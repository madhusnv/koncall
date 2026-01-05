package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageUploadOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StorageUploadFileOptions extends StorageUploadOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder<B extends Builder<B>> extends StorageUploadOptions.Builder<B, StorageUploadFileOptions> {
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageUploadFileOptions build() {
            return new StorageUploadFileOptions(this);
        }
    }

    public StorageUploadFileOptions(Builder<?> builder) {
        super(builder);
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageUploadFileOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageUploadFileOptions storageUploadFileOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(storageUploadFileOptions.getAccessLevel())).targetIdentityId(storageUploadFileOptions.getTargetIdentityId())).contentType(storageUploadFileOptions.getContentType())).metadata(storageUploadFileOptions.getMetadata())).bucket(storageUploadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadFileOptions)) {
            return false;
        }
        StorageUploadFileOptions storageUploadFileOptions = (StorageUploadFileOptions) obj;
        return Objects.equals(getAccessLevel(), storageUploadFileOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), storageUploadFileOptions.getTargetIdentityId()) && Objects.equals(getContentType(), storageUploadFileOptions.getContentType()) && Objects.equals(getMetadata(), storageUploadFileOptions.getMetadata()) && Objects.equals(getBucket(), storageUploadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata(), getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "StorageUploadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }
}
