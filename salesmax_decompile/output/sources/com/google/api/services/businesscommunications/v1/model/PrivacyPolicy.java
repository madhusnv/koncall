package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class PrivacyPolicy extends GenericJson {

    @Key
    private String url;

    public String getUrl() {
        return this.url;
    }

    public PrivacyPolicy setUrl(String str) {
        this.url = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PrivacyPolicy set(String str, Object obj) {
        return (PrivacyPolicy) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PrivacyPolicy clone() {
        return (PrivacyPolicy) super.clone();
    }
}
