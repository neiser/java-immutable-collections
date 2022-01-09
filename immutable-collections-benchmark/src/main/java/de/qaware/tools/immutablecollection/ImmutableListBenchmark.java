package de.qaware.tools.immutablecollection;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;


@Fork(5)
@Warmup(iterations = 5, time = 1000, timeUnit = MILLISECONDS)
@Measurement(iterations = 5, time = 1000, timeUnit = MILLISECONDS)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@SuppressWarnings({
        "java:S100",  // supress "method name" warning
})
@State(Scope.Benchmark)
public class ImmutableListBenchmark {

    private List<Integer> list;
    private ImmutableList<Integer> immutableList;

    @Setup
    public void setup() {
        list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        immutableList = MutableList.wrap(list);
    }

    @Benchmark
    public Object baselineFor_wrap_unwrap() {
        return list;
    }

    @Benchmark
    public Object wrap() {
        return MutableList.wrap(list);
    }

    @Benchmark
    public Object unwrap() {
        return immutableList.unwrap();
    }

    @Benchmark
    public void baselineFor_get(Blackhole bh) {
        bh.consume(list.get(0));
        bh.consume(list.get(3));
        bh.consume(list.get(7));
    }

    @Benchmark
    public void get(Blackhole bh) {
        bh.consume(immutableList.get(0));
        bh.consume(immutableList.get(3));
        bh.consume(immutableList.get(7));
    }

    @Benchmark
    public void baselineFor_forEach(Blackhole bh) {
        list.forEach(bh::consume);
    }

    @Benchmark
    public void forEach(Blackhole bh) {
        immutableList.forEach(bh::consume);
    }

}
