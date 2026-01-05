package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;

/* loaded from: classes5.dex */
public interface WebAuthnSignInActions {
    Action assertCredentials(WebAuthnEvent.EventType.AssertCredentialOptions assertCredentialOptions);

    Action fetchCredentialOptions(WebAuthnEvent.EventType.FetchCredentialOptions fetchCredentialOptions);

    Action verifyCredentialAndSignIn(WebAuthnEvent.EventType.VerifyCredentialsAndSignIn verifyCredentialsAndSignIn);
}
