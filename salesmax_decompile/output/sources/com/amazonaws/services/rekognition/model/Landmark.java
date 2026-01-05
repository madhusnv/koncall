package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Landmark implements Serializable {

    /* renamed from: type, reason: collision with root package name */
    private String f58089type;

    /* renamed from: x */
    private Float f10616x;

    /* renamed from: y */
    private Float f10617y;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Landmark)) {
            return false;
        }
        Landmark landmark = (Landmark) obj;
        if ((landmark.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (landmark.getType() != null && !landmark.getType().equals(getType())) {
            return false;
        }
        if ((landmark.getX() == null) ^ (getX() == null)) {
            return false;
        }
        if (landmark.getX() != null && !landmark.getX().equals(getX())) {
            return false;
        }
        if ((landmark.getY() == null) ^ (getY() == null)) {
            return false;
        }
        return landmark.getY() == null || landmark.getY().equals(getY());
    }

    public String getType() {
        return this.f58089type;
    }

    public Float getX() {
        return this.f10616x;
    }

    public Float getY() {
        return this.f10617y;
    }

    public int hashCode() {
        return (((((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getX() == null ? 0 : getX().hashCode())) * 31) + (getY() != null ? getY().hashCode() : 0);
    }

    public void setType(String str) {
        this.f58089type = str;
    }

    public void setX(Float f) {
        this.f10616x = f;
    }

    public void setY(Float f) {
        this.f10617y = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getX() != null) {
            sb.append("X: " + getX() + ",");
        }
        if (getY() != null) {
            sb.append("Y: " + getY());
        }
        sb.append("}");
        return sb.toString();
    }

    public Landmark withType(String str) {
        this.f58089type = str;
        return this;
    }

    public Landmark withX(Float f) {
        this.f10616x = f;
        return this;
    }

    public Landmark withY(Float f) {
        this.f10617y = f;
        return this;
    }

    public void setType(LandmarkType landmarkType) {
        this.f58089type = landmarkType.toString();
    }

    public Landmark withType(LandmarkType landmarkType) {
        this.f58089type = landmarkType.toString();
        return this;
    }
}
