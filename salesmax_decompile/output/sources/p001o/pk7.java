package p001o;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes2.dex */
public class pk7 implements neg {

    /* renamed from: a */
    public final SQLiteProgram f40194a;

    public pk7(SQLiteProgram sQLiteProgram) {
        sq8.m48649h(sQLiteProgram, "delegate");
        this.f40194a = sQLiteProgram;
    }

    @Override // p001o.neg
    public void bindBlob(int i, byte[] bArr) {
        sq8.m48649h(bArr, "value");
        this.f40194a.bindBlob(i, bArr);
    }

    @Override // p001o.neg
    public void bindDouble(int i, double d) {
        this.f40194a.bindDouble(i, d);
    }

    @Override // p001o.neg
    public void bindLong(int i, long j) {
        this.f40194a.bindLong(i, j);
    }

    @Override // p001o.neg
    public void bindNull(int i) {
        this.f40194a.bindNull(i);
    }

    @Override // p001o.neg
    public void bindString(int i, String str) {
        sq8.m48649h(str, "value");
        this.f40194a.bindString(i, str);
    }

    @Override // p001o.neg
    public void clearBindings() {
        this.f40194a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40194a.close();
    }
}
