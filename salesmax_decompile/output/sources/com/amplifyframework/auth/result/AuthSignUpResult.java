package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthSignUpResult {
    private final boolean isSignUpComplete;
    private final AuthNextSignUpStep nextStep;
    private final String userId;

    public AuthSignUpResult(boolean z, AuthNextSignUpStep authNextSignUpStep, String str) {
        this.isSignUpComplete = z;
        Objects.requireNonNull(authNextSignUpStep);
        this.nextStep = authNextSignUpStep;
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignUpResult.class != obj.getClass()) {
            return false;
        }
        AuthSignUpResult authSignUpResult = (AuthSignUpResult) obj;
        return s6c.m47909a(Boolean.valueOf(isSignUpComplete()), Boolean.valueOf(authSignUpResult.isSignUpComplete())) && s6c.m47909a(getNextStep(), authSignUpResult.getNextStep()) && s6c.m47909a(getUserId(), authSignUpResult.getUserId());
    }

    public AuthNextSignUpStep getNextStep() {
        return this.nextStep;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isSignUpComplete()), getNextStep(), getUserId());
    }

    public boolean isSignUpComplete() {
        return this.isSignUpComplete;
    }

    public String toString() {
        return "AuthSignUpResult{isSignUpComplete=" + isSignUpComplete() + ", nextStep=" + getNextStep() + ", userId=" + getUserId() + '}';
    }
}
