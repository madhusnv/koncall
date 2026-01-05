package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageDownloadFileOptions extends StorageDownloadFileOptions {
    private final boolean useAccelerationMode;

    public /* synthetic */ AWSS3StorageDownloadFileOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageDownloadFileOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return Objects.equals(getAccessLevel(), aWSS3StorageDownloadFileOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageDownloadFileOptions.getTargetIdentityId()) && Objects.equals(getBucket(), aWSS3StorageDownloadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public String toString() {
        return "AWSS3StorageDownloadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", useAccelerationMode=" + useAccelerateEndpoint() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageDownloadFileOptions.Builder<Builder> {
        private boolean useAccelerateEndpoint;

        public Builder setUseAccelerateEndpoint(boolean z6) {
            this.useAccelerateEndpoint = z6;
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageDownloadFileOptions build() {
            return new AWSS3StorageDownloadFileOptions(this, 0);
        }
    }

    private AWSS3StorageDownloadFileOptions(Builder builder) {
        super(builder);
        this.useAccelerationMode = builder.useAccelerateEndpoint;
    }
}
