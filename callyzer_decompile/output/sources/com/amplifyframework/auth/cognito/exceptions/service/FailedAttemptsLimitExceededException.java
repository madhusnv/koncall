package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FailedAttemptsLimitExceededException extends ServiceException {
    public FailedAttemptsLimitExceededException(Throwable th2) {
        super("User has made too many failed attempts for a given action.", "Please check out the service configuration to see the condition of locking.", th2);
    }
}
