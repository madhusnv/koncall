package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes6.dex */
public final class v0c extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0c(String str) {
        super(str);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }

    public /* synthetic */ v0c(String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
