package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DescribeDatasetResult implements Serializable {
    private DatasetDescription datasetDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDatasetResult)) {
            return false;
        }
        DescribeDatasetResult describeDatasetResult = (DescribeDatasetResult) obj;
        if ((describeDatasetResult.getDatasetDescription() == null) ^ (getDatasetDescription() == null)) {
            return false;
        }
        return describeDatasetResult.getDatasetDescription() == null || describeDatasetResult.getDatasetDescription().equals(getDatasetDescription());
    }

    public DatasetDescription getDatasetDescription() {
        return this.datasetDescription;
    }

    public int hashCode() {
        return 31 + (getDatasetDescription() == null ? 0 : getDatasetDescription().hashCode());
    }

    public void setDatasetDescription(DatasetDescription datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetDescription() != null) {
            sb.append("DatasetDescription: " + getDatasetDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeDatasetResult withDatasetDescription(DatasetDescription datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
}
