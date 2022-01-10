package de.qaware.tools.immutablecollection;

import java.util.List;

public interface ImmutableList<E> extends ImmutableCollection<E> {
    E get(int index);

    ImmutableList<E> immutableSubList(int fromIndex, int toIndex);

    List<E> unwrap();
}
