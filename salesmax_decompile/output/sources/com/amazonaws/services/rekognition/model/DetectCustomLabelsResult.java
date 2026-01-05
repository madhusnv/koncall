package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectCustomLabelsResult implements Serializable {
    private List<CustomLabel> customLabels;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectCustomLabelsResult)) {
            return false;
        }
        DetectCustomLabelsResult detectCustomLabelsResult = (DetectCustomLabelsResult) obj;
        if ((detectCustomLabelsResult.getCustomLabels() == null) ^ (getCustomLabels() == null)) {
            return false;
        }
        return detectCustomLabelsResult.getCustomLabels() == null || detectCustomLabelsResult.getCustomLabels().equals(getCustomLabels());
    }

    public List<CustomLabel> getCustomLabels() {
        return this.customLabels;
    }

    public int hashCode() {
        return 31 + (getCustomLabels() == null ? 0 : getCustomLabels().hashCode());
    }

    public void setCustomLabels(Collection<CustomLabel> collection) {
        if (collection == null) {
            this.customLabels = null;
        } else {
            this.customLabels = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomLabels() != null) {
            sb.append("CustomLabels: " + getCustomLabels());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectCustomLabelsResult withCustomLabels(CustomLabel... customLabelArr) {
        if (getCustomLabels() == null) {
            this.customLabels = new ArrayList(customLabelArr.length);
        }
        for (CustomLabel customLabel : customLabelArr) {
            this.customLabels.add(customLabel);
        }
        return this;
    }

    public DetectCustomLabelsResult withCustomLabels(Collection<CustomLabel> collection) {
        setCustomLabels(collection);
        return this;
    }
}
