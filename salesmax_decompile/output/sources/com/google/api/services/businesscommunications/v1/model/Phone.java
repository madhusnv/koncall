package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Phone extends GenericJson {

    @Key
    private String number;

    public String getNumber() {
        return this.number;
    }

    public Phone setNumber(String str) {
        this.number = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Phone set(String str, Object obj) {
        return (Phone) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Phone clone() {
        return (Phone) super.clone();
    }
}
