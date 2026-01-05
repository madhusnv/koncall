package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthNextResetPasswordStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthResetPasswordStep resetPasswordStep;

    public AuthNextResetPasswordStep(AuthResetPasswordStep authResetPasswordStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        Objects.requireNonNull(authResetPasswordStep);
        this.resetPasswordStep = authResetPasswordStep;
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
        if (obj != null && AuthNextResetPasswordStep.class == obj.getClass()) {
            AuthNextResetPasswordStep authNextResetPasswordStep = (AuthNextResetPasswordStep) obj;
            if (Objects.equals(getResetPasswordStep(), authNextResetPasswordStep.getResetPasswordStep()) && Objects.equals(getAdditionalInfo(), authNextResetPasswordStep.getAdditionalInfo()) && Objects.equals(getCodeDeliveryDetails(), authNextResetPasswordStep.getCodeDeliveryDetails())) {
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

    public AuthResetPasswordStep getResetPasswordStep() {
        return this.resetPasswordStep;
    }

    public int hashCode() {
        return Objects.hash(getResetPasswordStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextResetPasswordStep{resetPasswordStep=" + getResetPasswordStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
