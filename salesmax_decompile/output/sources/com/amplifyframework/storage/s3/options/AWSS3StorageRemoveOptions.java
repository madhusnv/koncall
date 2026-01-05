package com.amplifyframework.storage.s3.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageRemoveOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageRemoveOptions extends StorageRemoveOptions {
    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageRemoveOptions defaultInstance() {
        return builder().build();
    }

    public static Builder from(AWSS3StorageRemoveOptions aWSS3StorageRemoveOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageRemoveOptions.getAccessLevel())).targetIdentityId(aWSS3StorageRemoveOptions.getTargetIdentityId())).bucket(aWSS3StorageRemoveOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageRemoveOptions)) {
            return false;
        }
        AWSS3StorageRemoveOptions aWSS3StorageRemoveOptions = (AWSS3StorageRemoveOptions) obj;
        return s6c.m47909a(getAccessLevel(), aWSS3StorageRemoveOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageRemoveOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), aWSS3StorageRemoveOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public String toString() {
        return "AWSS3StorageRemoveOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }

    public static final class Builder extends StorageRemoveOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageRemoveOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public AWSS3StorageRemoveOptions build() {
            return new AWSS3StorageRemoveOptions(this);
        }
    }

    private AWSS3StorageRemoveOptions(Builder builder) {
        super(builder);
    }
}
