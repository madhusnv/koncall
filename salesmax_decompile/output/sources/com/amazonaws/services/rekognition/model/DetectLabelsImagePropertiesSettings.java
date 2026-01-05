package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectLabelsImagePropertiesSettings implements Serializable {
    private Integer maxDominantColors;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsImagePropertiesSettings)) {
            return false;
        }
        DetectLabelsImagePropertiesSettings detectLabelsImagePropertiesSettings = (DetectLabelsImagePropertiesSettings) obj;
        if ((detectLabelsImagePropertiesSettings.getMaxDominantColors() == null) ^ (getMaxDominantColors() == null)) {
            return false;
        }
        return detectLabelsImagePropertiesSettings.getMaxDominantColors() == null || detectLabelsImagePropertiesSettings.getMaxDominantColors().equals(getMaxDominantColors());
    }

    public Integer getMaxDominantColors() {
        return this.maxDominantColors;
    }

    public int hashCode() {
        return 31 + (getMaxDominantColors() == null ? 0 : getMaxDominantColors().hashCode());
    }

    public void setMaxDominantColors(Integer num) {
        this.maxDominantColors = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxDominantColors() != null) {
            sb.append("MaxDominantColors: " + getMaxDominantColors());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsImagePropertiesSettings withMaxDominantColors(Integer num) {
        this.maxDominantColors = num;
        return this;
    }
}
