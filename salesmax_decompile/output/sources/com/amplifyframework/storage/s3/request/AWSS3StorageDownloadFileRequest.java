package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;
import java.io.File;

@Deprecated
/* loaded from: classes5.dex */
public final class AWSS3StorageDownloadFileRequest {
    private final StorageAccessLevel accessLevel;
    private final String key;
    private final File local;
    private final String targetIdentityId;
    private final boolean useAccelerateEndpoint;

    public AWSS3StorageDownloadFileRequest(String str, File file, StorageAccessLevel storageAccessLevel, String str2, boolean z) {
        this.key = str;
        this.local = file;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.useAccelerateEndpoint = z;
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
