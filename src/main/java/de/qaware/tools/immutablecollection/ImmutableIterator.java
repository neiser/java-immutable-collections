package de.qaware.tools.immutablecollection;

import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.function.Consumer;

public interface ImmutableIterator<E> {

    @SuppressWarnings("unchecked")
    static <E> ImmutableIterator<E> wrap(Iterator<E> iterator) {
        return (ImmutableIterator<E>) Proxy.newProxyInstance(
                ImmutableIterator.class.getClassLoader(),
                new Class[]{Iterator.class, ImmutableIterator.class},
                (proxy, method, args) -> method.invoke(iterator, args)
        );
    }

    boolean hasNext();

    E next();

    void forEachRemaining(Consumer<? super E> action);
}
