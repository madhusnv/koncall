package com.amplifyframework.auth;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthUserAttribute {
    private AuthUserAttributeKey key;
    private String value;

    public AuthUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str) {
        this.key = authUserAttributeKey;
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUserAttribute.class != obj.getClass()) {
            return false;
        }
        AuthUserAttribute authUserAttribute = (AuthUserAttribute) obj;
        return s6c.m47909a(getKey(), authUserAttribute.getKey()) && s6c.m47909a(getValue(), authUserAttribute.getValue());
    }

    public AuthUserAttributeKey getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return s6c.m47910b(getKey(), getValue());
    }

    public String toString() {
        return "AuthUserAttribute {key=" + this.key + ", value=" + this.value + '}';
    }
}
