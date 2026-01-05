package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthResendSignUpCodeOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendSignUpCodeOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
        public /* synthetic */ DefaultAuthResendSignUpCodeOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResendSignUpCodeOptions;
        }

        public int hashCode() {
            return DefaultAuthResendSignUpCodeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResendSignUpCodeOptions.class.getSimpleName();
        }

        private DefaultAuthResendSignUpCodeOptions() {
        }
    }

    public static DefaultAuthResendSignUpCodeOptions defaults() {
        return new DefaultAuthResendSignUpCodeOptions(0);
    }
}
