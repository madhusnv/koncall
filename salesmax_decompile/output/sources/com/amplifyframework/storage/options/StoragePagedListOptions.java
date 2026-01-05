package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.options.StorageOptions;

/* loaded from: classes5.dex */
public class StoragePagedListOptions extends StorageOptions {
    private String nextToken;
    private int pageSize;
    private SubpathStrategy subpathStrategy;

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StoragePagedListOptions> {
        private String nextToken;
        private int pageSize;
        private SubpathStrategy subpathStrategy;

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder accessLevel(StorageAccessLevel storageAccessLevel) {
            return super.accessLevel(storageAccessLevel);
        }

        public B setNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public B setPageSize(int i) {
            this.pageSize = i;
            return this;
        }

        public B setSubpathStrategy(SubpathStrategy subpathStrategy) {
            this.subpathStrategy = subpathStrategy;
            return this;
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public /* bridge */ /* synthetic */ StorageOptions.Builder targetIdentityId(String str) {
            return super.targetIdentityId(str);
        }

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StoragePagedListOptions build() {
            return new StoragePagedListOptions(this);
        }
    }

    public StoragePagedListOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId(), builder.getBucket());
        this.pageSize = ((Builder) builder).pageSize;
        this.nextToken = ((Builder) builder).nextToken;
        this.subpathStrategy = ((Builder) builder).subpathStrategy;
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageAccessLevel getAccessLevel() {
        return super.getAccessLevel();
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ StorageBucket getBucket() {
        return super.getBucket();
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public SubpathStrategy getSubpathStrategy() {
        return this.subpathStrategy;
    }

    @Override // com.amplifyframework.storage.options.StorageOptions
    public /* bridge */ /* synthetic */ String getTargetIdentityId() {
        return super.getTargetIdentityId();
    }
}
