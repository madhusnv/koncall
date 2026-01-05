package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes3.dex */
public final class hse extends gse {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hse(String str, Throwable th, int i, Object obj) {
        super(str, th, i, obj, null, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
