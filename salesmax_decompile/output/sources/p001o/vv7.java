package p001o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes6.dex */
public final class vv7 implements lzf {

    /* renamed from: a */
    public byte f50917a;

    /* renamed from: b */
    public final xce f50918b;

    /* renamed from: c */
    public final Inflater f50919c;

    /* renamed from: d */
    public final di8 f50920d;

    /* renamed from: e */
    public final CRC32 f50921e;

    public vv7(lzf lzfVar) {
        sq8.m48649h(lzfVar, "source");
        xce xceVar = new xce(lzfVar);
        this.f50918b = xceVar;
        Inflater inflater = new Inflater(true);
        this.f50919c = inflater;
        this.f50920d = new di8((im1) xceVar, inflater);
        this.f50921e = new CRC32();
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) throws DataFormatException, IOException {
        sq8.m48649h(rl1Var, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f50917a == 0) {
            m53483c();
            this.f50917a = (byte) 1;
        }
        if (this.f50917a == 1) {
            long jF0 = rl1Var.f0();
            long jN0 = this.f50920d.N0(rl1Var, j);
            if (jN0 != -1) {
                m53485f(rl1Var, jF0, jN0);
                return jN0;
            }
            this.f50917a = (byte) 2;
        }
        if (this.f50917a == 2) {
            m53484d();
            this.f50917a = (byte) 3;
            if (!this.f50918b.mo32311n()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: a */
    public final void m53482a(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + f9g.o0(AbstractC13298f.m25895l(i2), 8, '0') + " != expected 0x" + f9g.o0(AbstractC13298f.m25895l(i), 8, '0'));
    }

    /* renamed from: c */
    public final void m53483c() throws IOException {
        this.f50918b.k1(10L);
        byte bM46918s = this.f50918b.f53528b.m46918s(3L);
        boolean z = ((bM46918s >> 1) & 1) == 1;
        if (z) {
            m53485f(this.f50918b.f53528b, 0L, 10L);
        }
        m53482a("ID1ID2", 8075, this.f50918b.readShort());
        this.f50918b.skip(8L);
        if (((bM46918s >> 2) & 1) == 1) {
            this.f50918b.k1(2L);
            if (z) {
                m53485f(this.f50918b.f53528b, 0L, 2L);
            }
            long jX0 = this.f50918b.f53528b.X0() & 65535;
            this.f50918b.k1(jX0);
            if (z) {
                m53485f(this.f50918b.f53528b, 0L, jX0);
            }
            this.f50918b.skip(jX0);
        }
        if (((bM46918s >> 3) & 1) == 1) {
            long jM56023a = this.f50918b.m56023a((byte) 0);
            if (jM56023a == -1) {
                throw new EOFException();
            }
            if (z) {
                m53485f(this.f50918b.f53528b, 0L, jM56023a + 1);
            }
            this.f50918b.skip(jM56023a + 1);
        }
        if (((bM46918s >> 4) & 1) == 1) {
            long jM56023a2 = this.f50918b.m56023a((byte) 0);
            if (jM56023a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m53485f(this.f50918b.f53528b, 0L, jM56023a2 + 1);
            }
            this.f50918b.skip(jM56023a2 + 1);
        }
        if (z) {
            m53482a("FHCRC", this.f50918b.X0(), (short) this.f50921e.getValue());
            this.f50921e.reset();
        }
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50920d.close();
    }

    /* renamed from: d */
    public final void m53484d() throws IOException {
        m53482a("CRC", this.f50918b.C2(), (int) this.f50921e.getValue());
        m53482a("ISIZE", this.f50918b.C2(), (int) this.f50919c.getBytesWritten());
    }

    /* renamed from: f */
    public final void m53485f(rl1 rl1Var, long j, long j2) {
        hbf hbfVar = rl1Var.f43757a;
        sq8.m48646e(hbfVar);
        while (true) {
            int i = hbfVar.f26589c;
            int i2 = hbfVar.f26588b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(hbfVar.f26589c - r6, j2);
            this.f50921e.update(hbfVar.f26587a, (int) (hbfVar.f26588b + j), iMin);
            j2 -= iMin;
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            j = 0;
        }
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f50918b.timeout();
    }
}
