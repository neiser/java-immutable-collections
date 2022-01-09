package de.qaware.tools.immutablecollection;

import java.util.Collection;

final class DelegatingMutableCollection<E> extends AbstractDelegatingMutableCollection<E, Collection<E>> {
    DelegatingMutableCollection(Collection<E> delegate) {
        super(delegate);
    }
}
