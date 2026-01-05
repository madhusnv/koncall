package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class PutProjectPolicyResult implements Serializable {
    private String policyRevisionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutProjectPolicyResult)) {
            return false;
        }
        PutProjectPolicyResult putProjectPolicyResult = (PutProjectPolicyResult) obj;
        if ((putProjectPolicyResult.getPolicyRevisionId() == null) ^ (getPolicyRevisionId() == null)) {
            return false;
        }
        return putProjectPolicyResult.getPolicyRevisionId() == null || putProjectPolicyResult.getPolicyRevisionId().equals(getPolicyRevisionId());
    }

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    public int hashCode() {
        return 31 + (getPolicyRevisionId() == null ? 0 : getPolicyRevisionId().hashCode());
    }

    public void setPolicyRevisionId(String str) {
        this.policyRevisionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyRevisionId() != null) {
            sb.append("PolicyRevisionId: " + getPolicyRevisionId());
        }
        sb.append("}");
        return sb.toString();
    }

    public PutProjectPolicyResult withPolicyRevisionId(String str) {
        this.policyRevisionId = str;
        return this;
    }
}
