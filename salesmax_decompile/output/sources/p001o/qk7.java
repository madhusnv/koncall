package p001o;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes2.dex */
public final class qk7 extends pk7 implements peg {

    /* renamed from: b */
    public final SQLiteStatement f42094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk7(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sq8.m48649h(sQLiteStatement, "delegate");
        this.f42094b = sQLiteStatement;
    }

    @Override // p001o.peg
    public void execute() {
        this.f42094b.execute();
    }

    @Override // p001o.peg
    public long executeInsert() {
        return this.f42094b.executeInsert();
    }

    @Override // p001o.peg
    public int executeUpdateDelete() {
        return this.f42094b.executeUpdateDelete();
    }

    @Override // p001o.peg
    public long simpleQueryForLong() {
        return this.f42094b.simpleQueryForLong();
    }

    @Override // p001o.peg
    public String simpleQueryForString() {
        return this.f42094b.simpleQueryForString();
    }
}
