package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes3.dex */
public abstract class g8 implements hja {
    @Override // p001o.hja
    /* renamed from: a */
    public void mo28154a(Throwable th) {
        sq8.m48649h(th, "ex");
    }

    @Override // p001o.hja
    /* renamed from: b */
    public void mo28155b() {
    }

    @Override // p001o.hja
    /* renamed from: c */
    public void mo28156c(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
    }

    @Override // p001o.hja
    /* renamed from: d */
    public void mo28157d(uk7 uk7Var) {
        sq8.m48649h(uk7Var, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
