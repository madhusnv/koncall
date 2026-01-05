package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private List<String> projectNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProjectsRequest)) {
            return false;
        }
        DescribeProjectsRequest describeProjectsRequest = (DescribeProjectsRequest) obj;
        if ((describeProjectsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeProjectsRequest.getNextToken() != null && !describeProjectsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeProjectsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (describeProjectsRequest.getMaxResults() != null && !describeProjectsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((describeProjectsRequest.getProjectNames() == null) ^ (getProjectNames() == null)) {
            return false;
        }
        return describeProjectsRequest.getProjectNames() == null || describeProjectsRequest.getProjectNames().equals(getProjectNames());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<String> getProjectNames() {
        return this.projectNames;
    }

    public int hashCode() {
        return (((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getProjectNames() != null ? getProjectNames().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setProjectNames(Collection<String> collection) {
        if (collection == null) {
            this.projectNames = null;
        } else {
            this.projectNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getProjectNames() != null) {
            sb.append("ProjectNames: " + getProjectNames());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeProjectsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public DescribeProjectsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeProjectsRequest withProjectNames(String... strArr) {
        if (getProjectNames() == null) {
            this.projectNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.projectNames.add(str);
        }
        return this;
    }

    public DescribeProjectsRequest withProjectNames(Collection<String> collection) {
        setProjectNames(collection);
        return this;
    }
}
