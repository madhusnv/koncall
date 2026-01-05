package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthResetPasswordResult {
    private final boolean isPasswordReset;
    private final AuthNextResetPasswordStep nextStep;

    public AuthResetPasswordResult(boolean z6, AuthNextResetPasswordStep authNextResetPasswordStep) {
        this.isPasswordReset = z6;
        Objects.requireNonNull(authNextResetPasswordStep);
        this.nextStep = authNextResetPasswordStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthResetPasswordResult.class == obj.getClass()) {
            AuthResetPasswordResult authResetPasswordResult = (AuthResetPasswordResult) obj;
            if (Boolean.valueOf(isPasswordReset()).equals(Boolean.valueOf(authResetPasswordResult.isPasswordReset())) && Objects.equals(getNextStep(), authResetPasswordResult.getNextStep())) {
                return true;
            }
        }
        return false;
    }

    public AuthNextResetPasswordStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isPasswordReset()), getNextStep());
    }

    public boolean isPasswordReset() {
        return this.isPasswordReset;
    }

    public String toString() {
        return "AuthResetPasswordResult{isPasswordReset=" + isPasswordReset() + ", nextStep=" + getNextStep() + '}';
    }
}
