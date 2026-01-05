package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageUploadInputStreamResult extends StorageUploadResult {
    @InternalAmplifyApi
    public StorageUploadInputStreamResult(String str, String str2) {
        super(str, str2);
    }

    @Deprecated
    public static StorageUploadInputStreamResult fromKey(String str) {
        Objects.requireNonNull(str);
        return new StorageUploadInputStreamResult(str, str);
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && StorageUploadInputStreamResult.class == obj.getClass() && Objects.equals(super.getKey(), ((StorageUploadInputStreamResult) obj).getKey()) && Objects.equals(super.getPath(), getPath());
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
