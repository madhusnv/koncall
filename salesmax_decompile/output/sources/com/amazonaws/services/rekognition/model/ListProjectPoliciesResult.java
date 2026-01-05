package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListProjectPoliciesResult implements Serializable {
    private String nextToken;
    private List<ProjectPolicy> projectPolicies;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListProjectPoliciesResult)) {
            return false;
        }
        ListProjectPoliciesResult listProjectPoliciesResult = (ListProjectPoliciesResult) obj;
        if ((listProjectPoliciesResult.getProjectPolicies() == null) ^ (getProjectPolicies() == null)) {
            return false;
        }
        if (listProjectPoliciesResult.getProjectPolicies() != null && !listProjectPoliciesResult.getProjectPolicies().equals(getProjectPolicies())) {
            return false;
        }
        if ((listProjectPoliciesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listProjectPoliciesResult.getNextToken() == null || listProjectPoliciesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ProjectPolicy> getProjectPolicies() {
        return this.projectPolicies;
    }

    public int hashCode() {
        return (((getProjectPolicies() == null ? 0 : getProjectPolicies().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setProjectPolicies(Collection<ProjectPolicy> collection) {
        if (collection == null) {
            this.projectPolicies = null;
        } else {
            this.projectPolicies = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectPolicies() != null) {
            sb.append("ProjectPolicies: " + getProjectPolicies() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListProjectPoliciesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListProjectPoliciesResult withProjectPolicies(ProjectPolicy... projectPolicyArr) {
        if (getProjectPolicies() == null) {
            this.projectPolicies = new ArrayList(projectPolicyArr.length);
        }
        for (ProjectPolicy projectPolicy : projectPolicyArr) {
            this.projectPolicies.add(projectPolicy);
        }
        return this;
    }

    public ListProjectPoliciesResult withProjectPolicies(Collection<ProjectPolicy> collection) {
        setProjectPolicies(collection);
        return this;
    }
}
