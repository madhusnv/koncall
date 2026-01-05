package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public class DatasetMetadata implements Serializable {
    private Date creationTimestamp;
    private String datasetArn;
    private String datasetType;
    private String status;
    private String statusMessage;
    private String statusMessageCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetMetadata)) {
            return false;
        }
        DatasetMetadata datasetMetadata = (DatasetMetadata) obj;
        if ((datasetMetadata.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (datasetMetadata.getCreationTimestamp() != null && !datasetMetadata.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((datasetMetadata.getDatasetType() == null) ^ (getDatasetType() == null)) {
            return false;
        }
        if (datasetMetadata.getDatasetType() != null && !datasetMetadata.getDatasetType().equals(getDatasetType())) {
            return false;
        }
        if ((datasetMetadata.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        if (datasetMetadata.getDatasetArn() != null && !datasetMetadata.getDatasetArn().equals(getDatasetArn())) {
            return false;
        }
        if ((datasetMetadata.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (datasetMetadata.getStatus() != null && !datasetMetadata.getStatus().equals(getStatus())) {
            return false;
        }
        if ((datasetMetadata.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (datasetMetadata.getStatusMessage() != null && !datasetMetadata.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((datasetMetadata.getStatusMessageCode() == null) ^ (getStatusMessageCode() == null)) {
            return false;
        }
        return datasetMetadata.getStatusMessageCode() == null || datasetMetadata.getStatusMessageCode().equals(getStatusMessageCode());
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public String getDatasetType() {
        return this.datasetType;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getStatusMessageCode() {
        return this.statusMessageCode;
    }

    public int hashCode() {
        return (((((((((((getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode()) + 31) * 31) + (getDatasetType() == null ? 0 : getDatasetType().hashCode())) * 31) + (getDatasetArn() == null ? 0 : getDatasetArn().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getStatusMessageCode() != null ? getStatusMessageCode().hashCode() : 0);
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public void setDatasetType(String str) {
        this.datasetType = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setStatusMessageCode(String str) {
        this.statusMessageCode = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getDatasetType() != null) {
            sb.append("DatasetType: " + getDatasetType() + ",");
        }
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getStatusMessage() != null) {
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        }
        if (getStatusMessageCode() != null) {
            sb.append("StatusMessageCode: " + getStatusMessageCode());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetMetadata withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public DatasetMetadata withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }

    public DatasetMetadata withDatasetType(String str) {
        this.datasetType = str;
        return this;
    }

    public DatasetMetadata withStatus(String str) {
        this.status = str;
        return this;
    }

    public DatasetMetadata withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public DatasetMetadata withStatusMessageCode(String str) {
        this.statusMessageCode = str;
        return this;
    }

    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    public void setStatus(DatasetStatus datasetStatus) {
        this.status = datasetStatus.toString();
    }

    public void setStatusMessageCode(DatasetStatusMessageCode datasetStatusMessageCode) {
        this.statusMessageCode = datasetStatusMessageCode.toString();
    }

    public DatasetMetadata withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    public DatasetMetadata withStatus(DatasetStatus datasetStatus) {
        this.status = datasetStatus.toString();
        return this;
    }

    public DatasetMetadata withStatusMessageCode(DatasetStatusMessageCode datasetStatusMessageCode) {
        this.statusMessageCode = datasetStatusMessageCode.toString();
        return this;
    }
}
