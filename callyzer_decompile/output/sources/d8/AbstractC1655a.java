package d8;

import c8.C0898a;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import qw.C6360j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d8.a */
/* loaded from: classes.dex */
public abstract class AbstractC1655a {

    /* renamed from: a */
    public final int f8164a;

    /* renamed from: b */
    public final int f8165b;

    public AbstractC1655a(int i10, int i11) {
        this.f8164a = i10;
        this.f8165b = i11;
    }

    /* renamed from: a */
    public void mo5365a(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        if (!(connection instanceof C0898a)) {
            throw new C6360j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        mo5366b(((C0898a) connection).f5551a);
    }

    /* renamed from: b */
    public void mo5366b(InterfaceC4427a db2) {
        AbstractC4154l.m8923f(db2, "db");
        throw new C6360j("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
