package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Pose implements Serializable {
    private Float pitch;
    private Float roll;
    private Float yaw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Pose)) {
            return false;
        }
        Pose pose = (Pose) obj;
        if ((pose.getRoll() == null) ^ (getRoll() == null)) {
            return false;
        }
        if (pose.getRoll() != null && !pose.getRoll().equals(getRoll())) {
            return false;
        }
        if ((pose.getYaw() == null) ^ (getYaw() == null)) {
            return false;
        }
        if (pose.getYaw() != null && !pose.getYaw().equals(getYaw())) {
            return false;
        }
        if ((pose.getPitch() == null) ^ (getPitch() == null)) {
            return false;
        }
        return pose.getPitch() == null || pose.getPitch().equals(getPitch());
    }

    public Float getPitch() {
        return this.pitch;
    }

    public Float getRoll() {
        return this.roll;
    }

    public Float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return (((((getRoll() == null ? 0 : getRoll().hashCode()) + 31) * 31) + (getYaw() == null ? 0 : getYaw().hashCode())) * 31) + (getPitch() != null ? getPitch().hashCode() : 0);
    }

    public void setPitch(Float f) {
        this.pitch = f;
    }

    public void setRoll(Float f) {
        this.roll = f;
    }

    public void setYaw(Float f) {
        this.yaw = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoll() != null) {
            sb.append("Roll: " + getRoll() + ",");
        }
        if (getYaw() != null) {
            sb.append("Yaw: " + getYaw() + ",");
        }
        if (getPitch() != null) {
            sb.append("Pitch: " + getPitch());
        }
        sb.append("}");
        return sb.toString();
    }

    public Pose withPitch(Float f) {
        this.pitch = f;
        return this;
    }

    public Pose withRoll(Float f) {
        this.roll = f;
        return this;
    }

    public Pose withYaw(Float f) {
        this.yaw = f;
        return this;
    }
}
