package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DisassociatedFace implements Serializable {
    private String faceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisassociatedFace)) {
            return false;
        }
        DisassociatedFace disassociatedFace = (DisassociatedFace) obj;
        if ((disassociatedFace.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        return disassociatedFace.getFaceId() == null || disassociatedFace.getFaceId().equals(getFaceId());
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

    public DisassociatedFace withFaceId(String str) {
        this.faceId = str;
        return this;
    }
}
