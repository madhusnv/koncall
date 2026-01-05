package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import p001o.kf9;
import p001o.leg;
import p001o.peg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1 */
/* loaded from: classes2.dex */
public final class C2444xdd6c1cf2 extends kf9 implements xk7 {
    final /* synthetic */ xk7 $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444xdd6c1cf2(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, xk7 xk7Var) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = xk7Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // p001o.xk7
    public final T invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        peg pegVarCompileStatement = legVar.compileStatement(this.this$0.sql);
        this.this$0.doBinds(pegVarCompileStatement);
        return this.$block.invoke(pegVarCompileStatement);
    }
}
