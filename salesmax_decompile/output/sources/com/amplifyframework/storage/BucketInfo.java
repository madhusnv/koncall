package com.amplifyframework.storage;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class BucketInfo {
    private final String bucketName;
    private final String region;

    public BucketInfo(String str, String str2) {
        sq8.m48649h(str, "bucketName");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        this.bucketName = str;
        this.region = str2;
    }

    public static /* synthetic */ BucketInfo copy$default(BucketInfo bucketInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bucketInfo.bucketName;
        }
        if ((i & 2) != 0) {
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

    public final BucketInfo copy(String str, String str2) {
        sq8.m48649h(str, "bucketName");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        return new BucketInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BucketInfo)) {
            return false;
        }
        BucketInfo bucketInfo = (BucketInfo) obj;
        return sq8.m48644c(this.bucketName, bucketInfo.bucketName) && sq8.m48644c(this.region, bucketInfo.region);
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (this.bucketName.hashCode() * 31) + this.region.hashCode();
    }

    public String toString() {
        return "BucketInfo(bucketName=" + this.bucketName + ", region=" + this.region + ")";
    }
}
