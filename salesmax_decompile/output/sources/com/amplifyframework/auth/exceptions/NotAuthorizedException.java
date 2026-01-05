package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class NotAuthorizedException extends AuthException {
    public NotAuthorizedException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ NotAuthorizedException(String str, String str2, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Failed since user is not authorized." : str, (i & 2) != 0 ? "Check whether the given values are correct and the user is authorized to perform the operation." : str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotAuthorizedException(String str, String str2, Throwable th) {
        super(str, str2, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
