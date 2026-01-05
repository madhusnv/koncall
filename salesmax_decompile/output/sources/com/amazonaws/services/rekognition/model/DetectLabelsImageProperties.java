package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectLabelsImageProperties implements Serializable {
    private DetectLabelsImageBackground background;
    private List<DominantColor> dominantColors;
    private DetectLabelsImageForeground foreground;
    private DetectLabelsImageQuality quality;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsImageProperties)) {
            return false;
        }
        DetectLabelsImageProperties detectLabelsImageProperties = (DetectLabelsImageProperties) obj;
        if ((detectLabelsImageProperties.getQuality() == null) ^ (getQuality() == null)) {
            return false;
        }
        if (detectLabelsImageProperties.getQuality() != null && !detectLabelsImageProperties.getQuality().equals(getQuality())) {
            return false;
        }
        if ((detectLabelsImageProperties.getDominantColors() == null) ^ (getDominantColors() == null)) {
            return false;
        }
        if (detectLabelsImageProperties.getDominantColors() != null && !detectLabelsImageProperties.getDominantColors().equals(getDominantColors())) {
            return false;
        }
        if ((detectLabelsImageProperties.getForeground() == null) ^ (getForeground() == null)) {
            return false;
        }
        if (detectLabelsImageProperties.getForeground() != null && !detectLabelsImageProperties.getForeground().equals(getForeground())) {
            return false;
        }
        if ((detectLabelsImageProperties.getBackground() == null) ^ (getBackground() == null)) {
            return false;
        }
        return detectLabelsImageProperties.getBackground() == null || detectLabelsImageProperties.getBackground().equals(getBackground());
    }

    public DetectLabelsImageBackground getBackground() {
        return this.background;
    }

    public List<DominantColor> getDominantColors() {
        return this.dominantColors;
    }

    public DetectLabelsImageForeground getForeground() {
        return this.foreground;
    }

    public DetectLabelsImageQuality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return (((((((getQuality() == null ? 0 : getQuality().hashCode()) + 31) * 31) + (getDominantColors() == null ? 0 : getDominantColors().hashCode())) * 31) + (getForeground() == null ? 0 : getForeground().hashCode())) * 31) + (getBackground() != null ? getBackground().hashCode() : 0);
    }

    public void setBackground(DetectLabelsImageBackground detectLabelsImageBackground) {
        this.background = detectLabelsImageBackground;
    }

    public void setDominantColors(Collection<DominantColor> collection) {
        if (collection == null) {
            this.dominantColors = null;
        } else {
            this.dominantColors = new ArrayList(collection);
        }
    }

    public void setForeground(DetectLabelsImageForeground detectLabelsImageForeground) {
        this.foreground = detectLabelsImageForeground;
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
            sb.append("DominantColors: " + getDominantColors() + ",");
        }
        if (getForeground() != null) {
            sb.append("Foreground: " + getForeground() + ",");
        }
        if (getBackground() != null) {
            sb.append("Background: " + getBackground());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsImageProperties withBackground(DetectLabelsImageBackground detectLabelsImageBackground) {
        this.background = detectLabelsImageBackground;
        return this;
    }

    public DetectLabelsImageProperties withDominantColors(DominantColor... dominantColorArr) {
        if (getDominantColors() == null) {
            this.dominantColors = new ArrayList(dominantColorArr.length);
        }
        for (DominantColor dominantColor : dominantColorArr) {
            this.dominantColors.add(dominantColor);
        }
        return this;
    }

    public DetectLabelsImageProperties withForeground(DetectLabelsImageForeground detectLabelsImageForeground) {
        this.foreground = detectLabelsImageForeground;
        return this;
    }

    public DetectLabelsImageProperties withQuality(DetectLabelsImageQuality detectLabelsImageQuality) {
        this.quality = detectLabelsImageQuality;
        return this;
    }

    public DetectLabelsImageProperties withDominantColors(Collection<DominantColor> collection) {
        setDominantColors(collection);
        return this;
    }
}
