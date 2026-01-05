package com.amplifyframework.auth.options;

import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthAssociateWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthAssociateWebAuthnCredentialsOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AuthAssociateWebAuthnCredentialsOptions defaults() {
            return new DefaultAuthAssociateWebAuthnCredentialOptions();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
