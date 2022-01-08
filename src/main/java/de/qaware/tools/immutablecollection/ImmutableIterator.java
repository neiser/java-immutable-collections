package de.qaware.tools.immutablecollection;

import java.util.Iterator;
import java.util.function.Consumer;

public interface ImmutableIterator<E> {


    boolean hasNext();

    E next();

    void forEachRemaining(Consumer<? super E> action);

    Iterator<E> unwrap();
}
