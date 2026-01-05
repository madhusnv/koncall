package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class ParseTokenException extends ServiceException {
    public ParseTokenException() {
        super("Failed to parse token", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
    }
}
