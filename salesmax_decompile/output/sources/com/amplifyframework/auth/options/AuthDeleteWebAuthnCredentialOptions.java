package com.amplifyframework.auth.options;

import p001o.id5;

/* loaded from: classes5.dex */
public abstract class AuthDeleteWebAuthnCredentialOptions {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthDeleteWebAuthnCredentialOptions build();

        public abstract T getThis();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AuthDeleteWebAuthnCredentialOptions defaults() {
            return new DefaultAuthDeleteWebAuthnCredentialOptions();
        }
    }

    public static final class DefaultAuthDeleteWebAuthnCredentialOptions extends AuthDeleteWebAuthnCredentialOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthDeleteWebAuthnCredentialOptions;
        }

        public int hashCode() {
            return DefaultAuthDeleteWebAuthnCredentialOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthDeleteWebAuthnCredentialOptions.class.getSimpleName();
        }
    }

    public static final AuthDeleteWebAuthnCredentialOptions defaults() {
        return Companion.defaults();
    }
}
