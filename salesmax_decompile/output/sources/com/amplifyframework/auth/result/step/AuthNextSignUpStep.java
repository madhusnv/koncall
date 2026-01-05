package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthNextSignUpStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthSignUpStep signUpStep;

    public AuthNextSignUpStep(AuthSignUpStep authSignUpStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        Objects.requireNonNull(authSignUpStep);
        this.signUpStep = authSignUpStep;
        HashMap map2 = new HashMap();
        this.additionalInfo = map2;
        Objects.requireNonNull(map);
        map2.putAll(map);
        this.codeDeliveryDetails = authCodeDeliveryDetails;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthNextSignUpStep.class != obj.getClass()) {
            return false;
        }
        AuthNextSignUpStep authNextSignUpStep = (AuthNextSignUpStep) obj;
        return s6c.m47909a(getSignUpStep(), authNextSignUpStep.getSignUpStep()) && s6c.m47909a(getAdditionalInfo(), authNextSignUpStep.getAdditionalInfo()) && s6c.m47909a(getCodeDeliveryDetails(), authNextSignUpStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthSignUpStep getSignUpStep() {
        return this.signUpStep;
    }

    public int hashCode() {
        return s6c.m47910b(getSignUpStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextSignUpStep{signUpStep=" + getSignUpStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
