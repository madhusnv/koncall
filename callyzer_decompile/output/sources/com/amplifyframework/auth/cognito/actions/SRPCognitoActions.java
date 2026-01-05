package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SRPActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import eb.C2002z;
import eb.h0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
    public final SRPEvent parseResponseChallenge(h0 h0Var, Map<String, String> map, String str, DeviceMetadata.Metadata metadata, Map<String, String> map2) throws ServiceException, UnknownException {
        String deviceKey;
        if (!AbstractC4154l.m8918a(h0Var, C2002z.f9524b)) {
            throw new UnknownException(null, new Exception("Challenge type not supported for this flow."), 1, null);
        }
        if (map == null) {
            throw new ServiceException("Auth challenge parameters are empty.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        }
        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null) {
            map = AbstractC6674x.m12781i(map, new C6361k(KEY_DEVICE_KEY, deviceKey));
        }
        return new SRPEvent(new SRPEvent.EventType.RespondPasswordVerifier(map, map2, str), null, 2, null);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPAuthAction(SRPEvent.EventType.InitiateSRP event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1("InitSRPAuth", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPWithCustomAuthAction(SRPEvent.EventType.InitiateSRPWithCustom event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1097xf02c4164("InitSRPCustomAuth", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action verifyPasswordSRPAction(Map<String, String> challengeParameters, Map<String, String> metadata, String str, SignInMethod signInMethod) {
        AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
        AbstractC4154l.m8923f(metadata, "metadata");
        AbstractC4154l.m8923f(signInMethod, "signInMethod");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1("VerifyPasswordSRP", challengeParameters, signInMethod, metadata, str);
    }
}
