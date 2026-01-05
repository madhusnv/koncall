package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && AuthNextSignUpStep.class == obj.getClass()) {
            AuthNextSignUpStep authNextSignUpStep = (AuthNextSignUpStep) obj;
            if (Objects.equals(getSignUpStep(), authNextSignUpStep.getSignUpStep()) && Objects.equals(getAdditionalInfo(), authNextSignUpStep.getAdditionalInfo()) && Objects.equals(getCodeDeliveryDetails(), authNextSignUpStep.getCodeDeliveryDetails())) {
                return true;
            }
        }
        return false;
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
        return Objects.hash(getSignUpStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextSignUpStep{signUpStep=" + getSignUpStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
