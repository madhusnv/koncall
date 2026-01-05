package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageUploadOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public class StorageUploadInputStreamOptions extends StorageUploadOptions {

    public static class Builder<B extends Builder<B>> extends StorageUploadOptions.Builder<B, StorageUploadInputStreamOptions> {
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageUploadInputStreamOptions build() {
            return new StorageUploadInputStreamOptions(this);
        }
    }

    public StorageUploadInputStreamOptions(Builder<?> builder) {
        super(builder);
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageUploadInputStreamOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageUploadInputStreamOptions storageUploadInputStreamOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(storageUploadInputStreamOptions.getAccessLevel())).targetIdentityId(storageUploadInputStreamOptions.getTargetIdentityId())).contentType(storageUploadInputStreamOptions.getContentType())).metadata(storageUploadInputStreamOptions.getMetadata())).bucket(storageUploadInputStreamOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadInputStreamOptions)) {
            return false;
        }
        StorageUploadInputStreamOptions storageUploadInputStreamOptions = (StorageUploadInputStreamOptions) obj;
        return s6c.m47909a(getAccessLevel(), storageUploadInputStreamOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), storageUploadInputStreamOptions.getTargetIdentityId()) && s6c.m47909a(getContentType(), storageUploadInputStreamOptions.getContentType()) && s6c.m47909a(getMetadata(), storageUploadInputStreamOptions.getMetadata()) && s6c.m47909a(getBucket(), storageUploadInputStreamOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "StorageUploadInputStreamOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }
}
