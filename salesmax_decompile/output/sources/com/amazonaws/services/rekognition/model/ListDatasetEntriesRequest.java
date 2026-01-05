package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListDatasetEntriesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> containsLabels;
    private String datasetArn;
    private Boolean hasErrors;
    private Boolean labeled;
    private Integer maxResults;
    private String nextToken;
    private String sourceRefContains;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetEntriesRequest)) {
            return false;
        }
        ListDatasetEntriesRequest listDatasetEntriesRequest = (ListDatasetEntriesRequest) obj;
        if ((listDatasetEntriesRequest.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getDatasetArn() != null && !listDatasetEntriesRequest.getDatasetArn().equals(getDatasetArn())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getContainsLabels() == null) ^ (getContainsLabels() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getContainsLabels() != null && !listDatasetEntriesRequest.getContainsLabels().equals(getContainsLabels())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getLabeled() == null) ^ (getLabeled() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getLabeled() != null && !listDatasetEntriesRequest.getLabeled().equals(getLabeled())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getSourceRefContains() == null) ^ (getSourceRefContains() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getSourceRefContains() != null && !listDatasetEntriesRequest.getSourceRefContains().equals(getSourceRefContains())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getHasErrors() == null) ^ (getHasErrors() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getHasErrors() != null && !listDatasetEntriesRequest.getHasErrors().equals(getHasErrors())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listDatasetEntriesRequest.getNextToken() != null && !listDatasetEntriesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listDatasetEntriesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listDatasetEntriesRequest.getMaxResults() == null || listDatasetEntriesRequest.getMaxResults().equals(getMaxResults());
    }

    public List<String> getContainsLabels() {
        return this.containsLabels;
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public Boolean getHasErrors() {
        return this.hasErrors;
    }

    public Boolean getLabeled() {
        return this.labeled;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSourceRefContains() {
        return this.sourceRefContains;
    }

    public int hashCode() {
        return (((((((((((((getDatasetArn() == null ? 0 : getDatasetArn().hashCode()) + 31) * 31) + (getContainsLabels() == null ? 0 : getContainsLabels().hashCode())) * 31) + (getLabeled() == null ? 0 : getLabeled().hashCode())) * 31) + (getSourceRefContains() == null ? 0 : getSourceRefContains().hashCode())) * 31) + (getHasErrors() == null ? 0 : getHasErrors().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public Boolean isHasErrors() {
        return this.hasErrors;
    }

    public Boolean isLabeled() {
        return this.labeled;
    }

    public void setContainsLabels(Collection<String> collection) {
        if (collection == null) {
            this.containsLabels = null;
        } else {
            this.containsLabels = new ArrayList(collection);
        }
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public void setHasErrors(Boolean bool) {
        this.hasErrors = bool;
    }

    public void setLabeled(Boolean bool) {
        this.labeled = bool;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSourceRefContains(String str) {
        this.sourceRefContains = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        }
        if (getContainsLabels() != null) {
            sb.append("ContainsLabels: " + getContainsLabels() + ",");
        }
        if (getLabeled() != null) {
            sb.append("Labeled: " + getLabeled() + ",");
        }
        if (getSourceRefContains() != null) {
            sb.append("SourceRefContains: " + getSourceRefContains() + ",");
        }
        if (getHasErrors() != null) {
            sb.append("HasErrors: " + getHasErrors() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListDatasetEntriesRequest withContainsLabels(String... strArr) {
        if (getContainsLabels() == null) {
            this.containsLabels = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.containsLabels.add(str);
        }
        return this;
    }

    public ListDatasetEntriesRequest withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }

    public ListDatasetEntriesRequest withHasErrors(Boolean bool) {
        this.hasErrors = bool;
        return this;
    }

    public ListDatasetEntriesRequest withLabeled(Boolean bool) {
        this.labeled = bool;
        return this;
    }

    public ListDatasetEntriesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListDatasetEntriesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDatasetEntriesRequest withSourceRefContains(String str) {
        this.sourceRefContains = str;
        return this;
    }

    public ListDatasetEntriesRequest withContainsLabels(Collection<String> collection) {
        setContainsLabels(collection);
        return this;
    }
}
