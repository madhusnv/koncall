package com.amplifyframework.storage.s3.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageGetUrlOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlOptions extends StorageGetUrlOptions {
    private final boolean useAccelerationMode;
    private final boolean validateObjectExistence;

    public /* synthetic */ AWSS3StorageGetPresignedUrlOptions(Builder builder, int i10) {
        this(builder);
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageGetPresignedUrlOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return Objects.equals(getAccessLevel(), aWSS3StorageGetPresignedUrlOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageGetPresignedUrlOptions.getTargetIdentityId()) && Integer.valueOf(getExpires()).equals(Integer.valueOf(aWSS3StorageGetPresignedUrlOptions.getExpires())) && Objects.equals(getBucket(), aWSS3StorageGetPresignedUrlOptions.getBucket()) && Boolean.valueOf(getValidateObjectExistence()).equals(Boolean.valueOf(aWSS3StorageGetPresignedUrlOptions.getValidateObjectExistence()));
    }

    public boolean getValidateObjectExistence() {
        return this.validateObjectExistence;
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), Integer.valueOf(getExpires()), Boolean.valueOf(getValidateObjectExistence()), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public String toString() {
        return "AWSS3StorageGetPresignedUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", expires=" + getExpires() + ", validateObjectExistence=" + getValidateObjectExistence() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageGetUrlOptions.Builder<Builder> {
        private boolean useAccelerateEndpoint;
        private boolean validateObjectExistence;

        public Builder setUseAccelerateEndpoint(boolean z6) {
            this.useAccelerateEndpoint = z6;
            return this;
        }

        public Builder setValidateObjectExistence(boolean z6) {
            this.validateObjectExistence = z6;
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageGetUrlOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageGetPresignedUrlOptions build() {
            return new AWSS3StorageGetPresignedUrlOptions(this, 0);
        }
    }

    private AWSS3StorageGetPresignedUrlOptions(Builder builder) {
        super(builder);
        this.useAccelerationMode = builder.useAccelerateEndpoint;
        this.validateObjectExistence = builder.validateObjectExistence;
    }
}
