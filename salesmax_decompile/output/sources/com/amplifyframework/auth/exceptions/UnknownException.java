package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class UnknownException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_WITHOUT_THROWABLE = "Sorry, we don’t have a recovery suggestion for this error.";
    public static final String RECOVERY_SUGGESTION_WITH_THROWABLE = "See the attached exception for more details";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnknownException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UnknownException(String str, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? "An unclassified error prevented this operation." : str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownException(String str, Throwable th) {
        super(str, th != null ? "See the attached exception for more details" : "Sorry, we don’t have a recovery suggestion for this error.", th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
