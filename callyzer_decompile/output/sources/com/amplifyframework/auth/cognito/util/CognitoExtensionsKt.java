package com.amplifyframework.auth.cognito.util;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import eb.g1;
import eb.l0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoExtensionsKt {
    public static final AuthCodeDeliveryDetails toAuthCodeDeliveryDetails(l0 l0Var) {
        String str;
        g1 g1Var;
        if (l0Var == null || (str = l0Var.f9357c) == null) {
            str = "";
        }
        return new AuthCodeDeliveryDetails(str, AuthCodeDeliveryDetails.DeliveryMedium.fromString((l0Var == null || (g1Var = l0Var.f9356b) == null) ? null : g1Var.mo5715a()), l0Var != null ? l0Var.f9355a : null);
    }
}
