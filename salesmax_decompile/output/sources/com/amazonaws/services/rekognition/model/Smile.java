package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Smile implements Serializable {
    private Float confidence;
    private Boolean value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Smile)) {
            return false;
        }
        Smile smile = (Smile) obj;
        if ((smile.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (smile.getValue() != null && !smile.getValue().equals(getValue())) {
            return false;
        }
        if ((smile.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return smile.getConfidence() == null || smile.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getValue() == null ? 0 : getValue().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public Boolean isValue() {
        return this.value;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setValue(Boolean bool) {
        this.value = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValue() != null) {
            sb.append("Value: " + getValue() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public Smile withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Smile withValue(Boolean bool) {
        this.value = bool;
        return this;
    }
}
