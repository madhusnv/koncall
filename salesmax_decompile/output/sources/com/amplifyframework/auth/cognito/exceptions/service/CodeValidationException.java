package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class CodeValidationException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public CodeValidationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CodeValidationException(String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Failed to parse code from the fetch token Uri" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeValidationException(String str) {
        super(str, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
