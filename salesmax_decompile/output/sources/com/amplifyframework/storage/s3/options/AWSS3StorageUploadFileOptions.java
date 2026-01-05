package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSS3StorageUploadFileOptions extends StorageUploadFileOptions {
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerationMode;

    public static final class Builder extends StorageUploadFileOptions.Builder<Builder> {
        private ServerSideEncryption serverSideEncryption;
        private boolean useAccelerateEndpoint;

        public ServerSideEncryption getServerSideEncryption() {
            return this.serverSideEncryption;
        }

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

        @Override // com.amplifyframework.storage.options.StorageUploadFileOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageUploadFileOptions build() {
            return new AWSS3StorageUploadFileOptions(this);
        }
    }

    public static Builder builder() {
        return new Builder();
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
        return s6c.m47909a(getAccessLevel(), aWSS3StorageUploadFileOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), aWSS3StorageUploadFileOptions.getTargetIdentityId()) && s6c.m47909a(getContentType(), aWSS3StorageUploadFileOptions.getContentType()) && s6c.m47909a(getServerSideEncryption(), aWSS3StorageUploadFileOptions.getServerSideEncryption()) && s6c.m47909a(getMetadata(), aWSS3StorageUploadFileOptions.getMetadata()) && s6c.m47909a(getBucket(), aWSS3StorageUploadFileOptions.getBucket());
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    @Override // com.amplifyframework.storage.options.StorageUploadFileOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getContentType(), getServerSideEncryption(), getMetadata(), getBucket());
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
