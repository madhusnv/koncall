package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public class DescribeCollectionResult implements Serializable {
    private String collectionARN;
    private Date creationTimestamp;
    private Long faceCount;
    private String faceModelVersion;
    private Long userCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCollectionResult)) {
            return false;
        }
        DescribeCollectionResult describeCollectionResult = (DescribeCollectionResult) obj;
        if ((describeCollectionResult.getFaceCount() == null) ^ (getFaceCount() == null)) {
            return false;
        }
        if (describeCollectionResult.getFaceCount() != null && !describeCollectionResult.getFaceCount().equals(getFaceCount())) {
            return false;
        }
        if ((describeCollectionResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        if (describeCollectionResult.getFaceModelVersion() != null && !describeCollectionResult.getFaceModelVersion().equals(getFaceModelVersion())) {
            return false;
        }
        if ((describeCollectionResult.getCollectionARN() == null) ^ (getCollectionARN() == null)) {
            return false;
        }
        if (describeCollectionResult.getCollectionARN() != null && !describeCollectionResult.getCollectionARN().equals(getCollectionARN())) {
            return false;
        }
        if ((describeCollectionResult.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (describeCollectionResult.getCreationTimestamp() != null && !describeCollectionResult.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((describeCollectionResult.getUserCount() == null) ^ (getUserCount() == null)) {
            return false;
        }
        return describeCollectionResult.getUserCount() == null || describeCollectionResult.getUserCount().equals(getUserCount());
    }

    public String getCollectionARN() {
        return this.collectionARN;
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public Long getFaceCount() {
        return this.faceCount;
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public Long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        return (((((((((getFaceCount() == null ? 0 : getFaceCount().hashCode()) + 31) * 31) + (getFaceModelVersion() == null ? 0 : getFaceModelVersion().hashCode())) * 31) + (getCollectionARN() == null ? 0 : getCollectionARN().hashCode())) * 31) + (getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode())) * 31) + (getUserCount() != null ? getUserCount().hashCode() : 0);
    }

    public void setCollectionARN(String str) {
        this.collectionARN = str;
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setFaceCount(Long l) {
        this.faceCount = l;
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setUserCount(Long l) {
        this.userCount = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceCount() != null) {
            sb.append("FaceCount: " + getFaceCount() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        }
        if (getCollectionARN() != null) {
            sb.append("CollectionARN: " + getCollectionARN() + ",");
        }
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getUserCount() != null) {
            sb.append("UserCount: " + getUserCount());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeCollectionResult withCollectionARN(String str) {
        this.collectionARN = str;
        return this;
    }

    public DescribeCollectionResult withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public DescribeCollectionResult withFaceCount(Long l) {
        this.faceCount = l;
        return this;
    }

    public DescribeCollectionResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public DescribeCollectionResult withUserCount(Long l) {
        this.userCount = l;
        return this;
    }
}
