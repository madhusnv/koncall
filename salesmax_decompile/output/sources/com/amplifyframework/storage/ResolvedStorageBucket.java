package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class ResolvedStorageBucket extends StorageBucket {
    private final BucketInfo bucketInfo;

    public ResolvedStorageBucket(BucketInfo bucketInfo) {
        sq8.m48649h(bucketInfo, "bucketInfo");
        this.bucketInfo = bucketInfo;
    }

    public static /* synthetic */ ResolvedStorageBucket copy$default(ResolvedStorageBucket resolvedStorageBucket, BucketInfo bucketInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            bucketInfo = resolvedStorageBucket.bucketInfo;
        }
        return resolvedStorageBucket.copy(bucketInfo);
    }

    public final BucketInfo component1() {
        return this.bucketInfo;
    }

    public final ResolvedStorageBucket copy(BucketInfo bucketInfo) {
        sq8.m48649h(bucketInfo, "bucketInfo");
        return new ResolvedStorageBucket(bucketInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolvedStorageBucket) && sq8.m48644c(this.bucketInfo, ((ResolvedStorageBucket) obj).bucketInfo);
    }

    public final BucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public int hashCode() {
        return this.bucketInfo.hashCode();
    }

    public String toString() {
        return "ResolvedStorageBucket(bucketInfo=" + this.bucketInfo + ")";
    }
}
