package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CustomLabel implements Serializable {
    private Float confidence;
    private Geometry geometry;
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CustomLabel)) {
            return false;
        }
        CustomLabel customLabel = (CustomLabel) obj;
        if ((customLabel.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (customLabel.getName() != null && !customLabel.getName().equals(getName())) {
            return false;
        }
        if ((customLabel.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (customLabel.getConfidence() != null && !customLabel.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((customLabel.getGeometry() == null) ^ (getGeometry() == null)) {
            return false;
        }
        return customLabel.getGeometry() == null || customLabel.getGeometry().equals(getGeometry());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getGeometry() != null ? getGeometry().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getGeometry() != null) {
            sb.append("Geometry: " + getGeometry());
        }
        sb.append("}");
        return sb.toString();
    }

    public CustomLabel withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public CustomLabel withGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

    public CustomLabel withName(String str) {
        this.name = str;
        return this;
    }
}
