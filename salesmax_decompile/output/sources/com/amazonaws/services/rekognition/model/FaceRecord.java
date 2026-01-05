package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class FaceRecord implements Serializable {
    private Face face;
    private FaceDetail faceDetail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FaceRecord)) {
            return false;
        }
        FaceRecord faceRecord = (FaceRecord) obj;
        if ((faceRecord.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        if (faceRecord.getFace() != null && !faceRecord.getFace().equals(getFace())) {
            return false;
        }
        if ((faceRecord.getFaceDetail() == null) ^ (getFaceDetail() == null)) {
            return false;
        }
        return faceRecord.getFaceDetail() == null || faceRecord.getFaceDetail().equals(getFaceDetail());
    }

    public Face getFace() {
        return this.face;
    }

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    public int hashCode() {
        return (((getFace() == null ? 0 : getFace().hashCode()) + 31) * 31) + (getFaceDetail() != null ? getFaceDetail().hashCode() : 0);
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFace() != null) {
            sb.append("Face: " + getFace() + ",");
        }
        if (getFaceDetail() != null) {
            sb.append("FaceDetail: " + getFaceDetail());
        }
        sb.append("}");
        return sb.toString();
    }

    public FaceRecord withFace(Face face) {
        this.face = face;
        return this;
    }

    public FaceRecord withFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }
}
