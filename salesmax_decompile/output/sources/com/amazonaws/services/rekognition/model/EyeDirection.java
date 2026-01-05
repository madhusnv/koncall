package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class EyeDirection implements Serializable {
    private Float confidence;
    private Float pitch;
    private Float yaw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EyeDirection)) {
            return false;
        }
        EyeDirection eyeDirection = (EyeDirection) obj;
        if ((eyeDirection.getYaw() == null) ^ (getYaw() == null)) {
            return false;
        }
        if (eyeDirection.getYaw() != null && !eyeDirection.getYaw().equals(getYaw())) {
            return false;
        }
        if ((eyeDirection.getPitch() == null) ^ (getPitch() == null)) {
            return false;
        }
        if (eyeDirection.getPitch() != null && !eyeDirection.getPitch().equals(getPitch())) {
            return false;
        }
        if ((eyeDirection.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return eyeDirection.getConfidence() == null || eyeDirection.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Float getPitch() {
        return this.pitch;
    }

    public Float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return (((((getYaw() == null ? 0 : getYaw().hashCode()) + 31) * 31) + (getPitch() == null ? 0 : getPitch().hashCode())) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setPitch(Float f) {
        this.pitch = f;
    }

    public void setYaw(Float f) {
        this.yaw = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getYaw() != null) {
            sb.append("Yaw: " + getYaw() + ",");
        }
        if (getPitch() != null) {
            sb.append("Pitch: " + getPitch() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public EyeDirection withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public EyeDirection withPitch(Float f) {
        this.pitch = f;
        return this;
    }

    public EyeDirection withYaw(Float f) {
        this.yaw = f;
        return this;
    }
}
