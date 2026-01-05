package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class VerifiedCallsPhone extends GenericJson {

    @Key
    private ApprovalDetails approvalDetails;

    @Key
    private String number;

    public ApprovalDetails getApprovalDetails() {
        return this.approvalDetails;
    }

    public String getNumber() {
        return this.number;
    }

    public VerifiedCallsPhone setApprovalDetails(ApprovalDetails approvalDetails) {
        this.approvalDetails = approvalDetails;
        return this;
    }

    public VerifiedCallsPhone setNumber(String str) {
        this.number = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VerifiedCallsPhone set(String str, Object obj) {
        return (VerifiedCallsPhone) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VerifiedCallsPhone clone() {
        return (VerifiedCallsPhone) super.clone();
    }
}
