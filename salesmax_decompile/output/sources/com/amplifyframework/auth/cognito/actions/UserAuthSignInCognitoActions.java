package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.UserAuthSignInActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import p001o.cg2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class UserAuthSignInCognitoActions implements UserAuthSignInActions {
    public static final UserAuthSignInCognitoActions INSTANCE = new UserAuthSignInCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_PREFERRED_CHALLENGE = "PREFERRED_CHALLENGE";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";

    private UserAuthSignInCognitoActions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSupportedChallenge(cg2 cg2Var) {
        return cg2Var != null && ((cg2Var instanceof cg2.C12661f) || (cg2Var instanceof cg2.C12671p) || (cg2Var instanceof cg2.C12673r));
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.UserAuthSignInActions
    public Action initiateUserAuthSignIn(SignInEvent.EventType.InitiateUserAuth initiateUserAuth) {
        sq8.m48649h(initiateUserAuth, "event");
        Action.Companion companion = Action.Companion;
        return new C10508x215eea0f("InitUserAuth", initiateUserAuth);
    }
}
