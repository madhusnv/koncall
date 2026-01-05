package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001o.s6c;

/* loaded from: classes5.dex */
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
        if (obj == null || AuthNextSignInStep.class != obj.getClass()) {
            return false;
        }
        AuthNextSignInStep authNextSignInStep = (AuthNextSignInStep) obj;
        return s6c.m47909a(getSignInStep(), authNextSignInStep.getSignInStep()) && s6c.m47909a(getAdditionalInfo(), authNextSignInStep.getAdditionalInfo()) && s6c.m47909a(getCodeDeliveryDetails(), authNextSignInStep.getCodeDeliveryDetails()) && s6c.m47909a(getTotpSetupDetails(), authNextSignInStep.getTotpSetupDetails()) && s6c.m47909a(getAllowedMFATypes(), authNextSignInStep.getAllowedMFATypes()) && s6c.m47909a(getAvailableFactors(), authNextSignInStep.getAvailableFactors());
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
        return s6c.m47910b(getSignInStep(), getAdditionalInfo(), getCodeDeliveryDetails(), getTotpSetupDetails(), getAllowedMFATypes(), getAvailableFactors());
    }

    public String toString() {
        return "AuthNextSignInStep{signInStep=" + getSignInStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + ", totpSetupDetails=" + getTotpSetupDetails() + ", allowedMFATypes=" + getAllowedMFATypes() + ", availableFactors=" + getAvailableFactors() + '}';
    }
}
