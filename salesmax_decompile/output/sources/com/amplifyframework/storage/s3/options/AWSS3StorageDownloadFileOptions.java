package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageDownloadFileOptions extends StorageDownloadFileOptions {
    private final boolean useAccelerationMode;

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageDownloadFileOptions defaultInstance() {
        return builder().build();
    }

    public static Builder from(AWSS3StorageDownloadFileOptions aWSS3StorageDownloadFileOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageDownloadFileOptions.getAccessLevel())).targetIdentityId(aWSS3StorageDownloadFileOptions.getTargetIdentityId())).setUseAccelerateEndpoint(aWSS3StorageDownloadFileOptions.useAccelerateEndpoint()).bucket(aWSS3StorageDownloadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageDownloadFileOptions)) {
            return false;
        }
        AWSS3StorageDownloadFileOptions aWSS3StorageDownloadFileOptions = (AWSS3StorageDownloadFileOptions) obj;
        return s6c.m47909a(getAccessLevel(), aWSS3StorageDownloadFileOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageDownloadFileOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), aWSS3StorageDownloadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public String toString() {
        return "AWSS3StorageDownloadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", useAccelerationMode=" + useAccelerateEndpoint() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    public static final class Builder extends StorageDownloadFileOptions.Builder<Builder> {
        private boolean useAccelerateEndpoint;

        public Builder setUseAccelerateEndpoint(boolean z) {
            this.useAccelerateEndpoint = z;
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageDownloadFileOptions build() {
            return new AWSS3StorageDownloadFileOptions(this);
        }
    }

    private AWSS3StorageDownloadFileOptions(Builder builder) {
        super(builder);
        this.useAccelerationMode = builder.useAccelerateEndpoint;
    }
}
