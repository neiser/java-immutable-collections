package de.qaware.tools.immutablecollection;

import java.util.Collection;

final class DelegatingCollection<E> extends AbstractDelegatingCollection<E, Collection<E>> {
    DelegatingCollection(Collection<E> delegate) {
        super(delegate);
    }
}
