package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthVerifyTOTPSetupOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthVerifyTOTPSetupOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
        public /* synthetic */ DefaultAuthVerifyTOTPSetupOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthVerifyTOTPSetupOptions;
        }

        public int hashCode() {
            return DefaultAuthVerifyTOTPSetupOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthVerifyTOTPSetupOptions.class.getSimpleName();
        }

        private DefaultAuthVerifyTOTPSetupOptions() {
        }
    }

    public static DefaultAuthVerifyTOTPSetupOptions defaults() {
        return new DefaultAuthVerifyTOTPSetupOptions(0);
    }
}
