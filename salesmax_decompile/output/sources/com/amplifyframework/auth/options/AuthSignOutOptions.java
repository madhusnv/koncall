package com.amplifyframework.auth.options;

import p001o.s6c;

/* loaded from: classes5.dex */
public class AuthSignOutOptions {
    private final boolean globalSignOut;

    public static abstract class Builder<T extends Builder<T>> {
        private boolean globalSignOut = false;

        public AuthSignOutOptions build() {
            return new AuthSignOutOptions(this.globalSignOut);
        }

        public abstract T getThis();

        public T globalSignOut(boolean z) {
            this.globalSignOut = z;
            return (T) getThis();
        }

        public boolean isGlobalSignOut() {
            return this.globalSignOut;
        }
    }

    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthSignOutOptions(boolean z) {
        this.globalSignOut = z;
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
        return s6c.m47909a(Boolean.valueOf(isGlobalSignOut()), Boolean.valueOf(((AuthSignOutOptions) obj).isGlobalSignOut()));
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isGlobalSignOut()));
    }

    public boolean isGlobalSignOut() {
        return this.globalSignOut;
    }

    public String toString() {
        return "AuthSignOutOptions{globalSignOut=" + isGlobalSignOut() + '}';
    }
}
