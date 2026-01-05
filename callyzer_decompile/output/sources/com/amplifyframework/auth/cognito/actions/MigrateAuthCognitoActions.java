package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
    public Action initiateMigrateAuthAction(SignInEvent.EventType.InitiateMigrateAuth event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1091xb12e4569("InitMigrateAuth", event);
    }
}
