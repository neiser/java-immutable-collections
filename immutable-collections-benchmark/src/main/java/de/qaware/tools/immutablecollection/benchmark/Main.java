package de.qaware.tools.immutablecollection.benchmark;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.util.ClassUtils;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

@SuppressWarnings({
        "java:S106" // ok to use System.out here instead of logger
})
public class Main {

    private static final String BASELINE_SUFFIX = "_baseline";

    public static void main(String[] args) throws Exception {
        var options = new OptionsBuilder()
                // run "echo -1 > /proc/sys/kernel/perf_event_paranoid"
                // and install "perf" tool with "apt install linux-tools-$(uname -r) linux-tools-generic -y"
                .addProfiler("perfnorm")
                .build();
        var runResults = new Runner(options).run().stream()
                .collect(Collectors.toMap(r -> r.getParams().getBenchmark(), x -> x));

        Map<String, String> denseBenchmarkNames = ClassUtils.denseClassNames(runResults.keySet());

        var slowDownResults = runResults.entrySet().stream()
                .flatMap(runResultEntry -> {
                    if (runResultEntry.getKey().endsWith(BASELINE_SUFFIX)) {
                        var baselineResult = runResultEntry.getValue().getPrimaryResult();
                        var benchmarkName = runResultEntry.getKey().substring(0, runResultEntry.getKey().length() - BASELINE_SUFFIX.length());
                        return Optional.ofNullable(runResults.get(benchmarkName))
                                .map(RunResult::getPrimaryResult)
                                .map(result -> SlowDownResult.of(denseBenchmarkNames.get(benchmarkName), result, baselineResult))
                                .stream();
                    }
                    return Stream.empty();
                })
                .collect(Collectors.toList());

        SlowDownResult.print(slowDownResults, System.out);
    }

    @RequiredArgsConstructor
    @Getter
    private static class SlowDownResult {
        public static final String SLOW_DOWN_COLUMN = "SlowDown";
        private final String benchmarkName;
        private final double slowDown;
        private final double slowDownError;

        static SlowDownResult of(String benchmarkName, Result<?> result, Result<?> baselineResult) {
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
            int nameLen = getNameLen(slowDownResults);
            out.println();
            out.println(SLOW_DOWN_COLUMN);
            slowDownResults.forEach(slowDownResult -> {
                out.printf("%-" + nameLen + "s", slowDownResult.getBenchmarkName());
                out.printf(" %.2f \u00B1 %.2f", slowDownResult.getSlowDown(), slowDownResult.getSlowDownError());
                out.println();
            });

        }

        private static int getNameLen(List<SlowDownResult> slowDownResults) {
            int nameLen = SLOW_DOWN_COLUMN.length();
            for (String prefix : slowDownResults.stream().map(SlowDownResult::getBenchmarkName).collect(Collectors.toList())) {
                nameLen = Math.max(nameLen, prefix.length());
            }
            return nameLen;
        }

        private static double calculateGaussianError(double... values) {
            return Math.sqrt(DoubleStream.of(values).map(x -> x * x).sum());
        }
    }


}
