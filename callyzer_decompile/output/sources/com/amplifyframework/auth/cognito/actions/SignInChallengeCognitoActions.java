package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.cognito.helpers.MFAHelperKt;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import eb.C1994r;
import eb.C1997u;
import eb.C1998v;
import eb.C1999w;
import eb.b0;
import eb.c0;
import eb.d0;
import eb.e0;
import eb.f0;
import eb.h0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInChallengeCognitoActions implements SignInChallengeActions {
    public static final SignInChallengeCognitoActions INSTANCE = new SignInChallengeCognitoActions();
    private static final String KEY_PREFIX_USER_ATTRIBUTE = "userAttributes.";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInChallengeCognitoActions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getChallengeResponseKey(AuthChallenge authChallenge) {
        h0 challengeNameType = AuthChallengeKt.getChallengeNameType(authChallenge);
        if (challengeNameType instanceof d0) {
            return "SMS_MFA_CODE";
        }
        if (challengeNameType instanceof C1997u) {
            return "EMAIL_OTP_CODE";
        }
        if (challengeNameType instanceof e0) {
            return "SMS_OTP_CODE";
        }
        if (challengeNameType instanceof C1999w) {
            return "NEW_PASSWORD";
        }
        if ((challengeNameType instanceof C1994r) || (challengeNameType instanceof c0) || (challengeNameType instanceof b0)) {
            return "ANSWER";
        }
        if (challengeNameType instanceof f0) {
            return "SOFTWARE_TOKEN_MFA_CODE";
        }
        if (challengeNameType instanceof C1998v) {
            if (MFAHelperKt.isMfaSetupSelectionChallenge(authChallenge)) {
                return "MFA_SETUP";
            }
            if (MFAHelperKt.isEmailMfaSetupChallenge(authChallenge)) {
                return "EMAIL";
            }
        }
        return null;
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions
    public Action verifyChallengeAuthAction(String answer, Map<String, String> metadata, List<AuthUserAttribute> attributes, AuthChallenge challenge, SignInMethod signInMethod) {
        AbstractC4154l.m8923f(answer, "answer");
        AbstractC4154l.m8923f(metadata, "metadata");
        AbstractC4154l.m8923f(attributes, "attributes");
        AbstractC4154l.m8923f(challenge, "challenge");
        AbstractC4154l.m8923f(signInMethod, "signInMethod");
        Action.Companion companion = Action.Companion;
        return new C1108xf83313cf("VerifySignInChallenge", challenge, answer, signInMethod, attributes, metadata);
    }
}
