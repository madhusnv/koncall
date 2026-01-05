package com.amplifyframework.auth;

import a2.AbstractC0030c;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && AuthUserAttribute.class == obj.getClass()) {
            AuthUserAttribute authUserAttribute = (AuthUserAttribute) obj;
            if (Objects.equals(getKey(), authUserAttribute.getKey()) && Objects.equals(getValue(), authUserAttribute.getValue())) {
                return true;
            }
        }
        return false;
    }

    public AuthUserAttributeKey getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthUserAttribute {key=");
        sb2.append(this.key);
        sb2.append(", value=");
        return AbstractC0030c.m123n(sb2, this.value, '}');
    }
}
