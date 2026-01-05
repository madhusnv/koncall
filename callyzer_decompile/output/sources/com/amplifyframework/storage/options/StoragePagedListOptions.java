package com.amplifyframework.storage.options;

import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StoragePagedListOptions extends StorageOptions {
    private String nextToken;
    private int pageSize;
    private SubpathStrategy subpathStrategy;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StoragePagedListOptions> {
        private String nextToken;
        private int pageSize;
        private SubpathStrategy subpathStrategy;

        public B setNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public B setPageSize(int i10) {
            this.pageSize = i10;
            return this;
        }

        public B setSubpathStrategy(SubpathStrategy subpathStrategy) {
            this.subpathStrategy = subpathStrategy;
            return this;
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

    public String getNextToken() {
        return this.nextToken;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public SubpathStrategy getSubpathStrategy() {
        return this.subpathStrategy;
    }
}
