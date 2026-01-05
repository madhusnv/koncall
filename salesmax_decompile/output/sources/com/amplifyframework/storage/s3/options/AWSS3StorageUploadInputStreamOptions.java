package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageUploadInputStreamOptions extends StorageUploadInputStreamOptions {
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerationMode;

    public static final class Builder extends StorageUploadInputStreamOptions.Builder<Builder> {
        private ServerSideEncryption serverSideEncryption;
        private boolean useAccelerateEndpoint;

        public Builder serverSideEncryption(ServerSideEncryption serverSideEncryption) {
            Objects.requireNonNull(serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder setUseAccelerateEndpoint(boolean z) {
            this.useAccelerateEndpoint = z;
            return this;
        }

        private Builder() {
            this.serverSideEncryption = ServerSideEncryption.NONE;
        }

        @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageUploadInputStreamOptions build() {
            return new AWSS3StorageUploadInputStreamOptions(this);
        }
    }

    public static Builder builder() {
        return new Builder();
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
        return s6c.m47909a(getAccessLevel(), aWSS3StorageUploadInputStreamOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageUploadInputStreamOptions.getTargetIdentityId()) && s6c.m47909a(getContentType(), aWSS3StorageUploadInputStreamOptions.getContentType()) && s6c.m47909a(getServerSideEncryption(), aWSS3StorageUploadInputStreamOptions.getServerSideEncryption()) && s6c.m47909a(getMetadata(), aWSS3StorageUploadInputStreamOptions.getMetadata()) && s6c.m47909a(getBucket(), aWSS3StorageUploadInputStreamOptions.getBucket());
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getContentType(), getServerSideEncryption(), getMetadata(), getBucket());
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
