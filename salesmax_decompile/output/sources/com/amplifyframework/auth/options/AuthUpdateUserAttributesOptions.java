package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthUpdateUserAttributesOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributesOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthUpdateUserAttributesOptions extends AuthUpdateUserAttributesOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributesOptions;
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributesOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributesOptions.class.getSimpleName();
        }

        private DefaultAuthUpdateUserAttributesOptions() {
        }
    }

    public static DefaultAuthUpdateUserAttributesOptions defaults() {
        return new DefaultAuthUpdateUserAttributesOptions();
    }
}
