package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetSegmentDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSegmentDetectionRequest)) {
            return false;
        }
        GetSegmentDetectionRequest getSegmentDetectionRequest = (GetSegmentDetectionRequest) obj;
        if ((getSegmentDetectionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getSegmentDetectionRequest.getJobId() != null && !getSegmentDetectionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getSegmentDetectionRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getSegmentDetectionRequest.getMaxResults() != null && !getSegmentDetectionRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getSegmentDetectionRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return getSegmentDetectionRequest.getNextToken() == null || getSegmentDetectionRequest.getNextToken().equals(getNextToken());
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

    public int hashCode() {
        return (((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
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
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetSegmentDetectionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetSegmentDetectionRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetSegmentDetectionRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
