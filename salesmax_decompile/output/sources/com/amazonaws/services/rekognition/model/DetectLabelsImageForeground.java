package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectLabelsImageForeground implements Serializable {
    private List<DominantColor> dominantColors;
    private DetectLabelsImageQuality quality;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsImageForeground)) {
            return false;
        }
        DetectLabelsImageForeground detectLabelsImageForeground = (DetectLabelsImageForeground) obj;
        if ((detectLabelsImageForeground.getQuality() == null) ^ (getQuality() == null)) {
            return false;
        }
        if (detectLabelsImageForeground.getQuality() != null && !detectLabelsImageForeground.getQuality().equals(getQuality())) {
            return false;
        }
        if ((detectLabelsImageForeground.getDominantColors() == null) ^ (getDominantColors() == null)) {
            return false;
        }
        return detectLabelsImageForeground.getDominantColors() == null || detectLabelsImageForeground.getDominantColors().equals(getDominantColors());
    }

    public List<DominantColor> getDominantColors() {
        return this.dominantColors;
    }

    public DetectLabelsImageQuality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return (((getQuality() == null ? 0 : getQuality().hashCode()) + 31) * 31) + (getDominantColors() != null ? getDominantColors().hashCode() : 0);
    }

    public void setDominantColors(Collection<DominantColor> collection) {
        if (collection == null) {
            this.dominantColors = null;
        } else {
            this.dominantColors = new ArrayList(collection);
        }
    }

    public void setQuality(DetectLabelsImageQuality detectLabelsImageQuality) {
        this.quality = detectLabelsImageQuality;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQuality() != null) {
            sb.append("Quality: " + getQuality() + ",");
        }
        if (getDominantColors() != null) {
            sb.append("DominantColors: " + getDominantColors());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsImageForeground withDominantColors(DominantColor... dominantColorArr) {
        if (getDominantColors() == null) {
            this.dominantColors = new ArrayList(dominantColorArr.length);
        }
        for (DominantColor dominantColor : dominantColorArr) {
            this.dominantColors.add(dominantColor);
        }
        return this;
    }

    public DetectLabelsImageForeground withQuality(DetectLabelsImageQuality detectLabelsImageQuality) {
        this.quality = detectLabelsImageQuality;
        return this;
    }

    public DetectLabelsImageForeground withDominantColors(Collection<DominantColor> collection) {
        setDominantColors(collection);
        return this;
    }
}
