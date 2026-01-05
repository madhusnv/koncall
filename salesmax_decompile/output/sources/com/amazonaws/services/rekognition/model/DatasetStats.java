package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DatasetStats implements Serializable {
    private Integer errorEntries;
    private Integer labeledEntries;
    private Integer totalEntries;
    private Integer totalLabels;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetStats)) {
            return false;
        }
        DatasetStats datasetStats = (DatasetStats) obj;
        if ((datasetStats.getLabeledEntries() == null) ^ (getLabeledEntries() == null)) {
            return false;
        }
        if (datasetStats.getLabeledEntries() != null && !datasetStats.getLabeledEntries().equals(getLabeledEntries())) {
            return false;
        }
        if ((datasetStats.getTotalEntries() == null) ^ (getTotalEntries() == null)) {
            return false;
        }
        if (datasetStats.getTotalEntries() != null && !datasetStats.getTotalEntries().equals(getTotalEntries())) {
            return false;
        }
        if ((datasetStats.getTotalLabels() == null) ^ (getTotalLabels() == null)) {
            return false;
        }
        if (datasetStats.getTotalLabels() != null && !datasetStats.getTotalLabels().equals(getTotalLabels())) {
            return false;
        }
        if ((datasetStats.getErrorEntries() == null) ^ (getErrorEntries() == null)) {
            return false;
        }
        return datasetStats.getErrorEntries() == null || datasetStats.getErrorEntries().equals(getErrorEntries());
    }

    public Integer getErrorEntries() {
        return this.errorEntries;
    }

    public Integer getLabeledEntries() {
        return this.labeledEntries;
    }

    public Integer getTotalEntries() {
        return this.totalEntries;
    }

    public Integer getTotalLabels() {
        return this.totalLabels;
    }

    public int hashCode() {
        return (((((((getLabeledEntries() == null ? 0 : getLabeledEntries().hashCode()) + 31) * 31) + (getTotalEntries() == null ? 0 : getTotalEntries().hashCode())) * 31) + (getTotalLabels() == null ? 0 : getTotalLabels().hashCode())) * 31) + (getErrorEntries() != null ? getErrorEntries().hashCode() : 0);
    }

    public void setErrorEntries(Integer num) {
        this.errorEntries = num;
    }

    public void setLabeledEntries(Integer num) {
        this.labeledEntries = num;
    }

    public void setTotalEntries(Integer num) {
        this.totalEntries = num;
    }

    public void setTotalLabels(Integer num) {
        this.totalLabels = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLabeledEntries() != null) {
            sb.append("LabeledEntries: " + getLabeledEntries() + ",");
        }
        if (getTotalEntries() != null) {
            sb.append("TotalEntries: " + getTotalEntries() + ",");
        }
        if (getTotalLabels() != null) {
            sb.append("TotalLabels: " + getTotalLabels() + ",");
        }
        if (getErrorEntries() != null) {
            sb.append("ErrorEntries: " + getErrorEntries());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetStats withErrorEntries(Integer num) {
        this.errorEntries = num;
        return this;
    }

    public DatasetStats withLabeledEntries(Integer num) {
        this.labeledEntries = num;
        return this;
    }

    public DatasetStats withTotalEntries(Integer num) {
        this.totalEntries = num;
        return this;
    }

    public DatasetStats withTotalLabels(Integer num) {
        this.totalLabels = num;
        return this;
    }
}
