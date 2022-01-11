package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

abstract class AbstractDelegatingCollection<E, D extends Collection<E>> extends AbstractDelegatingObject<D> implements AlmostImmutableCollection<E> {

    protected AbstractDelegatingCollection(D delegate) {
        super(delegate);
    }

    @Override
    public final ImmutableIterator<E> immutableIterator() {
        return AlmostImmutableIterator.wrap(delegate.iterator());
    }

    @Override
    public final void forEach(Consumer<? super E> action) {
        delegate.forEach(action);
    }

    @Override
    public final int size() {
        return delegate.size();
    }

    @Override
    public final boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public final boolean contains(Object o) {
        return delegate.contains(o);
    }

    @Override
    public final boolean containsAll(Collection<?> c) {
        return delegate.containsAll(c);
    }

    @Override
    public final Object[] toArray() {
        return delegate.toArray();
    }

    @Override
    public final <T> T[] toArray(T[] a) {
        return delegate.toArray(a);
    }

    @Override
    public final <T> T[] toArray(IntFunction<T[]> generator) {
        return delegate.toArray(generator);
    }

    @Override
    public final Stream<E> stream() {
        return delegate.stream();
    }

    @Override
    public final Stream<E> parallelStream() {
        return delegate.stream();
    }

    @Override
    public final Spliterator<E> spliterator() {
        return delegate.spliterator();
    }
}
