package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.notifications.NotificationsException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class PushNotificationsException extends NotificationsException {
    public /* synthetic */ PushNotificationsException(String str, String str2, Throwable th, int i, id5 id5Var) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsException(String str, String str2, Throwable th) {
        super(str, str2, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
