package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public class StorageUploadResult extends StorageTransferResult {
    private final String key;
    private final String path;

    @InternalAmplifyApi
    public StorageUploadResult(String str, String str2) {
        this.path = str;
        this.key = str2;
    }

    @Deprecated
    public static StorageUploadResult fromKey(String str) {
        Objects.requireNonNull(str);
        return new StorageUploadResult(str, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageUploadResult storageUploadResult = (StorageUploadResult) obj;
        return s6c.m47909a(this.key, storageUploadResult.key) && s6c.m47909a(this.path, storageUploadResult.path);
    }

    @Deprecated
    public String getKey() {
        return this.key;
    }

    public String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
