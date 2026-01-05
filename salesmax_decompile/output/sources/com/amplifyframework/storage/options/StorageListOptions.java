package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.options.StorageOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public class StorageListOptions extends StorageOptions {

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageListOptions> {
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
        public StorageListOptions build() {
            return new StorageListOptions(this);
        }
    }

    public StorageListOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId(), builder.getBucket());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageListOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageListOptions storageListOptions) {
        return (Builder) ((Builder) ((Builder) builder().accessLevel(storageListOptions.getAccessLevel())).targetIdentityId(storageListOptions.getTargetIdentityId())).bucket(storageListOptions.getBucket());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageListOptions)) {
            return false;
        }
        StorageListOptions storageListOptions = (StorageListOptions) obj;
        return s6c.m47909a(getAccessLevel(), storageListOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), storageListOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), storageListOptions.getBucket());
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
        return "StorageListOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + '}';
    }
}
