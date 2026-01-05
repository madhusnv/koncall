package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.AuthException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class EnableSoftwareTokenMFAException extends AuthException {
    public EnableSoftwareTokenMFAException(Throwable th2) {
        super("Unable to enable software token MFA", "Enable the software token MFA for the user.", th2);
    }
}
