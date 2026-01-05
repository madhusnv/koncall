package com.amplifyframework.storage.options;

import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class StorageOptions {
    private final StorageAccessLevel accessLevel;
    private final StorageBucket bucket;
    private final String targetIdentityId;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<B extends Builder, O extends StorageOptions> {
        private StorageAccessLevel accessLevel;
        private StorageBucket bucket;
        private String targetIdentityId;

        @Deprecated
        public B accessLevel(StorageAccessLevel storageAccessLevel) {
            this.accessLevel = storageAccessLevel;
            return this;
        }

        public B bucket(StorageBucket storageBucket) {
            this.bucket = storageBucket;
            return this;
        }

        public abstract O build();

        @Deprecated
        public final StorageAccessLevel getAccessLevel() {
            return this.accessLevel;
        }

        public final StorageBucket getBucket() {
            return this.bucket;
        }

        @Deprecated
        public final String getTargetIdentityId() {
            return this.targetIdentityId;
        }

        @Deprecated
        public B targetIdentityId(String str) {
            this.targetIdentityId = str;
            return this;
        }
    }

    public StorageOptions(StorageAccessLevel storageAccessLevel, String str) {
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str;
        this.bucket = null;
    }

    @Deprecated
    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public StorageBucket getBucket() {
        return this.bucket;
    }

    @Deprecated
    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public StorageOptions(StorageAccessLevel storageAccessLevel, String str, StorageBucket storageBucket) {
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str;
        this.bucket = storageBucket;
    }
}
