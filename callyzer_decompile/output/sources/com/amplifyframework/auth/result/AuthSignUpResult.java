package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthSignUpResult {
    private final boolean isSignUpComplete;
    private final AuthNextSignUpStep nextStep;
    private final String userId;

    public AuthSignUpResult(boolean z6, AuthNextSignUpStep authNextSignUpStep, String str) {
        this.isSignUpComplete = z6;
        Objects.requireNonNull(authNextSignUpStep);
        this.nextStep = authNextSignUpStep;
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthSignUpResult.class == obj.getClass()) {
            AuthSignUpResult authSignUpResult = (AuthSignUpResult) obj;
            if (Boolean.valueOf(isSignUpComplete()).equals(Boolean.valueOf(authSignUpResult.isSignUpComplete())) && Objects.equals(getNextStep(), authSignUpResult.getNextStep()) && Objects.equals(getUserId(), authSignUpResult.getUserId())) {
                return true;
            }
        }
        return false;
    }

    public AuthNextSignUpStep getNextStep() {
        return this.nextStep;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isSignUpComplete()), getNextStep(), getUserId());
    }

    public boolean isSignUpComplete() {
        return this.isSignUpComplete;
    }

    public String toString() {
        return "AuthSignUpResult{isSignUpComplete=" + isSignUpComplete() + ", nextStep=" + getNextStep() + ", userId=" + getUserId() + '}';
    }
}
