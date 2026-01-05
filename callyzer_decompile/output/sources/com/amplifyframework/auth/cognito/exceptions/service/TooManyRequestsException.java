package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class TooManyRequestsException extends ServiceException {
    public TooManyRequestsException(Throwable th2) {
        super("Failed since the user made too many requests.", "Make sure the requests send are controlled and the errors are properly handled.", th2);
    }
}
