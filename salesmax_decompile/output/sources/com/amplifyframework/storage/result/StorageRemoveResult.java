package com.amplifyframework.storage.result;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
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
        if (obj == null || StorageRemoveResult.class != obj.getClass()) {
            return false;
        }
        StorageRemoveResult storageRemoveResult = (StorageRemoveResult) obj;
        return s6c.m47909a(this.path, storageRemoveResult.path) && s6c.m47909a(this.key, storageRemoveResult.key);
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
