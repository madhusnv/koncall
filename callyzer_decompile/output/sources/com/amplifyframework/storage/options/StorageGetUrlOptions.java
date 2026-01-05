package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StorageGetUrlOptions extends StorageOptions {
    private final int expires;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageGetUrlOptions> {
        private int expires;

        public final B expires(int i10) {
            this.expires = i10;
            return this;
        }

        public final int getExpires() {
            return this.expires;
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
        return ((Builder) ((Builder) ((Builder) builder().accessLevel(super.getAccessLevel())).targetIdentityId(super.getTargetIdentityId())).bucket(super.getBucket())).expires(storageGetUrlOptions.getExpires());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetUrlOptions)) {
            return false;
        }
        StorageGetUrlOptions storageGetUrlOptions = (StorageGetUrlOptions) obj;
        return Objects.equals(super.getAccessLevel(), super.getAccessLevel()) && Objects.equals(super.getTargetIdentityId(), super.getTargetIdentityId()) && Objects.equals(super.getBucket(), super.getBucket()) && Integer.valueOf(getExpires()).equals(Integer.valueOf(storageGetUrlOptions.getExpires()));
    }

    public int getExpires() {
        return this.expires;
    }

    public int hashCode() {
        return Objects.hash(super.getAccessLevel(), super.getTargetIdentityId(), super.getBucket(), Integer.valueOf(getExpires()));
    }

    public String toString() {
        return "StorageGetUrlOptions {accessLevel=" + super.getAccessLevel() + ", targetIdentityId=" + super.getTargetIdentityId() + ", bucket=" + super.getBucket() + ", expires=" + getExpires() + '}';
    }
}
