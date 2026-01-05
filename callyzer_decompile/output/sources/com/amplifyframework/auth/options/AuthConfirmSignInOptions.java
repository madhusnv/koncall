package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthConfirmSignInOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignInOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
        public /* synthetic */ DefaultAuthConfirmSignInOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmSignInOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmSignInOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmSignInOptions.class.getSimpleName();
        }

        private DefaultAuthConfirmSignInOptions() {
        }
    }

    public static DefaultAuthConfirmSignInOptions defaults() {
        return new DefaultAuthConfirmSignInOptions(0);
    }
}
