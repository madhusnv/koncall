package pc;

import b00.C0526k;
import b00.InterfaceC0528m;
import b00.i0;
import b00.k0;
import ec.C2005c;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import pd.C5897c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.j */
/* loaded from: classes.dex */
public final class C5882j implements i0 {

    /* renamed from: a */
    public final i0 f28686a;

    /* renamed from: b */
    public final C5897c f28687b;

    /* renamed from: c */
    public final C2005c f28688c;

    public C5882j(InterfaceC0528m delegate, C5897c counter, C2005c c2005c) {
        AbstractC4154l.m8923f(delegate, "delegate");
        AbstractC4154l.m8923f(counter, "counter");
        this.f28686a = delegate;
        this.f28687b = counter;
        this.f28688c = c2005c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28686a.close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f28686a.mo1532f();
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        long jG0 = this.f28686a.g0(sink, j6);
        if (jG0 > 0) {
            C5897c.m11505a(this.f28687b, jG0, this.f28688c);
        }
        return jG0;
    }
}
