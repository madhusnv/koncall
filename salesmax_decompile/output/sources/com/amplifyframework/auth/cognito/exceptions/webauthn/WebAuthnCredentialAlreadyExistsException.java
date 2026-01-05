package com.amplifyframework.auth.cognito.exceptions.webauthn;

/* loaded from: classes5.dex */
public final class WebAuthnCredentialAlreadyExistsException extends WebAuthnFailedException {
    public WebAuthnCredentialAlreadyExistsException(Throwable th) {
        super("The credential is already associated with this user", "Remove the old WebAuthn credential and try again", th);
    }
}
