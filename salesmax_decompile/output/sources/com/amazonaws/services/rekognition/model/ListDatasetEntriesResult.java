package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListDatasetEntriesResult implements Serializable {
    private List<String> datasetEntries;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetEntriesResult)) {
            return false;
        }
        ListDatasetEntriesResult listDatasetEntriesResult = (ListDatasetEntriesResult) obj;
        if ((listDatasetEntriesResult.getDatasetEntries() == null) ^ (getDatasetEntries() == null)) {
            return false;
        }
        if (listDatasetEntriesResult.getDatasetEntries() != null && !listDatasetEntriesResult.getDatasetEntries().equals(getDatasetEntries())) {
            return false;
        }
        if ((listDatasetEntriesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listDatasetEntriesResult.getNextToken() == null || listDatasetEntriesResult.getNextToken().equals(getNextToken());
    }

    public List<String> getDatasetEntries() {
        return this.datasetEntries;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getDatasetEntries() == null ? 0 : getDatasetEntries().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDatasetEntries(Collection<String> collection) {
        if (collection == null) {
            this.datasetEntries = null;
        } else {
            this.datasetEntries = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetEntries() != null) {
            sb.append("DatasetEntries: " + getDatasetEntries() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListDatasetEntriesResult withDatasetEntries(String... strArr) {
        if (getDatasetEntries() == null) {
            this.datasetEntries = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.datasetEntries.add(str);
        }
        return this;
    }

    public ListDatasetEntriesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDatasetEntriesResult withDatasetEntries(Collection<String> collection) {
        setDatasetEntries(collection);
        return this;
    }
}
