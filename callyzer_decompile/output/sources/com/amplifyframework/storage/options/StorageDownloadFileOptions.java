package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StorageDownloadFileOptions extends StorageOptions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageDownloadFileOptions> {
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
        return (Builder) ((Builder) ((Builder) builder().accessLevel(super.getAccessLevel())).targetIdentityId(super.getTargetIdentityId())).bucket(super.getBucket());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageDownloadFileOptions)) {
            return false;
        }
        StorageDownloadFileOptions storageDownloadFileOptions = (StorageDownloadFileOptions) obj;
        return Objects.equals(super.getAccessLevel(), super.getAccessLevel()) && Objects.equals(super.getTargetIdentityId(), super.getTargetIdentityId()) && Objects.equals(super.getBucket(), super.getBucket());
    }

    public int hashCode() {
        return Objects.hash(super.getAccessLevel(), super.getTargetIdentityId(), super.getBucket());
    }

    public String toString() {
        return "StorageDownloadFileOptions {accessLevel=" + super.getAccessLevel() + ", targetIdentityId=" + super.getTargetIdentityId() + ", bucket=" + super.getBucket() + '}';
    }
}
