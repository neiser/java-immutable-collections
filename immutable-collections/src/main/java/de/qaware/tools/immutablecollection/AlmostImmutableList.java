package de.qaware.tools.immutablecollection;

import java.util.List;

public interface AlmostImmutableList<E> extends ImmutableList<E>, AlmostImmutableCollection<E> {
    static <E> AlmostImmutableList<E> wrap(List<E> list) {
        return new DelegatingList<>(list);
    }
}
