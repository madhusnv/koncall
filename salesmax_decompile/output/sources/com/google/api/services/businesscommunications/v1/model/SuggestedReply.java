package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class SuggestedReply extends GenericJson {

    @Key
    private String postbackData;

    @Key
    private String text;

    public String getPostbackData() {
        return this.postbackData;
    }

    public String getText() {
        return this.text;
    }

    public SuggestedReply setPostbackData(String str) {
        this.postbackData = str;
        return this;
    }

    public SuggestedReply setText(String str) {
        this.text = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SuggestedReply set(String str, Object obj) {
        return (SuggestedReply) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SuggestedReply clone() {
        return (SuggestedReply) super.clone();
    }
}
