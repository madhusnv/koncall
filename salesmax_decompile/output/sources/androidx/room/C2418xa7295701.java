package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1 */
/* loaded from: classes2.dex */
public final class C2418xa7295701 extends kf9 implements xk7 {
    final /* synthetic */ String $table;
    final /* synthetic */ Object[] $whereArgs;
    final /* synthetic */ String $whereClause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2418xa7295701(String str, String str2, Object[] objArr) {
        super(1);
        this.$table = str;
        this.$whereClause = str2;
        this.$whereArgs = objArr;
    }

    @Override // p001o.xk7
    public final Integer invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Integer.valueOf(legVar.delete(this.$table, this.$whereClause, this.$whereArgs));
    }
}
