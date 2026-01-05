package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectLabelsResult implements Serializable {
    private DetectLabelsImageProperties imageProperties;
    private String labelModelVersion;
    private List<Label> labels;
    private String orientationCorrection;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsResult)) {
            return false;
        }
        DetectLabelsResult detectLabelsResult = (DetectLabelsResult) obj;
        if ((detectLabelsResult.getLabels() == null) ^ (getLabels() == null)) {
            return false;
        }
        if (detectLabelsResult.getLabels() != null && !detectLabelsResult.getLabels().equals(getLabels())) {
            return false;
        }
        if ((detectLabelsResult.getOrientationCorrection() == null) ^ (getOrientationCorrection() == null)) {
            return false;
        }
        if (detectLabelsResult.getOrientationCorrection() != null && !detectLabelsResult.getOrientationCorrection().equals(getOrientationCorrection())) {
            return false;
        }
        if ((detectLabelsResult.getLabelModelVersion() == null) ^ (getLabelModelVersion() == null)) {
            return false;
        }
        if (detectLabelsResult.getLabelModelVersion() != null && !detectLabelsResult.getLabelModelVersion().equals(getLabelModelVersion())) {
            return false;
        }
        if ((detectLabelsResult.getImageProperties() == null) ^ (getImageProperties() == null)) {
            return false;
        }
        return detectLabelsResult.getImageProperties() == null || detectLabelsResult.getImageProperties().equals(getImageProperties());
    }

    public DetectLabelsImageProperties getImageProperties() {
        return this.imageProperties;
    }

    public String getLabelModelVersion() {
        return this.labelModelVersion;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    public int hashCode() {
        return (((((((getLabels() == null ? 0 : getLabels().hashCode()) + 31) * 31) + (getOrientationCorrection() == null ? 0 : getOrientationCorrection().hashCode())) * 31) + (getLabelModelVersion() == null ? 0 : getLabelModelVersion().hashCode())) * 31) + (getImageProperties() != null ? getImageProperties().hashCode() : 0);
    }

    public void setImageProperties(DetectLabelsImageProperties detectLabelsImageProperties) {
        this.imageProperties = detectLabelsImageProperties;
    }

    public void setLabelModelVersion(String str) {
        this.labelModelVersion = str;
    }

    public void setLabels(Collection<Label> collection) {
        if (collection == null) {
            this.labels = null;
        } else {
            this.labels = new ArrayList(collection);
        }
    }

    public void setOrientationCorrection(String str) {
        this.orientationCorrection = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLabels() != null) {
            sb.append("Labels: " + getLabels() + ",");
        }
        if (getOrientationCorrection() != null) {
            sb.append("OrientationCorrection: " + getOrientationCorrection() + ",");
        }
        if (getLabelModelVersion() != null) {
            sb.append("LabelModelVersion: " + getLabelModelVersion() + ",");
        }
        if (getImageProperties() != null) {
            sb.append("ImageProperties: " + getImageProperties());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsResult withImageProperties(DetectLabelsImageProperties detectLabelsImageProperties) {
        this.imageProperties = detectLabelsImageProperties;
        return this;
    }

    public DetectLabelsResult withLabelModelVersion(String str) {
        this.labelModelVersion = str;
        return this;
    }

    public DetectLabelsResult withLabels(Label... labelArr) {
        if (getLabels() == null) {
            this.labels = new ArrayList(labelArr.length);
        }
        for (Label label : labelArr) {
            this.labels.add(label);
        }
        return this;
    }

    public DetectLabelsResult withOrientationCorrection(String str) {
        this.orientationCorrection = str;
        return this;
    }

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    public DetectLabelsResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    public DetectLabelsResult withLabels(Collection<Label> collection) {
        setLabels(collection);
        return this;
    }
}
