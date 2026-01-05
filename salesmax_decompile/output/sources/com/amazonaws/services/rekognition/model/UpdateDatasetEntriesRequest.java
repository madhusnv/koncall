package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class UpdateDatasetEntriesRequest extends AmazonWebServiceRequest implements Serializable {
    private DatasetChanges changes;
    private String datasetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateDatasetEntriesRequest)) {
            return false;
        }
        UpdateDatasetEntriesRequest updateDatasetEntriesRequest = (UpdateDatasetEntriesRequest) obj;
        if ((updateDatasetEntriesRequest.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        if (updateDatasetEntriesRequest.getDatasetArn() != null && !updateDatasetEntriesRequest.getDatasetArn().equals(getDatasetArn())) {
            return false;
        }
        if ((updateDatasetEntriesRequest.getChanges() == null) ^ (getChanges() == null)) {
            return false;
        }
        return updateDatasetEntriesRequest.getChanges() == null || updateDatasetEntriesRequest.getChanges().equals(getChanges());
    }

    public DatasetChanges getChanges() {
        return this.changes;
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public int hashCode() {
        return (((getDatasetArn() == null ? 0 : getDatasetArn().hashCode()) + 31) * 31) + (getChanges() != null ? getChanges().hashCode() : 0);
    }

    public void setChanges(DatasetChanges datasetChanges) {
        this.changes = datasetChanges;
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        }
        if (getChanges() != null) {
            sb.append("Changes: " + getChanges());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateDatasetEntriesRequest withChanges(DatasetChanges datasetChanges) {
        this.changes = datasetChanges;
        return this;
    }

    public UpdateDatasetEntriesRequest withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }
}
