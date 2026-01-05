package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSS3StoragePluginConfiguration {
    public static final Companion Companion = new Companion(null);
    private final AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

    public static final class Builder {
        private AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

        public static /* synthetic */ void getAwsS3PluginPrefixResolver$annotations() {
        }

        public final AWSS3StoragePluginConfiguration build() {
            return new AWSS3StoragePluginConfiguration(this, null);
        }

        public final AWSS3PluginPrefixResolver getAwsS3PluginPrefixResolver() {
            return this.awsS3PluginPrefixResolver;
        }

        public final void setAwsS3PluginPrefixResolver(AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver) {
            this.awsS3PluginPrefixResolver = aWSS3PluginPrefixResolver;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AWSS3StoragePluginConfiguration invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            Builder builder = new Builder();
            xk7Var.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ AWSS3StoragePluginConfiguration(Builder builder, id5 id5Var) {
        this(builder);
    }

    public final AWSS3PluginPrefixResolver getAWSS3PluginPrefixResolver(AuthCredentialsProvider authCredentialsProvider) {
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = this.awsS3PluginPrefixResolver;
        return aWSS3PluginPrefixResolver == null ? new StorageAccessLevelAwarePrefixResolver(authCredentialsProvider) : aWSS3PluginPrefixResolver;
    }

    private AWSS3StoragePluginConfiguration(Builder builder) {
        this.awsS3PluginPrefixResolver = builder.getAwsS3PluginPrefixResolver();
    }
}
