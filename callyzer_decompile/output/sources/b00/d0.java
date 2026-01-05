package b00;

import c00.AbstractC0834a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import og.d2;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 implements InterfaceC0528m {

    /* renamed from: a */
    public final i0 f3601a;

    /* renamed from: b */
    public final C0526k f3602b;

    /* renamed from: c */
    public boolean f3603c;

    public d0(i0 source) {
        AbstractC4154l.m8923f(source, "source");
        this.f3601a = source;
        this.f3602b = new C0526k();
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: C */
    public final String mo1541C(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("limit < 0: ", j6).toString());
        }
        long j10 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long jM1546h = m1546h((byte) 10, 0L, j10);
        C0526k c0526k = this.f3602b;
        if (jM1546h != -1) {
            return AbstractC0834a.m2246b(c0526k, jM1546h);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && c0526k.m1587H(j10 - 1) == 13 && request(j10 + 1) && c0526k.m1587H(j10) == 10) {
            return AbstractC0834a.m2246b(c0526k, j10);
        }
        C0526k c0526k2 = new C0526k();
        c0526k.m1586A(c0526k2, 0L, Math.min(32, c0526k.f3638b));
        throw new EOFException("\\n not found: limit=" + Math.min(c0526k.f3638b, j6) + " content=" + c0526k2.mo1549o(c0526k2.f3638b).mo1564e() + (char) 8230);
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: D */
    public final int mo1542D(C0541z options) throws EOFException {
        AbstractC4154l.m8923f(options, "options");
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0526k c0526k = this.f3602b;
            int iM2247c = AbstractC0834a.m2247c(c0526k, options, true);
            if (iM2247c != -2) {
                if (iM2247c != -1) {
                    c0526k.skip(options.f3680a[iM2247c].mo1563d());
                    return iM2247c;
                }
            } else if (this.f3601a.g0(c0526k, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: Q */
    public final String mo1543Q(Charset charset) {
        AbstractC4154l.m8923f(charset, "charset");
        i0 i0Var = this.f3601a;
        C0526k c0526k = this.f3602b;
        c0526k.j0(i0Var);
        return c0526k.mo1543Q(charset);
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: a */
    public final C0526k mo1544a() {
        return this.f3602b;
    }

    @Override // b00.InterfaceC0528m
    public final String b0() {
        return mo1541C(Long.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f3603c) {
            return;
        }
        this.f3603c = true;
        this.f3601a.close();
        this.f3602b.m1593n();
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: e */
    public final boolean mo1545e() {
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        C0526k c0526k = this.f3602b;
        return c0526k.mo1545e() && this.f3601a.g0(c0526k, 8192L) == -1;
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f3601a.mo1532f();
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        C0526k c0526k = this.f3602b;
        if (c0526k.f3638b == 0) {
            if (j6 == 0) {
                return 0L;
            }
            if (this.f3601a.g0(c0526k, 8192L) == -1) {
                return -1L;
            }
        }
        return c0526k.g0(sink, Math.min(j6, c0526k.f3638b));
    }

    /* renamed from: h */
    public final long m1546h(byte b10, long j6, long j10) {
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10) {
            throw new IllegalArgumentException(a1.m14330j("fromIndex=0 toIndex=", j10).toString());
        }
        long jMax = 0;
        while (jMax < j10) {
            C0526k c0526k = this.f3602b;
            byte b11 = b10;
            long j11 = j10;
            long jM1588J = c0526k.m1588J(b11, jMax, j11);
            if (jM1588J != -1) {
                return jM1588J;
            }
            long j12 = c0526k.f3638b;
            if (j12 >= j11 || this.f3601a.g0(c0526k, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            b10 = b11;
            j10 = j11;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3603c;
    }

    /* renamed from: j */
    public final int m1547j() {
        s0(4L);
        int i10 = this.f3602b.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // b00.InterfaceC0528m
    public final long l0(InterfaceC0527l interfaceC0527l) {
        C0526k c0526k;
        long j6 = 0;
        while (true) {
            i0 i0Var = this.f3601a;
            c0526k = this.f3602b;
            if (i0Var.g0(c0526k, 8192L) == -1) {
                break;
            }
            long jM1595z = c0526k.m1595z();
            if (jM1595z > 0) {
                j6 += jM1595z;
                interfaceC0527l.h0(c0526k, jM1595z);
            }
        }
        long j10 = c0526k.f3638b;
        if (j10 <= 0) {
            return j6;
        }
        long j11 = j6 + j10;
        interfaceC0527l.h0(c0526k, j10);
        return j11;
    }

    /* renamed from: n */
    public final long m1548n() throws EOFException {
        char c2;
        char c10;
        char c11;
        char c12;
        long j6;
        s0(8L);
        C0526k c0526k = this.f3602b;
        if (c0526k.f3638b < 8) {
            throw new EOFException();
        }
        e0 e0Var = c0526k.f3637a;
        AbstractC4154l.m8920c(e0Var);
        int i10 = e0Var.f3608b;
        int i11 = e0Var.f3609c;
        if (i11 - i10 < 8) {
            j6 = ((c0526k.readInt() & 4294967295L) << 32) | (4294967295L & c0526k.readInt());
            c11 = '8';
            c12 = '\b';
            c2 = 24;
            c10 = '(';
        } else {
            byte[] bArr = e0Var.f3607a;
            c2 = 24;
            c10 = '(';
            c11 = '8';
            c12 = '\b';
            int i12 = i10 + 7;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j11 = j10 | (bArr[i12] & 255);
            c0526k.f3638b -= 8;
            if (i13 == i11) {
                c0526k.f3637a = e0Var.m1552a();
                f0.m1559a(e0Var);
            } else {
                e0Var.f3608b = i13;
            }
            j6 = j11;
        }
        return ((j6 & 255) << c11) | (((-72057594037927936L) & j6) >>> c11) | ((71776119061217280L & j6) >>> c10) | ((280375465082880L & j6) >>> c2) | ((1095216660480L & j6) >>> c12) | ((4278190080L & j6) << c12) | ((16711680 & j6) << c2) | ((65280 & j6) << c10);
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: o */
    public final C0529n mo1549o(long j6) {
        s0(j6);
        return this.f3602b.mo1549o(j6);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC4154l.m8923f(sink, "sink");
        C0526k c0526k = this.f3602b;
        if (c0526k.f3638b == 0 && this.f3601a.g0(c0526k, 8192L) == -1) {
            return -1;
        }
        return c0526k.read(sink);
    }

    @Override // b00.InterfaceC0528m
    public final byte readByte() {
        s0(1L);
        return this.f3602b.readByte();
    }

    @Override // b00.InterfaceC0528m
    public final int readInt() {
        s0(4L);
        return this.f3602b.readInt();
    }

    @Override // b00.InterfaceC0528m
    public final short readShort() {
        s0(2L);
        return this.f3602b.readShort();
    }

    @Override // b00.InterfaceC0528m
    public final boolean request(long j6) {
        C0526k c0526k;
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0526k = this.f3602b;
            if (c0526k.f3638b >= j6) {
                return true;
            }
        } while (this.f3601a.g0(c0526k, 8192L) != -1);
        return false;
    }

    @Override // b00.InterfaceC0528m
    public final void s0(long j6) {
        if (!request(j6)) {
            throw new EOFException();
        }
    }

    @Override // b00.InterfaceC0528m
    public final void skip(long j6) {
        if (this.f3603c) {
            throw new IllegalStateException("closed");
        }
        while (j6 > 0) {
            C0526k c0526k = this.f3602b;
            if (c0526k.f3638b == 0 && this.f3601a.g0(c0526k, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j6, c0526k.f3638b);
            c0526k.skip(jMin);
            j6 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f3601a + ')';
    }

    /* renamed from: u */
    public final short m1550u() {
        s0(2L);
        return this.f3602b.m1592U();
    }

    /* renamed from: w */
    public final String m1551w(long j6) {
        s0(j6);
        C0526k c0526k = this.f3602b;
        c0526k.getClass();
        return c0526k.a0(j6, AbstractC5163a.f25245a);
    }

    @Override // b00.InterfaceC0528m
    public final long x0() {
        C0526k c0526k;
        byte bM1587H;
        s0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zRequest = request(i11);
            c0526k = this.f3602b;
            if (!zRequest) {
                break;
            }
            bM1587H = c0526k.m1587H(i10);
            if ((bM1587H < 48 || bM1587H > 57) && ((bM1587H < 97 || bM1587H > 102) && (bM1587H < 65 || bM1587H > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            d2.m10599b(16);
            String string = Integer.toString(bM1587H, 16);
            AbstractC4154l.m8922e(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c0526k.x0();
    }

    @Override // b00.InterfaceC0528m
    public final InputStream z0() {
        return new C0524i(this, 1);
    }
}
