package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthNextSignInStep {
    private final Map<String, String> additionalInfo;
    private final Set<MFAType> allowedMFATypes;
    private final Set<AuthFactorType> availableFactors;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthSignInStep signInStep;
    private final TOTPSetupDetails totpSetupDetails;

    public AuthNextSignInStep(AuthSignInStep authSignInStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails, TOTPSetupDetails tOTPSetupDetails, Set<MFAType> set, Set<AuthFactorType> set2) {
        Objects.requireNonNull(authSignInStep);
        this.signInStep = authSignInStep;
        HashMap map2 = new HashMap();
        this.additionalInfo = map2;
        Objects.requireNonNull(map);
        map2.putAll(map);
        this.codeDeliveryDetails = authCodeDeliveryDetails;
        this.totpSetupDetails = tOTPSetupDetails;
        this.allowedMFATypes = set;
        this.availableFactors = set2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthNextSignInStep.class == obj.getClass()) {
            AuthNextSignInStep authNextSignInStep = (AuthNextSignInStep) obj;
            if (Objects.equals(getSignInStep(), authNextSignInStep.getSignInStep()) && Objects.equals(getAdditionalInfo(), authNextSignInStep.getAdditionalInfo()) && Objects.equals(getCodeDeliveryDetails(), authNextSignInStep.getCodeDeliveryDetails()) && Objects.equals(getTotpSetupDetails(), authNextSignInStep.getTotpSetupDetails()) && Objects.equals(getAllowedMFATypes(), authNextSignInStep.getAllowedMFATypes()) && Objects.equals(getAvailableFactors(), authNextSignInStep.getAvailableFactors())) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public Set<MFAType> getAllowedMFATypes() {
        return this.allowedMFATypes;
    }

    public Set<AuthFactorType> getAvailableFactors() {
        return this.availableFactors;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthSignInStep getSignInStep() {
        return this.signInStep;
    }

    public TOTPSetupDetails getTotpSetupDetails() {
        return this.totpSetupDetails;
    }

    public int hashCode() {
        return Objects.hash(getSignInStep(), getAdditionalInfo(), getCodeDeliveryDetails(), getTotpSetupDetails(), getAllowedMFATypes(), getAvailableFactors());
    }

    public String toString() {
        return "AuthNextSignInStep{signInStep=" + getSignInStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + ", totpSetupDetails=" + getTotpSetupDetails() + ", allowedMFATypes=" + getAllowedMFATypes() + ", availableFactors=" + getAvailableFactors() + '}';
    }
}
