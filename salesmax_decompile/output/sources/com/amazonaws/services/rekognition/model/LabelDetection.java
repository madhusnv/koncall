package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class LabelDetection implements Serializable {
    private Long durationMillis;
    private Long endTimestampMillis;
    private Label label;
    private Long startTimestampMillis;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LabelDetection)) {
            return false;
        }
        LabelDetection labelDetection = (LabelDetection) obj;
        if ((labelDetection.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (labelDetection.getTimestamp() != null && !labelDetection.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((labelDetection.getLabel() == null) ^ (getLabel() == null)) {
            return false;
        }
        if (labelDetection.getLabel() != null && !labelDetection.getLabel().equals(getLabel())) {
            return false;
        }
        if ((labelDetection.getStartTimestampMillis() == null) ^ (getStartTimestampMillis() == null)) {
            return false;
        }
        if (labelDetection.getStartTimestampMillis() != null && !labelDetection.getStartTimestampMillis().equals(getStartTimestampMillis())) {
            return false;
        }
        if ((labelDetection.getEndTimestampMillis() == null) ^ (getEndTimestampMillis() == null)) {
            return false;
        }
        if (labelDetection.getEndTimestampMillis() != null && !labelDetection.getEndTimestampMillis().equals(getEndTimestampMillis())) {
            return false;
        }
        if ((labelDetection.getDurationMillis() == null) ^ (getDurationMillis() == null)) {
            return false;
        }
        return labelDetection.getDurationMillis() == null || labelDetection.getDurationMillis().equals(getDurationMillis());
    }

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    public Label getLabel() {
        return this.label;
    }

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getLabel() == null ? 0 : getLabel().hashCode())) * 31) + (getStartTimestampMillis() == null ? 0 : getStartTimestampMillis().hashCode())) * 31) + (getEndTimestampMillis() == null ? 0 : getEndTimestampMillis().hashCode())) * 31) + (getDurationMillis() != null ? getDurationMillis().hashCode() : 0);
    }

    public void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public void setEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void setStartTimestampMillis(Long l) {
        this.startTimestampMillis = l;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null) {
            sb.append("Timestamp: " + getTimestamp() + ",");
        }
        if (getLabel() != null) {
            sb.append("Label: " + getLabel() + ",");
        }
        if (getStartTimestampMillis() != null) {
            sb.append("StartTimestampMillis: " + getStartTimestampMillis() + ",");
        }
        if (getEndTimestampMillis() != null) {
            sb.append("EndTimestampMillis: " + getEndTimestampMillis() + ",");
        }
        if (getDurationMillis() != null) {
            sb.append("DurationMillis: " + getDurationMillis());
        }
        sb.append("}");
        return sb.toString();
    }

    public LabelDetection withDurationMillis(Long l) {
        this.durationMillis = l;
        return this;
    }

    public LabelDetection withEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
        return this;
    }

    public LabelDetection withLabel(Label label) {
        this.label = label;
        return this;
    }

    public LabelDetection withStartTimestampMillis(Long l) {
        this.startTimestampMillis = l;
        return this;
    }

    public LabelDetection withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
