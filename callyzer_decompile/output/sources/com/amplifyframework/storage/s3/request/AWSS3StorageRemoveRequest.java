package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageRemoveRequest {
    private final StorageAccessLevel accessLevel;
    private final String key;
    private final String targetIdentityId;

    public AWSS3StorageRemoveRequest(String str, StorageAccessLevel storageAccessLevel, String str2) {
        this.key = str;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getKey() {
        return this.key;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }
}
