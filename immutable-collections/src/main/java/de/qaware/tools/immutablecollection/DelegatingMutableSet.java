package de.qaware.tools.immutablecollection;

import java.util.Set;

final class DelegatingMutableSet<E> extends AbstractDelegatingMutableCollection<E, Set<E>> implements MutableSet<E> {

    DelegatingMutableSet(Set<E> delegate) {
        super(delegate);
    }

}
