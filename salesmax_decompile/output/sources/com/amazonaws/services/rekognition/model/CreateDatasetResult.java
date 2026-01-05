package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateDatasetResult implements Serializable {
    private String datasetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateDatasetResult)) {
            return false;
        }
        CreateDatasetResult createDatasetResult = (CreateDatasetResult) obj;
        if ((createDatasetResult.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        return createDatasetResult.getDatasetArn() == null || createDatasetResult.getDatasetArn().equals(getDatasetArn());
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public int hashCode() {
        return 31 + (getDatasetArn() == null ? 0 : getDatasetArn().hashCode());
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateDatasetResult withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }
}
