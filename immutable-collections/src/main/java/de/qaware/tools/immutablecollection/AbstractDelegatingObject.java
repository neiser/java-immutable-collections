package de.qaware.tools.immutablecollection;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
abstract class AbstractDelegatingObject<D> {

    protected final D delegate;

    public final D unwrap() {
        return delegate;
    }

    @Override
    public final int hashCode() {
        return delegate.hashCode();
    }

    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public final boolean equals(Object obj) {
        return delegate.equals(obj);
    }

    @Override
    @SuppressWarnings("java:S1182")
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    public final String toString() {
        return delegate.toString();
    }
}
