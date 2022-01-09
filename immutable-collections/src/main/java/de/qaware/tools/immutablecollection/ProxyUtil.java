package de.qaware.tools.immutablecollection;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.function.Function;

class ProxyUtil {

    static final Function<Object, AdditionalInvocationHandler> UNWRAP_INVOCATION_HANDLER_FACTORY = delegate -> new AdditionalInvocationHandler() {
        @Override
        public String getMethodName() {
            return "unwrap";
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return delegate;
        }
    };

    static final Function<Collection<?>, AdditionalInvocationHandler> IMMUTABLE_ITERATOR_INVOCATION_HANDLER_FACTORY = delegate -> new AdditionalInvocationHandler() {
        @Override
        public String getMethodName() {
            return "immutableIterator";
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return MutableIterator.wrap(delegate.iterator());
        }
    };

    private ProxyUtil() {
        // static methods only
    }


    @SuppressWarnings("unchecked")
    static <D, W extends D, T extends W> T wrap(D delegate, Class<D> delegateType, Class<W> wrapperType, AdditionalInvocationHandler... additionalInvocationHandlers) {
        return (T) Proxy.newProxyInstance(
                wrapperType.getClassLoader(),
                new Class[]{delegateType, wrapperType},
                (proxy, method, args) -> {
                    for (AdditionalInvocationHandler additionalInvocationHandler : additionalInvocationHandlers) {
                        if (additionalInvocationHandler.getMethodName().equals(method.getName())) {
                            return additionalInvocationHandler.invoke(proxy, method, args);
                        }
                    }
                    return method.invoke(delegate, args);
                }
        );
    }

    interface AdditionalInvocationHandler {
        String getMethodName();

        Object invoke(Object proxy, Method method, Object[] args);
    }
}
