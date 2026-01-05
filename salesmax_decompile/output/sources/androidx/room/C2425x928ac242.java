package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 */
/* loaded from: classes2.dex */
public final class C2425x928ac242 extends kf9 implements xk7 {
    public static final C2425x928ac242 INSTANCE = new C2425x928ac242();

    public C2425x928ac242() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "obj");
        return Boolean.valueOf(legVar.isReadOnly());
    }
}
