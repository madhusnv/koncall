package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.CustomSignInActions;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInCustomCognitoActions implements CustomSignInActions {
    public static final SignInCustomCognitoActions INSTANCE = new SignInCustomCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInCustomCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CustomSignInActions
    public Action initiateCustomSignInAuthAction(CustomSignInEvent.EventType.InitiateCustomSignIn event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1116xc349ee6d("InitCustomAuth", event);
    }
}
