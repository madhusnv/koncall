package com.amplifyframework.predictions.aws.options;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.predictions.options.FaceLivenessSessionOptions;
import p001o.id5;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public class AWSFaceLivenessSessionOptions extends FaceLivenessSessionOptions {
    public static final Companion Companion = new Companion(null);
    private final AWSCredentialsProvider<AWSCredentials> credentialsProvider;

    public static final class Builder extends FaceLivenessSessionOptions.Builder<Builder> {
        private AWSCredentialsProvider<? extends AWSCredentials> credentialsProvider;

        public final Builder credentialsProvider(AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider) {
            sq8.m48649h(aWSCredentialsProvider, "credentialsProvider");
            this.credentialsProvider = aWSCredentialsProvider;
            return this;
        }

        public final AWSCredentialsProvider<AWSCredentials> getCredentialsProvider() {
            return this.credentialsProvider;
        }

        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        /* renamed from: getThis, reason: merged with bridge method [inline-methods] */
        public Builder m68960getThis() {
            return this;
        }

        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public AWSFaceLivenessSessionOptions m68959build() {
            return new AWSFaceLivenessSessionOptions(this.credentialsProvider, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        public final AWSFaceLivenessSessionOptions defaults() {
            return builder().m68959build();
        }
    }

    public /* synthetic */ AWSFaceLivenessSessionOptions(AWSCredentialsProvider aWSCredentialsProvider, id5 id5Var) {
        this(aWSCredentialsProvider);
    }

    /* renamed from: builder */
    public static final Builder m68961builder() {
        return Companion.builder();
    }

    /* renamed from: defaults */
    public static final AWSFaceLivenessSessionOptions m68962defaults() {
        return Companion.defaults();
    }

    /* renamed from: getCredentialsProvider */
    public final AWSCredentialsProvider<AWSCredentials> m68963getCredentialsProvider() {
        return this.credentialsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AWSFaceLivenessSessionOptions(AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider) {
        this.credentialsProvider = aWSCredentialsProvider;
    }
}
