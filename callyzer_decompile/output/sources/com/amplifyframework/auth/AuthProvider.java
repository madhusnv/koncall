package com.amplifyframework.auth;

import a2.AbstractC0030c;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AuthProvider {
    private static final String AMAZON = "amazon";
    private static final String APPLE = "apple";
    private static final String FACEBOOK = "facebook";
    private static final String GOOGLE = "google";
    private final String providerKey;

    public AuthProvider(String str) {
        this.providerKey = str;
    }

    public static AuthProvider amazon() {
        return new AuthProvider(AMAZON);
    }

    public static AuthProvider apple() {
        return new AuthProvider(APPLE);
    }

    public static AuthProvider custom(String str) {
        return new AuthProvider(str);
    }

    public static AuthProvider facebook() {
        return new AuthProvider(FACEBOOK);
    }

    public static AuthProvider google() {
        return new AuthProvider(GOOGLE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(getProviderKey(), ((AuthProvider) obj).getProviderKey());
    }

    public String getProviderKey() {
        return this.providerKey;
    }

    public int hashCode() {
        return Objects.hash(getProviderKey());
    }

    public String toString() {
        return AbstractC0030c.m123n(new StringBuilder("AuthProvider{providerKey="), this.providerKey, '}');
    }
}
