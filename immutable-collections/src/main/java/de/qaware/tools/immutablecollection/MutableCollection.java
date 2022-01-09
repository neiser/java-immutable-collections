package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableCollection<E> extends ImmutableCollection<E>, Collection<E> {

    static <E> MutableCollection<E> wrap(Collection<E> collection) {
        return new DelegatingMutableCollection<>(collection);
    }

    // define again to avoid confusion
    void forEach(Consumer<? super E> action);

    <T> T[] toArray(IntFunction<T[]> generator);

    Stream<E> stream();

    Stream<E> parallelStream();

    Spliterator<E> spliterator();
}
