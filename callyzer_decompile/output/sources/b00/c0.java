package b00;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 implements InterfaceC0527l {

    /* renamed from: a */
    public final h0 f3595a;

    /* renamed from: b */
    public final C0526k f3596b;

    /* renamed from: c */
    public boolean f3597c;

    public c0(h0 sink) {
        AbstractC4154l.m8923f(sink, "sink");
        this.f3595a = sink;
        this.f3596b = new C0526k();
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: M */
    public final InterfaceC0527l mo1533M(int i10, byte[] source) {
        AbstractC4154l.m8923f(source, "source");
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.write(source, 0, i10);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: N */
    public final InterfaceC0527l mo1534N(String string) {
        AbstractC4154l.m8923f(string, "string");
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.H0(string);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: V */
    public final InterfaceC0527l mo1535V(long j6) {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.D0(j6);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: a */
    public final C0526k mo1536a() {
        return this.f3596b;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: c */
    public final InterfaceC0527l mo1537c() {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        C0526k c0526k = this.f3596b;
        long j6 = c0526k.f3638b;
        if (j6 > 0) {
            this.f3595a.h0(c0526k, j6);
        }
        return this;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        h0 h0Var = this.f3595a;
        if (this.f3597c) {
            return;
        }
        try {
            C0526k c0526k = this.f3596b;
            long j6 = c0526k.f3638b;
            if (j6 > 0) {
                h0Var.h0(c0526k, j6);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            h0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f3597c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f3595a.mo1538f();
    }

    @Override // b00.InterfaceC0527l, b00.h0, java.io.Flushable
    public final void flush() {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        C0526k c0526k = this.f3596b;
        long j6 = c0526k.f3638b;
        h0 h0Var = this.f3595a;
        if (j6 > 0) {
            h0Var.h0(c0526k, j6);
        }
        h0Var.flush();
    }

    /* renamed from: h */
    public final InterfaceC0527l m1539h() {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        C0526k c0526k = this.f3596b;
        long jM1595z = c0526k.m1595z();
        if (jM1595z > 0) {
            this.f3595a.h0(c0526k, jM1595z);
        }
        return this;
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.h0(source, j6);
        m1539h();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3597c;
    }

    /* renamed from: j */
    public final InterfaceC0527l m1540j(long j6) {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.C0(j6);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final long j0(i0 source) {
        AbstractC4154l.m8923f(source, "source");
        long j6 = 0;
        while (true) {
            long jG0 = source.g0(this.f3596b, 8192L);
            if (jG0 == -1) {
                return j6;
            }
            j6 += jG0;
            m1539h();
        }
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l p0(C0529n byteString) {
        AbstractC4154l.m8923f(byteString, "byteString");
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.A0(byteString);
        m1539h();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f3595a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC4154l.m8923f(source, "source");
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f3596b.write(source);
        m1539h();
        return iWrite;
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l writeByte(int i10) {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.B0(i10);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l writeInt(int i10) {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.E0(i10);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l writeShort(int i10) {
        if (this.f3597c) {
            throw new IllegalStateException("closed");
        }
        this.f3596b.F0(i10);
        m1539h();
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l write(byte[] source) {
        AbstractC4154l.m8923f(source, "source");
        if (!this.f3597c) {
            this.f3596b.write(source, 0, source.length);
            m1539h();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
