package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class OfflineMessage extends GenericJson {

    @Key
    private String text;

    public String getText() {
        return this.text;
    }

    public OfflineMessage setText(String str) {
        this.text = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public OfflineMessage set(String str, Object obj) {
        return (OfflineMessage) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public OfflineMessage clone() {
        return (OfflineMessage) super.clone();
    }
}
