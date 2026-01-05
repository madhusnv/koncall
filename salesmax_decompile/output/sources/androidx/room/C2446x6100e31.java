package androidx.room;

import p001o.kf9;
import p001o.peg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 */
/* loaded from: classes2.dex */
public final class C2446x6100e31 extends kf9 implements xk7 {
    public static final C2446x6100e31 INSTANCE = new C2446x6100e31();

    public C2446x6100e31() {
        super(1);
    }

    @Override // p001o.xk7
    public final Long invoke(peg pegVar) {
        sq8.m48649h(pegVar, "obj");
        return Long.valueOf(pegVar.simpleQueryForLong());
    }
}
