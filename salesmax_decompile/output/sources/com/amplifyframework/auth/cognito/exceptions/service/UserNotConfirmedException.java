package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class UserNotConfirmedException extends ServiceException {
    public UserNotConfirmedException(Throwable th) {
        super("User not confirmed in the system.", "Please confirm user first using the confirmUser API and then retry this operation", th);
    }
}
