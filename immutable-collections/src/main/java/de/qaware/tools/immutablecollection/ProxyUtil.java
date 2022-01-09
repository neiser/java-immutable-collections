package de.qaware.tools.immutablecollection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

class ProxyUtil {

    static final AdditionalInvocationHandler<Object> UNWRAP_INVOCATION_HANDLER = new AdditionalInvocationHandler<>() {
        @Override
        public String getMethodName() {
            return "unwrap";
        }

        @Override
        public Object invoke(Object delegate, Method method, Object[] args) {
            return delegate;
        }
    };

    static final AdditionalInvocationHandler<Collection<?>> IMMUTABLE_ITERATOR_INVOCATION = new AdditionalInvocationHandler<>() {
        @Override
        public String getMethodName() {
            return "immutableIterator";
        }

        @Override
        public Object invoke(Collection<?> delegate, Method method, Object[] args) {
            return MutableIterator.wrap(delegate.iterator());
        }
    };

    private ProxyUtil() {
        // static methods only
    }


    @SuppressWarnings("unchecked")
    static <D, W extends D, T extends W> T wrap(D delegate, Class<D> delegateType, Class<W> wrapperType,
                                                AdditionalInvocationHandler<?>... additionalInvocationHandlers) {
        return createProxy(delegateType, wrapperType, (proxy, method, args) -> {
            for (var additionalInvocationHandler : additionalInvocationHandlers) {
                if (additionalInvocationHandler.getMethodName().equals(method.getName())) {
                    return ((AdditionalInvocationHandler<D>) additionalInvocationHandler).invoke(delegate, method, args);
                }
            }
            return method.invoke(delegate, args);
        });
    }

    @SuppressWarnings("unchecked")
    static <D, W extends D, T> T createProxy(Class<D> delegateType, Class<W> wrapperType, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(wrapperType.getClassLoader(), new Class[]{delegateType, wrapperType}, invocationHandler);
    }

    interface AdditionalInvocationHandler<D> {
        String getMethodName();

        Object invoke(D delegate, Method method, Object[] args);
    }
}
