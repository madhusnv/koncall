package com.amplifyframework.auth.result.step;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && AuthNextUpdateAttributeStep.class == obj.getClass()) {
            AuthNextUpdateAttributeStep authNextUpdateAttributeStep = (AuthNextUpdateAttributeStep) obj;
            if (Objects.equals(getUpdateAttributeStep(), authNextUpdateAttributeStep.getUpdateAttributeStep()) && Objects.equals(getAdditionalInfo(), authNextUpdateAttributeStep.getAdditionalInfo()) && Objects.equals(getCodeDeliveryDetails(), authNextUpdateAttributeStep.getCodeDeliveryDetails())) {
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

    public AuthUpdateAttributeStep getUpdateAttributeStep() {
        return this.updateAttributeStep;
    }

    public int hashCode() {
        return Objects.hash(getUpdateAttributeStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextUpdateAttributeStep{updateAttributeStep=" + getUpdateAttributeStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
