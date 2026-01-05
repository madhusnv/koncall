package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class TechnicalCueSegment implements Serializable {
    private Float confidence;

    /* renamed from: type, reason: collision with root package name */
    private String f58092type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TechnicalCueSegment)) {
            return false;
        }
        TechnicalCueSegment technicalCueSegment = (TechnicalCueSegment) obj;
        if ((technicalCueSegment.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (technicalCueSegment.getType() != null && !technicalCueSegment.getType().equals(getType())) {
            return false;
        }
        if ((technicalCueSegment.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return technicalCueSegment.getConfidence() == null || technicalCueSegment.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getType() {
        return this.f58092type;
    }

    public int hashCode() {
        return (((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setType(String str) {
        this.f58092type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public TechnicalCueSegment withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public TechnicalCueSegment withType(String str) {
        this.f58092type = str;
        return this;
    }

    public void setType(TechnicalCueType technicalCueType) {
        this.f58092type = technicalCueType.toString();
    }

    public TechnicalCueSegment withType(TechnicalCueType technicalCueType) {
        this.f58092type = technicalCueType.toString();
        return this;
    }
}
