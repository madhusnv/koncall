package com.amplifyframework.auth.options;

import p001o.id5;

/* loaded from: classes5.dex */
public abstract class AuthAssociateWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthAssociateWebAuthnCredentialsOptions build();

        public abstract T getThis();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AuthAssociateWebAuthnCredentialsOptions defaults() {
            return new DefaultAuthAssociateWebAuthnCredentialOptions();
        }
    }

    public static final class DefaultAuthAssociateWebAuthnCredentialOptions extends AuthAssociateWebAuthnCredentialsOptions {
        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthAssociateWebAuthnCredentialOptions;
        }

        public int hashCode() {
            return DefaultAuthAssociateWebAuthnCredentialOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthAssociateWebAuthnCredentialOptions.class.getSimpleName();
        }
    }

    public static final AuthAssociateWebAuthnCredentialsOptions defaults() {
        return Companion.defaults();
    }
}
