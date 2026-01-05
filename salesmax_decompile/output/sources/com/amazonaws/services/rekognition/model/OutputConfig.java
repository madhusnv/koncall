package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class OutputConfig implements Serializable {
    private String s3Bucket;
    private String s3KeyPrefix;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OutputConfig)) {
            return false;
        }
        OutputConfig outputConfig = (OutputConfig) obj;
        if ((outputConfig.getS3Bucket() == null) ^ (getS3Bucket() == null)) {
            return false;
        }
        if (outputConfig.getS3Bucket() != null && !outputConfig.getS3Bucket().equals(getS3Bucket())) {
            return false;
        }
        if ((outputConfig.getS3KeyPrefix() == null) ^ (getS3KeyPrefix() == null)) {
            return false;
        }
        return outputConfig.getS3KeyPrefix() == null || outputConfig.getS3KeyPrefix().equals(getS3KeyPrefix());
    }

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    public int hashCode() {
        return (((getS3Bucket() == null ? 0 : getS3Bucket().hashCode()) + 31) * 31) + (getS3KeyPrefix() != null ? getS3KeyPrefix().hashCode() : 0);
    }

    public void setS3Bucket(String str) {
        this.s3Bucket = str;
    }

    public void setS3KeyPrefix(String str) {
        this.s3KeyPrefix = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Bucket() != null) {
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        }
        if (getS3KeyPrefix() != null) {
            sb.append("S3KeyPrefix: " + getS3KeyPrefix());
        }
        sb.append("}");
        return sb.toString();
    }

    public OutputConfig withS3Bucket(String str) {
        this.s3Bucket = str;
        return this;
    }

    public OutputConfig withS3KeyPrefix(String str) {
        this.s3KeyPrefix = str;
        return this;
    }
}
