package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ImageQuality implements Serializable {
    private Float brightness;
    private Float sharpness;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ImageQuality)) {
            return false;
        }
        ImageQuality imageQuality = (ImageQuality) obj;
        if ((imageQuality.getBrightness() == null) ^ (getBrightness() == null)) {
            return false;
        }
        if (imageQuality.getBrightness() != null && !imageQuality.getBrightness().equals(getBrightness())) {
            return false;
        }
        if ((imageQuality.getSharpness() == null) ^ (getSharpness() == null)) {
            return false;
        }
        return imageQuality.getSharpness() == null || imageQuality.getSharpness().equals(getSharpness());
    }

    public Float getBrightness() {
        return this.brightness;
    }

    public Float getSharpness() {
        return this.sharpness;
    }

    public int hashCode() {
        return (((getBrightness() == null ? 0 : getBrightness().hashCode()) + 31) * 31) + (getSharpness() != null ? getSharpness().hashCode() : 0);
    }

    public void setBrightness(Float f) {
        this.brightness = f;
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
            sb.append("Sharpness: " + getSharpness());
        }
        sb.append("}");
        return sb.toString();
    }

    public ImageQuality withBrightness(Float f) {
        this.brightness = f;
        return this;
    }

    public ImageQuality withSharpness(Float f) {
        this.sharpness = f;
        return this;
    }
}
