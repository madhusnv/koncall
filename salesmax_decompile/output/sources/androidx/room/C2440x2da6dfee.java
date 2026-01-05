package androidx.room;

import p001o.dm7;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
/* loaded from: classes2.dex */
public /* synthetic */ class C2440x2da6dfee extends dm7 implements xk7 {
    public static final C2440x2da6dfee INSTANCE = new C2440x2da6dfee();

    public C2440x2da6dfee() {
        super(1, leg.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "p0");
        return Boolean.valueOf(legVar.yieldIfContendedSafely());
    }
}
