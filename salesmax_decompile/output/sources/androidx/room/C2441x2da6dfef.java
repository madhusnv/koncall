package androidx.room;

import p001o.dm7;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 */
/* loaded from: classes2.dex */
public /* synthetic */ class C2441x2da6dfef extends dm7 implements xk7 {
    public static final C2441x2da6dfef INSTANCE = new C2441x2da6dfef();

    public C2441x2da6dfef() {
        super(1, leg.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "p0");
        return Boolean.valueOf(legVar.yieldIfContendedSafely());
    }
}
