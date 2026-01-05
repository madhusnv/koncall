package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class LabelDetectionSettings implements Serializable {
    private GeneralLabelsSettings generalLabels;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LabelDetectionSettings)) {
            return false;
        }
        LabelDetectionSettings labelDetectionSettings = (LabelDetectionSettings) obj;
        if ((labelDetectionSettings.getGeneralLabels() == null) ^ (getGeneralLabels() == null)) {
            return false;
        }
        return labelDetectionSettings.getGeneralLabels() == null || labelDetectionSettings.getGeneralLabels().equals(getGeneralLabels());
    }

    public GeneralLabelsSettings getGeneralLabels() {
        return this.generalLabels;
    }

    public int hashCode() {
        return 31 + (getGeneralLabels() == null ? 0 : getGeneralLabels().hashCode());
    }

    public void setGeneralLabels(GeneralLabelsSettings generalLabelsSettings) {
        this.generalLabels = generalLabelsSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGeneralLabels() != null) {
            sb.append("GeneralLabels: " + getGeneralLabels());
        }
        sb.append("}");
        return sb.toString();
    }

    public LabelDetectionSettings withGeneralLabels(GeneralLabelsSettings generalLabelsSettings) {
        this.generalLabels = generalLabelsSettings;
        return this;
    }
}
