package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1 */
/* loaded from: classes2.dex */
public final class C2423x7d1b80e8 extends kf9 implements xk7 {
    public static final C2423x7d1b80e8 INSTANCE = new C2423x7d1b80e8();

    public C2423x7d1b80e8() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "obj");
        return Boolean.valueOf(legVar.isDatabaseIntegrityOk());
    }
}
