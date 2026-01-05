package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ListProjectPoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListProjectPoliciesRequest)) {
            return false;
        }
        ListProjectPoliciesRequest listProjectPoliciesRequest = (ListProjectPoliciesRequest) obj;
        if ((listProjectPoliciesRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (listProjectPoliciesRequest.getProjectArn() != null && !listProjectPoliciesRequest.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((listProjectPoliciesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listProjectPoliciesRequest.getNextToken() != null && !listProjectPoliciesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listProjectPoliciesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listProjectPoliciesRequest.getMaxResults() == null || listProjectPoliciesRequest.getMaxResults().equals(getMaxResults());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public int hashCode() {
        return (((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setProjectArn(String str) {
        this.projectArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn() + ",");
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

    public ListProjectPoliciesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListProjectPoliciesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListProjectPoliciesRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
