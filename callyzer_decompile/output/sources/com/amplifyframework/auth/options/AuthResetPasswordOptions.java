package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthResetPasswordOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResetPasswordOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthResetPasswordOptions extends AuthResetPasswordOptions {
        public /* synthetic */ DefaultAuthResetPasswordOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResetPasswordOptions;
        }

        public int hashCode() {
            return DefaultAuthResetPasswordOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResetPasswordOptions.class.getSimpleName();
        }

        private DefaultAuthResetPasswordOptions() {
        }
    }

    public static DefaultAuthResetPasswordOptions defaults() {
        return new DefaultAuthResetPasswordOptions(0);
    }
}
