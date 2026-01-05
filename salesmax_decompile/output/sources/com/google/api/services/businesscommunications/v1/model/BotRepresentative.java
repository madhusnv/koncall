package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class BotRepresentative extends GenericJson {

    @Key
    private MessagingAvailability botMessagingAvailability;

    public MessagingAvailability getBotMessagingAvailability() {
        return this.botMessagingAvailability;
    }

    public BotRepresentative setBotMessagingAvailability(MessagingAvailability messagingAvailability) {
        this.botMessagingAvailability = messagingAvailability;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public BotRepresentative set(String str, Object obj) {
        return (BotRepresentative) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BotRepresentative clone() {
        return (BotRepresentative) super.clone();
    }
}
