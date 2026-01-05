package com.amplifyframework.auth.options;

import p001o.id5;

/* loaded from: classes5.dex */
public abstract class AuthListWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthListWebAuthnCredentialsOptions build();

        public abstract T getThis();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AuthListWebAuthnCredentialsOptions defaults() {
            return new DefaultAuthListWebAuthnCredentialsOptions();
        }
    }

    public static final class DefaultAuthListWebAuthnCredentialsOptions extends AuthListWebAuthnCredentialsOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthListWebAuthnCredentialsOptions;
        }

        public int hashCode() {
            return DefaultAuthListWebAuthnCredentialsOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthListWebAuthnCredentialsOptions.class.getSimpleName();
        }
    }

    public static final AuthListWebAuthnCredentialsOptions defaults() {
        return Companion.defaults();
    }
}
