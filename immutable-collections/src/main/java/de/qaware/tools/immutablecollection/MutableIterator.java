package de.qaware.tools.immutablecollection;

import java.util.Iterator;
import java.util.function.Consumer;

public interface MutableIterator<E> extends ImmutableIterator<E>, Iterator<E> {

    static <E> MutableIterator<E> wrap(Iterator<E> iterator) {
        return new DelegatingMutableIterator<>(iterator);
    }

    // define again to avoid confusion
    void forEachRemaining(Consumer<? super E> action);
}
