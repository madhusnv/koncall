package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class TextDetectionResult implements Serializable {
    private TextDetection textDetection;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextDetectionResult)) {
            return false;
        }
        TextDetectionResult textDetectionResult = (TextDetectionResult) obj;
        if ((textDetectionResult.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (textDetectionResult.getTimestamp() != null && !textDetectionResult.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((textDetectionResult.getTextDetection() == null) ^ (getTextDetection() == null)) {
            return false;
        }
        return textDetectionResult.getTextDetection() == null || textDetectionResult.getTextDetection().equals(getTextDetection());
    }

    public TextDetection getTextDetection() {
        return this.textDetection;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getTextDetection() != null ? getTextDetection().hashCode() : 0);
    }

    public void setTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
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
        if (getTextDetection() != null) {
            sb.append("TextDetection: " + getTextDetection());
        }
        sb.append("}");
        return sb.toString();
    }

    public TextDetectionResult withTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
        return this;
    }

    public TextDetectionResult withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
