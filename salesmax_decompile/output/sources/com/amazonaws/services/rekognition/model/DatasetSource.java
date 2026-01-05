package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DatasetSource implements Serializable {
    private String datasetArn;
    private GroundTruthManifest groundTruthManifest;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetSource)) {
            return false;
        }
        DatasetSource datasetSource = (DatasetSource) obj;
        if ((datasetSource.getGroundTruthManifest() == null) ^ (getGroundTruthManifest() == null)) {
            return false;
        }
        if (datasetSource.getGroundTruthManifest() != null && !datasetSource.getGroundTruthManifest().equals(getGroundTruthManifest())) {
            return false;
        }
        if ((datasetSource.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        return datasetSource.getDatasetArn() == null || datasetSource.getDatasetArn().equals(getDatasetArn());
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public GroundTruthManifest getGroundTruthManifest() {
        return this.groundTruthManifest;
    }

    public int hashCode() {
        return (((getGroundTruthManifest() == null ? 0 : getGroundTruthManifest().hashCode()) + 31) * 31) + (getDatasetArn() != null ? getDatasetArn().hashCode() : 0);
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public void setGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroundTruthManifest() != null) {
            sb.append("GroundTruthManifest: " + getGroundTruthManifest() + ",");
        }
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetSource withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }

    public DatasetSource withGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
        return this;
    }
}
