package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.options.SubpathStrategy;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathListRequest {
    private final String nextToken;
    private final int pageSize;
    private final StoragePath path;
    private final SubpathStrategy subpathStrategy;

    public AWSS3StoragePathListRequest(StoragePath path, int i10, String str, SubpathStrategy subpathStrategy) {
        AbstractC4154l.m8923f(path, "path");
        this.path = path;
        this.pageSize = i10;
        this.nextToken = str;
        this.subpathStrategy = subpathStrategy;
    }

    public static /* synthetic */ AWSS3StoragePathListRequest copy$default(AWSS3StoragePathListRequest aWSS3StoragePathListRequest, StoragePath storagePath, int i10, String str, SubpathStrategy subpathStrategy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storagePath = aWSS3StoragePathListRequest.path;
        }
        if ((i11 & 2) != 0) {
            i10 = aWSS3StoragePathListRequest.pageSize;
        }
        if ((i11 & 4) != 0) {
            str = aWSS3StoragePathListRequest.nextToken;
        }
        if ((i11 & 8) != 0) {
            subpathStrategy = aWSS3StoragePathListRequest.subpathStrategy;
        }
        return aWSS3StoragePathListRequest.copy(storagePath, i10, str, subpathStrategy);
    }

    public final StoragePath component1() {
        return this.path;
    }

    public final int component2() {
        return this.pageSize;
    }

    public final String component3() {
        return this.nextToken;
    }

    public final SubpathStrategy component4() {
        return this.subpathStrategy;
    }

    public final AWSS3StoragePathListRequest copy(StoragePath path, int i10, String str, SubpathStrategy subpathStrategy) {
        AbstractC4154l.m8923f(path, "path");
        return new AWSS3StoragePathListRequest(path, i10, str, subpathStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathListRequest)) {
            return false;
        }
        AWSS3StoragePathListRequest aWSS3StoragePathListRequest = (AWSS3StoragePathListRequest) obj;
        return AbstractC4154l.m8918a(this.path, aWSS3StoragePathListRequest.path) && this.pageSize == aWSS3StoragePathListRequest.pageSize && AbstractC4154l.m8918a(this.nextToken, aWSS3StoragePathListRequest.nextToken) && AbstractC4154l.m8918a(this.subpathStrategy, aWSS3StoragePathListRequest.subpathStrategy);
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final StoragePath getPath() {
        return this.path;
    }

    public final SubpathStrategy getSubpathStrategy() {
        return this.subpathStrategy;
    }

    public int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.pageSize, this.path.hashCode() * 31, 31);
        String str = this.nextToken;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        SubpathStrategy subpathStrategy = this.subpathStrategy;
        return iHashCode + (subpathStrategy != null ? subpathStrategy.hashCode() : 0);
    }

    public String toString() {
        return "AWSS3StoragePathListRequest(path=" + this.path + ", pageSize=" + this.pageSize + ", nextToken=" + this.nextToken + ", subpathStrategy=" + this.subpathStrategy + ")";
    }
}
