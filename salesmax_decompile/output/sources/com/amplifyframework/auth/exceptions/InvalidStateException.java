package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class InvalidStateException extends AuthException {
    public InvalidStateException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ InvalidStateException(String str, String str2, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Auth state is an invalid state, cannot process the request." : str, (i & 2) != 0 ? "Operation performed is not a valid operation for the current auth state." : str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidStateException(String str, String str2, Throwable th) {
        super(str, str2, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
