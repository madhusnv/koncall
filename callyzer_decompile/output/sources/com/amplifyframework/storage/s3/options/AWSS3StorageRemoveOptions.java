package com.amplifyframework.storage.s3.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageRemoveOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageRemoveOptions extends StorageRemoveOptions {
    public /* synthetic */ AWSS3StorageRemoveOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageRemoveOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return Objects.equals(getAccessLevel(), aWSS3StorageRemoveOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageRemoveOptions.getTargetIdentityId()) && Objects.equals(getBucket(), aWSS3StorageRemoveOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public String toString() {
        return "AWSS3StorageRemoveOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageRemoveOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageRemoveOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public AWSS3StorageRemoveOptions build() {
            return new AWSS3StorageRemoveOptions(this, 0);
        }
    }

    private AWSS3StorageRemoveOptions(Builder builder) {
        super(builder);
    }
}
