package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class BusinessMessagesCapability extends GenericJson {

    @Key
    private String webhookUrl;

    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    public BusinessMessagesCapability setWebhookUrl(String str) {
        this.webhookUrl = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public BusinessMessagesCapability set(String str, Object obj) {
        return (BusinessMessagesCapability) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BusinessMessagesCapability clone() {
        return (BusinessMessagesCapability) super.clone();
    }
}
