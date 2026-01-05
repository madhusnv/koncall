package com.amplifyframework.auth.cognito.exceptions.webauthn;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnRpMismatchException extends WebAuthnFailedException {
    public WebAuthnRpMismatchException(Throwable th2) {
        super("Unable to verify Relying Party data", "Check that you have a valid assetlinks.json file deployed to your RP that specifies the correct package name, signing key fingerprints, and grants permission for delegate_permission/common.get_login_creds. See Android Credential Manager documentation for details.", th2);
    }
}
