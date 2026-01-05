package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class S3Destination implements Serializable {
    private String bucket;
    private String keyPrefix;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S3Destination)) {
            return false;
        }
        S3Destination s3Destination = (S3Destination) obj;
        if ((s3Destination.getBucket() == null) ^ (getBucket() == null)) {
            return false;
        }
        if (s3Destination.getBucket() != null && !s3Destination.getBucket().equals(getBucket())) {
            return false;
        }
        if ((s3Destination.getKeyPrefix() == null) ^ (getKeyPrefix() == null)) {
            return false;
        }
        return s3Destination.getKeyPrefix() == null || s3Destination.getKeyPrefix().equals(getKeyPrefix());
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    public int hashCode() {
        return (((getBucket() == null ? 0 : getBucket().hashCode()) + 31) * 31) + (getKeyPrefix() != null ? getKeyPrefix().hashCode() : 0);
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setKeyPrefix(String str) {
        this.keyPrefix = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) {
            sb.append("Bucket: " + getBucket() + ",");
        }
        if (getKeyPrefix() != null) {
            sb.append("KeyPrefix: " + getKeyPrefix());
        }
        sb.append("}");
        return sb.toString();
    }

    public S3Destination withBucket(String str) {
        this.bucket = str;
        return this;
    }

    public S3Destination withKeyPrefix(String str) {
        this.keyPrefix = str;
        return this;
    }
}
