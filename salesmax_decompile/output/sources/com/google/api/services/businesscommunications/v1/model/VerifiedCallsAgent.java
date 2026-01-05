package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class VerifiedCallsAgent extends GenericJson {

    @Key
    private List<CallReason> callReasons;

    @Key
    private String logoUrl;

    @Key
    private List<VerifiedCallsPhone> phones;

    public List<CallReason> getCallReasons() {
        return this.callReasons;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public List<VerifiedCallsPhone> getPhones() {
        return this.phones;
    }

    public VerifiedCallsAgent setCallReasons(List<CallReason> list) {
        this.callReasons = list;
        return this;
    }

    public VerifiedCallsAgent setLogoUrl(String str) {
        this.logoUrl = str;
        return this;
    }

    public VerifiedCallsAgent setPhones(List<VerifiedCallsPhone> list) {
        this.phones = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VerifiedCallsAgent set(String str, Object obj) {
        return (VerifiedCallsAgent) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VerifiedCallsAgent clone() {
        return (VerifiedCallsAgent) super.clone();
    }
}
