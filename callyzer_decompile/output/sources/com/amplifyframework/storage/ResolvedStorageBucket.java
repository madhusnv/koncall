package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class ResolvedStorageBucket extends StorageBucket {
    private final BucketInfo bucketInfo;

    public ResolvedStorageBucket(BucketInfo bucketInfo) {
        AbstractC4154l.m8923f(bucketInfo, "bucketInfo");
        this.bucketInfo = bucketInfo;
    }

    public static /* synthetic */ ResolvedStorageBucket copy$core_release$default(ResolvedStorageBucket resolvedStorageBucket, BucketInfo bucketInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bucketInfo = resolvedStorageBucket.bucketInfo;
        }
        return resolvedStorageBucket.copy$core_release(bucketInfo);
    }

    public final BucketInfo component1() {
        return this.bucketInfo;
    }

    public final ResolvedStorageBucket copy$core_release(BucketInfo bucketInfo) {
        AbstractC4154l.m8923f(bucketInfo, "bucketInfo");
        return new ResolvedStorageBucket(bucketInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolvedStorageBucket) && AbstractC4154l.m8918a(this.bucketInfo, ((ResolvedStorageBucket) obj).bucketInfo);
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
