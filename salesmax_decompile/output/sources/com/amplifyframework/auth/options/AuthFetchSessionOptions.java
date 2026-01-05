package com.amplifyframework.auth.options;

import p001o.id5;
import p001o.s6c;
import p001o.sq8;

/* loaded from: classes5.dex */
public class AuthFetchSessionOptions {
    public static final Companion Companion = new Companion(null);
    private final boolean forceRefresh;

    public static abstract class Builder<T extends Builder<T>> {
        private boolean forceRefresh;

        public AuthFetchSessionOptions build() {
            return new AuthFetchSessionOptions(this.forceRefresh);
        }

        public Builder<T> forceRefresh(boolean z) {
            this.forceRefresh = z;
            return this;
        }

        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        public abstract T getThis();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Builder<?> builder() {
            return new CoreBuilder();
        }

        public final AuthFetchSessionOptions defaults() {
            return new AuthFetchSessionOptions(false);
        }
    }

    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthFetchSessionOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthFetchSessionOptions(boolean z) {
        this.forceRefresh = z;
    }

    public static final Builder<?> builder() {
        return Companion.builder();
    }

    public static final AuthFetchSessionOptions defaults() {
        return Companion.defaults();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(getClass(), obj.getClass())) {
            return false;
        }
        return s6c.m47909a(Boolean.valueOf(this.forceRefresh), Boolean.valueOf(((AuthFetchSessionOptions) obj).forceRefresh));
    }

    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(this.forceRefresh));
    }

    public String toString() {
        return "AuthFetchSessionOptions{forceRefresh=" + this.forceRefresh + "}";
    }
}
