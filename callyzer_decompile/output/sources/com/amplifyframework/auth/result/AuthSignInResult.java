package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthSignInResult {
    private final boolean isSignedIn;
    private final AuthNextSignInStep nextStep;

    public AuthSignInResult(boolean z6, AuthNextSignInStep authNextSignInStep) {
        this.isSignedIn = z6;
        Objects.requireNonNull(authNextSignInStep);
        this.nextStep = authNextSignInStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthSignInResult.class == obj.getClass()) {
            AuthSignInResult authSignInResult = (AuthSignInResult) obj;
            if (Boolean.valueOf(isSignedIn()).equals(Boolean.valueOf(authSignInResult.isSignedIn())) && Objects.equals(getNextStep(), authSignInResult.getNextStep())) {
                return true;
            }
        }
        return false;
    }

    public AuthNextSignInStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isSignedIn()), getNextStep());
    }

    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public String toString() {
        return "AuthSignInResult{isSignedIn=" + isSignedIn() + ", nextStep=" + getNextStep() + '}';
    }
}
