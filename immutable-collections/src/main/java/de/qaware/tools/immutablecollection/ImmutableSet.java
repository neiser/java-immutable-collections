package de.qaware.tools.immutablecollection;

import java.util.Set;

public interface ImmutableSet<E> extends ImmutableCollection<E> {
    Set<E> unwrap();
}
