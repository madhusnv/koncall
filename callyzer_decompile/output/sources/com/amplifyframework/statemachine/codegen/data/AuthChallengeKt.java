package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import eb.h0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.sd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthChallengeKt {
    public static final h0 getChallengeNameType(AuthChallenge authChallenge) {
        AbstractC4154l.m8923f(authChallenge, "<this>");
        int i10 = h0.f9323a;
        return sd.m10912b(authChallenge.getChallengeName());
    }

    public static final String getParameter(AuthChallenge authChallenge, ChallengeParameter parameter) {
        AbstractC4154l.m8923f(authChallenge, "<this>");
        AbstractC4154l.m8923f(parameter, "parameter");
        Map<String, String> parameters = authChallenge.getParameters();
        if (parameters != null) {
            return parameters.get(parameter.getKey());
        }
        return null;
    }

    public static final Map<String, String> maskSensitiveChallengeParameters(Map<String, String> map) {
        AbstractC4154l.m8923f(map, "<this>");
        return MaskUtilKt.mask(map, ChallengeParameter.CodeDeliveryDestination.getKey(), ChallengeParameter.CredentialRequestOptions.getKey());
    }
}
