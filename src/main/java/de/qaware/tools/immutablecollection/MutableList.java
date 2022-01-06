package de.qaware.tools.immutablecollection;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public interface MutableList<E> extends ImmutableList<E>, List<E> {

    @SuppressWarnings("unchecked")
    static <E> MutableList<E> wrap(List<E> list) {
        return (MutableList<E>) Proxy.newProxyInstance(
                MutableList.class.getClassLoader(),
                new Class[]{List.class, MutableList.class},
                (proxy, method, args) -> method.invoke(list, args)
        );
    }

    <T> T[] toArray(IntFunction<T[]> generator);

    Stream<E> stream();

    Stream<E> parallelStream();

    Spliterator<E> spliterator();
}
