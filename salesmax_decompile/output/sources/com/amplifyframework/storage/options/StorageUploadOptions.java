package com.amplifyframework.storage.options;

import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.options.StorageOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public abstract class StorageUploadOptions extends StorageOptions {
    private final String contentType;
    private final Map<String, String> metadata;

    public static abstract class Builder<B extends Builder<B, O>, O extends StorageOptions> extends StorageOptions.Builder<B, O> {
        private String contentType;
        private Map<String, String> metadata = new HashMap();

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder accessLevel(StorageAccessLevel storageAccessLevel) {
            return super.accessLevel(storageAccessLevel);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder bucket(StorageBucket storageBucket) {
            return super.bucket(storageBucket);
        }

        public final B contentType(String str) {
            this.contentType = str;
            return this;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Map<String, String> getMetadata() {
            return Immutable.of(this.metadata);
        }

        public final B metadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata = new HashMap(map);
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder targetIdentityId(String str) {
            return super.targetIdentityId(str);
        }
    }

    public <B extends Builder<B, O>, O extends StorageUploadOptions> StorageUploadOptions(Builder<B, O> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId(), builder.getBucket());
        this.contentType = builder.getContentType();
        this.metadata = builder.getMetadata();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadOptions)) {
            return false;
        }
        StorageUploadOptions storageUploadOptions = (StorageUploadOptions) obj;
        return s6c.m47909a(getAccessLevel(), storageUploadOptions.getAccessLevel()) && s6c.m47909a(getTargetIdentityId(), storageUploadOptions.getTargetIdentityId()) && s6c.m47909a(getContentType(), storageUploadOptions.getContentType()) && s6c.m47909a(getMetadata(), storageUploadOptions.getMetadata()) && s6c.m47909a(getBucket(), storageUploadOptions.getBucket());
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageAccessLevel getAccessLevel() {
        return super.getAccessLevel();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageBucket getBucket() {
        return super.getBucket();
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getMetadata() {
        return Immutable.of(this.metadata);
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ String getTargetIdentityId() {
        return super.getTargetIdentityId();
    }

    public int hashCode() {
        return s6c.m47910b(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata(), getBucket());
    }

    public String toString() {
        return "StorageUploadOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }
}
