package de.qaware.tools.immutablecollection;

import java.util.Set;

public interface AlmostImmutableSet<E> extends ImmutableSet<E>, AlmostImmutableCollection<E> {

    static <E> AlmostImmutableSet<E> wrap(Set<E> set) {
        return new DelegatingSet<>(set);
    }
}
