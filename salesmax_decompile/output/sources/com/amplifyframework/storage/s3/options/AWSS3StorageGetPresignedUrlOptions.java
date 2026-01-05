package com.amplifyframework.storage.s3.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageGetUrlOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageGetPresignedUrlOptions extends StorageGetUrlOptions {
    private final boolean useAccelerationMode;
    private final boolean validateObjectExistence;

    @SuppressLint({"SyntheticAccessor"})
    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageGetPresignedUrlOptions defaultInstance() {
        return builder().build();
    }

    public static Builder from(AWSS3StorageGetPresignedUrlOptions aWSS3StorageGetPresignedUrlOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageGetPresignedUrlOptions.getAccessLevel())).targetIdentityId(aWSS3StorageGetPresignedUrlOptions.getTargetIdentityId())).expires(aWSS3StorageGetPresignedUrlOptions.getExpires()).setValidateObjectExistence(aWSS3StorageGetPresignedUrlOptions.getValidateObjectExistence()).expires(aWSS3StorageGetPresignedUrlOptions.getExpires()).bucket(aWSS3StorageGetPresignedUrlOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageGetPresignedUrlOptions)) {
            return false;
        }
        AWSS3StorageGetPresignedUrlOptions aWSS3StorageGetPresignedUrlOptions = (AWSS3StorageGetPresignedUrlOptions) obj;
        return s6c.m47909a(getAccessLevel(), aWSS3StorageGetPresignedUrlOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageGetPresignedUrlOptions.getTargetIdentityId()) && s6c.m47909a(Integer.valueOf(getExpires()), Integer.valueOf(aWSS3StorageGetPresignedUrlOptions.getExpires())) && s6c.m47909a(getBucket(), aWSS3StorageGetPresignedUrlOptions.getBucket()) && s6c.m47909a(Boolean.valueOf(getValidateObjectExistence()), Boolean.valueOf(aWSS3StorageGetPresignedUrlOptions.getValidateObjectExistence()));
    }

    public boolean getValidateObjectExistence() {
        return this.validateObjectExistence;
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), Integer.valueOf(getExpires()), Boolean.valueOf(getValidateObjectExistence()), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public String toString() {
        return "AWSS3StorageGetPresignedUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", expires=" + getExpires() + ", validateObjectExistence=" + getValidateObjectExistence() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    public static final class Builder extends StorageGetUrlOptions.Builder<Builder> {
        private boolean useAccelerateEndpoint;
        private boolean validateObjectExistence;

        public Builder setUseAccelerateEndpoint(boolean z) {
            this.useAccelerateEndpoint = z;
            return this;
        }

        public Builder setValidateObjectExistence(boolean z) {
            this.validateObjectExistence = z;
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageGetUrlOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageGetPresignedUrlOptions build() {
            return new AWSS3StorageGetPresignedUrlOptions(this);
        }
    }

    private AWSS3StorageGetPresignedUrlOptions(Builder builder) {
        super(builder);
        this.useAccelerationMode = builder.useAccelerateEndpoint;
        this.validateObjectExistence = builder.validateObjectExistence;
    }
}
