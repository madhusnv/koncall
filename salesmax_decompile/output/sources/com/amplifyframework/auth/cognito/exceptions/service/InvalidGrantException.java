package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.sq8;

/* loaded from: classes5.dex */
public class InvalidGrantException extends AuthException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidGrantException(String str, String str2) {
        super(str, str2 == null ? "Sorry, we don’t have a recovery suggestion for this error." : str2, null, 4, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
