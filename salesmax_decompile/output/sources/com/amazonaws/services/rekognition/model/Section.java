package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Section implements Serializable {
    private Long endTimestamp;
    private Long startTimestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if ((section.getStartTimestamp() == null) ^ (getStartTimestamp() == null)) {
            return false;
        }
        if (section.getStartTimestamp() != null && !section.getStartTimestamp().equals(getStartTimestamp())) {
            return false;
        }
        if ((section.getEndTimestamp() == null) ^ (getEndTimestamp() == null)) {
            return false;
        }
        return section.getEndTimestamp() == null || section.getEndTimestamp().equals(getEndTimestamp());
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return (((getStartTimestamp() == null ? 0 : getStartTimestamp().hashCode()) + 31) * 31) + (getEndTimestamp() != null ? getEndTimestamp().hashCode() : 0);
    }

    public void setEndTimestamp(Long l) {
        this.endTimestamp = l;
    }

    public void setStartTimestamp(Long l) {
        this.startTimestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTimestamp() != null) {
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        }
        if (getEndTimestamp() != null) {
            sb.append("EndTimestamp: " + getEndTimestamp());
        }
        sb.append("}");
        return sb.toString();
    }

    public Section withEndTimestamp(Long l) {
        this.endTimestamp = l;
        return this;
    }

    public Section withStartTimestamp(Long l) {
        this.startTimestamp = l;
        return this;
    }
}
