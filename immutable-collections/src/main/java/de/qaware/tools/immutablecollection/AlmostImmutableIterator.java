package de.qaware.tools.immutablecollection;

import java.util.Iterator;

public interface AlmostImmutableIterator<E> extends Unwrappable<Iterator<E>>, ImmutableIterator<E> {

    static <E> AlmostImmutableIterator<E> wrap(Iterator<E> iterator) {
        return new DelegatingIterator<>(iterator);
    }

}
