package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class InvalidGrantException extends AuthException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidGrantException(String message, String str) {
        super(message, str == null ? "Sorry, we don’t have a recovery suggestion for this error." : str, null, 4, null);
        AbstractC4154l.m8923f(message, "message");
    }
}
