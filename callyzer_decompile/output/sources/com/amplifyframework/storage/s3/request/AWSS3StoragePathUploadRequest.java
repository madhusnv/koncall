package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import i0.m0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathUploadRequest<L> {
    private final String contentType;
    private final L local;
    private final Map<String, String> metadata;
    private final StoragePath path;
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerateEndpoint;

    public AWSS3StoragePathUploadRequest(StoragePath path, L l9, String str, ServerSideEncryption serverSideEncryption, Map<String, String> metadata, boolean z6) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(serverSideEncryption, "serverSideEncryption");
        AbstractC4154l.m8923f(metadata, "metadata");
        this.path = path;
        this.local = l9;
        this.contentType = str;
        this.serverSideEncryption = serverSideEncryption;
        this.metadata = metadata;
        this.useAccelerateEndpoint = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSS3StoragePathUploadRequest copy$default(AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest, StoragePath storagePath, Object obj, String str, ServerSideEncryption serverSideEncryption, Map map, boolean z6, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            storagePath = aWSS3StoragePathUploadRequest.path;
        }
        L l9 = obj;
        if ((i10 & 2) != 0) {
            l9 = aWSS3StoragePathUploadRequest.local;
        }
        if ((i10 & 4) != 0) {
            str = aWSS3StoragePathUploadRequest.contentType;
        }
        if ((i10 & 8) != 0) {
            serverSideEncryption = aWSS3StoragePathUploadRequest.serverSideEncryption;
        }
        if ((i10 & 16) != 0) {
            map = aWSS3StoragePathUploadRequest.metadata;
        }
        if ((i10 & 32) != 0) {
            z6 = aWSS3StoragePathUploadRequest.useAccelerateEndpoint;
        }
        Map map2 = map;
        boolean z10 = z6;
        return aWSS3StoragePathUploadRequest.copy(storagePath, l9, str, serverSideEncryption, map2, z10);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final L component2() {
        return this.local;
    }

    public final String component3() {
        return this.contentType;
    }

    public final ServerSideEncryption component4() {
        return this.serverSideEncryption;
    }

    public final Map<String, String> component5() {
        return this.metadata;
    }

    public final boolean component6() {
        return this.useAccelerateEndpoint;
    }

    public final AWSS3StoragePathUploadRequest<L> copy(StoragePath path, L l9, String str, ServerSideEncryption serverSideEncryption, Map<String, String> metadata, boolean z6) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(serverSideEncryption, "serverSideEncryption");
        AbstractC4154l.m8923f(metadata, "metadata");
        return new AWSS3StoragePathUploadRequest<>(path, l9, str, serverSideEncryption, metadata, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathUploadRequest)) {
            return false;
        }
        AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest = (AWSS3StoragePathUploadRequest) obj;
        return AbstractC4154l.m8918a(this.path, aWSS3StoragePathUploadRequest.path) && AbstractC4154l.m8918a(this.local, aWSS3StoragePathUploadRequest.local) && AbstractC4154l.m8918a(this.contentType, aWSS3StoragePathUploadRequest.contentType) && this.serverSideEncryption == aWSS3StoragePathUploadRequest.serverSideEncryption && AbstractC4154l.m8918a(this.metadata, aWSS3StoragePathUploadRequest.metadata) && this.useAccelerateEndpoint == aWSS3StoragePathUploadRequest.useAccelerateEndpoint;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final L getLocal() {
        return this.local;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final StoragePath getPath() {
        return this.path;
    }

    public final ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public final boolean getUseAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        L l9 = this.local;
        int iHashCode2 = (iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str = this.contentType;
        return Boolean.hashCode(this.useAccelerateEndpoint) + m0.m7369b((this.serverSideEncryption.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.metadata);
    }

    public String toString() {
        return "AWSS3StoragePathUploadRequest(path=" + this.path + ", local=" + this.local + ", contentType=" + this.contentType + ", serverSideEncryption=" + this.serverSideEncryption + ", metadata=" + this.metadata + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ")";
    }
}
