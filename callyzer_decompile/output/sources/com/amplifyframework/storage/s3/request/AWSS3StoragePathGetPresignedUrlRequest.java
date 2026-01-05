package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathGetPresignedUrlRequest {
    private final int expires;
    private final StoragePath path;
    private final boolean useAccelerateEndpoint;
    private final boolean validateObjectExistence;

    public AWSS3StoragePathGetPresignedUrlRequest(StoragePath path, int i10, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(path, "path");
        this.path = path;
        this.expires = i10;
        this.useAccelerateEndpoint = z6;
        this.validateObjectExistence = z10;
    }

    public static /* synthetic */ AWSS3StoragePathGetPresignedUrlRequest copy$default(AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest, StoragePath storagePath, int i10, boolean z6, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storagePath = aWSS3StoragePathGetPresignedUrlRequest.path;
        }
        if ((i11 & 2) != 0) {
            i10 = aWSS3StoragePathGetPresignedUrlRequest.expires;
        }
        if ((i11 & 4) != 0) {
            z6 = aWSS3StoragePathGetPresignedUrlRequest.useAccelerateEndpoint;
        }
        if ((i11 & 8) != 0) {
            z10 = aWSS3StoragePathGetPresignedUrlRequest.validateObjectExistence;
        }
        return aWSS3StoragePathGetPresignedUrlRequest.copy(storagePath, i10, z6, z10);
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

    public final AWSS3StoragePathGetPresignedUrlRequest copy(StoragePath path, int i10, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(path, "path");
        return new AWSS3StoragePathGetPresignedUrlRequest(path, i10, z6, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathGetPresignedUrlRequest)) {
            return false;
        }
        AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest = (AWSS3StoragePathGetPresignedUrlRequest) obj;
        return AbstractC4154l.m8918a(this.path, aWSS3StoragePathGetPresignedUrlRequest.path) && this.expires == aWSS3StoragePathGetPresignedUrlRequest.expires && this.useAccelerateEndpoint == aWSS3StoragePathGetPresignedUrlRequest.useAccelerateEndpoint && this.validateObjectExistence == aWSS3StoragePathGetPresignedUrlRequest.validateObjectExistence;
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

    public int hashCode() {
        return Boolean.hashCode(this.validateObjectExistence) + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.expires, this.path.hashCode() * 31, 31), 31, this.useAccelerateEndpoint);
    }

    public String toString() {
        return "AWSS3StoragePathGetPresignedUrlRequest(path=" + this.path + ", expires=" + this.expires + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ", validateObjectExistence=" + this.validateObjectExistence + ")";
    }
}
