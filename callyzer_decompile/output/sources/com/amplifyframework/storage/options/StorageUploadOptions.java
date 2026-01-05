package com.amplifyframework.storage.options;

import com.amplifyframework.storage.options.StorageOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class StorageUploadOptions extends StorageOptions {
    private final String contentType;
    private final Map<String, String> metadata;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<B extends Builder<B, O>, O extends StorageOptions> extends StorageOptions.Builder<B, O> {
        private String contentType;
        private Map<String, String> metadata = new HashMap();

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
        return Objects.equals(getAccessLevel(), storageUploadOptions.getAccessLevel()) && Objects.equals(getTargetIdentityId(), storageUploadOptions.getTargetIdentityId()) && Objects.equals(getContentType(), storageUploadOptions.getContentType()) && Objects.equals(getMetadata(), storageUploadOptions.getMetadata()) && Objects.equals(getBucket(), storageUploadOptions.getBucket());
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getMetadata() {
        return Immutable.of(this.metadata);
    }

    public int hashCode() {
        return Objects.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata(), getBucket());
    }

    public String toString() {
        return "StorageUploadOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + ", bucket=" + getBucket() + '}';
    }
}
