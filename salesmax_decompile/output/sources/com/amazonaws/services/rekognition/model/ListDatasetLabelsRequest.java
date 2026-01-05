package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ListDatasetLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetArn;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetLabelsRequest)) {
            return false;
        }
        ListDatasetLabelsRequest listDatasetLabelsRequest = (ListDatasetLabelsRequest) obj;
        if ((listDatasetLabelsRequest.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        if (listDatasetLabelsRequest.getDatasetArn() != null && !listDatasetLabelsRequest.getDatasetArn().equals(getDatasetArn())) {
            return false;
        }
        if ((listDatasetLabelsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listDatasetLabelsRequest.getNextToken() != null && !listDatasetLabelsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listDatasetLabelsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listDatasetLabelsRequest.getMaxResults() == null || listDatasetLabelsRequest.getMaxResults().equals(getMaxResults());
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getDatasetArn() == null ? 0 : getDatasetArn().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn() + ",");
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

    public ListDatasetLabelsRequest withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }

    public ListDatasetLabelsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListDatasetLabelsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
