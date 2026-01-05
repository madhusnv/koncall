package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class TextDetection implements Serializable {
    private Float confidence;
    private String detectedText;
    private Geometry geometry;
    private Integer id;
    private Integer parentId;

    /* renamed from: type, reason: collision with root package name */
    private String f58093type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextDetection)) {
            return false;
        }
        TextDetection textDetection = (TextDetection) obj;
        if ((textDetection.getDetectedText() == null) ^ (getDetectedText() == null)) {
            return false;
        }
        if (textDetection.getDetectedText() != null && !textDetection.getDetectedText().equals(getDetectedText())) {
            return false;
        }
        if ((textDetection.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (textDetection.getType() != null && !textDetection.getType().equals(getType())) {
            return false;
        }
        if ((textDetection.getId() == null) ^ (getId() == null)) {
            return false;
        }
        if (textDetection.getId() != null && !textDetection.getId().equals(getId())) {
            return false;
        }
        if ((textDetection.getParentId() == null) ^ (getParentId() == null)) {
            return false;
        }
        if (textDetection.getParentId() != null && !textDetection.getParentId().equals(getParentId())) {
            return false;
        }
        if ((textDetection.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (textDetection.getConfidence() != null && !textDetection.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((textDetection.getGeometry() == null) ^ (getGeometry() == null)) {
            return false;
        }
        return textDetection.getGeometry() == null || textDetection.getGeometry().equals(getGeometry());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getDetectedText() {
        return this.detectedText;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public String getType() {
        return this.f58093type;
    }

    public int hashCode() {
        return (((((((((((getDetectedText() == null ? 0 : getDetectedText().hashCode()) + 31) * 31) + (getType() == null ? 0 : getType().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31) + (getParentId() == null ? 0 : getParentId().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getGeometry() != null ? getGeometry().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setDetectedText(String str) {
        this.detectedText = str;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setParentId(Integer num) {
        this.parentId = num;
    }

    public void setType(String str) {
        this.f58093type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDetectedText() != null) {
            sb.append("DetectedText: " + getDetectedText() + ",");
        }
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getId() != null) {
            sb.append("Id: " + getId() + ",");
        }
        if (getParentId() != null) {
            sb.append("ParentId: " + getParentId() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getGeometry() != null) {
            sb.append("Geometry: " + getGeometry());
        }
        sb.append("}");
        return sb.toString();
    }

    public TextDetection withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public TextDetection withDetectedText(String str) {
        this.detectedText = str;
        return this;
    }

    public TextDetection withGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

    public TextDetection withId(Integer num) {
        this.id = num;
        return this;
    }

    public TextDetection withParentId(Integer num) {
        this.parentId = num;
        return this;
    }

    public TextDetection withType(String str) {
        this.f58093type = str;
        return this;
    }

    public void setType(TextTypes textTypes) {
        this.f58093type = textTypes.toString();
    }

    public TextDetection withType(TextTypes textTypes) {
        this.f58093type = textTypes.toString();
        return this;
    }
}
