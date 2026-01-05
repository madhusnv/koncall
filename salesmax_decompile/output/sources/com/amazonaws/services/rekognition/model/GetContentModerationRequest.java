package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetContentModerationRequest extends AmazonWebServiceRequest implements Serializable {
    private String aggregateBy;
    private String jobId;
    private Integer maxResults;
    private String nextToken;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetContentModerationRequest)) {
            return false;
        }
        GetContentModerationRequest getContentModerationRequest = (GetContentModerationRequest) obj;
        if ((getContentModerationRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getContentModerationRequest.getJobId() != null && !getContentModerationRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getContentModerationRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getContentModerationRequest.getMaxResults() != null && !getContentModerationRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getContentModerationRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getContentModerationRequest.getNextToken() != null && !getContentModerationRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getContentModerationRequest.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        if (getContentModerationRequest.getSortBy() != null && !getContentModerationRequest.getSortBy().equals(getSortBy())) {
            return false;
        }
        if ((getContentModerationRequest.getAggregateBy() == null) ^ (getAggregateBy() == null)) {
            return false;
        }
        return getContentModerationRequest.getAggregateBy() == null || getContentModerationRequest.getAggregateBy().equals(getAggregateBy());
    }

    public String getAggregateBy() {
        return this.aggregateBy;
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
        return (((((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getSortBy() == null ? 0 : getSortBy().hashCode())) * 31) + (getAggregateBy() != null ? getAggregateBy().hashCode() : 0);
    }

    public void setAggregateBy(String str) {
        this.aggregateBy = str;
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
            sb.append("SortBy: " + getSortBy() + ",");
        }
        if (getAggregateBy() != null) {
            sb.append("AggregateBy: " + getAggregateBy());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetContentModerationRequest withAggregateBy(String str) {
        this.aggregateBy = str;
        return this;
    }

    public GetContentModerationRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetContentModerationRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetContentModerationRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetContentModerationRequest withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setAggregateBy(ContentModerationAggregateBy contentModerationAggregateBy) {
        this.aggregateBy = contentModerationAggregateBy.toString();
    }

    public void setSortBy(ContentModerationSortBy contentModerationSortBy) {
        this.sortBy = contentModerationSortBy.toString();
    }

    public GetContentModerationRequest withAggregateBy(ContentModerationAggregateBy contentModerationAggregateBy) {
        this.aggregateBy = contentModerationAggregateBy.toString();
        return this;
    }

    public GetContentModerationRequest withSortBy(ContentModerationSortBy contentModerationSortBy) {
        this.sortBy = contentModerationSortBy.toString();
        return this;
    }
}
