package com.google.api.client.json.webtoken;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class JsonWebToken {
    private final Header header;
    private final Payload payload;

    public JsonWebToken(Header header, Payload payload) {
        this.header = (Header) Preconditions.checkNotNull(header);
        this.payload = (Payload) Preconditions.checkNotNull(payload);
    }

    public Header getHeader() {
        return this.header;
    }

    public Payload getPayload() {
        return this.payload;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("header", this.header).add("payload", this.payload).toString();
    }

    public static class Header extends GenericJson {

        @Key("cty")
        private String contentType;

        /* renamed from: type, reason: collision with root package name */
        @Key(ClientData.KEY_TYPE)
        private String f58143type;

        public final String getContentType() {
            return this.contentType;
        }

        public final String getType() {
            return this.f58143type;
        }

        public Header setContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Header setType(String str) {
            this.f58143type = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Header clone() {
            return (Header) super.clone();
        }
    }

    public static class Payload extends GenericJson {

        @Key("aud")
        private Object audience;

        @Key("exp")
        private Long expirationTimeSeconds;

        @Key("iat")
        private Long issuedAtTimeSeconds;

        @Key("iss")
        private String issuer;

        @Key("jti")
        private String jwtId;

        @Key("nbf")
        private Long notBeforeTimeSeconds;

        @Key("sub")
        private String subject;

        /* renamed from: type, reason: collision with root package name */
        @Key(ClientData.KEY_TYPE)
        private String f58144type;

        public final Object getAudience() {
            return this.audience;
        }

        public final List<String> getAudienceAsList() {
            Object obj = this.audience;
            return obj == null ? Collections.emptyList() : obj instanceof String ? Collections.singletonList((String) obj) : (List) obj;
        }

        public final Long getExpirationTimeSeconds() {
            return this.expirationTimeSeconds;
        }

        public final Long getIssuedAtTimeSeconds() {
            return this.issuedAtTimeSeconds;
        }

        public final String getIssuer() {
            return this.issuer;
        }

        public final String getJwtId() {
            return this.jwtId;
        }

        public final Long getNotBeforeTimeSeconds() {
            return this.notBeforeTimeSeconds;
        }

        public final String getSubject() {
            return this.subject;
        }

        public final String getType() {
            return this.f58144type;
        }

        public Payload setAudience(Object obj) {
            this.audience = obj;
            return this;
        }

        public Payload setExpirationTimeSeconds(Long l) {
            this.expirationTimeSeconds = l;
            return this;
        }

        public Payload setIssuedAtTimeSeconds(Long l) {
            this.issuedAtTimeSeconds = l;
            return this;
        }

        public Payload setIssuer(String str) {
            this.issuer = str;
            return this;
        }

        public Payload setJwtId(String str) {
            this.jwtId = str;
            return this;
        }

        public Payload setNotBeforeTimeSeconds(Long l) {
            this.notBeforeTimeSeconds = l;
            return this;
        }

        public Payload setSubject(String str) {
            this.subject = str;
            return this;
        }

        public Payload setType(String str) {
            this.f58144type = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Payload clone() {
            return (Payload) super.clone();
        }
    }
}
