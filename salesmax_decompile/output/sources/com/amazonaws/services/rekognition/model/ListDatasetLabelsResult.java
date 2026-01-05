package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListDatasetLabelsResult implements Serializable {
    private List<DatasetLabelDescription> datasetLabelDescriptions;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetLabelsResult)) {
            return false;
        }
        ListDatasetLabelsResult listDatasetLabelsResult = (ListDatasetLabelsResult) obj;
        if ((listDatasetLabelsResult.getDatasetLabelDescriptions() == null) ^ (getDatasetLabelDescriptions() == null)) {
            return false;
        }
        if (listDatasetLabelsResult.getDatasetLabelDescriptions() != null && !listDatasetLabelsResult.getDatasetLabelDescriptions().equals(getDatasetLabelDescriptions())) {
            return false;
        }
        if ((listDatasetLabelsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listDatasetLabelsResult.getNextToken() == null || listDatasetLabelsResult.getNextToken().equals(getNextToken());
    }

    public List<DatasetLabelDescription> getDatasetLabelDescriptions() {
        return this.datasetLabelDescriptions;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getDatasetLabelDescriptions() == null ? 0 : getDatasetLabelDescriptions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDatasetLabelDescriptions(Collection<DatasetLabelDescription> collection) {
        if (collection == null) {
            this.datasetLabelDescriptions = null;
        } else {
            this.datasetLabelDescriptions = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetLabelDescriptions() != null) {
            sb.append("DatasetLabelDescriptions: " + getDatasetLabelDescriptions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListDatasetLabelsResult withDatasetLabelDescriptions(DatasetLabelDescription... datasetLabelDescriptionArr) {
        if (getDatasetLabelDescriptions() == null) {
            this.datasetLabelDescriptions = new ArrayList(datasetLabelDescriptionArr.length);
        }
        for (DatasetLabelDescription datasetLabelDescription : datasetLabelDescriptionArr) {
            this.datasetLabelDescriptions.add(datasetLabelDescription);
        }
        return this;
    }

    public ListDatasetLabelsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDatasetLabelsResult withDatasetLabelDescriptions(Collection<DatasetLabelDescription> collection) {
        setDatasetLabelDescriptions(collection);
        return this;
    }
}
