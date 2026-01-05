package com.amplifyframework.auth.options;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AuthSignOutOptions {
    private final boolean globalSignOut;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        private boolean globalSignOut = false;

        public AuthSignOutOptions build() {
            return new AuthSignOutOptions(this.globalSignOut);
        }

        public abstract T getThis();

        public T globalSignOut(boolean z6) {
            this.globalSignOut = z6;
            return (T) getThis();
        }

        public boolean isGlobalSignOut() {
            return this.globalSignOut;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthSignOutOptions(boolean z6) {
        this.globalSignOut = z6;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Boolean.valueOf(isGlobalSignOut()).equals(Boolean.valueOf(((AuthSignOutOptions) obj).isGlobalSignOut()));
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isGlobalSignOut()));
    }

    public boolean isGlobalSignOut() {
        return this.globalSignOut;
    }

    public String toString() {
        return "AuthSignOutOptions{globalSignOut=" + isGlobalSignOut() + '}';
    }
}
