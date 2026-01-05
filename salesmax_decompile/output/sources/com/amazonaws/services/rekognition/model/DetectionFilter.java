package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectionFilter implements Serializable {
    private Float minBoundingBoxHeight;
    private Float minBoundingBoxWidth;
    private Float minConfidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectionFilter)) {
            return false;
        }
        DetectionFilter detectionFilter = (DetectionFilter) obj;
        if ((detectionFilter.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (detectionFilter.getMinConfidence() != null && !detectionFilter.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((detectionFilter.getMinBoundingBoxHeight() == null) ^ (getMinBoundingBoxHeight() == null)) {
            return false;
        }
        if (detectionFilter.getMinBoundingBoxHeight() != null && !detectionFilter.getMinBoundingBoxHeight().equals(getMinBoundingBoxHeight())) {
            return false;
        }
        if ((detectionFilter.getMinBoundingBoxWidth() == null) ^ (getMinBoundingBoxWidth() == null)) {
            return false;
        }
        return detectionFilter.getMinBoundingBoxWidth() == null || detectionFilter.getMinBoundingBoxWidth().equals(getMinBoundingBoxWidth());
    }

    public Float getMinBoundingBoxHeight() {
        return this.minBoundingBoxHeight;
    }

    public Float getMinBoundingBoxWidth() {
        return this.minBoundingBoxWidth;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public int hashCode() {
        return (((((getMinConfidence() == null ? 0 : getMinConfidence().hashCode()) + 31) * 31) + (getMinBoundingBoxHeight() == null ? 0 : getMinBoundingBoxHeight().hashCode())) * 31) + (getMinBoundingBoxWidth() != null ? getMinBoundingBoxWidth().hashCode() : 0);
    }

    public void setMinBoundingBoxHeight(Float f) {
        this.minBoundingBoxHeight = f;
    }

    public void setMinBoundingBoxWidth(Float f) {
        this.minBoundingBoxWidth = f;
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        }
        if (getMinBoundingBoxHeight() != null) {
            sb.append("MinBoundingBoxHeight: " + getMinBoundingBoxHeight() + ",");
        }
        if (getMinBoundingBoxWidth() != null) {
            sb.append("MinBoundingBoxWidth: " + getMinBoundingBoxWidth());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectionFilter withMinBoundingBoxHeight(Float f) {
        this.minBoundingBoxHeight = f;
        return this;
    }

    public DetectionFilter withMinBoundingBoxWidth(Float f) {
        this.minBoundingBoxWidth = f;
        return this;
    }

    public DetectionFilter withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }
}
