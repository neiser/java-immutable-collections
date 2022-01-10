package de.qaware.tools.immutablecollection;

import java.util.function.Consumer;

public interface ImmutableIterable<T> {
    ImmutableIterator<T> immutableIterator();

    void forEach(Consumer<? super T> action);
}
