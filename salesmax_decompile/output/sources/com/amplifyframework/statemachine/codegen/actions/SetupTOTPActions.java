package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;

/* loaded from: classes5.dex */
public interface SetupTOTPActions {
    Action initiateTOTPSetup(SetupTOTPEvent.EventType.SetupTOTP setupTOTP);

    Action respondToAuthChallenge(SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge);

    Action verifyChallengeAnswer(SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer);
}
