package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class LocationLaunch extends GenericJson {

    @Key
    private String launchState;

    @Key
    private String name;

    public String getLaunchState() {
        return this.launchState;
    }

    public String getName() {
        return this.name;
    }

    public LocationLaunch setLaunchState(String str) {
        this.launchState = str;
        return this;
    }

    public LocationLaunch setName(String str) {
        this.name = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LocationLaunch set(String str, Object obj) {
        return (LocationLaunch) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LocationLaunch clone() {
        return (LocationLaunch) super.clone();
    }
}
