package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class InvalidStateException extends AuthException {
    public InvalidStateException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ InvalidStateException(String str, String str2, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? "Auth state is an invalid state, cannot process the request." : str, (i10 & 2) != 0 ? "Operation performed is not a valid operation for the current auth state." : str2, (i10 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidStateException(String message, String recoverySuggestion, Throwable th2) {
        super(message, recoverySuggestion, th2);
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(recoverySuggestion, "recoverySuggestion");
    }
}
