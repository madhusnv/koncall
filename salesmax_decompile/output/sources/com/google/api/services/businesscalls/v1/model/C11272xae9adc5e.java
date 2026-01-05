package com.google.api.services.businesscalls.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* renamed from: com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1CheckVcallDeviceReachableRequest */
/* loaded from: classes3.dex */
public final class C11272xae9adc5e extends GenericJson {

    @Key
    private String deviceNumber;

    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    public C11272xae9adc5e setDeviceNumber(String str) {
        this.deviceNumber = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public C11272xae9adc5e set(String str, Object obj) {
        return (C11272xae9adc5e) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public C11272xae9adc5e clone() {
        return (C11272xae9adc5e) super.clone();
    }
}
