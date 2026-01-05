package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageListOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageListOptions extends StorageListOptions {
    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageListOptions defaultInstance() {
        return builder().build();
    }

    public static Builder from(AWSS3StorageListOptions aWSS3StorageListOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageListOptions.getAccessLevel())).targetIdentityId(aWSS3StorageListOptions.getTargetIdentityId())).bucket(aWSS3StorageListOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageListOptions)) {
            return false;
        }
        AWSS3StorageListOptions aWSS3StorageListOptions = (AWSS3StorageListOptions) obj;
        return s6c.m47909a(getAccessLevel(), aWSS3StorageListOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageListOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), aWSS3StorageListOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public String toString() {
        return "AWSS3StorageListOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }

    public static final class Builder extends StorageListOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageListOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageListOptions build() {
            return new AWSS3StorageListOptions(this);
        }
    }

    private AWSS3StorageListOptions(Builder builder) {
        super(builder);
    }
}
