package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class AgentLaunch extends GenericJson {

    @Key
    private BusinessMessagesLaunch businessMessages;

    @Key
    private String name;

    @Key
    private VerifiedCallsLaunch verifiedCalls;

    public BusinessMessagesLaunch getBusinessMessages() {
        return this.businessMessages;
    }

    public String getName() {
        return this.name;
    }

    public VerifiedCallsLaunch getVerifiedCalls() {
        return this.verifiedCalls;
    }

    public AgentLaunch setBusinessMessages(BusinessMessagesLaunch businessMessagesLaunch) {
        this.businessMessages = businessMessagesLaunch;
        return this;
    }

    public AgentLaunch setName(String str) {
        this.name = str;
        return this;
    }

    public AgentLaunch setVerifiedCalls(VerifiedCallsLaunch verifiedCallsLaunch) {
        this.verifiedCalls = verifiedCallsLaunch;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public AgentLaunch set(String str, Object obj) {
        return (AgentLaunch) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AgentLaunch clone() {
        return (AgentLaunch) super.clone();
    }
}
