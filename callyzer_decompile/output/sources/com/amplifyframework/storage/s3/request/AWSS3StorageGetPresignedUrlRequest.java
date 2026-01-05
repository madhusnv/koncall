package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlRequest {
    private final StorageAccessLevel accessLevel;
    private final int expires;
    private final String key;
    private final String targetIdentityId;
    private final boolean useAccelerateEndpoint;
    private final boolean validateObjectExistence;

    public AWSS3StorageGetPresignedUrlRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i10, boolean z6) {
        this.key = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.expires = i10;
        this.useAccelerateEndpoint = z6;
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

    public AWSS3StorageGetPresignedUrlRequest(String str, StorageAccessLevel storageAccessLevel, String str2, int i10, boolean z6, boolean z10) {
        this.key = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.expires = i10;
        this.useAccelerateEndpoint = z6;
        this.validateObjectExistence = z10;
    }
}
