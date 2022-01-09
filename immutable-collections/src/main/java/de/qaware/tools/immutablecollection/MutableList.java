package de.qaware.tools.immutablecollection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableList<E> extends ImmutableList<E>, List<E>, MutableCollection<E> {

    static <E> MutableList<E> wrap(List<E> list) {
        return ProxyUtil.wrap(list, List.class, MutableList.class,
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
