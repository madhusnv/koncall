package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ListUsersRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListUsersRequest)) {
            return false;
        }
        ListUsersRequest listUsersRequest = (ListUsersRequest) obj;
        if ((listUsersRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (listUsersRequest.getCollectionId() != null && !listUsersRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((listUsersRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listUsersRequest.getMaxResults() != null && !listUsersRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listUsersRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listUsersRequest.getNextToken() == null || listUsersRequest.getNextToken().equals(getNextToken());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
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
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListUsersRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public ListUsersRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListUsersRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
