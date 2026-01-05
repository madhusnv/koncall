package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class VerifiedSmsCapability extends GenericJson {

    @Key
    private String webhookUrl;

    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    public VerifiedSmsCapability setWebhookUrl(String str) {
        this.webhookUrl = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VerifiedSmsCapability set(String str, Object obj) {
        return (VerifiedSmsCapability) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VerifiedSmsCapability clone() {
        return (VerifiedSmsCapability) super.clone();
    }
}
