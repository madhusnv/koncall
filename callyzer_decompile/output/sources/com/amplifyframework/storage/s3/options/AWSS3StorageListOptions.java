package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageListOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageListOptions extends StorageListOptions {
    public /* synthetic */ AWSS3StorageListOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageListOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return Objects.equals(getAccessLevel(), aWSS3StorageListOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageListOptions.getTargetIdentityId()) && Objects.equals(getBucket(), aWSS3StorageListOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public String toString() {
        return "AWSS3StorageListOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageListOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageListOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageListOptions build() {
            return new AWSS3StorageListOptions(this, 0);
        }
    }

    private AWSS3StorageListOptions(Builder builder) {
        super(builder);
    }
}
