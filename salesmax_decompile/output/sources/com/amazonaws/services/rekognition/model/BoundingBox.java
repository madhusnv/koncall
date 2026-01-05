package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class BoundingBox implements Serializable {
    private Float height;
    private Float left;
    private Float top;
    private Float width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        if ((boundingBox.getWidth() == null) ^ (getWidth() == null)) {
            return false;
        }
        if (boundingBox.getWidth() != null && !boundingBox.getWidth().equals(getWidth())) {
            return false;
        }
        if ((boundingBox.getHeight() == null) ^ (getHeight() == null)) {
            return false;
        }
        if (boundingBox.getHeight() != null && !boundingBox.getHeight().equals(getHeight())) {
            return false;
        }
        if ((boundingBox.getLeft() == null) ^ (getLeft() == null)) {
            return false;
        }
        if (boundingBox.getLeft() != null && !boundingBox.getLeft().equals(getLeft())) {
            return false;
        }
        if ((boundingBox.getTop() == null) ^ (getTop() == null)) {
            return false;
        }
        return boundingBox.getTop() == null || boundingBox.getTop().equals(getTop());
    }

    public Float getHeight() {
        return this.height;
    }

    public Float getLeft() {
        return this.left;
    }

    public Float getTop() {
        return this.top;
    }

    public Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((getWidth() == null ? 0 : getWidth().hashCode()) + 31) * 31) + (getHeight() == null ? 0 : getHeight().hashCode())) * 31) + (getLeft() == null ? 0 : getLeft().hashCode())) * 31) + (getTop() != null ? getTop().hashCode() : 0);
    }

    public void setHeight(Float f) {
        this.height = f;
    }

    public void setLeft(Float f) {
        this.left = f;
    }

    public void setTop(Float f) {
        this.top = f;
    }

    public void setWidth(Float f) {
        this.width = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWidth() != null) {
            sb.append("Width: " + getWidth() + ",");
        }
        if (getHeight() != null) {
            sb.append("Height: " + getHeight() + ",");
        }
        if (getLeft() != null) {
            sb.append("Left: " + getLeft() + ",");
        }
        if (getTop() != null) {
            sb.append("Top: " + getTop());
        }
        sb.append("}");
        return sb.toString();
    }

    public BoundingBox withHeight(Float f) {
        this.height = f;
        return this;
    }

    public BoundingBox withLeft(Float f) {
        this.left = f;
        return this;
    }

    public BoundingBox withTop(Float f) {
        this.top = f;
        return this;
    }

    public BoundingBox withWidth(Float f) {
        this.width = f;
        return this;
    }
}
