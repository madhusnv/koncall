package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthUpdateAttributeResult {
    private final boolean isUpdated;
    private final AuthNextUpdateAttributeStep nextStep;

    public AuthUpdateAttributeResult(boolean z6, AuthNextUpdateAttributeStep authNextUpdateAttributeStep) {
        this.isUpdated = z6;
        Objects.requireNonNull(authNextUpdateAttributeStep);
        this.nextStep = authNextUpdateAttributeStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthUpdateAttributeResult.class == obj.getClass()) {
            AuthUpdateAttributeResult authUpdateAttributeResult = (AuthUpdateAttributeResult) obj;
            if (Boolean.valueOf(isUpdated()).equals(Boolean.valueOf(authUpdateAttributeResult.isUpdated())) && Objects.equals(getNextStep(), authUpdateAttributeResult.getNextStep())) {
                return true;
            }
        }
        return false;
    }

    public AuthNextUpdateAttributeStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isUpdated()), getNextStep());
    }

    public boolean isUpdated() {
        return this.isUpdated;
    }

    public String toString() {
        return "AuthUpdateAttributeResult{isUpdated=" + isUpdated() + ", nextStep=" + getNextStep() + '}';
    }
}
