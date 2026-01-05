package com.amplifyframework.auth;

import p001o.s6c;
import p001o.sq8;

/* loaded from: classes5.dex */
public class AuthSession {
    private final boolean isSignedIn;

    public AuthSession(boolean z) {
        this.isSignedIn = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type com.amplifyframework.auth.AuthSession");
        return isSignedIn() == ((AuthSession) obj).isSignedIn();
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isSignedIn()));
    }

    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public String toString() {
        return "AuthSession{isSignedIn=" + isSignedIn() + "}";
    }
}
