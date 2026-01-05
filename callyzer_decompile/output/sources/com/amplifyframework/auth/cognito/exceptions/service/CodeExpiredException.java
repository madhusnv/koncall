package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CodeExpiredException extends ServiceException {
    public CodeExpiredException(Throwable th2) {
        super("Confirmation code has expired.", "Resend a new confirmation code and then retry operation with it.", th2);
    }
}
