package de.qaware.tools.immutablecollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

abstract class AbstractDelegatingMutableCollection<E, D extends Collection<E>> extends AbstractDelegatingObject<D> implements MutableCollection<E> {

    protected AbstractDelegatingMutableCollection(D delegate) {
        super(delegate);
    }

    @Override
    public final ImmutableIterator<E> immutableIterator() {
        return MutableIterator.wrap(delegate.iterator());
    }

    @Override
    public final Iterator<E> iterator() {
        return delegate.iterator();
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
    public final boolean addAll(Collection<? extends E> c) {
        return delegate.addAll(c);
    }

    @Override
    public final boolean removeAll(Collection<?> c) {
        return delegate.removeAll(c);
    }

    @Override
    public final boolean removeIf(Predicate<? super E> filter) {
        return delegate.removeIf(filter);
    }

    @Override
    public final boolean retainAll(Collection<?> c) {
        return delegate.retainAll(c);
    }

    @Override
    public final void clear() {
        delegate.clear();
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
    public final boolean add(E e) {
        return delegate.add(e);
    }

    @Override
    public final boolean remove(Object o) {
        return delegate.remove(o);
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
