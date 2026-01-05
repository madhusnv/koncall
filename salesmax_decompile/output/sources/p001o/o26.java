package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public final class o26 extends q81 {

    /* renamed from: d */
    public final int f37547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o26(int i, String str) {
        super(str);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.f37547d = i;
    }

    /* renamed from: e */
    public final int m41350e() {
        return this.f37547d;
    }
}
