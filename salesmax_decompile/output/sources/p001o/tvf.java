package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class tvf implements hja {

    /* renamed from: b */
    public final eka f47964b;

    public tvf(eka ekaVar) {
        sq8.m48649h(ekaVar, "delegate");
        this.f47964b = ekaVar;
    }

    /* renamed from: f */
    public static final String m50714f(uk7 uk7Var) {
        return (String) uk7Var.invoke();
    }

    @Override // p001o.hja
    /* renamed from: a */
    public void mo28154a(Throwable th) {
        sq8.m48649h(th, "ex");
        this.f47964b.mo25189a(th);
    }

    @Override // p001o.hja
    /* renamed from: b */
    public void mo28155b() {
        this.f47964b.mo25191c();
    }

    @Override // p001o.hja
    /* renamed from: c */
    public void mo28156c(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        this.f47964b.mo25192d(str, obj);
    }

    @Override // p001o.hja
    /* renamed from: d */
    public void mo28157d(final uk7 uk7Var) {
        sq8.m48649h(uk7Var, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.f47964b.mo25190b(new Supplier() { // from class: o.svf
            @Override // java.util.function.Supplier
            public final Object get() {
                return tvf.m50714f(uk7Var);
            }
        });
    }
}
