package com.amplifyframework.predictions.options;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public class FaceLivenessSessionOptions {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<T extends Builder<T>> {
        public FaceLivenessSessionOptions build() {
            return new FaceLivenessSessionOptions();
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

        public final FaceLivenessSessionOptions defaults() {
            return new FaceLivenessSessionOptions();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public static final Builder<?> builder() {
        return Companion.builder();
    }

    public static final FaceLivenessSessionOptions defaults() {
        return Companion.defaults();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass().equals(obj.getClass());
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        return "FaceLivenessSessionOptions()";
    }
}
