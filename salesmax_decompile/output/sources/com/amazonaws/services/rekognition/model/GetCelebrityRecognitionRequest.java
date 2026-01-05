package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetCelebrityRecognitionRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private Integer maxResults;
    private String nextToken;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCelebrityRecognitionRequest)) {
            return false;
        }
        GetCelebrityRecognitionRequest getCelebrityRecognitionRequest = (GetCelebrityRecognitionRequest) obj;
        if ((getCelebrityRecognitionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getCelebrityRecognitionRequest.getJobId() != null && !getCelebrityRecognitionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getCelebrityRecognitionRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getCelebrityRecognitionRequest.getMaxResults() != null && !getCelebrityRecognitionRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getCelebrityRecognitionRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getCelebrityRecognitionRequest.getNextToken() != null && !getCelebrityRecognitionRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getCelebrityRecognitionRequest.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        return getCelebrityRecognitionRequest.getSortBy() == null || getCelebrityRecognitionRequest.getSortBy().equals(getSortBy());
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

    public GetCelebrityRecognitionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetCelebrityRecognitionRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetCelebrityRecognitionRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetCelebrityRecognitionRequest withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setSortBy(CelebrityRecognitionSortBy celebrityRecognitionSortBy) {
        this.sortBy = celebrityRecognitionSortBy.toString();
    }

    public GetCelebrityRecognitionRequest withSortBy(CelebrityRecognitionSortBy celebrityRecognitionSortBy) {
        this.sortBy = celebrityRecognitionSortBy.toString();
        return this;
    }
}
