package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageRemoveResult {
    private final String key;
    private final String path;

    @InternalAmplifyApi
    public StorageRemoveResult(String str, String str2) {
        this.path = str;
        this.key = str2;
    }

    @Deprecated
    public static StorageRemoveResult fromKey(String str) {
        Objects.requireNonNull(str);
        return new StorageRemoveResult(str, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StorageRemoveResult.class == obj.getClass()) {
            StorageRemoveResult storageRemoveResult = (StorageRemoveResult) obj;
            if (Objects.equals(this.path, storageRemoveResult.path) && Objects.equals(this.key, storageRemoveResult.key)) {
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
        return Objects.hash(this.path, this.key);
    }
}
