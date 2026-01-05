package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthNextUpdateAttributeStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthUpdateAttributeStep updateAttributeStep;

    public AuthNextUpdateAttributeStep(AuthUpdateAttributeStep authUpdateAttributeStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        Objects.requireNonNull(authUpdateAttributeStep);
        this.updateAttributeStep = authUpdateAttributeStep;
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
        if (obj == null || AuthNextUpdateAttributeStep.class != obj.getClass()) {
            return false;
        }
        AuthNextUpdateAttributeStep authNextUpdateAttributeStep = (AuthNextUpdateAttributeStep) obj;
        return s6c.m47909a(getUpdateAttributeStep(), authNextUpdateAttributeStep.getUpdateAttributeStep()) && s6c.m47909a(getAdditionalInfo(), authNextUpdateAttributeStep.getAdditionalInfo()) && s6c.m47909a(getCodeDeliveryDetails(), authNextUpdateAttributeStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthUpdateAttributeStep getUpdateAttributeStep() {
        return this.updateAttributeStep;
    }

    public int hashCode() {
        return s6c.m47910b(getUpdateAttributeStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextUpdateAttributeStep{updateAttributeStep=" + getUpdateAttributeStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
