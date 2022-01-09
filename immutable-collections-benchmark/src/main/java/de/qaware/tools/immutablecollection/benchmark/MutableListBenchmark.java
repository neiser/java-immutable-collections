package de.qaware.tools.immutablecollection.benchmark;

import de.qaware.tools.immutablecollection.MutableList;
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

import java.util.List;
import java.util.concurrent.TimeUnit;


@Fork(5)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@SuppressWarnings({
        "java:S100",  // supress "method name" warning
        "unused"      // JMH uses this class!
})
@State(Scope.Benchmark)
public class MutableListBenchmark {

    private List<String> items;
    private MutableList<String> mutableList;

    @Setup
    public void setup() {
        items = List.of("item1", "item2");
        mutableList = MutableList.wrap(items);
    }

    @Benchmark
    public Object wrap_baseline() {
        return items;
    }

    @Benchmark
    public Object wrap() {
        return MutableList.wrap(items);
    }

    @Benchmark
    public Object get_baseline() {
        return items.get(0);
    }

    @Benchmark
    public Object get() {
        return mutableList.get(0);
    }

}
