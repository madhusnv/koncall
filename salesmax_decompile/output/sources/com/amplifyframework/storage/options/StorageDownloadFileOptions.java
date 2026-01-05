package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.options.StorageOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public class StorageDownloadFileOptions extends StorageOptions {

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageDownloadFileOptions> {
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder accessLevel(StorageAccessLevel storageAccessLevel) {
            return super.accessLevel(storageAccessLevel);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder bucket(StorageBucket storageBucket) {
            return super.bucket(storageBucket);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder targetIdentityId(String str) {
            return super.targetIdentityId(str);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageDownloadFileOptions build() {
            return new StorageDownloadFileOptions(this);
        }
    }

    public StorageDownloadFileOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId(), builder.getBucket());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageDownloadFileOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageDownloadFileOptions storageDownloadFileOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(storageDownloadFileOptions.getAccessLevel())).targetIdentityId(storageDownloadFileOptions.getTargetIdentityId())).bucket(storageDownloadFileOptions.getBucket());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageDownloadFileOptions)) {
            return false;
        }
        StorageDownloadFileOptions storageDownloadFileOptions = (StorageDownloadFileOptions) obj;
        return s6c.m47909a(getAccessLevel(), storageDownloadFileOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), storageDownloadFileOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), storageDownloadFileOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageAccessLevel getAccessLevel() {
        return super.getAccessLevel();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageBucket getBucket() {
        return super.getBucket();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ String getTargetIdentityId() {
        return super.getTargetIdentityId();
    }

    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getBucket());
    }

    public String toString() {
        return "StorageDownloadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }
}
