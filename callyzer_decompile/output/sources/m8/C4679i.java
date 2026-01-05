package m8;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4432f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.i */
/* loaded from: classes.dex */
public class C4679i implements InterfaceC4432f {

    /* renamed from: a */
    public final SQLiteProgram f23136a;

    public C4679i(SQLiteProgram delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f23136a = delegate;
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: L */
    public final void mo9274L(int i10, byte[] bArr) {
        this.f23136a.bindBlob(i10, bArr);
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: Z */
    public final void mo9275Z(double d2, int i10) {
        this.f23136a.bindDouble(i10, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23136a.close();
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: g */
    public final void mo9276g(int i10, long j6) {
        this.f23136a.bindLong(i10, j6);
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: i */
    public final void mo9277i(int i10) {
        this.f23136a.bindNull(i10);
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: q */
    public final void mo9278q(int i10, String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f23136a.bindString(i10, value);
    }
}
