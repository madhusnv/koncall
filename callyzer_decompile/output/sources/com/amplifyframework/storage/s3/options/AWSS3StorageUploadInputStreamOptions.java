package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageUploadInputStreamOptions extends StorageUploadInputStreamOptions {
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerationMode;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageUploadInputStreamOptions.Builder<Builder> {
        private ServerSideEncryption serverSideEncryption;
        private boolean useAccelerateEndpoint;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder serverSideEncryption(ServerSideEncryption serverSideEncryption) {
            Objects.requireNonNull(serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder setUseAccelerateEndpoint(boolean z6) {
            this.useAccelerateEndpoint = z6;
            return this;
        }

        private Builder() {
            this.serverSideEncryption = ServerSideEncryption.NONE;
        }

        @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageUploadInputStreamOptions build() {
            return new AWSS3StorageUploadInputStreamOptions(this, 0);
        }
    }

    public /* synthetic */ AWSS3StorageUploadInputStreamOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static AWSS3StorageUploadInputStreamOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageUploadInputStreamOptions aWSS3StorageUploadInputStreamOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageUploadInputStreamOptions.getAccessLevel())).targetIdentityId(aWSS3StorageUploadInputStreamOptions.getTargetIdentityId())).contentType(aWSS3StorageUploadInputStreamOptions.getContentType())).serverSideEncryption(aWSS3StorageUploadInputStreamOptions.getServerSideEncryption()).metadata(aWSS3StorageUploadInputStreamOptions.getMetadata())).bucket(aWSS3StorageUploadInputStreamOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageUploadInputStreamOptions)) {
            return false;
        }
        AWSS3StorageUploadInputStreamOptions aWSS3StorageUploadInputStreamOptions = (AWSS3StorageUploadInputStreamOptions) obj;
        return Objects.equals(getAccessLevel(), aWSS3StorageUploadInputStreamOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageUploadInputStreamOptions.getTargetIdentityId()) && Objects.equals(getContentType(), aWSS3StorageUploadInputStreamOptions.getContentType()) && Objects.equals(getServerSideEncryption(), aWSS3StorageUploadInputStreamOptions.getServerSideEncryption()) && Objects.equals(getMetadata(), aWSS3StorageUploadInputStreamOptions.getMetadata()) && Objects.equals(getBucket(), aWSS3StorageUploadInputStreamOptions.getBucket());
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getServerSideEncryption(), getMetadata(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "AWSS3StorageUploadInputStreamOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", serverSideEncryption=" + getServerSideEncryption().getName() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    private AWSS3StorageUploadInputStreamOptions(Builder builder) {
        super(builder);
        this.serverSideEncryption = builder.serverSideEncryption;
        this.useAccelerationMode = builder.useAccelerateEndpoint;
    }
}
