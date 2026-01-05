package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthConfirmResetPasswordOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmResetPasswordOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthConfirmResetPasswordOptions extends AuthConfirmResetPasswordOptions {
        public /* synthetic */ DefaultAuthConfirmResetPasswordOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmResetPasswordOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmResetPasswordOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmResetPasswordOptions.class.getSimpleName();
        }

        private DefaultAuthConfirmResetPasswordOptions() {
        }
    }

    public static DefaultAuthConfirmResetPasswordOptions defaults() {
        return new DefaultAuthConfirmResetPasswordOptions(0);
    }
}
