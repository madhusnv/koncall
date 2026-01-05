package com.google.api.services.businesscalls.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class GoogleCommunicationsBusinesscallsV1ShortCode extends GenericJson {

    @Key
    private String countryCode;

    @Key
    private String shortNumber;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getShortNumber() {
        return this.shortNumber;
    }

    public GoogleCommunicationsBusinesscallsV1ShortCode setCountryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public GoogleCommunicationsBusinesscallsV1ShortCode setShortNumber(String str) {
        this.shortNumber = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleCommunicationsBusinesscallsV1ShortCode set(String str, Object obj) {
        return (GoogleCommunicationsBusinesscallsV1ShortCode) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleCommunicationsBusinesscallsV1ShortCode clone() {
        return (GoogleCommunicationsBusinesscallsV1ShortCode) super.clone();
    }
}
