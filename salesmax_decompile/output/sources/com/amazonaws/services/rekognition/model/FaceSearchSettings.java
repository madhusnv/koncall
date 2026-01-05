package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class FaceSearchSettings implements Serializable {
    private String collectionId;
    private Float faceMatchThreshold;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FaceSearchSettings)) {
            return false;
        }
        FaceSearchSettings faceSearchSettings = (FaceSearchSettings) obj;
        if ((faceSearchSettings.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (faceSearchSettings.getCollectionId() != null && !faceSearchSettings.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((faceSearchSettings.getFaceMatchThreshold() == null) ^ (getFaceMatchThreshold() == null)) {
            return false;
        }
        return faceSearchSettings.getFaceMatchThreshold() == null || faceSearchSettings.getFaceMatchThreshold().equals(getFaceMatchThreshold());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    public int hashCode() {
        return (((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getFaceMatchThreshold() != null ? getFaceMatchThreshold().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getFaceMatchThreshold() != null) {
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold());
        }
        sb.append("}");
        return sb.toString();
    }

    public FaceSearchSettings withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public FaceSearchSettings withFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
        return this;
    }
}
