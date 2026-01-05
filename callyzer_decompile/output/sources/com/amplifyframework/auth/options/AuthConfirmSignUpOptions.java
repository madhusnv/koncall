package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthConfirmSignUpOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignUpOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
        public /* synthetic */ DefaultAuthConfirmSignUpOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmSignUpOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmSignUpOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmSignUpOptions.class.getSimpleName();
        }

        private DefaultAuthConfirmSignUpOptions() {
        }
    }

    public static DefaultAuthConfirmSignUpOptions defaults() {
        return new DefaultAuthConfirmSignUpOptions(0);
    }
}
