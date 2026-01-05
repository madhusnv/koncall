package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartTechnicalCueDetectionFilter implements Serializable {
    private BlackFrame blackFrame;
    private Float minSegmentConfidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartTechnicalCueDetectionFilter)) {
            return false;
        }
        StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter = (StartTechnicalCueDetectionFilter) obj;
        if ((startTechnicalCueDetectionFilter.getMinSegmentConfidence() == null) ^ (getMinSegmentConfidence() == null)) {
            return false;
        }
        if (startTechnicalCueDetectionFilter.getMinSegmentConfidence() != null && !startTechnicalCueDetectionFilter.getMinSegmentConfidence().equals(getMinSegmentConfidence())) {
            return false;
        }
        if ((startTechnicalCueDetectionFilter.getBlackFrame() == null) ^ (getBlackFrame() == null)) {
            return false;
        }
        return startTechnicalCueDetectionFilter.getBlackFrame() == null || startTechnicalCueDetectionFilter.getBlackFrame().equals(getBlackFrame());
    }

    public BlackFrame getBlackFrame() {
        return this.blackFrame;
    }

    public Float getMinSegmentConfidence() {
        return this.minSegmentConfidence;
    }

    public int hashCode() {
        return (((getMinSegmentConfidence() == null ? 0 : getMinSegmentConfidence().hashCode()) + 31) * 31) + (getBlackFrame() != null ? getBlackFrame().hashCode() : 0);
    }

    public void setBlackFrame(BlackFrame blackFrame) {
        this.blackFrame = blackFrame;
    }

    public void setMinSegmentConfidence(Float f) {
        this.minSegmentConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinSegmentConfidence() != null) {
            sb.append("MinSegmentConfidence: " + getMinSegmentConfidence() + ",");
        }
        if (getBlackFrame() != null) {
            sb.append("BlackFrame: " + getBlackFrame());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartTechnicalCueDetectionFilter withBlackFrame(BlackFrame blackFrame) {
        this.blackFrame = blackFrame;
        return this;
    }

    public StartTechnicalCueDetectionFilter withMinSegmentConfidence(Float f) {
        this.minSegmentConfidence = f;
        return this;
    }
}
