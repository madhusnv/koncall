package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class ConversationStarters extends GenericJson {

    @Key
    private Suggestion suggestion;

    public Suggestion getSuggestion() {
        return this.suggestion;
    }

    public ConversationStarters setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ConversationStarters set(String str, Object obj) {
        return (ConversationStarters) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ConversationStarters clone() {
        return (ConversationStarters) super.clone();
    }
}
