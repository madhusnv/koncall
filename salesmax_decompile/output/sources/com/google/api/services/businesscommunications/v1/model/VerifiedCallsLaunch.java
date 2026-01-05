package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class VerifiedCallsLaunch extends GenericJson {

    @Key
    private String launchState;

    public String getLaunchState() {
        return this.launchState;
    }

    public VerifiedCallsLaunch setLaunchState(String str) {
        this.launchState = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VerifiedCallsLaunch set(String str, Object obj) {
        return (VerifiedCallsLaunch) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VerifiedCallsLaunch clone() {
        return (VerifiedCallsLaunch) super.clone();
    }
}
