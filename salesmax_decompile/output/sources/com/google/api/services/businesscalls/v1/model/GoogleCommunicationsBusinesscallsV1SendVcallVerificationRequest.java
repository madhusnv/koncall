package com.google.api.services.businesscalls.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest extends GenericJson {

    @Key
    private String brandNumber;

    @Key
    private String callReason;

    @Key
    private String deviceNumber;

    @Key
    private String proxyNumber;

    @Key
    private GoogleCommunicationsBusinesscallsV1ShortCode shortCode;

    public String getBrandNumber() {
        return this.brandNumber;
    }

    public String getCallReason() {
        return this.callReason;
    }

    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    public String getProxyNumber() {
        return this.proxyNumber;
    }

    public GoogleCommunicationsBusinesscallsV1ShortCode getShortCode() {
        return this.shortCode;
    }

    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest setBrandNumber(String str) {
        this.brandNumber = str;
        return this;
    }

    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest setCallReason(String str) {
        this.callReason = str;
        return this;
    }

    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest setDeviceNumber(String str) {
        this.deviceNumber = str;
        return this;
    }

    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest setProxyNumber(String str) {
        this.proxyNumber = str;
        return this;
    }

    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest setShortCode(GoogleCommunicationsBusinesscallsV1ShortCode googleCommunicationsBusinesscallsV1ShortCode) {
        this.shortCode = googleCommunicationsBusinesscallsV1ShortCode;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest set(String str, Object obj) {
        return (GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest clone() {
        return (GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest) super.clone();
    }
}
