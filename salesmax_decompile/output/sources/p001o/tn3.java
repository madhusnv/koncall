package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public final class tn3 extends IllegalStateException {

    /* renamed from: a */
    public final String f47458a;

    public tn3(String str) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.f47458a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f47458a;
    }
}
