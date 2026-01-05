package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetPersonTrackingRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private Integer maxResults;
    private String nextToken;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPersonTrackingRequest)) {
            return false;
        }
        GetPersonTrackingRequest getPersonTrackingRequest = (GetPersonTrackingRequest) obj;
        if ((getPersonTrackingRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getPersonTrackingRequest.getJobId() != null && !getPersonTrackingRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getPersonTrackingRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getPersonTrackingRequest.getMaxResults() != null && !getPersonTrackingRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getPersonTrackingRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getPersonTrackingRequest.getNextToken() != null && !getPersonTrackingRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getPersonTrackingRequest.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        return getPersonTrackingRequest.getSortBy() == null || getPersonTrackingRequest.getSortBy().equals(getSortBy());
    }

    public String getJobId() {
        return this.jobId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return (((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getSortBy() != null ? getSortBy().hashCode() : 0);
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSortBy(String str) {
        this.sortBy = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null) {
            sb.append("JobId: " + getJobId() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getSortBy() != null) {
            sb.append("SortBy: " + getSortBy());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetPersonTrackingRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetPersonTrackingRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetPersonTrackingRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetPersonTrackingRequest withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setSortBy(PersonTrackingSortBy personTrackingSortBy) {
        this.sortBy = personTrackingSortBy.toString();
    }

    public GetPersonTrackingRequest withSortBy(PersonTrackingSortBy personTrackingSortBy) {
        this.sortBy = personTrackingSortBy.toString();
        return this;
    }
}
