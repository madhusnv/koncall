package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class SignedOutException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED = "Please sign in and reattempt the operation.";
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE = "If you have guest access enabled, please check that your device is online and try again. Otherwise if guest access is not enabled, you'll need to sign in and try again.";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public SignedOutException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ SignedOutException(String str, String str2, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? "You are currently signed out." : str, (i & 2) != 0 ? RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED : str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedOutException(String str, String str2, Throwable th) {
        super(str, str2, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
