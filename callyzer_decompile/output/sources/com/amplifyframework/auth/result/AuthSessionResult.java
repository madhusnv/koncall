package com.amplifyframework.auth.result;

import com.amplifyframework.auth.AuthException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthSessionResult<T> {
    private final AuthException error;
    private final Type type;
    private final T value;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Type {
        SUCCESS,
        FAILURE
    }

    private AuthSessionResult(T t7, AuthException authException, Type type) {
        this.value = t7;
        this.error = authException;
        this.type = type;
    }

    public static <T> AuthSessionResult<T> failure(AuthException authException) {
        return new AuthSessionResult<>(null, authException, Type.FAILURE);
    }

    public static <T> AuthSessionResult<T> success(T t7) {
        return new AuthSessionResult<>(t7, null, Type.SUCCESS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AuthSessionResult)) {
            AuthSessionResult authSessionResult = (AuthSessionResult) obj;
            if (Objects.equals(getValue(), authSessionResult.getValue()) && Objects.equals(getError(), authSessionResult.getError()) && Objects.equals(getType(), authSessionResult.getType())) {
                return true;
            }
        }
        return false;
    }

    public AuthException getError() {
        return this.error;
    }

    public Type getType() {
        return this.type;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(getValue(), getError(), getType());
    }

    public String toString() {
        return "AuthSessionResult{value=" + getValue() + ", error=" + getError() + ", type=" + getType() + '}';
    }
}
