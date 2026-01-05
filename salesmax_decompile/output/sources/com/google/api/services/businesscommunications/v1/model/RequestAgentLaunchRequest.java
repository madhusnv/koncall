package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class RequestAgentLaunchRequest extends GenericJson {

    @Key
    private AgentLaunch agentLaunch;

    public AgentLaunch getAgentLaunch() {
        return this.agentLaunch;
    }

    public RequestAgentLaunchRequest setAgentLaunch(AgentLaunch agentLaunch) {
        this.agentLaunch = agentLaunch;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public RequestAgentLaunchRequest set(String str, Object obj) {
        return (RequestAgentLaunchRequest) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public RequestAgentLaunchRequest clone() {
        return (RequestAgentLaunchRequest) super.clone();
    }
}
