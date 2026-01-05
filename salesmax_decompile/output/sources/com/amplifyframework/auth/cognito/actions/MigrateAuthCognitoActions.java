package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class MigrateAuthCognitoActions implements MigrateAuthActions {
    public static final MigrateAuthCognitoActions INSTANCE = new MigrateAuthCognitoActions();
    private static final String KEY_ANSWER = "ANSWER";
    private static final String KEY_PASSWORD = "PASSWORD";
    private static final String KEY_PREFERRED_CHALLENGE = "PREFERRED_CHALLENGE";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";

    private MigrateAuthCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions
    public Action initiateMigrateAuthAction(SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        sq8.m48649h(initiateMigrateAuth, "event");
        Action.Companion companion = Action.Companion;
        return new C10475xb12e4569("InitMigrateAuth", initiateMigrateAuth);
    }
}
