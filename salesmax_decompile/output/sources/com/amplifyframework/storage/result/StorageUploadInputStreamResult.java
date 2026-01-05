package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
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
        if (obj == null || StorageUploadInputStreamResult.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(super.getKey(), ((StorageUploadInputStreamResult) obj).getKey()) && s6c.m47909a(super.getPath(), getPath());
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
