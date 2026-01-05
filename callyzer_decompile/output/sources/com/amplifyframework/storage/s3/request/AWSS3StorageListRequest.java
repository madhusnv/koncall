package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.options.SubpathStrategy;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageListRequest {
    private final StorageAccessLevel accessLevel;
    private final String nextToken;
    private final int pageSize;
    private final String path;
    private final SubpathStrategy subpathStrategy;
    private final String targetIdentityId;

    public AWSS3StorageListRequest(String str, StorageAccessLevel storageAccessLevel, String str2) {
        this.path = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.pageSize = -1;
        this.nextToken = null;
        this.subpathStrategy = null;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String getPath() {
        return this.path;
    }

    public SubpathStrategy getSubpathStrategy() {
        return this.subpathStrategy;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public AWSS3StorageListRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i10, String str3) {
        this.path = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.pageSize = i10;
        this.nextToken = str3;
        this.subpathStrategy = null;
    }

    public AWSS3StorageListRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i10, String str3, SubpathStrategy subpathStrategy) {
        this.path = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.pageSize = i10;
        this.nextToken = str3;
        this.subpathStrategy = subpathStrategy;
    }
}
