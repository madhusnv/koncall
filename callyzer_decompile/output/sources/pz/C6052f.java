package pz;

import b00.C0526k;
import iz.C3389v;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.f */
/* loaded from: classes3.dex */
public final class C6052f extends AbstractC6047a {

    /* renamed from: e */
    public boolean f29537e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29524c) {
            return;
        }
        if (!this.f29537e) {
            m12058h(C6053g.f29538g);
        }
        this.f29524c = true;
    }

    @Override // pz.AbstractC6047a, b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        if (this.f29524c) {
            throw new IllegalStateException("closed");
        }
        if (this.f29537e) {
            return -1L;
        }
        long jG0 = super.g0(sink, j6);
        if (jG0 != -1) {
            return jG0;
        }
        this.f29537e = true;
        m12058h(C3389v.f17980b);
        return -1L;
    }
}
