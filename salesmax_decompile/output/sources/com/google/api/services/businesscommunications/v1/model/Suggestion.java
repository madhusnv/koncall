package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Suggestion extends GenericJson {

    @Key
    private SuggestedAction action;

    @Key
    private SuggestedReply reply;

    public SuggestedAction getAction() {
        return this.action;
    }

    public SuggestedReply getReply() {
        return this.reply;
    }

    public Suggestion setAction(SuggestedAction suggestedAction) {
        this.action = suggestedAction;
        return this;
    }

    public Suggestion setReply(SuggestedReply suggestedReply) {
        this.reply = suggestedReply;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Suggestion set(String str, Object obj) {
        return (Suggestion) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Suggestion clone() {
        return (Suggestion) super.clone();
    }
}
