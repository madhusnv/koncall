package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class TestUrl extends GenericJson {

    @Key
    private String surface;

    @Key
    private String url;

    public String getSurface() {
        return this.surface;
    }

    public String getUrl() {
        return this.url;
    }

    public TestUrl setSurface(String str) {
        this.surface = str;
        return this;
    }

    public TestUrl setUrl(String str) {
        this.url = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TestUrl set(String str, Object obj) {
        return (TestUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TestUrl clone() {
        return (TestUrl) super.clone();
    }
}
