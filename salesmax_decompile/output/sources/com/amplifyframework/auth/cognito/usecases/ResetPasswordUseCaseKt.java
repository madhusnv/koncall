package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import p001o.ze3;

/* loaded from: classes5.dex */
public final class ResetPasswordUseCaseKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AuthCodeDeliveryDetails toAuthCodeDeliveryDetails(ze3 ze3Var) {
        if (ze3Var == 0) {
            return (AuthCodeDeliveryDetails) ze3Var;
        }
        if (ze3Var.m59325c() != null) {
            return new AuthCodeDeliveryDetails(String.valueOf(ze3Var.m59325c()), AuthCodeDeliveryDetails.DeliveryMedium.fromString(String.valueOf(ze3Var.m59324b())), ze3Var.m59323a());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
