package com.amplifyframework.auth.options;

import a2.AbstractC0030c;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AuthFetchSessionOptions {
    public static final Companion Companion = new Companion(null);
    private final boolean forceRefresh;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        private boolean forceRefresh;

        public AuthFetchSessionOptions build() {
            return new AuthFetchSessionOptions(this.forceRefresh);
        }

        public Builder<T> forceRefresh(boolean z6) {
            this.forceRefresh = z6;
            return this;
        }

        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        public abstract T getThis();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final Builder<?> builder() {
            return new CoreBuilder();
        }

        public final AuthFetchSessionOptions defaults() {
            return new AuthFetchSessionOptions(false);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthFetchSessionOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthFetchSessionOptions(boolean z6) {
        this.forceRefresh = z6;
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
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Boolean.valueOf(this.forceRefresh).equals(Boolean.valueOf(((AuthFetchSessionOptions) obj).forceRefresh));
    }

    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.forceRefresh));
    }

    public String toString() {
        return AbstractC0030c.m122m("AuthFetchSessionOptions{forceRefresh=", "}", this.forceRefresh);
    }
}
