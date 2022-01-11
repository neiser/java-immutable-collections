package de.qaware.tools.immutablecollection;

import java.util.List;

final class DelegatingList<E> extends AbstractDelegatingCollection<E, List<E>> implements AlmostImmutableList<E> {

    DelegatingList(List<E> delegate) {
        super(delegate);
    }

    @Override
    public ImmutableList<E> immutableSubList(int fromIndex, int toIndex) {
        return new DelegatingList<>(delegate.subList(fromIndex, toIndex));
    }

    @Override
    public E get(int index) {
        return delegate.get(index);
    }
}
