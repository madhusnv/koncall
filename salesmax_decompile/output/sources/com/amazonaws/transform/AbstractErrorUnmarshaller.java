package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;

/* loaded from: classes5.dex */
public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<AmazonServiceException, T> {
    protected final Class<? extends AmazonServiceException> exceptionClass;

    public AbstractErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public AmazonServiceException newException(String str) {
        return this.exceptionClass.getConstructor(String.class).newInstance(str);
    }

    public AbstractErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.exceptionClass = cls;
    }
}
