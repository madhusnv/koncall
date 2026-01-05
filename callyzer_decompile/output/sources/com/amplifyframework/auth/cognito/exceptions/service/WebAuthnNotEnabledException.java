package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnNotEnabledException extends ServiceException {
    public WebAuthnNotEnabledException(Throwable th2) {
        super("WebAuthn is not enabled for this userpool", "Ensure that your userpool is setup to have WebAuthn enabled", th2);
    }
}
