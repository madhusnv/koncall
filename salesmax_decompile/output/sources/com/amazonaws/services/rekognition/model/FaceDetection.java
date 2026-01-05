package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class FaceDetection implements Serializable {
    private FaceDetail face;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FaceDetection)) {
            return false;
        }
        FaceDetection faceDetection = (FaceDetection) obj;
        if ((faceDetection.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (faceDetection.getTimestamp() != null && !faceDetection.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((faceDetection.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        return faceDetection.getFace() == null || faceDetection.getFace().equals(getFace());
    }

    public FaceDetail getFace() {
        return this.face;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getFace() != null ? getFace().hashCode() : 0);
    }

    public void setFace(FaceDetail faceDetail) {
        this.face = faceDetail;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null) {
            sb.append("Timestamp: " + getTimestamp() + ",");
        }
        if (getFace() != null) {
            sb.append("Face: " + getFace());
        }
        sb.append("}");
        return sb.toString();
    }

    public FaceDetection withFace(FaceDetail faceDetail) {
        this.face = faceDetail;
        return this;
    }

    public FaceDetection withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
