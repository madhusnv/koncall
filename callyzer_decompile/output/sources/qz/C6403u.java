package qz;

import b00.C0526k;
import b00.h0;
import b00.k0;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.u */
/* loaded from: classes3.dex */
public final class C6403u implements h0 {

    /* renamed from: a */
    public final boolean f30886a;

    /* renamed from: b */
    public final C0526k f30887b = new C0526k();

    /* renamed from: c */
    public boolean f30888c;

    /* renamed from: d */
    public final /* synthetic */ C6406x f30889d;

    public C6403u(C6406x c6406x, boolean z6) {
        this.f30889d = c6406x;
        this.f30886a = z6;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        C6406x c6406x = this.f30889d;
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (c6406x) {
            if (this.f30888c) {
                return;
            }
            boolean z6 = c6406x.m12407f() == null;
            C6406x c6406x2 = this.f30889d;
            if (!c6406x2.f30905i.f30886a) {
                if (this.f30887b.f3638b > 0) {
                    while (this.f30887b.f3638b > 0) {
                        m12400h(true);
                    }
                } else if (z6) {
                    c6406x2.f30898b.m12393z(c6406x2.f30897a, true, null, 0L);
                }
            }
            C6406x c6406x3 = this.f30889d;
            synchronized (c6406x3) {
                this.f30888c = true;
                c6406x3.notifyAll();
            }
            this.f30889d.f30898b.flush();
            this.f30889d.m12402a();
        }
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f30889d.f30907k;
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() {
        C6406x c6406x = this.f30889d;
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (c6406x) {
            c6406x.m12403b();
        }
        while (this.f30887b.f3638b > 0) {
            m12400h(false);
            this.f30889d.f30898b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: h */
    public final void m12400h(boolean z6) {
        long jMin;
        boolean z10;
        C6406x c6406x = this.f30889d;
        synchronized (c6406x) {
            c6406x.f30907k.m1556h();
            while (c6406x.f30900d >= c6406x.f30901e && !this.f30886a && !this.f30888c && c6406x.m12407f() == null) {
                try {
                    try {
                        c6406x.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    c6406x.f30907k.m12401k();
                    throw th2;
                }
            }
            c6406x.f30907k.m12401k();
            c6406x.m12403b();
            jMin = Math.min(c6406x.f30901e - c6406x.f30900d, this.f30887b.f3638b);
            c6406x.f30900d += jMin;
            z10 = z6 && jMin == this.f30887b.f3638b;
        }
        this.f30889d.f30907k.m1556h();
        try {
            C6406x c6406x2 = this.f30889d;
            c6406x2.f30898b.m12393z(c6406x2.f30897a, z10, this.f30887b, jMin);
        } finally {
            this.f30889d.f30907k.m12401k();
        }
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        TimeZone timeZone = AbstractC4299e.f21707a;
        C0526k c0526k = this.f30887b;
        c0526k.h0(source, j6);
        while (c0526k.f3638b >= 16384) {
            m12400h(false);
        }
    }
}
