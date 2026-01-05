package com.google.api.services.businesscalls.v1;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public abstract class BusinesscallsRequest<T> extends AbstractGoogleJsonClientRequest<T> {

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

    public BusinesscallsRequest(Businesscalls businesscalls, String str, String str2, Object obj, Class<T> cls) {
        super(businesscalls, str, str2, obj, cls);
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
    public BusinesscallsRequest<T> set$Xgafv2(String str) {
        this.$Xgafv = str;
        return this;
    }

    /* renamed from: setAccessToken */
    public BusinesscallsRequest<T> setAccessToken2(String str) {
        this.accessToken = str;
        return this;
    }

    /* renamed from: setAlt */
    public BusinesscallsRequest<T> setAlt2(String str) {
        this.alt = str;
        return this;
    }

    /* renamed from: setCallback */
    public BusinesscallsRequest<T> setCallback2(String str) {
        this.callback = str;
        return this;
    }

    /* renamed from: setFields */
    public BusinesscallsRequest<T> setFields2(String str) {
        this.fields = str;
        return this;
    }

    /* renamed from: setKey */
    public BusinesscallsRequest<T> setKey2(String str) {
        this.key = str;
        return this;
    }

    /* renamed from: setOauthToken */
    public BusinesscallsRequest<T> setOauthToken2(String str) {
        this.oauthToken = str;
        return this;
    }

    /* renamed from: setPrettyPrint */
    public BusinesscallsRequest<T> setPrettyPrint2(Boolean bool) {
        this.prettyPrint = bool;
        return this;
    }

    /* renamed from: setQuotaUser */
    public BusinesscallsRequest<T> setQuotaUser2(String str) {
        this.quotaUser = str;
        return this;
    }

    /* renamed from: setUploadProtocol */
    public BusinesscallsRequest<T> setUploadProtocol2(String str) {
        this.uploadProtocol = str;
        return this;
    }

    /* renamed from: setUploadType */
    public BusinesscallsRequest<T> setUploadType2(String str) {
        this.uploadType = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public final Businesscalls getAbstractGoogleClient() {
        return (Businesscalls) super.getAbstractGoogleClient();
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public BusinesscallsRequest<T> setDisableGZipContent(boolean z) {
        return (BusinesscallsRequest) super.setDisableGZipContent(z);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public BusinesscallsRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        return (BusinesscallsRequest) super.setRequestHeaders(httpHeaders);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
    public BusinesscallsRequest<T> set(String str, Object obj) {
        return (BusinesscallsRequest) super.set(str, obj);
    }
}
