package com.amplifyframework.auth.result;

import com.amplifyframework.auth.AuthException;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthSessionResult<T> {
    private final AuthException error;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58095type;
    private final T value;

    public enum Type {
        SUCCESS,
        FAILURE
    }

    private AuthSessionResult(T t, AuthException authException, Type type2) {
        this.value = t;
        this.error = authException;
        this.f58095type = type2;
    }

    public static <T> AuthSessionResult<T> failure(AuthException authException) {
        return new AuthSessionResult<>(null, authException, Type.FAILURE);
    }

    public static <T> AuthSessionResult<T> success(T t) {
        return new AuthSessionResult<>(t, null, Type.SUCCESS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthSessionResult)) {
            return false;
        }
        AuthSessionResult authSessionResult = (AuthSessionResult) obj;
        return s6c.m47909a(getValue(), authSessionResult.getValue()) && s6c.m47909a(getError(), authSessionResult.getError()) && s6c.m47909a(getType(), authSessionResult.getType());
    }

    public AuthException getError() {
        return this.error;
    }

    public Type getType() {
        return this.f58095type;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        return s6c.m47910b(getValue(), getError(), getType());
    }

    public String toString() {
        return "AuthSessionResult{value=" + getValue() + ", error=" + getError() + ", type=" + getType() + '}';
    }
}
