package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public final class WebAuthnNotEnabledException extends ServiceException {
    public WebAuthnNotEnabledException(Throwable th) {
        super("WebAuthn is not enabled for this userpool", "Ensure that your userpool is setup to have WebAuthn enabled", th);
    }
}
