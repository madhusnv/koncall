package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetTextDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetTextDetectionRequest)) {
            return false;
        }
        GetTextDetectionRequest getTextDetectionRequest = (GetTextDetectionRequest) obj;
        if ((getTextDetectionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getTextDetectionRequest.getJobId() != null && !getTextDetectionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getTextDetectionRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getTextDetectionRequest.getMaxResults() != null && !getTextDetectionRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getTextDetectionRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return getTextDetectionRequest.getNextToken() == null || getTextDetectionRequest.getNextToken().equals(getNextToken());
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

    public GetTextDetectionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetTextDetectionRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetTextDetectionRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
