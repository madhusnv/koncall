package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathUploadRequest<L> {
    private final String contentType;
    private final L local;
    private final Map<String, String> metadata;
    private final StoragePath path;
    private final ServerSideEncryption serverSideEncryption;
    private final boolean useAccelerateEndpoint;

    public AWSS3StoragePathUploadRequest(StoragePath storagePath, L l, String str, ServerSideEncryption serverSideEncryption, Map<String, String> map, boolean z) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        sq8.m48649h(serverSideEncryption, "serverSideEncryption");
        sq8.m48649h(map, "metadata");
        this.path = storagePath;
        this.local = l;
        this.contentType = str;
        this.serverSideEncryption = serverSideEncryption;
        this.metadata = map;
        this.useAccelerateEndpoint = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSS3StoragePathUploadRequest copy$default(AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest, StoragePath storagePath, Object obj, String str, ServerSideEncryption serverSideEncryption, Map map, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            storagePath = aWSS3StoragePathUploadRequest.path;
        }
        L l = obj;
        if ((i & 2) != 0) {
            l = aWSS3StoragePathUploadRequest.local;
        }
        L l2 = l;
        if ((i & 4) != 0) {
            str = aWSS3StoragePathUploadRequest.contentType;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            serverSideEncryption = aWSS3StoragePathUploadRequest.serverSideEncryption;
        }
        ServerSideEncryption serverSideEncryption2 = serverSideEncryption;
        if ((i & 16) != 0) {
            map = aWSS3StoragePathUploadRequest.metadata;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            z = aWSS3StoragePathUploadRequest.useAccelerateEndpoint;
        }
        return aWSS3StoragePathUploadRequest.copy(storagePath, l2, str2, serverSideEncryption2, map2, z);
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

    public final AWSS3StoragePathUploadRequest<L> copy(StoragePath storagePath, L l, String str, ServerSideEncryption serverSideEncryption, Map<String, String> map, boolean z) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        sq8.m48649h(serverSideEncryption, "serverSideEncryption");
        sq8.m48649h(map, "metadata");
        return new AWSS3StoragePathUploadRequest<>(storagePath, l, str, serverSideEncryption, map, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathUploadRequest)) {
            return false;
        }
        AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest = (AWSS3StoragePathUploadRequest) obj;
        return sq8.m48644c(this.path, aWSS3StoragePathUploadRequest.path) && sq8.m48644c(this.local, aWSS3StoragePathUploadRequest.local) && sq8.m48644c(this.contentType, aWSS3StoragePathUploadRequest.contentType) && this.serverSideEncryption == aWSS3StoragePathUploadRequest.serverSideEncryption && sq8.m48644c(this.metadata, aWSS3StoragePathUploadRequest.metadata) && this.useAccelerateEndpoint == aWSS3StoragePathUploadRequest.useAccelerateEndpoint;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        L l = this.local;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.contentType;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.serverSideEncryption.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        boolean z = this.useAccelerateEndpoint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode3 + i;
    }

    public String toString() {
        return "AWSS3StoragePathUploadRequest(path=" + this.path + ", local=" + this.local + ", contentType=" + this.contentType + ", serverSideEncryption=" + this.serverSideEncryption + ", metadata=" + this.metadata + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ")";
    }
}
