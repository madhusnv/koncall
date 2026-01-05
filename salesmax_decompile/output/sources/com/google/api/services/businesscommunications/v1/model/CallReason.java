package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class CallReason extends GenericJson {

    @Key
    private ApprovalDetails approvalDetails;

    @Key
    private String text;

    public ApprovalDetails getApprovalDetails() {
        return this.approvalDetails;
    }

    public String getText() {
        return this.text;
    }

    public CallReason setApprovalDetails(ApprovalDetails approvalDetails) {
        this.approvalDetails = approvalDetails;
        return this;
    }

    public CallReason setText(String str) {
        this.text = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CallReason set(String str, Object obj) {
        return (CallReason) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CallReason clone() {
        return (CallReason) super.clone();
    }
}
