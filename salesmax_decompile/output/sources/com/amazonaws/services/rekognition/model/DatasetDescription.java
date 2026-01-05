package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public class DatasetDescription implements Serializable {
    private Date creationTimestamp;
    private DatasetStats datasetStats;
    private Date lastUpdatedTimestamp;
    private String status;
    private String statusMessage;
    private String statusMessageCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetDescription)) {
            return false;
        }
        DatasetDescription datasetDescription = (DatasetDescription) obj;
        if ((datasetDescription.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (datasetDescription.getCreationTimestamp() != null && !datasetDescription.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((datasetDescription.getLastUpdatedTimestamp() == null) ^ (getLastUpdatedTimestamp() == null)) {
            return false;
        }
        if (datasetDescription.getLastUpdatedTimestamp() != null && !datasetDescription.getLastUpdatedTimestamp().equals(getLastUpdatedTimestamp())) {
            return false;
        }
        if ((datasetDescription.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (datasetDescription.getStatus() != null && !datasetDescription.getStatus().equals(getStatus())) {
            return false;
        }
        if ((datasetDescription.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (datasetDescription.getStatusMessage() != null && !datasetDescription.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((datasetDescription.getStatusMessageCode() == null) ^ (getStatusMessageCode() == null)) {
            return false;
        }
        if (datasetDescription.getStatusMessageCode() != null && !datasetDescription.getStatusMessageCode().equals(getStatusMessageCode())) {
            return false;
        }
        if ((datasetDescription.getDatasetStats() == null) ^ (getDatasetStats() == null)) {
            return false;
        }
        return datasetDescription.getDatasetStats() == null || datasetDescription.getDatasetStats().equals(getDatasetStats());
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public DatasetStats getDatasetStats() {
        return this.datasetStats;
    }

    public Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
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
        return (((((((((((getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode()) + 31) * 31) + (getLastUpdatedTimestamp() == null ? 0 : getLastUpdatedTimestamp().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getStatusMessageCode() == null ? 0 : getStatusMessageCode().hashCode())) * 31) + (getDatasetStats() != null ? getDatasetStats().hashCode() : 0);
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setDatasetStats(DatasetStats datasetStats) {
        this.datasetStats = datasetStats;
    }

    public void setLastUpdatedTimestamp(Date date) {
        this.lastUpdatedTimestamp = date;
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
        if (getLastUpdatedTimestamp() != null) {
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getStatusMessage() != null) {
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        }
        if (getStatusMessageCode() != null) {
            sb.append("StatusMessageCode: " + getStatusMessageCode() + ",");
        }
        if (getDatasetStats() != null) {
            sb.append("DatasetStats: " + getDatasetStats());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetDescription withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public DatasetDescription withDatasetStats(DatasetStats datasetStats) {
        this.datasetStats = datasetStats;
        return this;
    }

    public DatasetDescription withLastUpdatedTimestamp(Date date) {
        this.lastUpdatedTimestamp = date;
        return this;
    }

    public DatasetDescription withStatus(String str) {
        this.status = str;
        return this;
    }

    public DatasetDescription withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public DatasetDescription withStatusMessageCode(String str) {
        this.statusMessageCode = str;
        return this;
    }

    public void setStatus(DatasetStatus datasetStatus) {
        this.status = datasetStatus.toString();
    }

    public void setStatusMessageCode(DatasetStatusMessageCode datasetStatusMessageCode) {
        this.statusMessageCode = datasetStatusMessageCode.toString();
    }

    public DatasetDescription withStatus(DatasetStatus datasetStatus) {
        this.status = datasetStatus.toString();
        return this;
    }

    public DatasetDescription withStatusMessageCode(DatasetStatusMessageCode datasetStatusMessageCode) {
        this.statusMessageCode = datasetStatusMessageCode.toString();
        return this;
    }
}
