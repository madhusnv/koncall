package com.amplifyframework.auth.cognito.exceptions.webauthn;

/* loaded from: classes5.dex */
public final class WebAuthnNotSupportedException extends WebAuthnFailedException {
    public WebAuthnNotSupportedException(Throwable th) {
        super("WebAuthn is not supported on this device", "Sorry, we don’t have a recovery suggestion for this error.", th);
    }
}
