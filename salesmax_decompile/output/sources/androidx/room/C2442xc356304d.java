package androidx.room;

import p001o.kf9;
import p001o.peg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 */
/* loaded from: classes2.dex */
public final class C2442xc356304d extends kf9 implements xk7 {
    public static final C2442xc356304d INSTANCE = new C2442xc356304d();

    public C2442xc356304d() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(peg pegVar) {
        sq8.m48649h(pegVar, "statement");
        pegVar.execute();
        return null;
    }
}
