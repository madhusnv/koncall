package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectsResult implements Serializable {
    private String nextToken;
    private List<ProjectDescription> projectDescriptions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProjectsResult)) {
            return false;
        }
        DescribeProjectsResult describeProjectsResult = (DescribeProjectsResult) obj;
        if ((describeProjectsResult.getProjectDescriptions() == null) ^ (getProjectDescriptions() == null)) {
            return false;
        }
        if (describeProjectsResult.getProjectDescriptions() != null && !describeProjectsResult.getProjectDescriptions().equals(getProjectDescriptions())) {
            return false;
        }
        if ((describeProjectsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeProjectsResult.getNextToken() == null || describeProjectsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ProjectDescription> getProjectDescriptions() {
        return this.projectDescriptions;
    }

    public int hashCode() {
        return (((getProjectDescriptions() == null ? 0 : getProjectDescriptions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setProjectDescriptions(Collection<ProjectDescription> collection) {
        if (collection == null) {
            this.projectDescriptions = null;
        } else {
            this.projectDescriptions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectDescriptions() != null) {
            sb.append("ProjectDescriptions: " + getProjectDescriptions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeProjectsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeProjectsResult withProjectDescriptions(ProjectDescription... projectDescriptionArr) {
        if (getProjectDescriptions() == null) {
            this.projectDescriptions = new ArrayList(projectDescriptionArr.length);
        }
        for (ProjectDescription projectDescription : projectDescriptionArr) {
            this.projectDescriptions.add(projectDescription);
        }
        return this;
    }

    public DescribeProjectsResult withProjectDescriptions(Collection<ProjectDescription> collection) {
        setProjectDescriptions(collection);
        return this;
    }
}
