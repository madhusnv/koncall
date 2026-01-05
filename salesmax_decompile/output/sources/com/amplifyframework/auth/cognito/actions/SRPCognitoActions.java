package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SRPActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;
import p001o.cg2;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
public final class SRPCognitoActions implements SRPActions {
    public static final SRPCognitoActions INSTANCE = new SRPCognitoActions();
    private static final String KEY_ANSWER = "ANSWER";
    private static final String KEY_CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_PASSWORD_CLAIM_SECRET_BLOCK = "PASSWORD_CLAIM_SECRET_BLOCK";
    private static final String KEY_PASSWORD_CLAIM_SIGNATURE = "PASSWORD_CLAIM_SIGNATURE";
    private static final String KEY_PASSWORD_SRP = "PASSWORD_SRP";
    private static final String KEY_PREFERRED_CHALLENGE = "PREFERRED_CHALLENGE";
    private static final String KEY_SALT = "SALT";
    private static final String KEY_SECRET_BLOCK = "SECRET_BLOCK";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_SRP_A = "SRP_A";
    private static final String KEY_SRP_B = "SRP_B";
    private static final String KEY_TIMESTAMP = "TIMESTAMP";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";
    private static final String KEY_USER_ID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String VALUE_SRP_A = "SRP_A";

    private SRPCognitoActions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SRPEvent parseResponseChallenge(cg2 cg2Var, Map<String, String> map, String str, DeviceMetadata.Metadata metadata, Map<String, String> map2) throws ServiceException, UnknownException {
        String deviceKey;
        Map<String, String> mapM32688o;
        if (!sq8.m48644c(cg2Var, cg2.C12666k.f18072c)) {
            throw new UnknownException(null, new Exception("Challenge type not supported for this flow."), 1, null);
        }
        if (map == null) {
            throw new ServiceException("Auth challenge parameters are empty.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        }
        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null && (mapM32688o = isa.m32688o(map, vyh.m53620a(KEY_DEVICE_KEY, deviceKey))) != null) {
            map = mapM32688o;
        }
        return new SRPEvent(new SRPEvent.EventType.RespondPasswordVerifier(map, map2, str), null, 2, null);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPAuthAction(SRPEvent.EventType.InitiateSRP initiateSRP) {
        sq8.m48649h(initiateSRP, "event");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1("InitSRPAuth", initiateSRP);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPWithCustomAuthAction(SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom) {
        sq8.m48649h(initiateSRPWithCustom, "event");
        Action.Companion companion = Action.Companion;
        return new C10481xf02c4164("InitSRPCustomAuth", initiateSRPWithCustom);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action verifyPasswordSRPAction(Map<String, String> map, Map<String, String> map2, String str, SignInMethod signInMethod) {
        sq8.m48649h(map, "challengeParameters");
        sq8.m48649h(map2, "metadata");
        sq8.m48649h(signInMethod, "signInMethod");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1("VerifyPasswordSRP", map, signInMethod, map2, str);
    }
}
