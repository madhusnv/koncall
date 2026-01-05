package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SignUpActions;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpCognitoActions implements SignUpActions {
    public static final SignUpCognitoActions INSTANCE = new SignUpCognitoActions();

    private SignUpCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignUpActions
    public Action confirmSignUpAction(SignUpEvent.EventType.ConfirmSignUp event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1("ConfirmSignUp", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignUpActions
    public Action initiateSignUpAction(SignUpEvent.EventType.InitiateSignUp event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1("InitiatingSignUp", event);
    }
}
