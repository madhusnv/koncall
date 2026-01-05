package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Gender implements Serializable {
    private Float confidence;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Gender)) {
            return false;
        }
        Gender gender = (Gender) obj;
        if ((gender.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (gender.getValue() != null && !gender.getValue().equals(getValue())) {
            return false;
        }
        if ((gender.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return gender.getConfidence() == null || gender.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getValue() == null ? 0 : getValue().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setValue(String str) {
        this.value = str;
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

    public Gender withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Gender withValue(String str) {
        this.value = str;
        return this;
    }

    public void setValue(GenderType genderType) {
        this.value = genderType.toString();
    }

    public Gender withValue(GenderType genderType) {
        this.value = genderType.toString();
        return this;
    }
}
