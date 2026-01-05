package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
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
        if (obj == null || StorageUploadFileResult.class != obj.getClass()) {
            return false;
        }
        StorageUploadFileResult storageUploadFileResult = (StorageUploadFileResult) obj;
        return s6c.m47909a(super.getKey(), storageUploadFileResult.getKey()) && s6c.m47909a(super.getPath(), storageUploadFileResult.getPath());
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
