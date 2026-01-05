package com.amplifyframework.auth.options;

/* loaded from: classes5.dex */
public abstract class AuthVerifyTOTPSetupOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthVerifyTOTPSetupOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
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
        return new DefaultAuthVerifyTOTPSetupOptions();
    }
}
