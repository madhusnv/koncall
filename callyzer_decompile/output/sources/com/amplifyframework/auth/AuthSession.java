package com.amplifyframework.auth;

import a2.AbstractC0030c;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AuthSession {
    private final boolean isSignedIn;

    public AuthSession(boolean z6) {
        this.isSignedIn = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type com.amplifyframework.auth.AuthSession");
        return isSignedIn() == ((AuthSession) obj).isSignedIn();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isSignedIn()));
    }

    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public String toString() {
        return AbstractC0030c.m122m("AuthSession{isSignedIn=", "}", isSignedIn());
    }
}
