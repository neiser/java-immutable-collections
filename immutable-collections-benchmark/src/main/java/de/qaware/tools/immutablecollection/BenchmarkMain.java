package de.qaware.tools.immutablecollection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.util.ClassUtils;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@SuppressWarnings({
        "java:S106" // ok to use System.out here instead of logger
})
public class BenchmarkMain {

    private static final String GROUP_SEPARATOR = "_";
    private static final String BASELINE_PREFIX = "baselineFor_";

    public static void main(String[] args) throws Exception {
        var options = new OptionsBuilder()
                // run "echo -1 > /proc/sys/kernel/perf_event_paranoid"
                // and install "perf" tool with "apt install linux-tools-$(uname -r) linux-tools-generic -y"
                .addProfiler("perfnorm")
                .build();
        Runner runner = new Runner(options);
        var runResults = runner.run().stream()
                .collect(Collectors.toMap(r -> r.getParams().getBenchmark(), x -> x, (a, b) -> a, TreeMap::new));

        var slowDownResults = runResults.entrySet().stream()
                .flatMap(runResultEntry -> extractGroupPrefix(runResultEntry.getKey())
                        .flatMap(groupPrefix -> findBaselineResult(runResults, groupPrefix)
                                .map(baselineResult -> SlowDownResult.of(runResultEntry, baselineResult)))
                        .stream()
                ).collect(Collectors.toList());

        SlowDownResult.print(slowDownResults, System.out);
    }

    private static Optional<RunResult> findBaselineResult(Map<String, RunResult> runResults, String groupPrefix) {
        return runResults.keySet().stream()
                .filter(benchmarkName -> {
                    var strippedBenchmarkName = stripBenchmarkName(benchmarkName);
                    if (strippedBenchmarkName.startsWith(BASELINE_PREFIX)) {
                        String[] groups = strippedBenchmarkName.substring(BASELINE_PREFIX.length()).split(GROUP_SEPARATOR);
                        return Arrays.asList(groups).contains(groupPrefix);
                    }
                    return false;
                })
                .findAny()
                .map(runResults::get);
    }


    private static Optional<String> extractGroupPrefix(String benchmarkName) {
        var strippedBenchmarkName = stripBenchmarkName(benchmarkName);
        if (strippedBenchmarkName.startsWith(BASELINE_PREFIX)) {
            return Optional.empty();
        }
        return Optional.of(strippedBenchmarkName.split(GROUP_SEPARATOR)[0]);
    }

    private static String stripBenchmarkName(String benchmarkName) {
        return benchmarkName.substring(benchmarkName.lastIndexOf('.') + 1);
    }

    @RequiredArgsConstructor
    @Getter
    private static class SlowDownResult {
        public static final String SLOW_DOWN_COLUMN = "SlowDown";
        private final String benchmarkName;
        private final double slowDown;
        private final double slowDownError;

        static SlowDownResult of(Map.Entry<String, RunResult> runResultEntry, RunResult baselineRunResult) {
            var baselineResult = baselineRunResult.getPrimaryResult();
            var result = runResultEntry.getValue().getPrimaryResult();
            var benchmarkName = runResultEntry.getKey();
            double slowDown = result.getScore() / baselineResult.getScore();
            double relativeSlowDownError = calculateGaussianError(relativeScoreError(result), relativeScoreError(baselineResult));
            return new SlowDownResult(benchmarkName, slowDown, slowDown * relativeSlowDownError);
        }

        private static double relativeScoreError(Result<?> result) {
            return result.getScoreError() / result.getScore();
        }

        @SuppressWarnings("SameParameterValue")
        static void print(List<SlowDownResult> slowDownResults, PrintStream out) {
            if (slowDownResults.isEmpty()) {
                return;
            }
            Map<String, String> denseBenchmarkNames = ClassUtils.denseClassNames(slowDownResults.stream().map(SlowDownResult::getBenchmarkName).collect(Collectors.toList()));

            int nameLen = getNameLen(denseBenchmarkNames.values());
            out.println();
            out.println(SLOW_DOWN_COLUMN);
            slowDownResults.forEach(slowDownResult -> {
                out.printf("%-" + nameLen + "s", denseBenchmarkNames.get(slowDownResult.getBenchmarkName()));
                out.printf(" %.2f \u00B1 %.2f", slowDownResult.getSlowDown(), slowDownResult.getSlowDownError());
                out.println();
            });

        }

        private static int getNameLen(Collection<String> benchmarkNames) {
            int nameLen = SLOW_DOWN_COLUMN.length();
            for (String prefix : benchmarkNames) {
                nameLen = Math.max(nameLen, prefix.length());
            }
            return nameLen;
        }

        private static double calculateGaussianError(double... values) {
            return Math.sqrt(DoubleStream.of(values).map(x -> x * x).sum());
        }
    }


}
