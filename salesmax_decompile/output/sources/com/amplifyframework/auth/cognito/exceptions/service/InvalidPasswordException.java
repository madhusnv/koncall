package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class InvalidPasswordException extends ServiceException {
    public InvalidPasswordException(Throwable th) {
        super("The password given is invalid.", "Enter correct password.", th);
    }
}
