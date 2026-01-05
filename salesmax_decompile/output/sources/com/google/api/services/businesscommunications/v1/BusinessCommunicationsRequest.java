package com.google.api.services.businesscommunications.v1;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public abstract class BusinessCommunicationsRequest<T> extends AbstractGoogleJsonClientRequest<T> {

    @Key("$.xgafv")
    private String $Xgafv;

    @Key("access_token")
    private String accessToken;

    @Key
    private String alt;

    @Key
    private String callback;

    @Key
    private String fields;

    @Key
    private String key;

    @Key("oauth_token")
    private String oauthToken;

    @Key
    private Boolean prettyPrint;

    @Key
    private String quotaUser;

    @Key("upload_protocol")
    private String uploadProtocol;

    @Key
    private String uploadType;

    public BusinessCommunicationsRequest(BusinessCommunications businessCommunications, String str, String str2, Object obj, Class<T> cls) {
        super(businessCommunications, str, str2, obj, cls);
    }

    public String get$Xgafv() {
        return this.$Xgafv;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getCallback() {
        return this.callback;
    }

    public String getFields() {
        return this.fields;
    }

    public String getKey() {
        return this.key;
    }

    public String getOauthToken() {
        return this.oauthToken;
    }

    public Boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public String getQuotaUser() {
        return this.quotaUser;
    }

    public String getUploadProtocol() {
        return this.uploadProtocol;
    }

    public String getUploadType() {
        return this.uploadType;
    }

    /* renamed from: set$Xgafv */
    public BusinessCommunicationsRequest<T> set$Xgafv2(String str) {
        this.$Xgafv = str;
        return this;
    }

    /* renamed from: setAccessToken */
    public BusinessCommunicationsRequest<T> setAccessToken2(String str) {
        this.accessToken = str;
        return this;
    }

    /* renamed from: setAlt */
    public BusinessCommunicationsRequest<T> setAlt2(String str) {
        this.alt = str;
        return this;
    }

    /* renamed from: setCallback */
    public BusinessCommunicationsRequest<T> setCallback2(String str) {
        this.callback = str;
        return this;
    }

    /* renamed from: setFields */
    public BusinessCommunicationsRequest<T> setFields2(String str) {
        this.fields = str;
        return this;
    }

    /* renamed from: setKey */
    public BusinessCommunicationsRequest<T> setKey2(String str) {
        this.key = str;
        return this;
    }

    /* renamed from: setOauthToken */
    public BusinessCommunicationsRequest<T> setOauthToken2(String str) {
        this.oauthToken = str;
        return this;
    }

    /* renamed from: setPrettyPrint */
    public BusinessCommunicationsRequest<T> setPrettyPrint2(Boolean bool) {
        this.prettyPrint = bool;
        return this;
    }

    /* renamed from: setQuotaUser */
    public BusinessCommunicationsRequest<T> setQuotaUser2(String str) {
        this.quotaUser = str;
        return this;
    }

    /* renamed from: setUploadProtocol */
    public BusinessCommunicationsRequest<T> setUploadProtocol2(String str) {
        this.uploadProtocol = str;
        return this;
    }

    /* renamed from: setUploadType */
    public BusinessCommunicationsRequest<T> setUploadType2(String str) {
        this.uploadType = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public final BusinessCommunications getAbstractGoogleClient() {
        return (BusinessCommunications) super.getAbstractGoogleClient();
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public BusinessCommunicationsRequest<T> setDisableGZipContent(boolean z) {
        return (BusinessCommunicationsRequest) super.setDisableGZipContent(z);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public BusinessCommunicationsRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        return (BusinessCommunicationsRequest) super.setRequestHeaders(httpHeaders);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
    public BusinessCommunicationsRequest<T> set(String str, Object obj) {
        return (BusinessCommunicationsRequest) super.set(str, obj);
    }
}
