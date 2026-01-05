package qz;

import b00.C0526k;
import b00.i0;
import b00.k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import okhttp3.internal.http2.StreamResetException;
import p020v.a1;
import rz.C6691a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.v */
/* loaded from: classes3.dex */
public final class C6404v implements i0 {

    /* renamed from: a */
    public final long f30890a;

    /* renamed from: b */
    public boolean f30891b;

    /* renamed from: c */
    public final C0526k f30892c = new C0526k();

    /* renamed from: d */
    public final C0526k f30893d = new C0526k();

    /* renamed from: e */
    public boolean f30894e;

    /* renamed from: f */
    public final /* synthetic */ C6406x f30895f;

    public C6404v(C6406x c6406x, long j6, boolean z6) {
        this.f30895f = c6406x;
        this.f30890a = j6;
        this.f30891b = z6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        C6406x c6406x = this.f30895f;
        synchronized (c6406x) {
            this.f30894e = true;
            C0526k c0526k = this.f30893d;
            j6 = c0526k.f3638b;
            c0526k.m1593n();
            c6406x.notifyAll();
        }
        if (j6 > 0) {
            C6406x c6406x2 = this.f30895f;
            TimeZone timeZone = AbstractC4299e.f21707a;
            c6406x2.f30898b.m12392w(j6);
        }
        this.f30895f.m12402a();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f30895f.f30906j;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws Throwable {
        boolean z6;
        Throwable streamResetException;
        long jG0;
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        do {
            C6406x c6406x = this.f30895f;
            synchronized (c6406x) {
                c6406x.f30898b.getClass();
                C6403u c6403u = c6406x.f30905i;
                z6 = true;
                boolean z10 = c6403u.f30888c || c6403u.f30886a;
                if (z10) {
                    c6406x.f30906j.m1556h();
                }
                try {
                    if (c6406x.m12407f() == null || this.f30891b) {
                        streamResetException = null;
                    } else {
                        streamResetException = c6406x.f30909m;
                        if (streamResetException == null) {
                            EnumC6384b enumC6384bM12407f = c6406x.m12407f();
                            AbstractC4154l.m8920c(enumC6384bM12407f);
                            streamResetException = new StreamResetException(enumC6384bM12407f);
                        }
                    }
                    if (this.f30894e) {
                        throw new IOException("stream closed");
                    }
                    C0526k c0526k = this.f30893d;
                    long j10 = c0526k.f3638b;
                    if (j10 > 0) {
                        jG0 = c0526k.g0(sink, Math.min(j6, j10));
                        C6691a.m12828b(c6406x.f30899c, jG0, 0L, 2);
                        long jM12829a = c6406x.f30899c.m12829a();
                        if (streamResetException == null && jM12829a >= c6406x.f30898b.f30862t.m12369a() / 2) {
                            c6406x.f30898b.m12387H(c6406x.f30897a, jM12829a);
                            C6691a.m12828b(c6406x.f30899c, 0L, jM12829a, 1);
                        }
                        z6 = false;
                    } else {
                        if (this.f30891b || streamResetException != null) {
                            z6 = false;
                        } else {
                            try {
                                c6406x.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jG0 = -1;
                    }
                } finally {
                    if (z10) {
                        c6406x.f30906j.m12401k();
                    }
                }
            }
            this.f30895f.f30898b.f30861s.getClass();
        } while (z6);
        if (jG0 != -1) {
            return jG0;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }
}
