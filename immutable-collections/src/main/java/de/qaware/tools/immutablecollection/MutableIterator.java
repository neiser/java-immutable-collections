package de.qaware.tools.immutablecollection;

import java.util.Iterator;
import java.util.function.Consumer;

import static de.qaware.tools.immutablecollection.ProxyUtil.UNWRAP_INVOCATION_HANDLER_FACTORY;

public interface MutableIterator<E> extends ImmutableIterator<E>, Iterator<E> {

    static <E> MutableIterator<E> wrap(Iterator<E> iterator) {
        return ProxyUtil.wrap(iterator, Iterator.class, MutableIterator.class,
                UNWRAP_INVOCATION_HANDLER_FACTORY.apply(iterator)
        );
    }

    // define again to avoid confusion
    void forEachRemaining(Consumer<? super E> action);
}
