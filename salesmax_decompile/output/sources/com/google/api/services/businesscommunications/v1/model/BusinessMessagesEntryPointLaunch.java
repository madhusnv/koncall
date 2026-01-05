package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class BusinessMessagesEntryPointLaunch extends GenericJson {

    @Key
    private String entryPoint;

    @Key
    private String launchState;

    public String getEntryPoint() {
        return this.entryPoint;
    }

    public String getLaunchState() {
        return this.launchState;
    }

    public BusinessMessagesEntryPointLaunch setEntryPoint(String str) {
        this.entryPoint = str;
        return this;
    }

    public BusinessMessagesEntryPointLaunch setLaunchState(String str) {
        this.launchState = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public BusinessMessagesEntryPointLaunch set(String str, Object obj) {
        return (BusinessMessagesEntryPointLaunch) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BusinessMessagesEntryPointLaunch clone() {
        return (BusinessMessagesEntryPointLaunch) super.clone();
    }
}
