package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Sender extends GenericJson {

    @Key
    private String countryCode;

    @Key
    private String senderId;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public Sender setCountryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public Sender setSenderId(String str) {
        this.senderId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Sender set(String str, Object obj) {
        return (Sender) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Sender clone() {
        return (Sender) super.clone();
    }
}
