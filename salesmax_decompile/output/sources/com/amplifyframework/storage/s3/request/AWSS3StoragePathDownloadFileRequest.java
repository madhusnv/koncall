package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathDownloadFileRequest {
    private final File local;
    private final StoragePath path;
    private final boolean useAccelerateEndpoint;

    public AWSS3StoragePathDownloadFileRequest(StoragePath storagePath, File file, boolean z) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        sq8.m48649h(file, ImagesContract.LOCAL);
        this.path = storagePath;
        this.local = file;
        this.useAccelerateEndpoint = z;
    }

    public static /* synthetic */ AWSS3StoragePathDownloadFileRequest copy$default(AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, StoragePath storagePath, File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            storagePath = aWSS3StoragePathDownloadFileRequest.path;
        }
        if ((i & 2) != 0) {
            file = aWSS3StoragePathDownloadFileRequest.local;
        }
        if ((i & 4) != 0) {
            z = aWSS3StoragePathDownloadFileRequest.useAccelerateEndpoint;
        }
        return aWSS3StoragePathDownloadFileRequest.copy(storagePath, file, z);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final File component2() {
        return this.local;
    }

    public final boolean component3() {
        return this.useAccelerateEndpoint;
    }

    public final AWSS3StoragePathDownloadFileRequest copy(StoragePath storagePath, File file, boolean z) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        sq8.m48649h(file, ImagesContract.LOCAL);
        return new AWSS3StoragePathDownloadFileRequest(storagePath, file, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathDownloadFileRequest)) {
            return false;
        }
        AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest = (AWSS3StoragePathDownloadFileRequest) obj;
        return sq8.m48644c(this.path, aWSS3StoragePathDownloadFileRequest.path) && sq8.m48644c(this.local, aWSS3StoragePathDownloadFileRequest.local) && this.useAccelerateEndpoint == aWSS3StoragePathDownloadFileRequest.useAccelerateEndpoint;
    }

    public final File getLocal() {
        return this.local;
    }

    public final StoragePath getPath() {
        return this.path;
    }

    public final boolean getUseAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + this.local.hashCode()) * 31;
        boolean z = this.useAccelerateEndpoint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        return "AWSS3StoragePathDownloadFileRequest(path=" + this.path + ", local=" + this.local + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ")";
    }
}
