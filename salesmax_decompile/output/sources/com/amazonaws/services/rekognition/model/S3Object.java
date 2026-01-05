package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class S3Object implements Serializable {
    private String bucket;
    private String name;
    private String version;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S3Object)) {
            return false;
        }
        S3Object s3Object = (S3Object) obj;
        if ((s3Object.getBucket() == null) ^ (getBucket() == null)) {
            return false;
        }
        if (s3Object.getBucket() != null && !s3Object.getBucket().equals(getBucket())) {
            return false;
        }
        if ((s3Object.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (s3Object.getName() != null && !s3Object.getName().equals(getName())) {
            return false;
        }
        if ((s3Object.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        return s3Object.getVersion() == null || s3Object.getVersion().equals(getVersion());
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((getBucket() == null ? 0 : getBucket().hashCode()) + 31) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getVersion() != null ? getVersion().hashCode() : 0);
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) {
            sb.append("Bucket: " + getBucket() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getVersion() != null) {
            sb.append("Version: " + getVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public S3Object withBucket(String str) {
        this.bucket = str;
        return this;
    }

    public S3Object withName(String str) {
        this.name = str;
        return this;
    }

    public S3Object withVersion(String str) {
        this.version = str;
        return this;
    }
}
