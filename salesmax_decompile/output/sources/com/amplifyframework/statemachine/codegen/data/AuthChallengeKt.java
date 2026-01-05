package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import java.util.Map;
import p001o.cg2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthChallengeKt {
    public static final cg2 getChallengeNameType(AuthChallenge authChallenge) {
        sq8.m48649h(authChallenge, "<this>");
        return cg2.f18052a.m21139a(authChallenge.getChallengeName());
    }

    public static final String getParameter(AuthChallenge authChallenge, ChallengeParameter challengeParameter) {
        sq8.m48649h(authChallenge, "<this>");
        sq8.m48649h(challengeParameter, "parameter");
        Map<String, String> parameters = authChallenge.getParameters();
        if (parameters != null) {
            return parameters.get(challengeParameter.getKey());
        }
        return null;
    }

    public static final Map<String, String> maskSensitiveChallengeParameters(Map<String, String> map) {
        sq8.m48649h(map, "<this>");
        return MaskUtilKt.mask(map, ChallengeParameter.CodeDeliveryDestination.getKey(), ChallengeParameter.CredentialRequestOptions.getKey());
    }
}
