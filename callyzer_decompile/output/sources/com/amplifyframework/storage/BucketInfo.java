package com.amplifyframework.storage;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BucketInfo {
    private final String bucketName;
    private final String region;

    public BucketInfo(String bucketName, String region) {
        AbstractC4154l.m8923f(bucketName, "bucketName");
        AbstractC4154l.m8923f(region, "region");
        this.bucketName = bucketName;
        this.region = region;
    }

    public static /* synthetic */ BucketInfo copy$default(BucketInfo bucketInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bucketInfo.bucketName;
        }
        if ((i10 & 2) != 0) {
            str2 = bucketInfo.region;
        }
        return bucketInfo.copy(str, str2);
    }

    public final String component1() {
        return this.bucketName;
    }

    public final String component2() {
        return this.region;
    }

    public final BucketInfo copy(String bucketName, String region) {
        AbstractC4154l.m8923f(bucketName, "bucketName");
        AbstractC4154l.m8923f(region, "region");
        return new BucketInfo(bucketName, region);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BucketInfo)) {
            return false;
        }
        BucketInfo bucketInfo = (BucketInfo) obj;
        return AbstractC4154l.m8918a(this.bucketName, bucketInfo.bucketName) && AbstractC4154l.m8918a(this.region, bucketInfo.region);
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + (this.bucketName.hashCode() * 31);
    }

    public String toString() {
        return a1.m14333m("BucketInfo(bucketName=", this.bucketName, ", region=", this.region, ")");
    }
}
