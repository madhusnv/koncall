package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class AssociatedFace implements Serializable {
    private String faceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociatedFace)) {
            return false;
        }
        AssociatedFace associatedFace = (AssociatedFace) obj;
        if ((associatedFace.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        return associatedFace.getFaceId() == null || associatedFace.getFaceId().equals(getFaceId());
    }

    public String getFaceId() {
        return this.faceId;
    }

    public int hashCode() {
        return 31 + (getFaceId() == null ? 0 : getFaceId().hashCode());
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceId() != null) {
            sb.append("FaceId: " + getFaceId());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssociatedFace withFaceId(String str) {
        this.faceId = str;
        return this;
    }
}
