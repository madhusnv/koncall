package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.UserAuthSignInActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import eb.C1997u;
import eb.e0;
import eb.g0;
import eb.h0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
    public final boolean isSupportedChallenge(h0 h0Var) {
        if (h0Var != null) {
            return (h0Var instanceof C1997u) || (h0Var instanceof e0) || (h0Var instanceof g0);
        }
        return false;
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.UserAuthSignInActions
    public Action initiateUserAuthSignIn(SignInEvent.EventType.InitiateUserAuth event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1124x215eea0f("InitUserAuth", event);
    }
}
