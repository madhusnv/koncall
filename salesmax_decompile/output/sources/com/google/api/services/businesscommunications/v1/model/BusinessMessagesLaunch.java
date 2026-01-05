package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.Map;

/* loaded from: classes3.dex */
public final class BusinessMessagesLaunch extends GenericJson {

    @Key
    private Map<String, BusinessMessagesEntryPointLaunch> launchDetails;

    public Map<String, BusinessMessagesEntryPointLaunch> getLaunchDetails() {
        return this.launchDetails;
    }

    public BusinessMessagesLaunch setLaunchDetails(Map<String, BusinessMessagesEntryPointLaunch> map) {
        this.launchDetails = map;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public BusinessMessagesLaunch set(String str, Object obj) {
        return (BusinessMessagesLaunch) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BusinessMessagesLaunch clone() {
        return (BusinessMessagesLaunch) super.clone();
    }
}
