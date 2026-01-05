package com.amplifyframework.predictions.options;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.id5;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public class FaceLivenessSessionOptions {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder<T extends Builder<T>> {
        public FaceLivenessSessionOptions build() {
            return new FaceLivenessSessionOptions();
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

        public final FaceLivenessSessionOptions defaults() {
            return new FaceLivenessSessionOptions();
        }
    }

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
        return obj != null && sq8.m48644c(getClass(), obj.getClass());
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        return "FaceLivenessSessionOptions()";
    }
}
