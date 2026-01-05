package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class UsernameExistsException extends ServiceException {
    public UsernameExistsException(Throwable th) {
        super("Username already exists in the system.", "Retry operation and enter another username.", th);
    }
}
