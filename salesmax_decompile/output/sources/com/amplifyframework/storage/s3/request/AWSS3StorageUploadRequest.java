package com.amplifyframework.storage.s3.request;

import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes5.dex */
public final class AWSS3StorageUploadRequest<L> {
    private final StorageAccessLevel accessLevel;
    private final String contentType;
    private final String key;
    private final L local;
    private final Map<String, String> metadata;
    private final ServerSideEncryption serverSideEncryption;
    private final String targetIdentityId;
    private final boolean useAccelerateEndpoint;

    public AWSS3StorageUploadRequest(String str, L l, StorageAccessLevel storageAccessLevel, String str2, String str3, ServerSideEncryption serverSideEncryption, Map<String, String> map, boolean z) {
        this.key = str;
        this.local = l;
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str2;
        this.contentType = str3;
        this.serverSideEncryption = serverSideEncryption;
        HashMap map2 = new HashMap();
        this.metadata = map2;
        if (map != null) {
            map2.putAll(map);
        }
        this.useAccelerateEndpoint = z;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getKey() {
        return this.key;
    }

    public L getLocal() {
        return this.local;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public boolean useAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }
}
