package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class Image implements Serializable {
    private ByteBuffer bytes;
    private S3Object s3Object;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if ((image.getBytes() == null) ^ (getBytes() == null)) {
            return false;
        }
        if (image.getBytes() != null && !image.getBytes().equals(getBytes())) {
            return false;
        }
        if ((image.getS3Object() == null) ^ (getS3Object() == null)) {
            return false;
        }
        return image.getS3Object() == null || image.getS3Object().equals(getS3Object());
    }

    public ByteBuffer getBytes() {
        return this.bytes;
    }

    public S3Object getS3Object() {
        return this.s3Object;
    }

    public int hashCode() {
        return (((getBytes() == null ? 0 : getBytes().hashCode()) + 31) * 31) + (getS3Object() != null ? getS3Object().hashCode() : 0);
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
            sb.append("S3Object: " + getS3Object());
        }
        sb.append("}");
        return sb.toString();
    }

    public Image withBytes(ByteBuffer byteBuffer) {
        this.bytes = byteBuffer;
        return this;
    }

    public Image withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
        return this;
    }
}
