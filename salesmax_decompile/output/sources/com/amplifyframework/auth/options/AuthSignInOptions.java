package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthSignInOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthSignInOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthSignInOptions extends AuthSignInOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthSignInOptions;
        }

        public int hashCode() {
            return DefaultAuthSignInOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthSignInOptions.class.getSimpleName();
        }

        private DefaultAuthSignInOptions() {
        }
    }

    public static DefaultAuthSignInOptions defaults() {
        return new DefaultAuthSignInOptions();
    }
}
