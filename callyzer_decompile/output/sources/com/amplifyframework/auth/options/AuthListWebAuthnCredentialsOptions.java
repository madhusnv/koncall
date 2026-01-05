package com.amplifyframework.auth.options;

import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthListWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthListWebAuthnCredentialsOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AuthListWebAuthnCredentialsOptions defaults() {
            return new DefaultAuthListWebAuthnCredentialsOptions();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
