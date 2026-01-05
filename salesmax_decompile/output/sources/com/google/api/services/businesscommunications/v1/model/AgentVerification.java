package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class AgentVerification extends GenericJson {

    @Key
    private AgentVerificationContact agentVerificationContact;

    @Key
    private String name;

    @Key
    private String verificationState;

    public AgentVerificationContact getAgentVerificationContact() {
        return this.agentVerificationContact;
    }

    public String getName() {
        return this.name;
    }

    public String getVerificationState() {
        return this.verificationState;
    }

    public AgentVerification setAgentVerificationContact(AgentVerificationContact agentVerificationContact) {
        this.agentVerificationContact = agentVerificationContact;
        return this;
    }

    public AgentVerification setName(String str) {
        this.name = str;
        return this;
    }

    public AgentVerification setVerificationState(String str) {
        this.verificationState = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public AgentVerification set(String str, Object obj) {
        return (AgentVerification) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AgentVerification clone() {
        return (AgentVerification) super.clone();
    }
}
