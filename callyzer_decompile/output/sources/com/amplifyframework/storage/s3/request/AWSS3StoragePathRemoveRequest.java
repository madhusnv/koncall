package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathRemoveRequest {
    private final StoragePath path;

    public AWSS3StoragePathRemoveRequest(StoragePath path) {
        AbstractC4154l.m8923f(path, "path");
        this.path = path;
    }

    public static /* synthetic */ AWSS3StoragePathRemoveRequest copy$default(AWSS3StoragePathRemoveRequest aWSS3StoragePathRemoveRequest, StoragePath storagePath, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storagePath = aWSS3StoragePathRemoveRequest.path;
        }
        return aWSS3StoragePathRemoveRequest.copy(storagePath);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final AWSS3StoragePathRemoveRequest copy(StoragePath path) {
        AbstractC4154l.m8923f(path, "path");
        return new AWSS3StoragePathRemoveRequest(path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSS3StoragePathRemoveRequest) && AbstractC4154l.m8918a(this.path, ((AWSS3StoragePathRemoveRequest) obj).path);
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
