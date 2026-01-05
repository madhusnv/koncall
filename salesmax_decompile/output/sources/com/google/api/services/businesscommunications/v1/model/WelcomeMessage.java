package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class WelcomeMessage extends GenericJson {

    @Key
    private String text;

    public String getText() {
        return this.text;
    }

    public WelcomeMessage setText(String str) {
        this.text = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public WelcomeMessage set(String str, Object obj) {
        return (WelcomeMessage) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public WelcomeMessage clone() {
        return (WelcomeMessage) super.clone();
    }
}
