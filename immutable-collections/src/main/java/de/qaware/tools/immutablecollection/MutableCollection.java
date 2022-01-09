package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableCollection<E> extends ImmutableCollection<E>, Collection<E> {

    static <E> MutableList<E> wrap(List<E> list) {
        return ProxyUtil.wrap(list, List.class, MutableList.class,
                ProxyUtil.UNWRAP_INVOCATION_HANDLER_FACTORY.apply(list),
                ProxyUtil.IMMUTABLE_ITERATOR_INVOCATION_HANDLER_FACTORY.apply(list)
        );
    }

    // define again to avoid confusion
    <T> T[] toArray(IntFunction<T[]> generator);

    Stream<E> stream();

    Stream<E> parallelStream();

    Spliterator<E> spliterator();
}