package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DatasetLabelStats implements Serializable {
    private Integer boundingBoxCount;
    private Integer entryCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetLabelStats)) {
            return false;
        }
        DatasetLabelStats datasetLabelStats = (DatasetLabelStats) obj;
        if ((datasetLabelStats.getEntryCount() == null) ^ (getEntryCount() == null)) {
            return false;
        }
        if (datasetLabelStats.getEntryCount() != null && !datasetLabelStats.getEntryCount().equals(getEntryCount())) {
            return false;
        }
        if ((datasetLabelStats.getBoundingBoxCount() == null) ^ (getBoundingBoxCount() == null)) {
            return false;
        }
        return datasetLabelStats.getBoundingBoxCount() == null || datasetLabelStats.getBoundingBoxCount().equals(getBoundingBoxCount());
    }

    public Integer getBoundingBoxCount() {
        return this.boundingBoxCount;
    }

    public Integer getEntryCount() {
        return this.entryCount;
    }

    public int hashCode() {
        return (((getEntryCount() == null ? 0 : getEntryCount().hashCode()) + 31) * 31) + (getBoundingBoxCount() != null ? getBoundingBoxCount().hashCode() : 0);
    }

    public void setBoundingBoxCount(Integer num) {
        this.boundingBoxCount = num;
    }

    public void setEntryCount(Integer num) {
        this.entryCount = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEntryCount() != null) {
            sb.append("EntryCount: " + getEntryCount() + ",");
        }
        if (getBoundingBoxCount() != null) {
            sb.append("BoundingBoxCount: " + getBoundingBoxCount());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetLabelStats withBoundingBoxCount(Integer num) {
        this.boundingBoxCount = num;
        return this;
    }

    public DatasetLabelStats withEntryCount(Integer num) {
        this.entryCount = num;
        return this;
    }
}
