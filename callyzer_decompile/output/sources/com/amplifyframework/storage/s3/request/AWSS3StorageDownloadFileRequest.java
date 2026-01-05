package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;
import java.io.File;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageDownloadFileRequest {
    private final StorageAccessLevel accessLevel;
    private final String key;
    private final File local;
    private final String targetIdentityId;
    private final boolean useAccelerateEndpoint;

    public AWSS3StorageDownloadFileRequest(String str, File file, StorageAccessLevel storageAccessLevel, String str2, boolean z6) {
        this.key = str;
        this.local = file;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.useAccelerateEndpoint = z6;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getKey() {
        return this.key;
    }

    public File getLocal() {
        return this.local;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }
}
