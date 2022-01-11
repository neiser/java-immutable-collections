package de.qaware.tools.immutablecollection;

import java.util.Iterator;
import java.util.function.Consumer;

final class DelegatingIterator<E> extends AbstractDelegatingObject<Iterator<E>> implements AlmostImmutableIterator<E> {
    DelegatingIterator(Iterator<E> delegate) {
        super(delegate);
    }

    @Override
    public boolean hasNext() {
        return delegate.hasNext();
    }

    @Override
    public E next() {
        return delegate.next();
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
        delegate.forEachRemaining(action);
    }
}
