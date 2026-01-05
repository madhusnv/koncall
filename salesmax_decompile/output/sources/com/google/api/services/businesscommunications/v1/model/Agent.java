package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Agent extends GenericJson {

    @Key
    private BusinessMessagesAgent businessMessagesAgent;

    @Key
    private String displayName;

    @Key
    private String name;

    @Key
    private VerifiedCallsAgent verifiedCallsAgent;

    @Key
    private VerifiedSmsAgent verifiedSmsAgent;

    public BusinessMessagesAgent getBusinessMessagesAgent() {
        return this.businessMessagesAgent;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public VerifiedCallsAgent getVerifiedCallsAgent() {
        return this.verifiedCallsAgent;
    }

    public VerifiedSmsAgent getVerifiedSmsAgent() {
        return this.verifiedSmsAgent;
    }

    public Agent setBusinessMessagesAgent(BusinessMessagesAgent businessMessagesAgent) {
        this.businessMessagesAgent = businessMessagesAgent;
        return this;
    }

    public Agent setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public Agent setName(String str) {
        this.name = str;
        return this;
    }

    public Agent setVerifiedCallsAgent(VerifiedCallsAgent verifiedCallsAgent) {
        this.verifiedCallsAgent = verifiedCallsAgent;
        return this;
    }

    public Agent setVerifiedSmsAgent(VerifiedSmsAgent verifiedSmsAgent) {
        this.verifiedSmsAgent = verifiedSmsAgent;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Agent set(String str, Object obj) {
        return (Agent) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Agent clone() {
        return (Agent) super.clone();
    }
}
