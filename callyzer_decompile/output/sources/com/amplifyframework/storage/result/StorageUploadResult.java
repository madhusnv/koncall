package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && getClass() == obj.getClass()) {
            StorageUploadResult storageUploadResult = (StorageUploadResult) obj;
            if (Objects.equals(this.key, storageUploadResult.key) && Objects.equals(this.path, storageUploadResult.path)) {
                return true;
            }
        }
        return false;
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
