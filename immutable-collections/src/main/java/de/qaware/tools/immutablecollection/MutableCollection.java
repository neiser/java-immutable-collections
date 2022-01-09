package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableCollection<E> extends ImmutableCollection<E>, Collection<E> {

    static <E> MutableCollection<E> wrap(Collection<E> collection) {
        return ProxyUtil.wrap(collection, Collection.class, MutableCollection.class,
                ProxyUtil.UNWRAP_INVOCATION_HANDLER,
                ProxyUtil.IMMUTABLE_ITERATOR_INVOCATION
        );
    }

    // define again to avoid confusion
    <T> T[] toArray(IntFunction<T[]> generator);

    Stream<E> stream();

    Stream<E> parallelStream();

    Spliterator<E> spliterator();
}
