package com.amplifyframework.auth.cognito.exceptions.invalidstate;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class SignedInException extends InvalidStateException {
    /* JADX WARN: Multi-variable type inference failed */
    public SignedInException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SignedInException(String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "There is already a user signed in." : str, (i & 2) != 0 ? "Sign out the user first before signing in again." : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedInException(String str, String str2) {
        super(str, str2, null, 4, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
