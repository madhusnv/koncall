package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.options.StorageOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public class StorageGetUrlOptions extends StorageOptions {
    private final int expires;

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageGetUrlOptions> {
        private int expires;

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder accessLevel(StorageAccessLevel storageAccessLevel) {
            return super.accessLevel(storageAccessLevel);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder bucket(StorageBucket storageBucket) {
            return super.bucket(storageBucket);
        }

        public final B expires(int i) {
            this.expires = i;
            return this;
        }

        public final int getExpires() {
            return this.expires;
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder targetIdentityId(String str) {
            return super.targetIdentityId(str);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageGetUrlOptions build() {
            return new StorageGetUrlOptions(this);
        }
    }

    public StorageGetUrlOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId(), builder.getBucket());
        this.expires = builder.getExpires();
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageGetUrlOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageGetUrlOptions storageGetUrlOptions) {
        return ((Builder) ((Builder) ((Builder) builder().accessLevel(storageGetUrlOptions.getAccessLevel())).targetIdentityId(storageGetUrlOptions.getTargetIdentityId())).bucket(storageGetUrlOptions.getBucket())).expires(storageGetUrlOptions.getExpires());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetUrlOptions)) {
            return false;
        }
        StorageGetUrlOptions storageGetUrlOptions = (StorageGetUrlOptions) obj;
        return s6c.m47909a(getAccessLevel(), storageGetUrlOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), storageGetUrlOptions.getTargetIdentityId()) && s6c.m47909a(getBucket(), storageGetUrlOptions.getBucket()) && s6c.m47909a(Integer.valueOf(getExpires()), Integer.valueOf(storageGetUrlOptions.getExpires()));
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageAccessLevel getAccessLevel() {
        return super.getAccessLevel();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageBucket getBucket() {
        return super.getBucket();
    }

    public int getExpires() {
        return this.expires;
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ String getTargetIdentityId() {
        return super.getTargetIdentityId();
    }

    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getBucket(), Integer.valueOf(getExpires()));
    }

    public String toString() {
        return "StorageGetUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", bucket=" + getBucket() + ", expires=" + getExpires() + '}';
    }
}
