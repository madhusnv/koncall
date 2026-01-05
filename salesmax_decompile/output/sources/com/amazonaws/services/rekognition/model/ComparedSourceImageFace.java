package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ComparedSourceImageFace implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ComparedSourceImageFace)) {
            return false;
        }
        ComparedSourceImageFace comparedSourceImageFace = (ComparedSourceImageFace) obj;
        if ((comparedSourceImageFace.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (comparedSourceImageFace.getBoundingBox() != null && !comparedSourceImageFace.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((comparedSourceImageFace.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        return comparedSourceImageFace.getConfidence() == null || comparedSourceImageFace.getConfidence().equals(getConfidence());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return (((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getConfidence() != null ? getConfidence().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public ComparedSourceImageFace withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ComparedSourceImageFace withConfidence(Float f) {
        this.confidence = f;
        return this;
    }
}
