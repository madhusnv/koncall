package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;

@Deprecated
/* loaded from: classes5.dex */
public final class AWSS3StorageGetPresignedUrlRequest {
    private final StorageAccessLevel accessLevel;
    private final int expires;
    private final String key;
    private final String targetIdentityId;
    private final boolean useAccelerateEndpoint;
    private final boolean validateObjectExistence;

    public AWSS3StorageGetPresignedUrlRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i, boolean z) {
        this.key = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.expires = i;
        this.useAccelerateEndpoint = z;
        this.validateObjectExistence = false;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public int getExpires() {
        return this.expires;
    }

    public String getKey() {
        return this.key;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }

    public boolean validateObjectExistence() {
        return this.validateObjectExistence;
    }

    public AWSS3StorageGetPresignedUrlRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i, boolean z, boolean z2) {
        this.key = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.expires = i;
        this.useAccelerateEndpoint = z;
        this.validateObjectExistence = z2;
    }
}
