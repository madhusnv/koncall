package androidx.room;

import android.content.ContentValues;
import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1 */
/* loaded from: classes2.dex */
public final class C2422x9698888f extends kf9 implements xk7 {
    final /* synthetic */ int $conflictAlgorithm;
    final /* synthetic */ String $table;
    final /* synthetic */ ContentValues $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2422x9698888f(String str, int i, ContentValues contentValues) {
        super(1);
        this.$table = str;
        this.$conflictAlgorithm = i;
        this.$values = contentValues;
    }

    @Override // p001o.xk7
    public final Long invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Long.valueOf(legVar.insert(this.$table, this.$conflictAlgorithm, this.$values));
    }
}
