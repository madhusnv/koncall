package com.amplifyframework.auth.cognito.exceptions.webauthn;

/* loaded from: classes5.dex */
public final class WebAuthnRpMismatchException extends WebAuthnFailedException {
    public WebAuthnRpMismatchException(Throwable th) {
        super("Unable to verify Relying Party data", "Check that you have a valid assetlinks.json file deployed to your RP that specifies the correct package name, signing key fingerprints, and grants permission for delegate_permission/common.get_login_creds. See Android Credential Manager documentation for details.", th);
    }
}
