package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class InvalidAccountTypeException extends ServiceException {
    private final Throwable cause;

    public InvalidAccountTypeException(Throwable th) {
        super("The account type you have configured doesn't support this operation.", "Update your Auth configuration to an account type which supports this operation.", th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
