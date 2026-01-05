package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class ProjectDescription implements Serializable {
    private Date creationTimestamp;
    private List<DatasetMetadata> datasets;
    private String projectArn;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProjectDescription)) {
            return false;
        }
        ProjectDescription projectDescription = (ProjectDescription) obj;
        if ((projectDescription.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (projectDescription.getProjectArn() != null && !projectDescription.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((projectDescription.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (projectDescription.getCreationTimestamp() != null && !projectDescription.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((projectDescription.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (projectDescription.getStatus() != null && !projectDescription.getStatus().equals(getStatus())) {
            return false;
        }
        if ((projectDescription.getDatasets() == null) ^ (getDatasets() == null)) {
            return false;
        }
        return projectDescription.getDatasets() == null || projectDescription.getDatasets().equals(getDatasets());
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public List<DatasetMetadata> getDatasets() {
        return this.datasets;
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getDatasets() != null ? getDatasets().hashCode() : 0);
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setDatasets(Collection<DatasetMetadata> collection) {
        if (collection == null) {
            this.datasets = null;
        } else {
            this.datasets = new ArrayList(collection);
        }
    }

    public void setProjectArn(String str) {
        this.projectArn = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn() + ",");
        }
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getDatasets() != null) {
            sb.append("Datasets: " + getDatasets());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProjectDescription withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public ProjectDescription withDatasets(DatasetMetadata... datasetMetadataArr) {
        if (getDatasets() == null) {
            this.datasets = new ArrayList(datasetMetadataArr.length);
        }
        for (DatasetMetadata datasetMetadata : datasetMetadataArr) {
            this.datasets.add(datasetMetadata);
        }
        return this;
    }

    public ProjectDescription withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }

    public ProjectDescription withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setStatus(ProjectStatus projectStatus) {
        this.status = projectStatus.toString();
    }

    public ProjectDescription withStatus(ProjectStatus projectStatus) {
        this.status = projectStatus.toString();
        return this;
    }

    public ProjectDescription withDatasets(Collection<DatasetMetadata> collection) {
        setDatasets(collection);
        return this;
    }
}
