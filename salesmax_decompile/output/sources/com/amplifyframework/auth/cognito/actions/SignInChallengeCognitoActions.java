package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.cognito.helpers.MFAHelperKt;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.List;
import java.util.Map;
import p001o.cg2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignInChallengeCognitoActions implements SignInChallengeActions {
    public static final SignInChallengeCognitoActions INSTANCE = new SignInChallengeCognitoActions();
    private static final String KEY_PREFIX_USER_ATTRIBUTE = "userAttributes.";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInChallengeCognitoActions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getChallengeResponseKey(AuthChallenge authChallenge) {
        cg2 challengeNameType = AuthChallengeKt.getChallengeNameType(authChallenge);
        if (challengeNameType instanceof cg2.C12670o) {
            return "SMS_MFA_CODE";
        }
        if (challengeNameType instanceof cg2.C12661f) {
            return "EMAIL_OTP_CODE";
        }
        if (challengeNameType instanceof cg2.C12671p) {
            return "SMS_OTP_CODE";
        }
        if (challengeNameType instanceof cg2.C12663h) {
            return "NEW_PASSWORD";
        }
        if (challengeNameType instanceof cg2.C12658c ? true : challengeNameType instanceof cg2.C12669n ? true : challengeNameType instanceof cg2.C12668m) {
            return "ANSWER";
        }
        if (challengeNameType instanceof cg2.C12672q) {
            return "SOFTWARE_TOKEN_MFA_CODE";
        }
        if (challengeNameType instanceof cg2.C12662g) {
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
    public Action verifyChallengeAuthAction(String str, Map<String, String> map, List<AuthUserAttribute> list, AuthChallenge authChallenge, SignInMethod signInMethod) {
        sq8.m48649h(str, "answer");
        sq8.m48649h(map, "metadata");
        sq8.m48649h(list, "attributes");
        sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
        sq8.m48649h(signInMethod, "signInMethod");
        Action.Companion companion = Action.Companion;
        return new C10492xf83313cf("VerifySignInChallenge", authChallenge, str, signInMethod, list, map);
    }
}
