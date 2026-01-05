package com.amplifyframework.auth;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthUser {
    private String userId;
    private String username;

    public AuthUser(String str, String str2) {
        Objects.requireNonNull(str);
        this.userId = str;
        Objects.requireNonNull(str2);
        this.username = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUser.class != obj.getClass()) {
            return false;
        }
        AuthUser authUser = (AuthUser) obj;
        return s6c.m47909a(getUserId(), authUser.getUserId()) && s6c.m47909a(getUsername(), authUser.getUsername());
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return s6c.m47910b(getUserId(), getUsername());
    }

    public String toString() {
        return "AuthUser{userId='" + this.userId + "', username='" + this.username + "'}";
    }
}
