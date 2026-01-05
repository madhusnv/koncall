package com.amplifyframework.storage.s3.options;

import com.amplifyframework.storage.options.StoragePagedListOptions;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePagedListOptions extends StoragePagedListOptions {

    @Deprecated
    public static final int ALL_PAGE_SIZE = -1;
    private static final int DEFAULT_PAGE_SIZE = 1000;

    public /* synthetic */ AWSS3StoragePagedListOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StoragePagedListOptions defaultInstance() {
        return builder().setPageSize(1000).build();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends StoragePagedListOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StoragePagedListOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StoragePagedListOptions build() {
            return new AWSS3StoragePagedListOptions(this, 0);
        }
    }

    private AWSS3StoragePagedListOptions(Builder builder) {
        super(builder);
    }
}
