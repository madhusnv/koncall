package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthResendSignUpCodeOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendSignUpCodeOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResendSignUpCodeOptions;
        }

        public int hashCode() {
            return DefaultAuthResendSignUpCodeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResendSignUpCodeOptions.class.getSimpleName();
        }

        private DefaultAuthResendSignUpCodeOptions() {
        }
    }

    public static DefaultAuthResendSignUpCodeOptions defaults() {
        return new DefaultAuthResendSignUpCodeOptions();
    }
}
