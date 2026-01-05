package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.ObjectMetadata;
import org.objectweb.asm.Opcodes;
import p001o.h6c;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class UploadOptions {
    private final String bucket;
    private final h6c cannedAcl;
    private final ObjectMetadata objectMetadata;
    private final String region;
    private final TransferListener transferListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String str, String str2) {
        this(str, str2, null, null, null, 28, null);
        sq8.m48649h(str, "bucket");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
    }

    public static /* synthetic */ UploadOptions copy$default(UploadOptions uploadOptions, String str, String str2, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadOptions.bucket;
        }
        if ((i & 2) != 0) {
            str2 = uploadOptions.region;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            objectMetadata = uploadOptions.objectMetadata;
        }
        ObjectMetadata objectMetadata2 = objectMetadata;
        if ((i & 8) != 0) {
            h6cVar = uploadOptions.cannedAcl;
        }
        h6c h6cVar2 = h6cVar;
        if ((i & 16) != 0) {
            transferListener = uploadOptions.transferListener;
        }
        return uploadOptions.copy(str, str3, objectMetadata2, h6cVar2, transferListener);
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

    public final h6c component4() {
        return this.cannedAcl;
    }

    public final TransferListener component5() {
        return this.transferListener;
    }

    public final UploadOptions copy(String str, String str2, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener) {
        sq8.m48649h(str, "bucket");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        sq8.m48649h(objectMetadata, "objectMetadata");
        return new UploadOptions(str, str2, objectMetadata, h6cVar, transferListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadOptions)) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return sq8.m48644c(this.bucket, uploadOptions.bucket) && sq8.m48644c(this.region, uploadOptions.region) && sq8.m48644c(this.objectMetadata, uploadOptions.objectMetadata) && sq8.m48644c(this.cannedAcl, uploadOptions.cannedAcl) && sq8.m48644c(this.transferListener, uploadOptions.transferListener);
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final h6c getCannedAcl() {
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
        int iHashCode = ((((this.bucket.hashCode() * 31) + this.region.hashCode()) * 31) + this.objectMetadata.hashCode()) * 31;
        h6c h6cVar = this.cannedAcl;
        int iHashCode2 = (iHashCode + (h6cVar == null ? 0 : h6cVar.hashCode())) * 31;
        TransferListener transferListener = this.transferListener;
        return iHashCode2 + (transferListener != null ? transferListener.hashCode() : 0);
    }

    public String toString() {
        return "UploadOptions(bucket=" + this.bucket + ", region=" + this.region + ", objectMetadata=" + this.objectMetadata + ", cannedAcl=" + this.cannedAcl + ", transferListener=" + this.transferListener + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String str, String str2, ObjectMetadata objectMetadata) {
        this(str, str2, objectMetadata, null, null, 24, null);
        sq8.m48649h(str, "bucket");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        sq8.m48649h(objectMetadata, "objectMetadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadOptions(String str, String str2, ObjectMetadata objectMetadata, h6c h6cVar) {
        this(str, str2, objectMetadata, h6cVar, null, 16, null);
        sq8.m48649h(str, "bucket");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        sq8.m48649h(objectMetadata, "objectMetadata");
    }

    public UploadOptions(String str, String str2, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener) {
        sq8.m48649h(str, "bucket");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        sq8.m48649h(objectMetadata, "objectMetadata");
        this.bucket = str;
        this.region = str2;
        this.objectMetadata = objectMetadata;
        this.cannedAcl = h6cVar;
        this.transferListener = transferListener;
    }

    public /* synthetic */ UploadOptions(String str, String str2, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener, int i, id5 id5Var) {
        this(str, str2, (i & 4) != 0 ? new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null) : objectMetadata, (i & 8) != 0 ? null : h6cVar, (i & 16) != 0 ? null : transferListener);
    }
}
