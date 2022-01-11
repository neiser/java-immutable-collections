package de.qaware.tools.immutablecollection;

import java.util.Set;

final class DelegatingSet<E> extends AbstractDelegatingCollection<E, Set<E>> implements AlmostImmutableSet<E> {

    DelegatingSet(Set<E> delegate) {
        super(delegate);
    }

}
