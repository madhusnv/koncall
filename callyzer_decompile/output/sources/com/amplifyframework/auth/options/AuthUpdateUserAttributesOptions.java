package com.amplifyframework.auth.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthUpdateUserAttributesOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributesOptions build();

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthUpdateUserAttributesOptions extends AuthUpdateUserAttributesOptions {
        public /* synthetic */ DefaultAuthUpdateUserAttributesOptions(int i10) {
            this();
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributesOptions;
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributesOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributesOptions.class.getSimpleName();
        }

        private DefaultAuthUpdateUserAttributesOptions() {
        }
    }

    public static DefaultAuthUpdateUserAttributesOptions defaults() {
        return new DefaultAuthUpdateUserAttributesOptions(0);
    }
}
