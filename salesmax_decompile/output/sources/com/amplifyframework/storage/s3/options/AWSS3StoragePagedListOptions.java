package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StoragePagedListOptions;

/* loaded from: classes5.dex */
public final class AWSS3StoragePagedListOptions extends StoragePagedListOptions {

    @Deprecated
    public static final int ALL_PAGE_SIZE = -1;
    private static final int DEFAULT_PAGE_SIZE = 1000;

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StoragePagedListOptions defaultInstance() {
        return builder().setPageSize(1000).build();
    }

    public static final class Builder extends StoragePagedListOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StoragePagedListOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StoragePagedListOptions build() {
            return new AWSS3StoragePagedListOptions(this);
        }
    }

    private AWSS3StoragePagedListOptions(Builder builder) {
        super(builder);
    }
}
