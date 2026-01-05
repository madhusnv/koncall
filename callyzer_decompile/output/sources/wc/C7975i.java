package wc;

import b00.C0523h;
import b00.C0526k;
import ic.InterfaceC3227e;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.i */
/* loaded from: classes.dex */
public final class C7975i implements e0 {

    /* renamed from: a */
    public final e0 f38365a;

    /* renamed from: b */
    public final C0523h f38366b;

    /* renamed from: c */
    public final InterfaceC3227e f38367c;

    public C7975i(InterfaceC3227e interfaceC3227e, e0 source) {
        AbstractC4154l.m8923f(source, "source");
        this.f38365a = source;
        this.f38366b = new C0523h();
        this.f38367c = interfaceC3227e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38365a.close();
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        C0526k c0526k = sink.f38413a;
        long j10 = this.f38365a.read(sink, j6);
        if (j10 <= 0) {
            return j10;
        }
        C0523h c0523h = this.f38366b;
        c0526k.f0(c0523h);
        try {
            long j11 = j10;
            for (int iM1578j = c0523h.m1578j(c0526k.f3638b - j10); j11 > 0 && iM1578j > 0; iM1578j = c0523h.m1577h()) {
                int iMin = Math.min(iM1578j, (int) j11);
                byte[] bArr = c0523h.f3630d;
                if (bArr == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f38367c.update(bArr, c0523h.f3631e, iMin);
                j11 -= iMin;
            }
            c0523h.close();
            return j10;
        } catch (Throwable th2) {
            c0523h.close();
            throw th2;
        }
    }
}
