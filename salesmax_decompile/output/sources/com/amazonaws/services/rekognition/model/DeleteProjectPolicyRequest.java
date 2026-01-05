package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteProjectPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyName;
    private String policyRevisionId;
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteProjectPolicyRequest)) {
            return false;
        }
        DeleteProjectPolicyRequest deleteProjectPolicyRequest = (DeleteProjectPolicyRequest) obj;
        if ((deleteProjectPolicyRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (deleteProjectPolicyRequest.getProjectArn() != null && !deleteProjectPolicyRequest.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((deleteProjectPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (deleteProjectPolicyRequest.getPolicyName() != null && !deleteProjectPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((deleteProjectPolicyRequest.getPolicyRevisionId() == null) ^ (getPolicyRevisionId() == null)) {
            return false;
        }
        return deleteProjectPolicyRequest.getPolicyRevisionId() == null || deleteProjectPolicyRequest.getPolicyRevisionId().equals(getPolicyRevisionId());
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
        return (((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getPolicyName() == null ? 0 : getPolicyName().hashCode())) * 31) + (getPolicyRevisionId() != null ? getPolicyRevisionId().hashCode() : 0);
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
            sb.append("PolicyRevisionId: " + getPolicyRevisionId());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteProjectPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public DeleteProjectPolicyRequest withPolicyRevisionId(String str) {
        this.policyRevisionId = str;
        return this;
    }

    public DeleteProjectPolicyRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
