package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2 */
/* loaded from: classes2.dex */
public final class C2420x106d7262 extends kf9 implements xk7 {
    final /* synthetic */ Object[] $bindArgs;
    final /* synthetic */ String $sql;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2420x106d7262(String str, Object[] objArr) {
        super(1);
        this.$sql = str;
        this.$bindArgs = objArr;
    }

    @Override // p001o.xk7
    public final Object invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL(this.$sql, this.$bindArgs);
        return null;
    }
}
