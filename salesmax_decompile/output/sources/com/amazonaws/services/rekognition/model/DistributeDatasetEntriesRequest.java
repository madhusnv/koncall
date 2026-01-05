package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DistributeDatasetEntriesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<DistributeDataset> datasets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DistributeDatasetEntriesRequest)) {
            return false;
        }
        DistributeDatasetEntriesRequest distributeDatasetEntriesRequest = (DistributeDatasetEntriesRequest) obj;
        if ((distributeDatasetEntriesRequest.getDatasets() == null) ^ (getDatasets() == null)) {
            return false;
        }
        return distributeDatasetEntriesRequest.getDatasets() == null || distributeDatasetEntriesRequest.getDatasets().equals(getDatasets());
    }

    public List<DistributeDataset> getDatasets() {
        return this.datasets;
    }

    public int hashCode() {
        return 31 + (getDatasets() == null ? 0 : getDatasets().hashCode());
    }

    public void setDatasets(Collection<DistributeDataset> collection) {
        if (collection == null) {
            this.datasets = null;
        } else {
            this.datasets = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasets() != null) {
            sb.append("Datasets: " + getDatasets());
        }
        sb.append("}");
        return sb.toString();
    }

    public DistributeDatasetEntriesRequest withDatasets(DistributeDataset... distributeDatasetArr) {
        if (getDatasets() == null) {
            this.datasets = new ArrayList(distributeDatasetArr.length);
        }
        for (DistributeDataset distributeDataset : distributeDatasetArr) {
            this.datasets.add(distributeDataset);
        }
        return this;
    }

    public DistributeDatasetEntriesRequest withDatasets(Collection<DistributeDataset> collection) {
        setDatasets(collection);
        return this;
    }
}
