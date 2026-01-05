package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessingStopSelector implements Serializable {
    private Long maxDurationInSeconds;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessingStopSelector)) {
            return false;
        }
        StreamProcessingStopSelector streamProcessingStopSelector = (StreamProcessingStopSelector) obj;
        if ((streamProcessingStopSelector.getMaxDurationInSeconds() == null) ^ (getMaxDurationInSeconds() == null)) {
            return false;
        }
        return streamProcessingStopSelector.getMaxDurationInSeconds() == null || streamProcessingStopSelector.getMaxDurationInSeconds().equals(getMaxDurationInSeconds());
    }

    public Long getMaxDurationInSeconds() {
        return this.maxDurationInSeconds;
    }

    public int hashCode() {
        return 31 + (getMaxDurationInSeconds() == null ? 0 : getMaxDurationInSeconds().hashCode());
    }

    public void setMaxDurationInSeconds(Long l) {
        this.maxDurationInSeconds = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxDurationInSeconds() != null) {
            sb.append("MaxDurationInSeconds: " + getMaxDurationInSeconds());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessingStopSelector withMaxDurationInSeconds(Long l) {
        this.maxDurationInSeconds = l;
        return this;
    }
}
