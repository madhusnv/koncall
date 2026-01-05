package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthSignInOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthSignInOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthSignInOptions extends AuthSignInOptions {
        public /* synthetic */ DefaultAuthSignInOptions(int i10) {
            this();
        }

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
        return new DefaultAuthSignInOptions(0);
    }
}
