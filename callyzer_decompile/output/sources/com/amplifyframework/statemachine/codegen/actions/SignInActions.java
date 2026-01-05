package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface SignInActions {
    Action autoSignInAction(SignInEvent.EventType.InitiateAutoSignIn initiateAutoSignIn);

    Action confirmDevice(SignInEvent.EventType.ConfirmDevice confirmDevice);

    Action initResolveChallenge(SignInEvent.EventType.ReceivedChallenge receivedChallenge);

    Action initiateTOTPSetupAction(SignInEvent.EventType.InitiateTOTPSetup initiateTOTPSetup);

    Action initiateWebAuthnSignInAction(SignInEvent.EventType.InitiateWebAuthnSignIn initiateWebAuthnSignIn);

    Action startCustomAuthAction(SignInEvent.EventType.InitiateSignInWithCustom initiateSignInWithCustom);

    Action startCustomAuthWithSRPAction(SignInEvent.EventType.InitiateCustomSignInWithSRP initiateCustomSignInWithSRP);

    Action startDeviceSRPAuthAction(SignInEvent.EventType.InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP);

    Action startHostedUIAuthAction(SignInEvent.EventType.InitiateHostedUISignIn initiateHostedUISignIn);

    Action startMigrationAuthAction(SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth);

    Action startSRPAuthAction(SignInEvent.EventType.InitiateSignInWithSRP initiateSignInWithSRP);
}
