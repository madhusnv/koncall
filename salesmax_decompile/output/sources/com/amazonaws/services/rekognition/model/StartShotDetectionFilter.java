package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartShotDetectionFilter implements Serializable {
    private Float minSegmentConfidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartShotDetectionFilter)) {
            return false;
        }
        StartShotDetectionFilter startShotDetectionFilter = (StartShotDetectionFilter) obj;
        if ((startShotDetectionFilter.getMinSegmentConfidence() == null) ^ (getMinSegmentConfidence() == null)) {
            return false;
        }
        return startShotDetectionFilter.getMinSegmentConfidence() == null || startShotDetectionFilter.getMinSegmentConfidence().equals(getMinSegmentConfidence());
    }

    public Float getMinSegmentConfidence() {
        return this.minSegmentConfidence;
    }

    public int hashCode() {
        return 31 + (getMinSegmentConfidence() == null ? 0 : getMinSegmentConfidence().hashCode());
    }

    public void setMinSegmentConfidence(Float f) {
        this.minSegmentConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinSegmentConfidence() != null) {
            sb.append("MinSegmentConfidence: " + getMinSegmentConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartShotDetectionFilter withMinSegmentConfidence(Float f) {
        this.minSegmentConfidence = f;
        return this;
    }
}
