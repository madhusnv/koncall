package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectLabelsSettings implements Serializable {
    private GeneralLabelsSettings generalLabels;
    private DetectLabelsImagePropertiesSettings imageProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsSettings)) {
            return false;
        }
        DetectLabelsSettings detectLabelsSettings = (DetectLabelsSettings) obj;
        if ((detectLabelsSettings.getGeneralLabels() == null) ^ (getGeneralLabels() == null)) {
            return false;
        }
        if (detectLabelsSettings.getGeneralLabels() != null && !detectLabelsSettings.getGeneralLabels().equals(getGeneralLabels())) {
            return false;
        }
        if ((detectLabelsSettings.getImageProperties() == null) ^ (getImageProperties() == null)) {
            return false;
        }
        return detectLabelsSettings.getImageProperties() == null || detectLabelsSettings.getImageProperties().equals(getImageProperties());
    }

    public GeneralLabelsSettings getGeneralLabels() {
        return this.generalLabels;
    }

    public DetectLabelsImagePropertiesSettings getImageProperties() {
        return this.imageProperties;
    }

    public int hashCode() {
        return (((getGeneralLabels() == null ? 0 : getGeneralLabels().hashCode()) + 31) * 31) + (getImageProperties() != null ? getImageProperties().hashCode() : 0);
    }

    public void setGeneralLabels(GeneralLabelsSettings generalLabelsSettings) {
        this.generalLabels = generalLabelsSettings;
    }

    public void setImageProperties(DetectLabelsImagePropertiesSettings detectLabelsImagePropertiesSettings) {
        this.imageProperties = detectLabelsImagePropertiesSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGeneralLabels() != null) {
            sb.append("GeneralLabels: " + getGeneralLabels() + ",");
        }
        if (getImageProperties() != null) {
            sb.append("ImageProperties: " + getImageProperties());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsSettings withGeneralLabels(GeneralLabelsSettings generalLabelsSettings) {
        this.generalLabels = generalLabelsSettings;
        return this;
    }

    public DetectLabelsSettings withImageProperties(DetectLabelsImagePropertiesSettings detectLabelsImagePropertiesSettings) {
        this.imageProperties = detectLabelsImagePropertiesSettings;
        return this;
    }
}
