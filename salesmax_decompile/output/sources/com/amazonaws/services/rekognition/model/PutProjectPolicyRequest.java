package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class PutProjectPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyDocument;
    private String policyName;
    private String policyRevisionId;
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutProjectPolicyRequest)) {
            return false;
        }
        PutProjectPolicyRequest putProjectPolicyRequest = (PutProjectPolicyRequest) obj;
        if ((putProjectPolicyRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (putProjectPolicyRequest.getProjectArn() != null && !putProjectPolicyRequest.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((putProjectPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (putProjectPolicyRequest.getPolicyName() != null && !putProjectPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((putProjectPolicyRequest.getPolicyRevisionId() == null) ^ (getPolicyRevisionId() == null)) {
            return false;
        }
        if (putProjectPolicyRequest.getPolicyRevisionId() != null && !putProjectPolicyRequest.getPolicyRevisionId().equals(getPolicyRevisionId())) {
            return false;
        }
        if ((putProjectPolicyRequest.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        return putProjectPolicyRequest.getPolicyDocument() == null || putProjectPolicyRequest.getPolicyDocument().equals(getPolicyDocument());
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
        return (((((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getPolicyName() == null ? 0 : getPolicyName().hashCode())) * 31) + (getPolicyRevisionId() == null ? 0 : getPolicyRevisionId().hashCode())) * 31) + (getPolicyDocument() != null ? getPolicyDocument().hashCode() : 0);
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
            sb.append("PolicyDocument: " + getPolicyDocument());
        }
        sb.append("}");
        return sb.toString();
    }

    public PutProjectPolicyRequest withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public PutProjectPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public PutProjectPolicyRequest withPolicyRevisionId(String str) {
        this.policyRevisionId = str;
        return this;
    }

    public PutProjectPolicyRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
