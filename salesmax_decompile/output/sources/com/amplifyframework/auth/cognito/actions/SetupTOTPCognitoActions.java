package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SetupTOTPCognitoActions implements SetupTOTPActions {
    public static final SetupTOTPCognitoActions INSTANCE = new SetupTOTPCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";

    private SetupTOTPCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action initiateTOTPSetup(SetupTOTPEvent.EventType.SetupTOTP setupTOTP) {
        sq8.m48649h(setupTOTP, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1("InitiateTOTPSetup", setupTOTP);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action respondToAuthChallenge(SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge) {
        sq8.m48649h(respondToAuthChallenge, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1("RespondToAuthChallenge", respondToAuthChallenge);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action verifyChallengeAnswer(SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer) {
        sq8.m48649h(verifyChallengeAnswer, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1("verifyChallengeAnswer", verifyChallengeAnswer);
    }
}
