package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectLabelsImageQuality implements Serializable {
    private Float brightness;
    private Float contrast;
    private Float sharpness;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsImageQuality)) {
            return false;
        }
        DetectLabelsImageQuality detectLabelsImageQuality = (DetectLabelsImageQuality) obj;
        if ((detectLabelsImageQuality.getBrightness() == null) ^ (getBrightness() == null)) {
            return false;
        }
        if (detectLabelsImageQuality.getBrightness() != null && !detectLabelsImageQuality.getBrightness().equals(getBrightness())) {
            return false;
        }
        if ((detectLabelsImageQuality.getSharpness() == null) ^ (getSharpness() == null)) {
            return false;
        }
        if (detectLabelsImageQuality.getSharpness() != null && !detectLabelsImageQuality.getSharpness().equals(getSharpness())) {
            return false;
        }
        if ((detectLabelsImageQuality.getContrast() == null) ^ (getContrast() == null)) {
            return false;
        }
        return detectLabelsImageQuality.getContrast() == null || detectLabelsImageQuality.getContrast().equals(getContrast());
    }

    public Float getBrightness() {
        return this.brightness;
    }

    public Float getContrast() {
        return this.contrast;
    }

    public Float getSharpness() {
        return this.sharpness;
    }

    public int hashCode() {
        return (((((getBrightness() == null ? 0 : getBrightness().hashCode()) + 31) * 31) + (getSharpness() == null ? 0 : getSharpness().hashCode())) * 31) + (getContrast() != null ? getContrast().hashCode() : 0);
    }

    public void setBrightness(Float f) {
        this.brightness = f;
    }

    public void setContrast(Float f) {
        this.contrast = f;
    }

    public void setSharpness(Float f) {
        this.sharpness = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBrightness() != null) {
            sb.append("Brightness: " + getBrightness() + ",");
        }
        if (getSharpness() != null) {
            sb.append("Sharpness: " + getSharpness() + ",");
        }
        if (getContrast() != null) {
            sb.append("Contrast: " + getContrast());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsImageQuality withBrightness(Float f) {
        this.brightness = f;
        return this;
    }

    public DetectLabelsImageQuality withContrast(Float f) {
        this.contrast = f;
        return this;
    }

    public DetectLabelsImageQuality withSharpness(Float f) {
        this.sharpness = f;
        return this;
    }
}
