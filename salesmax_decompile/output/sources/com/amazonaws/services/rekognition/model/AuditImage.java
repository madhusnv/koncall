package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class AuditImage implements Serializable {
    private BoundingBox boundingBox;
    private ByteBuffer bytes;
    private S3Object s3Object;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuditImage)) {
            return false;
        }
        AuditImage auditImage = (AuditImage) obj;
        if ((auditImage.getBytes() == null) ^ (getBytes() == null)) {
            return false;
        }
        if (auditImage.getBytes() != null && !auditImage.getBytes().equals(getBytes())) {
            return false;
        }
        if ((auditImage.getS3Object() == null) ^ (getS3Object() == null)) {
            return false;
        }
        if (auditImage.getS3Object() != null && !auditImage.getS3Object().equals(getS3Object())) {
            return false;
        }
        if ((auditImage.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        return auditImage.getBoundingBox() == null || auditImage.getBoundingBox().equals(getBoundingBox());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public ByteBuffer getBytes() {
        return this.bytes;
    }

    public S3Object getS3Object() {
        return this.s3Object;
    }

    public int hashCode() {
        return (((((getBytes() == null ? 0 : getBytes().hashCode()) + 31) * 31) + (getS3Object() == null ? 0 : getS3Object().hashCode())) * 31) + (getBoundingBox() != null ? getBoundingBox().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setBytes(ByteBuffer byteBuffer) {
        this.bytes = byteBuffer;
    }

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBytes() != null) {
            sb.append("Bytes: " + getBytes() + ",");
        }
        if (getS3Object() != null) {
            sb.append("S3Object: " + getS3Object() + ",");
        }
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox());
        }
        sb.append("}");
        return sb.toString();
    }

    public AuditImage withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public AuditImage withBytes(ByteBuffer byteBuffer) {
        this.bytes = byteBuffer;
        return this;
    }

    public AuditImage withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
        return this;
    }
}
