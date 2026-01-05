package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageUploadOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StorageUploadInputStreamOptions extends StorageUploadOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
        return Objects.equals(getAccessLevel(), storageUploadInputStreamOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), storageUploadInputStreamOptions.getTargetIdentityId()) && Objects.equals(getContentType(), storageUploadInputStreamOptions.getContentType()) && Objects.equals(getMetadata(), storageUploadInputStreamOptions.getMetadata()) && Objects.equals(getBucket(), storageUploadInputStreamOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "StorageUploadInputStreamOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }
}
