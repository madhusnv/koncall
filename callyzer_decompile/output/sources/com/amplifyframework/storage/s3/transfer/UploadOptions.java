package com.amplifyframework.storage.s3.transfer;

import a2.AbstractC0030c;
import com.amplifyframework.storage.ObjectMetadata;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import mb.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UploadOptions {
    private final String bucket;
    private final a1 cannedAcl;
    private final ObjectMetadata objectMetadata;
    private final String region;
    private final TransferListener transferListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String bucket, String region) {
        this(bucket, region, null, null, null, 28, null);
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
    }

    public static /* synthetic */ UploadOptions copy$default(UploadOptions uploadOptions, String str, String str2, ObjectMetadata objectMetadata, a1 a1Var, TransferListener transferListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadOptions.bucket;
        }
        if ((i10 & 2) != 0) {
            str2 = uploadOptions.region;
        }
        if ((i10 & 4) != 0) {
            objectMetadata = uploadOptions.objectMetadata;
        }
        if ((i10 & 8) != 0) {
            a1Var = uploadOptions.cannedAcl;
        }
        if ((i10 & 16) != 0) {
            transferListener = uploadOptions.transferListener;
        }
        TransferListener transferListener2 = transferListener;
        ObjectMetadata objectMetadata2 = objectMetadata;
        return uploadOptions.copy(str, str2, objectMetadata2, a1Var, transferListener2);
    }

    public final String component1() {
        return this.bucket;
    }

    public final String component2() {
        return this.region;
    }

    public final ObjectMetadata component3() {
        return this.objectMetadata;
    }

    public final a1 component4() {
        return this.cannedAcl;
    }

    public final TransferListener component5() {
        return this.transferListener;
    }

    public final UploadOptions copy(String bucket, String region, ObjectMetadata objectMetadata, a1 a1Var, TransferListener transferListener) {
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(objectMetadata, "objectMetadata");
        return new UploadOptions(bucket, region, objectMetadata, a1Var, transferListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadOptions)) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return AbstractC4154l.m8918a(this.bucket, uploadOptions.bucket) && AbstractC4154l.m8918a(this.region, uploadOptions.region) && AbstractC4154l.m8918a(this.objectMetadata, uploadOptions.objectMetadata) && AbstractC4154l.m8918a(this.cannedAcl, uploadOptions.cannedAcl) && AbstractC4154l.m8918a(this.transferListener, uploadOptions.transferListener);
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final a1 getCannedAcl() {
        return this.cannedAcl;
    }

    public final ObjectMetadata getObjectMetadata() {
        return this.objectMetadata;
    }

    public final String getRegion() {
        return this.region;
    }

    public final TransferListener getTransferListener() {
        return this.transferListener;
    }

    public int hashCode() {
        int iHashCode = (this.objectMetadata.hashCode() + AbstractC0030c.m113d(this.bucket.hashCode() * 31, 31, this.region)) * 31;
        a1 a1Var = this.cannedAcl;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        TransferListener transferListener = this.transferListener;
        return iHashCode2 + (transferListener != null ? transferListener.hashCode() : 0);
    }

    public String toString() {
        String str = this.bucket;
        String str2 = this.region;
        ObjectMetadata objectMetadata = this.objectMetadata;
        a1 a1Var = this.cannedAcl;
        TransferListener transferListener = this.transferListener;
        StringBuilder sbM127r = AbstractC0030c.m127r("UploadOptions(bucket=", str, ", region=", str2, ", objectMetadata=");
        sbM127r.append(objectMetadata);
        sbM127r.append(", cannedAcl=");
        sbM127r.append(a1Var);
        sbM127r.append(", transferListener=");
        sbM127r.append(transferListener);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String bucket, String region, ObjectMetadata objectMetadata) {
        this(bucket, region, objectMetadata, null, null, 24, null);
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(objectMetadata, "objectMetadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String bucket, String region, ObjectMetadata objectMetadata, a1 a1Var) {
        this(bucket, region, objectMetadata, a1Var, null, 16, null);
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(objectMetadata, "objectMetadata");
    }

    public UploadOptions(String bucket, String region, ObjectMetadata objectMetadata, a1 a1Var, TransferListener transferListener) {
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(objectMetadata, "objectMetadata");
        this.bucket = bucket;
        this.region = region;
        this.objectMetadata = objectMetadata;
        this.cannedAcl = a1Var;
        this.transferListener = transferListener;
    }

    public /* synthetic */ UploadOptions(String str, String str2, ObjectMetadata objectMetadata, a1 a1Var, TransferListener transferListener, int i10, AbstractC4148f abstractC4148f) {
        this(str, str2, (i10 & 4) != 0 ? new ObjectMetadata(null, null, null, null, null, null, null, 127, null) : objectMetadata, (i10 & 8) != 0 ? null : a1Var, (i10 & 16) != 0 ? null : transferListener);
    }
}
