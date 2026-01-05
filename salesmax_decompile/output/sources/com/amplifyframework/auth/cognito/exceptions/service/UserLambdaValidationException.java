package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class UserLambdaValidationException extends ServiceException {
    public UserLambdaValidationException(String str, Throwable th) {
        super("User validation exception with the Lambda service.", str == null ? "" : str, th);
    }
}
