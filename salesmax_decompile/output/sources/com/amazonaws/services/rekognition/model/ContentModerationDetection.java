package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ContentModerationDetection implements Serializable {
    private Long durationMillis;
    private Long endTimestampMillis;
    private ModerationLabel moderationLabel;
    private Long startTimestampMillis;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContentModerationDetection)) {
            return false;
        }
        ContentModerationDetection contentModerationDetection = (ContentModerationDetection) obj;
        if ((contentModerationDetection.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (contentModerationDetection.getTimestamp() != null && !contentModerationDetection.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((contentModerationDetection.getModerationLabel() == null) ^ (getModerationLabel() == null)) {
            return false;
        }
        if (contentModerationDetection.getModerationLabel() != null && !contentModerationDetection.getModerationLabel().equals(getModerationLabel())) {
            return false;
        }
        if ((contentModerationDetection.getStartTimestampMillis() == null) ^ (getStartTimestampMillis() == null)) {
            return false;
        }
        if (contentModerationDetection.getStartTimestampMillis() != null && !contentModerationDetection.getStartTimestampMillis().equals(getStartTimestampMillis())) {
            return false;
        }
        if ((contentModerationDetection.getEndTimestampMillis() == null) ^ (getEndTimestampMillis() == null)) {
            return false;
        }
        if (contentModerationDetection.getEndTimestampMillis() != null && !contentModerationDetection.getEndTimestampMillis().equals(getEndTimestampMillis())) {
            return false;
        }
        if ((contentModerationDetection.getDurationMillis() == null) ^ (getDurationMillis() == null)) {
            return false;
        }
        return contentModerationDetection.getDurationMillis() == null || contentModerationDetection.getDurationMillis().equals(getDurationMillis());
    }

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    public ModerationLabel getModerationLabel() {
        return this.moderationLabel;
    }

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getModerationLabel() == null ? 0 : getModerationLabel().hashCode())) * 31) + (getStartTimestampMillis() == null ? 0 : getStartTimestampMillis().hashCode())) * 31) + (getEndTimestampMillis() == null ? 0 : getEndTimestampMillis().hashCode())) * 31) + (getDurationMillis() != null ? getDurationMillis().hashCode() : 0);
    }

    public void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public void setEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
    }

    public void setModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
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
        if (getModerationLabel() != null) {
            sb.append("ModerationLabel: " + getModerationLabel() + ",");
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

    public ContentModerationDetection withDurationMillis(Long l) {
        this.durationMillis = l;
        return this;
    }

    public ContentModerationDetection withEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
        return this;
    }

    public ContentModerationDetection withModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
        return this;
    }

    public ContentModerationDetection withStartTimestampMillis(Long l) {
        this.startTimestampMillis = l;
        return this;
    }

    public ContentModerationDetection withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
