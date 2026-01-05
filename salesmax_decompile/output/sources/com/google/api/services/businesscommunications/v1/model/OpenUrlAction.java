package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class OpenUrlAction extends GenericJson {

    @Key
    private String url;

    public String getUrl() {
        return this.url;
    }

    public OpenUrlAction setUrl(String str) {
        this.url = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public OpenUrlAction set(String str, Object obj) {
        return (OpenUrlAction) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public OpenUrlAction clone() {
        return (OpenUrlAction) super.clone();
    }
}
