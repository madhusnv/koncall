package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class MessagingAvailability extends GenericJson {

    @Key
    private List<Hours> hours;

    public List<Hours> getHours() {
        return this.hours;
    }

    public MessagingAvailability setHours(List<Hours> list) {
        this.hours = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MessagingAvailability set(String str, Object obj) {
        return (MessagingAvailability) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MessagingAvailability clone() {
        return (MessagingAvailability) super.clone();
    }
}
