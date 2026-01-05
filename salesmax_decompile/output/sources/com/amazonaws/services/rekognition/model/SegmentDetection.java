package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class SegmentDetection implements Serializable {
    private Long durationFrames;
    private Long durationMillis;
    private String durationSMPTE;
    private Long endFrameNumber;
    private String endTimecodeSMPTE;
    private Long endTimestampMillis;
    private ShotSegment shotSegment;
    private Long startFrameNumber;
    private String startTimecodeSMPTE;
    private Long startTimestampMillis;
    private TechnicalCueSegment technicalCueSegment;

    /* renamed from: type, reason: collision with root package name */
    private String f58090type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SegmentDetection)) {
            return false;
        }
        SegmentDetection segmentDetection = (SegmentDetection) obj;
        if ((segmentDetection.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (segmentDetection.getType() != null && !segmentDetection.getType().equals(getType())) {
            return false;
        }
        if ((segmentDetection.getStartTimestampMillis() == null) ^ (getStartTimestampMillis() == null)) {
            return false;
        }
        if (segmentDetection.getStartTimestampMillis() != null && !segmentDetection.getStartTimestampMillis().equals(getStartTimestampMillis())) {
            return false;
        }
        if ((segmentDetection.getEndTimestampMillis() == null) ^ (getEndTimestampMillis() == null)) {
            return false;
        }
        if (segmentDetection.getEndTimestampMillis() != null && !segmentDetection.getEndTimestampMillis().equals(getEndTimestampMillis())) {
            return false;
        }
        if ((segmentDetection.getDurationMillis() == null) ^ (getDurationMillis() == null)) {
            return false;
        }
        if (segmentDetection.getDurationMillis() != null && !segmentDetection.getDurationMillis().equals(getDurationMillis())) {
            return false;
        }
        if ((segmentDetection.getStartTimecodeSMPTE() == null) ^ (getStartTimecodeSMPTE() == null)) {
            return false;
        }
        if (segmentDetection.getStartTimecodeSMPTE() != null && !segmentDetection.getStartTimecodeSMPTE().equals(getStartTimecodeSMPTE())) {
            return false;
        }
        if ((segmentDetection.getEndTimecodeSMPTE() == null) ^ (getEndTimecodeSMPTE() == null)) {
            return false;
        }
        if (segmentDetection.getEndTimecodeSMPTE() != null && !segmentDetection.getEndTimecodeSMPTE().equals(getEndTimecodeSMPTE())) {
            return false;
        }
        if ((segmentDetection.getDurationSMPTE() == null) ^ (getDurationSMPTE() == null)) {
            return false;
        }
        if (segmentDetection.getDurationSMPTE() != null && !segmentDetection.getDurationSMPTE().equals(getDurationSMPTE())) {
            return false;
        }
        if ((segmentDetection.getTechnicalCueSegment() == null) ^ (getTechnicalCueSegment() == null)) {
            return false;
        }
        if (segmentDetection.getTechnicalCueSegment() != null && !segmentDetection.getTechnicalCueSegment().equals(getTechnicalCueSegment())) {
            return false;
        }
        if ((segmentDetection.getShotSegment() == null) ^ (getShotSegment() == null)) {
            return false;
        }
        if (segmentDetection.getShotSegment() != null && !segmentDetection.getShotSegment().equals(getShotSegment())) {
            return false;
        }
        if ((segmentDetection.getStartFrameNumber() == null) ^ (getStartFrameNumber() == null)) {
            return false;
        }
        if (segmentDetection.getStartFrameNumber() != null && !segmentDetection.getStartFrameNumber().equals(getStartFrameNumber())) {
            return false;
        }
        if ((segmentDetection.getEndFrameNumber() == null) ^ (getEndFrameNumber() == null)) {
            return false;
        }
        if (segmentDetection.getEndFrameNumber() != null && !segmentDetection.getEndFrameNumber().equals(getEndFrameNumber())) {
            return false;
        }
        if ((segmentDetection.getDurationFrames() == null) ^ (getDurationFrames() == null)) {
            return false;
        }
        return segmentDetection.getDurationFrames() == null || segmentDetection.getDurationFrames().equals(getDurationFrames());
    }

    public Long getDurationFrames() {
        return this.durationFrames;
    }

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    public String getDurationSMPTE() {
        return this.durationSMPTE;
    }

    public Long getEndFrameNumber() {
        return this.endFrameNumber;
    }

    public String getEndTimecodeSMPTE() {
        return this.endTimecodeSMPTE;
    }

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    public ShotSegment getShotSegment() {
        return this.shotSegment;
    }

    public Long getStartFrameNumber() {
        return this.startFrameNumber;
    }

    public String getStartTimecodeSMPTE() {
        return this.startTimecodeSMPTE;
    }

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    public TechnicalCueSegment getTechnicalCueSegment() {
        return this.technicalCueSegment;
    }

    public String getType() {
        return this.f58090type;
    }

    public int hashCode() {
        return (((((((((((((((((((((((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getStartTimestampMillis() == null ? 0 : getStartTimestampMillis().hashCode())) * 31) + (getEndTimestampMillis() == null ? 0 : getEndTimestampMillis().hashCode())) * 31) + (getDurationMillis() == null ? 0 : getDurationMillis().hashCode())) * 31) + (getStartTimecodeSMPTE() == null ? 0 : getStartTimecodeSMPTE().hashCode())) * 31) + (getEndTimecodeSMPTE() == null ? 0 : getEndTimecodeSMPTE().hashCode())) * 31) + (getDurationSMPTE() == null ? 0 : getDurationSMPTE().hashCode())) * 31) + (getTechnicalCueSegment() == null ? 0 : getTechnicalCueSegment().hashCode())) * 31) + (getShotSegment() == null ? 0 : getShotSegment().hashCode())) * 31) + (getStartFrameNumber() == null ? 0 : getStartFrameNumber().hashCode())) * 31) + (getEndFrameNumber() == null ? 0 : getEndFrameNumber().hashCode())) * 31) + (getDurationFrames() != null ? getDurationFrames().hashCode() : 0);
    }

    public void setDurationFrames(Long l) {
        this.durationFrames = l;
    }

    public void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public void setDurationSMPTE(String str) {
        this.durationSMPTE = str;
    }

    public void setEndFrameNumber(Long l) {
        this.endFrameNumber = l;
    }

    public void setEndTimecodeSMPTE(String str) {
        this.endTimecodeSMPTE = str;
    }

    public void setEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
    }

    public void setShotSegment(ShotSegment shotSegment) {
        this.shotSegment = shotSegment;
    }

    public void setStartFrameNumber(Long l) {
        this.startFrameNumber = l;
    }

    public void setStartTimecodeSMPTE(String str) {
        this.startTimecodeSMPTE = str;
    }

    public void setStartTimestampMillis(Long l) {
        this.startTimestampMillis = l;
    }

    public void setTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        this.technicalCueSegment = technicalCueSegment;
    }

    public void setType(String str) {
        this.f58090type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getStartTimestampMillis() != null) {
            sb.append("StartTimestampMillis: " + getStartTimestampMillis() + ",");
        }
        if (getEndTimestampMillis() != null) {
            sb.append("EndTimestampMillis: " + getEndTimestampMillis() + ",");
        }
        if (getDurationMillis() != null) {
            sb.append("DurationMillis: " + getDurationMillis() + ",");
        }
        if (getStartTimecodeSMPTE() != null) {
            sb.append("StartTimecodeSMPTE: " + getStartTimecodeSMPTE() + ",");
        }
        if (getEndTimecodeSMPTE() != null) {
            sb.append("EndTimecodeSMPTE: " + getEndTimecodeSMPTE() + ",");
        }
        if (getDurationSMPTE() != null) {
            sb.append("DurationSMPTE: " + getDurationSMPTE() + ",");
        }
        if (getTechnicalCueSegment() != null) {
            sb.append("TechnicalCueSegment: " + getTechnicalCueSegment() + ",");
        }
        if (getShotSegment() != null) {
            sb.append("ShotSegment: " + getShotSegment() + ",");
        }
        if (getStartFrameNumber() != null) {
            sb.append("StartFrameNumber: " + getStartFrameNumber() + ",");
        }
        if (getEndFrameNumber() != null) {
            sb.append("EndFrameNumber: " + getEndFrameNumber() + ",");
        }
        if (getDurationFrames() != null) {
            sb.append("DurationFrames: " + getDurationFrames());
        }
        sb.append("}");
        return sb.toString();
    }

    public SegmentDetection withDurationFrames(Long l) {
        this.durationFrames = l;
        return this;
    }

    public SegmentDetection withDurationMillis(Long l) {
        this.durationMillis = l;
        return this;
    }

    public SegmentDetection withDurationSMPTE(String str) {
        this.durationSMPTE = str;
        return this;
    }

    public SegmentDetection withEndFrameNumber(Long l) {
        this.endFrameNumber = l;
        return this;
    }

    public SegmentDetection withEndTimecodeSMPTE(String str) {
        this.endTimecodeSMPTE = str;
        return this;
    }

    public SegmentDetection withEndTimestampMillis(Long l) {
        this.endTimestampMillis = l;
        return this;
    }

    public SegmentDetection withShotSegment(ShotSegment shotSegment) {
        this.shotSegment = shotSegment;
        return this;
    }

    public SegmentDetection withStartFrameNumber(Long l) {
        this.startFrameNumber = l;
        return this;
    }

    public SegmentDetection withStartTimecodeSMPTE(String str) {
        this.startTimecodeSMPTE = str;
        return this;
    }

    public SegmentDetection withStartTimestampMillis(Long l) {
        this.startTimestampMillis = l;
        return this;
    }

    public SegmentDetection withTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        this.technicalCueSegment = technicalCueSegment;
        return this;
    }

    public SegmentDetection withType(String str) {
        this.f58090type = str;
        return this;
    }

    public void setType(SegmentType segmentType) {
        this.f58090type = segmentType.toString();
    }

    public SegmentDetection withType(SegmentType segmentType) {
        this.f58090type = segmentType.toString();
        return this;
    }
}
