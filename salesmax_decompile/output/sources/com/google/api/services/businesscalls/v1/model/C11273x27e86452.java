package com.google.api.services.businesscalls.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* renamed from: com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1CheckVcallDeviceReachableResponse */
/* loaded from: classes3.dex */
public final class C11273x27e86452 extends GenericJson {

    @Key
    private String reachability;

    public String getReachability() {
        return this.reachability;
    }

    public C11273x27e86452 setReachability(String str) {
        this.reachability = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public C11273x27e86452 set(String str, Object obj) {
        return (C11273x27e86452) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public C11273x27e86452 clone() {
        return (C11273x27e86452) super.clone();
    }
}
