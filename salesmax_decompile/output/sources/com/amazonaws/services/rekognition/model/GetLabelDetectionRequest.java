package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetLabelDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String aggregateBy;
    private String jobId;
    private Integer maxResults;
    private String nextToken;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLabelDetectionRequest)) {
            return false;
        }
        GetLabelDetectionRequest getLabelDetectionRequest = (GetLabelDetectionRequest) obj;
        if ((getLabelDetectionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getLabelDetectionRequest.getJobId() != null && !getLabelDetectionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getLabelDetectionRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getLabelDetectionRequest.getMaxResults() != null && !getLabelDetectionRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getLabelDetectionRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getLabelDetectionRequest.getNextToken() != null && !getLabelDetectionRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getLabelDetectionRequest.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        if (getLabelDetectionRequest.getSortBy() != null && !getLabelDetectionRequest.getSortBy().equals(getSortBy())) {
            return false;
        }
        if ((getLabelDetectionRequest.getAggregateBy() == null) ^ (getAggregateBy() == null)) {
            return false;
        }
        return getLabelDetectionRequest.getAggregateBy() == null || getLabelDetectionRequest.getAggregateBy().equals(getAggregateBy());
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

    public GetLabelDetectionRequest withAggregateBy(String str) {
        this.aggregateBy = str;
        return this;
    }

    public GetLabelDetectionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetLabelDetectionRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetLabelDetectionRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetLabelDetectionRequest withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setAggregateBy(LabelDetectionAggregateBy labelDetectionAggregateBy) {
        this.aggregateBy = labelDetectionAggregateBy.toString();
    }

    public void setSortBy(LabelDetectionSortBy labelDetectionSortBy) {
        this.sortBy = labelDetectionSortBy.toString();
    }

    public GetLabelDetectionRequest withAggregateBy(LabelDetectionAggregateBy labelDetectionAggregateBy) {
        this.aggregateBy = labelDetectionAggregateBy.toString();
        return this;
    }

    public GetLabelDetectionRequest withSortBy(LabelDetectionSortBy labelDetectionSortBy) {
        this.sortBy = labelDetectionSortBy.toString();
        return this;
    }
}
