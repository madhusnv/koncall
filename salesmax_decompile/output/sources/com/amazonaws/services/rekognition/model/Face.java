package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Face implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;
    private String externalImageId;
    private String faceId;
    private String imageId;
    private String indexFacesModelVersion;
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Face)) {
            return false;
        }
        Face face = (Face) obj;
        if ((face.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        if (face.getFaceId() != null && !face.getFaceId().equals(getFaceId())) {
            return false;
        }
        if ((face.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (face.getBoundingBox() != null && !face.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((face.getImageId() == null) ^ (getImageId() == null)) {
            return false;
        }
        if (face.getImageId() != null && !face.getImageId().equals(getImageId())) {
            return false;
        }
        if ((face.getExternalImageId() == null) ^ (getExternalImageId() == null)) {
            return false;
        }
        if (face.getExternalImageId() != null && !face.getExternalImageId().equals(getExternalImageId())) {
            return false;
        }
        if ((face.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (face.getConfidence() != null && !face.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((face.getIndexFacesModelVersion() == null) ^ (getIndexFacesModelVersion() == null)) {
            return false;
        }
        if (face.getIndexFacesModelVersion() != null && !face.getIndexFacesModelVersion().equals(getIndexFacesModelVersion())) {
            return false;
        }
        if ((face.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        return face.getUserId() == null || face.getUserId().equals(getUserId());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getExternalImageId() {
        return this.externalImageId;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public String getIndexFacesModelVersion() {
        return this.indexFacesModelVersion;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((getFaceId() == null ? 0 : getFaceId().hashCode()) + 31) * 31) + (getBoundingBox() == null ? 0 : getBoundingBox().hashCode())) * 31) + (getImageId() == null ? 0 : getImageId().hashCode())) * 31) + (getExternalImageId() == null ? 0 : getExternalImageId().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getIndexFacesModelVersion() == null ? 0 : getIndexFacesModelVersion().hashCode())) * 31) + (getUserId() != null ? getUserId().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setExternalImageId(String str) {
        this.externalImageId = str;
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public void setImageId(String str) {
        this.imageId = str;
    }

    public void setIndexFacesModelVersion(String str) {
        this.indexFacesModelVersion = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceId() != null) {
            sb.append("FaceId: " + getFaceId() + ",");
        }
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getImageId() != null) {
            sb.append("ImageId: " + getImageId() + ",");
        }
        if (getExternalImageId() != null) {
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getIndexFacesModelVersion() != null) {
            sb.append("IndexFacesModelVersion: " + getIndexFacesModelVersion() + ",");
        }
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId());
        }
        sb.append("}");
        return sb.toString();
    }

    public Face withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public Face withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Face withExternalImageId(String str) {
        this.externalImageId = str;
        return this;
    }

    public Face withFaceId(String str) {
        this.faceId = str;
        return this;
    }

    public Face withImageId(String str) {
        this.imageId = str;
        return this;
    }

    public Face withIndexFacesModelVersion(String str) {
        this.indexFacesModelVersion = str;
        return this;
    }

    public Face withUserId(String str) {
        this.userId = str;
        return this;
    }
}
