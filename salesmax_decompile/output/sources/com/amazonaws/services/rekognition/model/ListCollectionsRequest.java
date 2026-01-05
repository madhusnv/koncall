package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ListCollectionsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListCollectionsRequest)) {
            return false;
        }
        ListCollectionsRequest listCollectionsRequest = (ListCollectionsRequest) obj;
        if ((listCollectionsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listCollectionsRequest.getNextToken() != null && !listCollectionsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listCollectionsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listCollectionsRequest.getMaxResults() == null || listCollectionsRequest.getMaxResults().equals(getMaxResults());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
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
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListCollectionsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListCollectionsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
