package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CoversBodyPart implements Serializable {
    private Float confidence;
    private Boolean value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CoversBodyPart)) {
            return false;
        }
        CoversBodyPart coversBodyPart = (CoversBodyPart) obj;
        if ((coversBodyPart.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (coversBodyPart.getConfidence() != null && !coversBodyPart.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((coversBodyPart.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        return coversBodyPart.getValue() == null || coversBodyPart.getValue().equals(getValue());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getConfidence() == null ? 0 : getConfidence().hashCode()) + 31) * 31) + (getValue() != null ? getValue().hashCode() : 0);
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
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getValue() != null) {
            sb.append("Value: " + getValue());
        }
        sb.append("}");
        return sb.toString();
    }

    public CoversBodyPart withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public CoversBodyPart withValue(Boolean bool) {
        this.value = bool;
        return this;
    }
}
