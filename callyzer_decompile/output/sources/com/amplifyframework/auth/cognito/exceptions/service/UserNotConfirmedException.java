package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UserNotConfirmedException extends ServiceException {
    public UserNotConfirmedException(Throwable th2) {
        super("User not confirmed in the system.", "Please confirm user first using the confirmUser API and then retry this operation", th2);
    }
}
