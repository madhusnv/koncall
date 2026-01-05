package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SetupTOTPCognitoActions implements SetupTOTPActions {
    public static final SetupTOTPCognitoActions INSTANCE = new SetupTOTPCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";

    private SetupTOTPCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action initiateTOTPSetup(SetupTOTPEvent.EventType.SetupTOTP eventType) {
        AbstractC4154l.m8923f(eventType, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1("InitiateTOTPSetup", eventType);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action respondToAuthChallenge(SetupTOTPEvent.EventType.RespondToAuthChallenge eventType) {
        AbstractC4154l.m8923f(eventType, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1("RespondToAuthChallenge", eventType);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action verifyChallengeAnswer(SetupTOTPEvent.EventType.VerifyChallengeAnswer eventType) {
        AbstractC4154l.m8923f(eventType, "eventType");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1("verifyChallengeAnswer", eventType);
    }
}
