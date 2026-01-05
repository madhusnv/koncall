package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public class ProjectPolicy implements Serializable {
    private Date creationTimestamp;
    private Date lastUpdatedTimestamp;
    private String policyDocument;
    private String policyName;
    private String policyRevisionId;
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProjectPolicy)) {
            return false;
        }
        ProjectPolicy projectPolicy = (ProjectPolicy) obj;
        if ((projectPolicy.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (projectPolicy.getProjectArn() != null && !projectPolicy.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((projectPolicy.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (projectPolicy.getPolicyName() != null && !projectPolicy.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((projectPolicy.getPolicyRevisionId() == null) ^ (getPolicyRevisionId() == null)) {
            return false;
        }
        if (projectPolicy.getPolicyRevisionId() != null && !projectPolicy.getPolicyRevisionId().equals(getPolicyRevisionId())) {
            return false;
        }
        if ((projectPolicy.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        if (projectPolicy.getPolicyDocument() != null && !projectPolicy.getPolicyDocument().equals(getPolicyDocument())) {
            return false;
        }
        if ((projectPolicy.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (projectPolicy.getCreationTimestamp() != null && !projectPolicy.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((projectPolicy.getLastUpdatedTimestamp() == null) ^ (getLastUpdatedTimestamp() == null)) {
            return false;
        }
        return projectPolicy.getLastUpdatedTimestamp() == null || projectPolicy.getLastUpdatedTimestamp().equals(getLastUpdatedTimestamp());
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public int hashCode() {
        return (((((((((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getPolicyName() == null ? 0 : getPolicyName().hashCode())) * 31) + (getPolicyRevisionId() == null ? 0 : getPolicyRevisionId().hashCode())) * 31) + (getPolicyDocument() == null ? 0 : getPolicyDocument().hashCode())) * 31) + (getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode())) * 31) + (getLastUpdatedTimestamp() != null ? getLastUpdatedTimestamp().hashCode() : 0);
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setLastUpdatedTimestamp(Date date) {
        this.lastUpdatedTimestamp = date;
    }

    public void setPolicyDocument(String str) {
        this.policyDocument = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setPolicyRevisionId(String str) {
        this.policyRevisionId = str;
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
        if (getPolicyName() != null) {
            sb.append("PolicyName: " + getPolicyName() + ",");
        }
        if (getPolicyRevisionId() != null) {
            sb.append("PolicyRevisionId: " + getPolicyRevisionId() + ",");
        }
        if (getPolicyDocument() != null) {
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        }
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getLastUpdatedTimestamp() != null) {
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProjectPolicy withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public ProjectPolicy withLastUpdatedTimestamp(Date date) {
        this.lastUpdatedTimestamp = date;
        return this;
    }

    public ProjectPolicy withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public ProjectPolicy withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public ProjectPolicy withPolicyRevisionId(String str) {
        this.policyRevisionId = str;
        return this;
    }

    public ProjectPolicy withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
