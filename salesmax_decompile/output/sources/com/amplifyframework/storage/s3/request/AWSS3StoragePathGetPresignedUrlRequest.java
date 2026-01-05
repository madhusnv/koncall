package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathGetPresignedUrlRequest {
    private final int expires;
    private final StoragePath path;
    private final boolean useAccelerateEndpoint;
    private final boolean validateObjectExistence;

    public AWSS3StoragePathGetPresignedUrlRequest(StoragePath storagePath, int i, boolean z, boolean z2) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        this.path = storagePath;
        this.expires = i;
        this.useAccelerateEndpoint = z;
        this.validateObjectExistence = z2;
    }

    public static /* synthetic */ AWSS3StoragePathGetPresignedUrlRequest copy$default(AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest, StoragePath storagePath, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            storagePath = aWSS3StoragePathGetPresignedUrlRequest.path;
        }
        if ((i2 & 2) != 0) {
            i = aWSS3StoragePathGetPresignedUrlRequest.expires;
        }
        if ((i2 & 4) != 0) {
            z = aWSS3StoragePathGetPresignedUrlRequest.useAccelerateEndpoint;
        }
        if ((i2 & 8) != 0) {
            z2 = aWSS3StoragePathGetPresignedUrlRequest.validateObjectExistence;
        }
        return aWSS3StoragePathGetPresignedUrlRequest.copy(storagePath, i, z, z2);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final int component2() {
        return this.expires;
    }

    public final boolean component3() {
        return this.useAccelerateEndpoint;
    }

    public final boolean component4() {
        return this.validateObjectExistence;
    }

    public final AWSS3StoragePathGetPresignedUrlRequest copy(StoragePath storagePath, int i, boolean z, boolean z2) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        return new AWSS3StoragePathGetPresignedUrlRequest(storagePath, i, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathGetPresignedUrlRequest)) {
            return false;
        }
        AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest = (AWSS3StoragePathGetPresignedUrlRequest) obj;
        return sq8.m48644c(this.path, aWSS3StoragePathGetPresignedUrlRequest.path) && this.expires == aWSS3StoragePathGetPresignedUrlRequest.expires && this.useAccelerateEndpoint == aWSS3StoragePathGetPresignedUrlRequest.useAccelerateEndpoint && this.validateObjectExistence == aWSS3StoragePathGetPresignedUrlRequest.validateObjectExistence;
    }

    public final int getExpires() {
        return this.expires;
    }

    public final StoragePath getPath() {
        return this.path;
    }

    public final boolean getUseAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }

    public final boolean getValidateObjectExistence() {
        return this.validateObjectExistence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + Integer.hashCode(this.expires)) * 31;
        boolean z = this.useAccelerateEndpoint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.validateObjectExistence;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "AWSS3StoragePathGetPresignedUrlRequest(path=" + this.path + ", expires=" + this.expires + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ", validateObjectExistence=" + this.validateObjectExistence + ")";
    }
}
