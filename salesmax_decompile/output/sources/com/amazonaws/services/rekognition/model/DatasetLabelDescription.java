package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DatasetLabelDescription implements Serializable {
    private String labelName;
    private DatasetLabelStats labelStats;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetLabelDescription)) {
            return false;
        }
        DatasetLabelDescription datasetLabelDescription = (DatasetLabelDescription) obj;
        if ((datasetLabelDescription.getLabelName() == null) ^ (getLabelName() == null)) {
            return false;
        }
        if (datasetLabelDescription.getLabelName() != null && !datasetLabelDescription.getLabelName().equals(getLabelName())) {
            return false;
        }
        if ((datasetLabelDescription.getLabelStats() == null) ^ (getLabelStats() == null)) {
            return false;
        }
        return datasetLabelDescription.getLabelStats() == null || datasetLabelDescription.getLabelStats().equals(getLabelStats());
    }

    public String getLabelName() {
        return this.labelName;
    }

    public DatasetLabelStats getLabelStats() {
        return this.labelStats;
    }

    public int hashCode() {
        return (((getLabelName() == null ? 0 : getLabelName().hashCode()) + 31) * 31) + (getLabelStats() != null ? getLabelStats().hashCode() : 0);
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelStats(DatasetLabelStats datasetLabelStats) {
        this.labelStats = datasetLabelStats;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLabelName() != null) {
            sb.append("LabelName: " + getLabelName() + ",");
        }
        if (getLabelStats() != null) {
            sb.append("LabelStats: " + getLabelStats());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetLabelDescription withLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public DatasetLabelDescription withLabelStats(DatasetLabelStats datasetLabelStats) {
        this.labelStats = datasetLabelStats;
        return this;
    }
}
