package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class InvalidAccountTypeException extends ServiceException {
    private final Throwable cause;

    public InvalidAccountTypeException(Throwable th2) {
        super("The account type you have configured doesn't support this operation.", "Update your Auth configuration to an account type which supports this operation.", th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
