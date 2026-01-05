package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class ListAgentsResponse extends GenericJson {

    @Key
    private List<Agent> agents;

    @Key
    private String nextPageToken;

    static {
        Data.nullOf(Agent.class);
    }

    public List<Agent> getAgents() {
        return this.agents;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListAgentsResponse setAgents(List<Agent> list) {
        this.agents = list;
        return this;
    }

    public ListAgentsResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ListAgentsResponse set(String str, Object obj) {
        return (ListAgentsResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ListAgentsResponse clone() {
        return (ListAgentsResponse) super.clone();
    }
}
