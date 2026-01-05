package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathDownloadFileRequest {
    private final File local;
    private final StoragePath path;
    private final boolean useAccelerateEndpoint;

    public AWSS3StoragePathDownloadFileRequest(StoragePath path, File local, boolean z6) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(local, "local");
        this.path = path;
        this.local = local;
        this.useAccelerateEndpoint = z6;
    }

    public static /* synthetic */ AWSS3StoragePathDownloadFileRequest copy$default(AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, StoragePath storagePath, File file, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storagePath = aWSS3StoragePathDownloadFileRequest.path;
        }
        if ((i10 & 2) != 0) {
            file = aWSS3StoragePathDownloadFileRequest.local;
        }
        if ((i10 & 4) != 0) {
            z6 = aWSS3StoragePathDownloadFileRequest.useAccelerateEndpoint;
        }
        return aWSS3StoragePathDownloadFileRequest.copy(storagePath, file, z6);
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

    public final AWSS3StoragePathDownloadFileRequest copy(StoragePath path, File local, boolean z6) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(local, "local");
        return new AWSS3StoragePathDownloadFileRequest(path, local, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathDownloadFileRequest)) {
            return false;
        }
        AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest = (AWSS3StoragePathDownloadFileRequest) obj;
        return AbstractC4154l.m8918a(this.path, aWSS3StoragePathDownloadFileRequest.path) && AbstractC4154l.m8918a(this.local, aWSS3StoragePathDownloadFileRequest.local) && this.useAccelerateEndpoint == aWSS3StoragePathDownloadFileRequest.useAccelerateEndpoint;
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

    public int hashCode() {
        return Boolean.hashCode(this.useAccelerateEndpoint) + ((this.local.hashCode() + (this.path.hashCode() * 31)) * 31);
    }

    public String toString() {
        StoragePath storagePath = this.path;
        File file = this.local;
        boolean z6 = this.useAccelerateEndpoint;
        StringBuilder sb2 = new StringBuilder("AWSS3StoragePathDownloadFileRequest(path=");
        sb2.append(storagePath);
        sb2.append(", local=");
        sb2.append(file);
        sb2.append(", useAccelerateEndpoint=");
        return AbstractC5601a.m11242m(sb2, z6, ")");
    }
}
