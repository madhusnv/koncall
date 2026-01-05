package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathRemoveRequest {
    private final StoragePath path;

    public AWSS3StoragePathRemoveRequest(StoragePath storagePath) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        this.path = storagePath;
    }

    public static /* synthetic */ AWSS3StoragePathRemoveRequest copy$default(AWSS3StoragePathRemoveRequest aWSS3StoragePathRemoveRequest, StoragePath storagePath, int i, Object obj) {
        if ((i & 1) != 0) {
            storagePath = aWSS3StoragePathRemoveRequest.path;
        }
        return aWSS3StoragePathRemoveRequest.copy(storagePath);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final AWSS3StoragePathRemoveRequest copy(StoragePath storagePath) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        return new AWSS3StoragePathRemoveRequest(storagePath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSS3StoragePathRemoveRequest) && sq8.m48644c(this.path, ((AWSS3StoragePathRemoveRequest) obj).path);
    }

    public final StoragePath getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "AWSS3StoragePathRemoveRequest(path=" + this.path + ")";
    }
}
