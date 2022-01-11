package de.qaware.tools.immutablecollection;

public interface ImmutableList<E> extends ImmutableCollection<E> {
    E get(int index);

    ImmutableList<E> immutableSubList(int fromIndex, int toIndex);
}
