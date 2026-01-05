package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageUploadFileResult extends StorageUploadResult {
    @InternalAmplifyApi
    public StorageUploadFileResult(String str, String str2) {
        super(str, str2);
    }

    @Deprecated
    public static StorageUploadFileResult fromKey(String str) {
        Objects.requireNonNull(str);
        return new StorageUploadFileResult(str, str);
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StorageUploadFileResult.class == obj.getClass()) {
            StorageUploadFileResult storageUploadFileResult = (StorageUploadFileResult) obj;
            if (Objects.equals(super.getKey(), storageUploadFileResult.getKey()) && Objects.equals(super.getPath(), storageUploadFileResult.getPath())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
