package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class SoftwareTokenMFANotFoundException extends ServiceException {
    public SoftwareTokenMFANotFoundException(Throwable th) {
        super("Software token TOTP multi-factor authentication (MFA) is not enabled for the user pool.", "Enable the software token MFA for the user.", th);
    }
}
