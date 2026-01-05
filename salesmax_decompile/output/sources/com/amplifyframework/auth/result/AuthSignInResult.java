package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthSignInResult {
    private final boolean isSignedIn;
    private final AuthNextSignInStep nextStep;

    public AuthSignInResult(boolean z, AuthNextSignInStep authNextSignInStep) {
        this.isSignedIn = z;
        Objects.requireNonNull(authNextSignInStep);
        this.nextStep = authNextSignInStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignInResult.class != obj.getClass()) {
            return false;
        }
        AuthSignInResult authSignInResult = (AuthSignInResult) obj;
        return s6c.m47909a(Boolean.valueOf(isSignedIn()), Boolean.valueOf(authSignInResult.isSignedIn())) && s6c.m47909a(getNextStep(), authSignInResult.getNextStep());
    }

    public AuthNextSignInStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isSignedIn()), getNextStep());
    }

    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public String toString() {
        return "AuthSignInResult{isSignedIn=" + isSignedIn() + ", nextStep=" + getNextStep() + '}';
    }
}
