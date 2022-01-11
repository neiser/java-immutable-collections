package de.qaware.tools.immutablecollection;

import java.util.Collection;

public interface AlmostImmutableCollection<E> extends ImmutableCollection<E>, Unwrappable<Collection<E>> {

    static <E> AlmostImmutableCollection<E> wrap(Collection<E> collection) {
        return new DelegatingCollection<>(collection);
    }
}
