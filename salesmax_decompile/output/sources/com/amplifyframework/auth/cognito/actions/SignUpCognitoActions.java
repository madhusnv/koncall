package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SignUpActions;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignUpCognitoActions implements SignUpActions {
    public static final SignUpCognitoActions INSTANCE = new SignUpCognitoActions();

    private SignUpCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignUpActions
    public Action confirmSignUpAction(SignUpEvent.EventType.ConfirmSignUp confirmSignUp) {
        sq8.m48649h(confirmSignUp, "event");
        Action.Companion companion = Action.Companion;
        return new SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1("ConfirmSignUp", confirmSignUp);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignUpActions
    public Action initiateSignUpAction(SignUpEvent.EventType.InitiateSignUp initiateSignUp) {
        sq8.m48649h(initiateSignUp, "event");
        Action.Companion companion = Action.Companion;
        return new SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1("InitiatingSignUp", initiateSignUp);
    }
}
