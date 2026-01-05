package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ShotSegment implements Serializable {
    private Float confidence;
    private Long index;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ShotSegment)) {
            return false;
        }
        ShotSegment shotSegment = (ShotSegment) obj;
        if ((shotSegment.getIndex() == null) ^ (getIndex() == null)) {
            return false;
        }
        if (shotSegment.getIndex() != null && !shotSegment.getIndex().equals(getIndex())) {
            return false;
        }
        if ((shotSegment.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return shotSegment.getConfidence() == null || shotSegment.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Long getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((getIndex() == null ? 0 : getIndex().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setIndex(Long l) {
        this.index = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndex() != null) {
            sb.append("Index: " + getIndex() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public ShotSegment withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public ShotSegment withIndex(Long l) {
        this.index = l;
        return this;
    }
}
