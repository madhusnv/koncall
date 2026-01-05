package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePluginConfiguration {
    public static final Companion Companion = new Companion(null);
    private final AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AWSS3StoragePluginConfiguration invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AWSS3StoragePluginConfiguration(Builder builder, AbstractC4148f abstractC4148f) {
        this(builder);
    }

    @InterfaceC6353c
    public final AWSS3PluginPrefixResolver getAWSS3PluginPrefixResolver(AuthCredentialsProvider authCredentialsProvider) {
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = this.awsS3PluginPrefixResolver;
        return aWSS3PluginPrefixResolver == null ? new StorageAccessLevelAwarePrefixResolver(authCredentialsProvider) : aWSS3PluginPrefixResolver;
    }

    private AWSS3StoragePluginConfiguration(Builder builder) {
        this.awsS3PluginPrefixResolver = builder.getAwsS3PluginPrefixResolver();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

        public final AWSS3StoragePluginConfiguration build() {
            return new AWSS3StoragePluginConfiguration(this, null);
        }

        public final AWSS3PluginPrefixResolver getAwsS3PluginPrefixResolver() {
            return this.awsS3PluginPrefixResolver;
        }

        public final void setAwsS3PluginPrefixResolver(AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver) {
            this.awsS3PluginPrefixResolver = aWSS3PluginPrefixResolver;
        }

        @InterfaceC6353c
        public static /* synthetic */ void getAwsS3PluginPrefixResolver$annotations() {
        }
    }
}
