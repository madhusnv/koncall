package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class Instance implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;
    private List<DominantColor> dominantColors;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instance)) {
            return false;
        }
        Instance instance = (Instance) obj;
        if ((instance.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (instance.getBoundingBox() != null && !instance.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((instance.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (instance.getConfidence() != null && !instance.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((instance.getDominantColors() == null) ^ (getDominantColors() == null)) {
            return false;
        }
        return instance.getDominantColors() == null || instance.getDominantColors().equals(getDominantColors());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public List<DominantColor> getDominantColors() {
        return this.dominantColors;
    }

    public int hashCode() {
        return (((((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getDominantColors() != null ? getDominantColors().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setDominantColors(Collection<DominantColor> collection) {
        if (collection == null) {
            this.dominantColors = null;
        } else {
            this.dominantColors = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getDominantColors() != null) {
            sb.append("DominantColors: " + getDominantColors());
        }
        sb.append("}");
        return sb.toString();
    }

    public Instance withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public Instance withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Instance withDominantColors(DominantColor... dominantColorArr) {
        if (getDominantColors() == null) {
            this.dominantColors = new ArrayList(dominantColorArr.length);
        }
        for (DominantColor dominantColor : dominantColorArr) {
            this.dominantColors.add(dominantColor);
        }
        return this;
    }

    public Instance withDominantColors(Collection<DominantColor> collection) {
        setDominantColors(collection);
        return this;
    }
}
