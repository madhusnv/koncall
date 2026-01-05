package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthUpdateUserAttributeOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributeOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthUpdateUserAttributeOptions extends AuthUpdateUserAttributeOptions {
        public /* synthetic */ DefaultAuthUpdateUserAttributeOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributeOptions;
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributeOptions.class.getSimpleName();
        }

        private DefaultAuthUpdateUserAttributeOptions() {
        }
    }

    public static DefaultAuthUpdateUserAttributeOptions defaults() {
        return new DefaultAuthUpdateUserAttributeOptions(0);
    }
}
