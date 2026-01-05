package b00;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.u */
/* loaded from: classes3.dex */
public final class C0536u implements i0 {

    /* renamed from: a */
    public byte f3667a;

    /* renamed from: b */
    public final d0 f3668b;

    /* renamed from: c */
    public final Inflater f3669c;

    /* renamed from: d */
    public final C0537v f3670d;

    /* renamed from: e */
    public final CRC32 f3671e;

    public C0536u(InterfaceC0528m source) {
        AbstractC4154l.m8923f(source, "source");
        d0 d0Var = new d0(source);
        this.f3668b = d0Var;
        Inflater inflater = new Inflater(true);
        this.f3669c = inflater;
        this.f3670d = new C0537v(d0Var, inflater);
        this.f3671e = new CRC32();
    }

    /* renamed from: h */
    public static void m1624h(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ": actual 0x");
        sbM11245p.append(AbstractC5178p.m10105P(8, AbstractC0517b.m1531j(i11)));
        sbM11245p.append(" != expected 0x");
        sbM11245p.append(AbstractC5178p.m10105P(8, AbstractC0517b.m1531j(i10)));
        throw new IOException(sbM11245p.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3670d.close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f3668b.f3601a.mo1532f();
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws DataFormatException, IOException {
        C0536u c0536u = this;
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        if (j6 == 0) {
            return 0L;
        }
        byte b10 = c0536u.f3667a;
        CRC32 crc32 = c0536u.f3671e;
        d0 d0Var = c0536u.f3668b;
        if (b10 == 0) {
            d0Var.s0(10L);
            C0526k c0526k = d0Var.f3602b;
            byte bM1587H = c0526k.m1587H(3L);
            boolean z6 = ((bM1587H >> 1) & 1) == 1;
            if (z6) {
                c0536u.m1625j(c0526k, 0L, 10L);
            }
            m1624h(8075, d0Var.readShort(), "ID1ID2");
            d0Var.skip(8L);
            if (((bM1587H >> 2) & 1) == 1) {
                d0Var.s0(2L);
                if (z6) {
                    m1625j(c0526k, 0L, 2L);
                }
                long jM1592U = c0526k.m1592U() & HPKE.aead_EXPORT_ONLY;
                d0Var.s0(jM1592U);
                if (z6) {
                    m1625j(c0526k, 0L, jM1592U);
                }
                d0Var.skip(jM1592U);
            }
            if (((bM1587H >> 3) & 1) == 1) {
                long jM1546h = d0Var.m1546h((byte) 0, 0L, Long.MAX_VALUE);
                if (jM1546h == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    m1625j(c0526k, 0L, jM1546h + 1);
                }
                d0Var.skip(jM1546h + 1);
            }
            if (((bM1587H >> 4) & 1) == 1) {
                long jM1546h2 = d0Var.m1546h((byte) 0, 0L, Long.MAX_VALUE);
                if (jM1546h2 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    c0536u = this;
                    c0536u.m1625j(c0526k, 0L, jM1546h2 + 1);
                } else {
                    c0536u = this;
                }
                d0Var.skip(jM1546h2 + 1);
            } else {
                c0536u = this;
            }
            if (z6) {
                m1624h(d0Var.m1550u(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c0536u.f3667a = (byte) 1;
        }
        if (c0536u.f3667a == 1) {
            long j10 = sink.f3638b;
            long jG0 = c0536u.f3670d.g0(sink, j6);
            if (jG0 != -1) {
                c0536u.m1625j(sink, j10, jG0);
                return jG0;
            }
            c0536u.f3667a = (byte) 2;
        }
        if (c0536u.f3667a == 2) {
            m1624h(d0Var.m1547j(), (int) crc32.getValue(), "CRC");
            m1624h(d0Var.m1547j(), (int) c0536u.f3669c.getBytesWritten(), "ISIZE");
            c0536u.f3667a = (byte) 3;
            if (!d0Var.mo1545e()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: j */
    public final void m1625j(C0526k c0526k, long j6, long j10) {
        e0 e0Var = c0526k.f3637a;
        AbstractC4154l.m8920c(e0Var);
        while (true) {
            int i10 = e0Var.f3609c;
            int i11 = e0Var.f3608b;
            if (j6 < i10 - i11) {
                break;
            }
            j6 -= i10 - i11;
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
        }
        while (j10 > 0) {
            int iMin = (int) Math.min(e0Var.f3609c - r6, j10);
            this.f3671e.update(e0Var.f3607a, (int) (e0Var.f3608b + j6), iMin);
            j10 -= iMin;
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j6 = 0;
        }
    }
}
