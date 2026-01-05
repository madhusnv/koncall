package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class HumanRepresentative extends GenericJson {

    @Key
    private MessagingAvailability humanMessagingAvailability;

    public MessagingAvailability getHumanMessagingAvailability() {
        return this.humanMessagingAvailability;
    }

    public HumanRepresentative setHumanMessagingAvailability(MessagingAvailability messagingAvailability) {
        this.humanMessagingAvailability = messagingAvailability;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public HumanRepresentative set(String str, Object obj) {
        return (HumanRepresentative) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public HumanRepresentative clone() {
        return (HumanRepresentative) super.clone();
    }
}
