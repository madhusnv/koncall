package wc;

import b00.C0522g;
import b00.C0523h;
import b00.C0526k;
import ic.InterfaceC3227e;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.r7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.h */
/* loaded from: classes.dex */
public final class C7974h implements d0 {

    /* renamed from: a */
    public final d0 f38362a;

    /* renamed from: b */
    public final C0523h f38363b;

    /* renamed from: c */
    public final InterfaceC3227e f38364c;

    public C7974h(InterfaceC3227e interfaceC3227e) {
        this(interfaceC3227e, r7.m11852c(new C0522g()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38362a.close();
    }

    @Override // wc.d0
    public final void flush() {
        this.f38362a.flush();
    }

    @Override // wc.d0
    public final void m0(C7985s c7985s, long j6) {
        C0526k c0526k = c7985s.f38413a;
        C0523h c0523h = this.f38363b;
        c0526k.f0(c0523h);
        try {
            long j10 = j6;
            for (int iM1578j = c0523h.m1578j(0L); iM1578j > 0 && j10 > 0; iM1578j = c0523h.m1577h()) {
                int iMin = Math.min(iM1578j, (int) j10);
                byte[] bArr = c0523h.f3630d;
                if (bArr == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f38364c.update(bArr, c0523h.f3631e, iMin);
                j10 -= iMin;
            }
            c0523h.close();
            this.f38362a.m0(c7985s, j6);
        } catch (Throwable th2) {
            c0523h.close();
            throw th2;
        }
    }

    public C7974h(InterfaceC3227e hash, d0 sink) {
        AbstractC4154l.m8923f(hash, "hash");
        AbstractC4154l.m8923f(sink, "sink");
        this.f38362a = sink;
        this.f38363b = new C0523h();
        this.f38364c = hash;
    }
}
