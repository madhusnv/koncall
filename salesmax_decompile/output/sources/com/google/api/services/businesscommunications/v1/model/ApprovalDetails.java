package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class ApprovalDetails extends GenericJson {

    @Key
    private String approvalInfo;

    @Key
    private String approvalState;

    public String getApprovalInfo() {
        return this.approvalInfo;
    }

    public String getApprovalState() {
        return this.approvalState;
    }

    public ApprovalDetails setApprovalInfo(String str) {
        this.approvalInfo = str;
        return this;
    }

    public ApprovalDetails setApprovalState(String str) {
        this.approvalState = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ApprovalDetails set(String str, Object obj) {
        return (ApprovalDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ApprovalDetails clone() {
        return (ApprovalDetails) super.clone();
    }
}
