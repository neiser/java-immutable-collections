package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface ImmutableCollection<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean containsAll(Collection<?> c);

    Stream<E> stream();

    Stream<E> parallelStream();

    Object[] toArray();

    <T> T[] toArray(T[] a);

    <T> T[] toArray(IntFunction<T[]> generator);

    Spliterator<E> spliterator();

    ImmutableIterator<E> immutableIterator();
}
