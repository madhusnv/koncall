package com.amplifyframework.auth.cognito.exceptions.webauthn;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnCredentialAlreadyExistsException extends WebAuthnFailedException {
    public WebAuthnCredentialAlreadyExistsException(Throwable th2) {
        super("The credential is already associated with this user", "Remove the old WebAuthn credential and try again", th2);
    }
}
