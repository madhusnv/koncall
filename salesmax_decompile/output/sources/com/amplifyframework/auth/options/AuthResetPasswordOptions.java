package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthResetPasswordOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResetPasswordOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthResetPasswordOptions extends AuthResetPasswordOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResetPasswordOptions;
        }

        public int hashCode() {
            return DefaultAuthResetPasswordOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResetPasswordOptions.class.getSimpleName();
        }

        private DefaultAuthResetPasswordOptions() {
        }
    }

    public static DefaultAuthResetPasswordOptions defaults() {
        return new DefaultAuthResetPasswordOptions();
    }
}
