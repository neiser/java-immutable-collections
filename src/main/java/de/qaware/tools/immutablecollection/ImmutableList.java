package de.qaware.tools.immutablecollection;

import java.util.List;

public interface ImmutableList<E> extends ImmutableCollection<E> {
    E get(int index);

    List<E> unwrap();
}
