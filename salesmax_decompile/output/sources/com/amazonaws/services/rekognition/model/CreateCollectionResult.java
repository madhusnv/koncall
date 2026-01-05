package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateCollectionResult implements Serializable {
    private String collectionArn;
    private String faceModelVersion;
    private Integer statusCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCollectionResult)) {
            return false;
        }
        CreateCollectionResult createCollectionResult = (CreateCollectionResult) obj;
        if ((createCollectionResult.getStatusCode() == null) ^ (getStatusCode() == null)) {
            return false;
        }
        if (createCollectionResult.getStatusCode() != null && !createCollectionResult.getStatusCode().equals(getStatusCode())) {
            return false;
        }
        if ((createCollectionResult.getCollectionArn() == null) ^ (getCollectionArn() == null)) {
            return false;
        }
        if (createCollectionResult.getCollectionArn() != null && !createCollectionResult.getCollectionArn().equals(getCollectionArn())) {
            return false;
        }
        if ((createCollectionResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        return createCollectionResult.getFaceModelVersion() == null || createCollectionResult.getFaceModelVersion().equals(getFaceModelVersion());
    }

    public String getCollectionArn() {
        return this.collectionArn;
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (((((getStatusCode() == null ? 0 : getStatusCode().hashCode()) + 31) * 31) + (getCollectionArn() == null ? 0 : getCollectionArn().hashCode())) * 31) + (getFaceModelVersion() != null ? getFaceModelVersion().hashCode() : 0);
    }

    public void setCollectionArn(String str) {
        this.collectionArn = str;
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatusCode() != null) {
            sb.append("StatusCode: " + getStatusCode() + ",");
        }
        if (getCollectionArn() != null) {
            sb.append("CollectionArn: " + getCollectionArn() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateCollectionResult withCollectionArn(String str) {
        this.collectionArn = str;
        return this;
    }

    public CreateCollectionResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public CreateCollectionResult withStatusCode(Integer num) {
        this.statusCode = num;
        return this;
    }
}
