package com.amplifyframework.auth.cognito.exceptions.webauthn;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class WebAuthnFailedException extends AuthException {
    public /* synthetic */ WebAuthnFailedException(String str, String str2, Throwable th, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthnFailedException(String str, String str2, Throwable th) {
        super(str, str2 == null ? th == null ? "Sorry, we don’t have a recovery suggestion for this error." : "See the attached exception for more details" : str2, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
