package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    private DatasetSource datasetSource;
    private String datasetType;
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateDatasetRequest)) {
            return false;
        }
        CreateDatasetRequest createDatasetRequest = (CreateDatasetRequest) obj;
        if ((createDatasetRequest.getDatasetSource() == null) ^ (getDatasetSource() == null)) {
            return false;
        }
        if (createDatasetRequest.getDatasetSource() != null && !createDatasetRequest.getDatasetSource().equals(getDatasetSource())) {
            return false;
        }
        if ((createDatasetRequest.getDatasetType() == null) ^ (getDatasetType() == null)) {
            return false;
        }
        if (createDatasetRequest.getDatasetType() != null && !createDatasetRequest.getDatasetType().equals(getDatasetType())) {
            return false;
        }
        if ((createDatasetRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        return createDatasetRequest.getProjectArn() == null || createDatasetRequest.getProjectArn().equals(getProjectArn());
    }

    public DatasetSource getDatasetSource() {
        return this.datasetSource;
    }

    public String getDatasetType() {
        return this.datasetType;
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public int hashCode() {
        return (((((getDatasetSource() == null ? 0 : getDatasetSource().hashCode()) + 31) * 31) + (getDatasetType() == null ? 0 : getDatasetType().hashCode())) * 31) + (getProjectArn() != null ? getProjectArn().hashCode() : 0);
    }

    public void setDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
    }

    public void setDatasetType(String str) {
        this.datasetType = str;
    }

    public void setProjectArn(String str) {
        this.projectArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetSource() != null) {
            sb.append("DatasetSource: " + getDatasetSource() + ",");
        }
        if (getDatasetType() != null) {
            sb.append("DatasetType: " + getDatasetType() + ",");
        }
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateDatasetRequest withDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
        return this;
    }

    public CreateDatasetRequest withDatasetType(String str) {
        this.datasetType = str;
        return this;
    }

    public CreateDatasetRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }

    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    public CreateDatasetRequest withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }
}
