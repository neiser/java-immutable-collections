package de.qaware.tools.immutablecollection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableList<E> extends ImmutableList<E>, List<E>, MutableCollection<E> {

    static <E> MutableList<E> wrap(List<E> list) {
        return new DelegatingMutableList<>(list);
    }

    // define again to avoid confusion
    void forEach(Consumer<? super E> action);

    <T> T[] toArray(IntFunction<T[]> generator);

    Stream<E> stream();

    Stream<E> parallelStream();

    Spliterator<E> spliterator();
}
