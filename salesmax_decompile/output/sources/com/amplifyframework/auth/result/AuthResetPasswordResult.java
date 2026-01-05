package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthResetPasswordResult {
    private final boolean isPasswordReset;
    private final AuthNextResetPasswordStep nextStep;

    public AuthResetPasswordResult(boolean z, AuthNextResetPasswordStep authNextResetPasswordStep) {
        this.isPasswordReset = z;
        Objects.requireNonNull(authNextResetPasswordStep);
        this.nextStep = authNextResetPasswordStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthResetPasswordResult.class != obj.getClass()) {
            return false;
        }
        AuthResetPasswordResult authResetPasswordResult = (AuthResetPasswordResult) obj;
        return s6c.m47909a(Boolean.valueOf(isPasswordReset()), Boolean.valueOf(authResetPasswordResult.isPasswordReset())) && s6c.m47909a(getNextStep(), authResetPasswordResult.getNextStep());
    }

    public AuthNextResetPasswordStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isPasswordReset()), getNextStep());
    }

    public boolean isPasswordReset() {
        return this.isPasswordReset;
    }

    public String toString() {
        return "AuthResetPasswordResult{isPasswordReset=" + isPasswordReset() + ", nextStep=" + getNextStep() + '}';
    }
}
