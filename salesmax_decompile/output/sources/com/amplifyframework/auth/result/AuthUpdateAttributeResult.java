package com.amplifyframework.auth.result;

import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthUpdateAttributeResult {
    private final boolean isUpdated;
    private final AuthNextUpdateAttributeStep nextStep;

    public AuthUpdateAttributeResult(boolean z, AuthNextUpdateAttributeStep authNextUpdateAttributeStep) {
        this.isUpdated = z;
        Objects.requireNonNull(authNextUpdateAttributeStep);
        this.nextStep = authNextUpdateAttributeStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUpdateAttributeResult.class != obj.getClass()) {
            return false;
        }
        AuthUpdateAttributeResult authUpdateAttributeResult = (AuthUpdateAttributeResult) obj;
        return s6c.m47909a(Boolean.valueOf(isUpdated()), Boolean.valueOf(authUpdateAttributeResult.isUpdated())) && s6c.m47909a(getNextStep(), authUpdateAttributeResult.getNextStep());
    }

    public AuthNextUpdateAttributeStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isUpdated()), getNextStep());
    }

    public boolean isUpdated() {
        return this.isUpdated;
    }

    public String toString() {
        return "AuthUpdateAttributeResult{isUpdated=" + isUpdated() + ", nextStep=" + getNextStep() + '}';
    }
}
