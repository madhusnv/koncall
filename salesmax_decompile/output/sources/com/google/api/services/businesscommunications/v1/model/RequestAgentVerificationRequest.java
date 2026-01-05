package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class RequestAgentVerificationRequest extends GenericJson {

    @Key
    private AgentVerificationContact agentVerificationContact;

    public AgentVerificationContact getAgentVerificationContact() {
        return this.agentVerificationContact;
    }

    public RequestAgentVerificationRequest setAgentVerificationContact(AgentVerificationContact agentVerificationContact) {
        this.agentVerificationContact = agentVerificationContact;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public RequestAgentVerificationRequest set(String str, Object obj) {
        return (RequestAgentVerificationRequest) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public RequestAgentVerificationRequest clone() {
        return (RequestAgentVerificationRequest) super.clone();
    }
}
