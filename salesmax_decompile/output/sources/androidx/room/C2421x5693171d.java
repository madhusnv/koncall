package androidx.room;

import p001o.dm7;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 */
/* loaded from: classes2.dex */
public /* synthetic */ class C2421x5693171d extends dm7 implements xk7 {
    public static final C2421x5693171d INSTANCE = new C2421x5693171d();

    public C2421x5693171d() {
        super(1, leg.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "p0");
        return Boolean.valueOf(legVar.inTransaction());
    }
}
