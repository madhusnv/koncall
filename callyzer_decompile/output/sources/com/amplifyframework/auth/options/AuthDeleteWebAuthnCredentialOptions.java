package com.amplifyframework.auth.options;

import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthDeleteWebAuthnCredentialOptions {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthDeleteWebAuthnCredentialOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AuthDeleteWebAuthnCredentialOptions defaults() {
            return new DefaultAuthDeleteWebAuthnCredentialOptions();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
