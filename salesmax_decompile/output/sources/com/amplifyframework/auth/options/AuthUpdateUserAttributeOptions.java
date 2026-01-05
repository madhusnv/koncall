package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthUpdateUserAttributeOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributeOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthUpdateUserAttributeOptions extends AuthUpdateUserAttributeOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributeOptions;
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributeOptions.class.getSimpleName();
        }

        private DefaultAuthUpdateUserAttributeOptions() {
        }
    }

    public static DefaultAuthUpdateUserAttributeOptions defaults() {
        return new DefaultAuthUpdateUserAttributeOptions();
    }
}
