package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public final class xr8 extends ya3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr8(String str, Throwable th) {
        super(str, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }

    public /* synthetic */ xr8(String str, Throwable th, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
