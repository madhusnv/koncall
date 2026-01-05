package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1 */
/* loaded from: classes2.dex */
public final class C2426x1aa74a04 extends kf9 implements xk7 {
    public static final C2426x1aa74a04 INSTANCE = new C2426x1aa74a04();

    public C2426x1aa74a04() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Boolean.valueOf(legVar.isWriteAheadLoggingEnabled());
    }
}
