package androidx.room;

import android.content.ContentValues;
import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1 */
/* loaded from: classes2.dex */
public final class C2437xc522ba9f extends kf9 implements xk7 {
    final /* synthetic */ int $conflictAlgorithm;
    final /* synthetic */ String $table;
    final /* synthetic */ ContentValues $values;
    final /* synthetic */ Object[] $whereArgs;
    final /* synthetic */ String $whereClause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437xc522ba9f(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        super(1);
        this.$table = str;
        this.$conflictAlgorithm = i;
        this.$values = contentValues;
        this.$whereClause = str2;
        this.$whereArgs = objArr;
    }

    @Override // p001o.xk7
    public final Integer invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Integer.valueOf(legVar.update(this.$table, this.$conflictAlgorithm, this.$values, this.$whereClause, this.$whereArgs));
    }
}
