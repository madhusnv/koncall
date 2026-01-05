package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.options.SubpathStrategy;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathListRequest {
    private final String nextToken;
    private final int pageSize;
    private final StoragePath path;
    private final SubpathStrategy subpathStrategy;

    public AWSS3StoragePathListRequest(StoragePath storagePath, int i, String str, SubpathStrategy subpathStrategy) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        this.path = storagePath;
        this.pageSize = i;
        this.nextToken = str;
        this.subpathStrategy = subpathStrategy;
    }

    public static /* synthetic */ AWSS3StoragePathListRequest copy$default(AWSS3StoragePathListRequest aWSS3StoragePathListRequest, StoragePath storagePath, int i, String str, SubpathStrategy subpathStrategy, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            storagePath = aWSS3StoragePathListRequest.path;
        }
        if ((i2 & 2) != 0) {
            i = aWSS3StoragePathListRequest.pageSize;
        }
        if ((i2 & 4) != 0) {
            str = aWSS3StoragePathListRequest.nextToken;
        }
        if ((i2 & 8) != 0) {
            subpathStrategy = aWSS3StoragePathListRequest.subpathStrategy;
        }
        return aWSS3StoragePathListRequest.copy(storagePath, i, str, subpathStrategy);
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

    public final AWSS3StoragePathListRequest copy(StoragePath storagePath, int i, String str, SubpathStrategy subpathStrategy) {
        sq8.m48649h(storagePath, ClientCookie.PATH_ATTR);
        return new AWSS3StoragePathListRequest(storagePath, i, str, subpathStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StoragePathListRequest)) {
            return false;
        }
        AWSS3StoragePathListRequest aWSS3StoragePathListRequest = (AWSS3StoragePathListRequest) obj;
        return sq8.m48644c(this.path, aWSS3StoragePathListRequest.path) && this.pageSize == aWSS3StoragePathListRequest.pageSize && sq8.m48644c(this.nextToken, aWSS3StoragePathListRequest.nextToken) && sq8.m48644c(this.subpathStrategy, aWSS3StoragePathListRequest.subpathStrategy);
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
        int iHashCode = ((this.path.hashCode() * 31) + Integer.hashCode(this.pageSize)) * 31;
        String str = this.nextToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SubpathStrategy subpathStrategy = this.subpathStrategy;
        return iHashCode2 + (subpathStrategy != null ? subpathStrategy.hashCode() : 0);
    }

    public String toString() {
        return "AWSS3StoragePathListRequest(path=" + this.path + ", pageSize=" + this.pageSize + ", nextToken=" + this.nextToken + ", subpathStrategy=" + this.subpathStrategy + ")";
    }
}
