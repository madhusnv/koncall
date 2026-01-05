package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1 */
/* loaded from: classes2.dex */
public final class C2419x106d7261 extends kf9 implements xk7 {
    final /* synthetic */ String $sql;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419x106d7261(String str) {
        super(1);
        this.$sql = str;
    }

    @Override // p001o.xk7
    public final Object invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL(this.$sql);
        return null;
    }
}
