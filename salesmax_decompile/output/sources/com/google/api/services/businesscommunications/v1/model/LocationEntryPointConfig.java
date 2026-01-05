package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class LocationEntryPointConfig extends GenericJson {

    @Key
    private String allowedEntryPoint;

    public String getAllowedEntryPoint() {
        return this.allowedEntryPoint;
    }

    public LocationEntryPointConfig setAllowedEntryPoint(String str) {
        this.allowedEntryPoint = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LocationEntryPointConfig set(String str, Object obj) {
        return (LocationEntryPointConfig) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LocationEntryPointConfig clone() {
        return (LocationEntryPointConfig) super.clone();
    }
}
