package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectVersionsResult implements Serializable {
    private String nextToken;
    private List<ProjectVersionDescription> projectVersionDescriptions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProjectVersionsResult)) {
            return false;
        }
        DescribeProjectVersionsResult describeProjectVersionsResult = (DescribeProjectVersionsResult) obj;
        if ((describeProjectVersionsResult.getProjectVersionDescriptions() == null) ^ (getProjectVersionDescriptions() == null)) {
            return false;
        }
        if (describeProjectVersionsResult.getProjectVersionDescriptions() != null && !describeProjectVersionsResult.getProjectVersionDescriptions().equals(getProjectVersionDescriptions())) {
            return false;
        }
        if ((describeProjectVersionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeProjectVersionsResult.getNextToken() == null || describeProjectVersionsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ProjectVersionDescription> getProjectVersionDescriptions() {
        return this.projectVersionDescriptions;
    }

    public int hashCode() {
        return (((getProjectVersionDescriptions() == null ? 0 : getProjectVersionDescriptions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setProjectVersionDescriptions(Collection<ProjectVersionDescription> collection) {
        if (collection == null) {
            this.projectVersionDescriptions = null;
        } else {
            this.projectVersionDescriptions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectVersionDescriptions() != null) {
            sb.append("ProjectVersionDescriptions: " + getProjectVersionDescriptions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeProjectVersionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeProjectVersionsResult withProjectVersionDescriptions(ProjectVersionDescription... projectVersionDescriptionArr) {
        if (getProjectVersionDescriptions() == null) {
            this.projectVersionDescriptions = new ArrayList(projectVersionDescriptionArr.length);
        }
        for (ProjectVersionDescription projectVersionDescription : projectVersionDescriptionArr) {
            this.projectVersionDescriptions.add(projectVersionDescription);
        }
        return this;
    }

    public DescribeProjectVersionsResult withProjectVersionDescriptions(Collection<ProjectVersionDescription> collection) {
        setProjectVersionDescriptions(collection);
        return this;
    }
}
