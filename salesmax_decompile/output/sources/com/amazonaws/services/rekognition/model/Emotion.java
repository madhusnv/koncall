package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Emotion implements Serializable {
    private Float confidence;

    /* renamed from: type, reason: collision with root package name */
    private String f58086type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Emotion)) {
            return false;
        }
        Emotion emotion = (Emotion) obj;
        if ((emotion.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (emotion.getType() != null && !emotion.getType().equals(getType())) {
            return false;
        }
        if ((emotion.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return emotion.getConfidence() == null || emotion.getConfidence().equals(getConfidence());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getType() {
        return this.f58086type;
    }

    public int hashCode() {
        return (((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setType(String str) {
        this.f58086type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public Emotion withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Emotion withType(String str) {
        this.f58086type = str;
        return this;
    }

    public void setType(EmotionName emotionName) {
        this.f58086type = emotionName.toString();
    }

    public Emotion withType(EmotionName emotionName) {
        this.f58086type = emotionName.toString();
        return this;
    }
}
