package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String projectArn;
    private List<String> versionNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProjectVersionsRequest)) {
            return false;
        }
        DescribeProjectVersionsRequest describeProjectVersionsRequest = (DescribeProjectVersionsRequest) obj;
        if ((describeProjectVersionsRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (describeProjectVersionsRequest.getProjectArn() != null && !describeProjectVersionsRequest.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((describeProjectVersionsRequest.getVersionNames() == null) ^ (getVersionNames() == null)) {
            return false;
        }
        if (describeProjectVersionsRequest.getVersionNames() != null && !describeProjectVersionsRequest.getVersionNames().equals(getVersionNames())) {
            return false;
        }
        if ((describeProjectVersionsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeProjectVersionsRequest.getNextToken() != null && !describeProjectVersionsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeProjectVersionsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return describeProjectVersionsRequest.getMaxResults() == null || describeProjectVersionsRequest.getMaxResults().equals(getMaxResults());
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

    public List<String> getVersionNames() {
        return this.versionNames;
    }

    public int hashCode() {
        return (((((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getVersionNames() == null ? 0 : getVersionNames().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
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

    public void setVersionNames(Collection<String> collection) {
        if (collection == null) {
            this.versionNames = null;
        } else {
            this.versionNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn() + ",");
        }
        if (getVersionNames() != null) {
            sb.append("VersionNames: " + getVersionNames() + ",");
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

    public DescribeProjectVersionsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public DescribeProjectVersionsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeProjectVersionsRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }

    public DescribeProjectVersionsRequest withVersionNames(String... strArr) {
        if (getVersionNames() == null) {
            this.versionNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.versionNames.add(str);
        }
        return this;
    }

    public DescribeProjectVersionsRequest withVersionNames(Collection<String> collection) {
        setVersionNames(collection);
        return this;
    }
}
