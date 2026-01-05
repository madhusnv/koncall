package androidx.room;

import p001o.kf9;
import p001o.peg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1 */
/* loaded from: classes2.dex */
public final class C2445x7fb2e741 extends kf9 implements xk7 {
    public static final C2445x7fb2e741 INSTANCE = new C2445x7fb2e741();

    public C2445x7fb2e741() {
        super(1);
    }

    @Override // p001o.xk7
    public final Integer invoke(peg pegVar) {
        sq8.m48649h(pegVar, "obj");
        return Integer.valueOf(pegVar.executeUpdateDelete());
    }
}
