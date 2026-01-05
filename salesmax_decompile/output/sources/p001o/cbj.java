package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public final class cbj extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbj(String str) {
        super(str);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
