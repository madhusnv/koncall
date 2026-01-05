package xc;

import b00.h0;
import wc.C7985s;
import wc.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.f */
/* loaded from: classes.dex */
public final class C8325f implements d0 {

    /* renamed from: a */
    public final h0 f39899a;

    public C8325f(h0 h0Var) {
        this.f39899a = h0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39899a.close();
    }

    @Override // wc.d0
    public final void flush() {
        this.f39899a.flush();
    }

    @Override // wc.d0
    public final void m0(C7985s c7985s, long j6) {
        this.f39899a.h0(c7985s.f38413a, j6);
    }
}
