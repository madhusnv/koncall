package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageUploadFileOptions extends StorageUploadFileOptions {
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerationMode;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StorageUploadFileOptions.Builder<Builder> {
        private ServerSideEncryption serverSideEncryption;
        private boolean useAccelerateEndpoint;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public ServerSideEncryption getServerSideEncryption() {
            return this.serverSideEncryption;
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

        @Override // com.amplifyframework.storage.options.StorageUploadFileOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageUploadFileOptions build() {
            return new AWSS3StorageUploadFileOptions(this, 0);
        }
    }

    public /* synthetic */ AWSS3StorageUploadFileOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static AWSS3StorageUploadFileOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageUploadFileOptions aWSS3StorageUploadFileOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageUploadFileOptions.getAccessLevel())).targetIdentityId(aWSS3StorageUploadFileOptions.getTargetIdentityId())).contentType(aWSS3StorageUploadFileOptions.getContentType())).serverSideEncryption(aWSS3StorageUploadFileOptions.getServerSideEncryption()).metadata(aWSS3StorageUploadFileOptions.getMetadata())).bucket(aWSS3StorageUploadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadFileOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageUploadFileOptions)) {
            return false;
        }
        AWSS3StorageUploadFileOptions aWSS3StorageUploadFileOptions = (AWSS3StorageUploadFileOptions) obj;
        return Objects.equals(getAccessLevel(), aWSS3StorageUploadFileOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), aWSS3StorageUploadFileOptions.getTargetIdentityId()) && Objects.equals(getContentType(), aWSS3StorageUploadFileOptions.getContentType()) && Objects.equals(getServerSideEncryption(), aWSS3StorageUploadFileOptions.getServerSideEncryption()) && Objects.equals(getMetadata(), aWSS3StorageUploadFileOptions.getMetadata()) && Objects.equals(getBucket(), aWSS3StorageUploadFileOptions.getBucket());
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    @Override // com.amplifyframework.storage.options.StorageUploadFileOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getServerSideEncryption(), getMetadata(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadFileOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "AWSS3StorageUploadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", serverSideEncryption=" + getServerSideEncryption().getName() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerationMode;
    }

    private AWSS3StorageUploadFileOptions(Builder builder) {
        super(builder);
        this.serverSideEncryption = builder.getServerSideEncryption();
        this.useAccelerationMode = builder.useAccelerateEndpoint;
    }
}
