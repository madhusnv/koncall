package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class LocationVerification extends GenericJson {

    @Key
    private String name;

    @Key
    private String verificationState;

    public String getName() {
        return this.name;
    }

    public String getVerificationState() {
        return this.verificationState;
    }

    public LocationVerification setName(String str) {
        this.name = str;
        return this;
    }

    public LocationVerification setVerificationState(String str) {
        this.verificationState = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LocationVerification set(String str, Object obj) {
        return (LocationVerification) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LocationVerification clone() {
        return (LocationVerification) super.clone();
    }
}
