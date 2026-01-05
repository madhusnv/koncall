package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.options.SubpathStrategy;

@Deprecated
/* loaded from: classes5.dex */
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

    public AWSS3StorageListRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i, String str3) {
        this.path = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.pageSize = i;
        this.nextToken = str3;
        this.subpathStrategy = null;
    }

    public AWSS3StorageListRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i, String str3, SubpathStrategy subpathStrategy) {
        this.path = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.pageSize = i;
        this.nextToken = str3;
        this.subpathStrategy = subpathStrategy;
    }
}
