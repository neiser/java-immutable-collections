package de.qaware.tools.immutablecollection;

import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableSet<E> extends ImmutableSet<E>, Set<E>, MutableCollection<E> {

    static <E> MutableSet<E> wrap(Set<E> set) {
        return new DelegatingMutableSet<>(set);
    }

    // define again to avoid confusion
    @Override
    void forEach(Consumer<? super E> action);

    @Override
    <T> T[] toArray(IntFunction<T[]> generator);

    @Override
    Stream<E> stream();

    @Override
    Stream<E> parallelStream();

    @Override
    Spliterator<E> spliterator();
}
