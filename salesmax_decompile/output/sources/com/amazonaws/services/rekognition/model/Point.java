package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Point implements Serializable {

    /* renamed from: x */
    private Float f10618x;

    /* renamed from: y */
    private Float f10619y;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        if ((point.getX() == null) ^ (getX() == null)) {
            return false;
        }
        if (point.getX() != null && !point.getX().equals(getX())) {
            return false;
        }
        if ((point.getY() == null) ^ (getY() == null)) {
            return false;
        }
        return point.getY() == null || point.getY().equals(getY());
    }

    public Float getX() {
        return this.f10618x;
    }

    public Float getY() {
        return this.f10619y;
    }

    public int hashCode() {
        return (((getX() == null ? 0 : getX().hashCode()) + 31) * 31) + (getY() != null ? getY().hashCode() : 0);
    }

    public void setX(Float f) {
        this.f10618x = f;
    }

    public void setY(Float f) {
        this.f10619y = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getX() != null) {
            sb.append("X: " + getX() + ",");
        }
        if (getY() != null) {
            sb.append("Y: " + getY());
        }
        sb.append("}");
        return sb.toString();
    }

    public Point withX(Float f) {
        this.f10618x = f;
        return this;
    }

    public Point withY(Float f) {
        this.f10619y = f;
        return this;
    }
}
