package p001o;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Api;
import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class xce implements im1 {

    /* renamed from: a */
    public final lzf f53527a;

    /* renamed from: b */
    public final rl1 f53528b;

    /* renamed from: c */
    public boolean f53529c;

    public xce(lzf lzfVar) {
        sq8.m48649h(lzfVar, "source");
        this.f53527a = lzfVar;
        this.f53528b = new rl1();
    }

    @Override // p001o.im1
    public int C2() throws EOFException {
        k1(4L);
        return this.f53528b.C2();
    }

    @Override // p001o.im1
    /* renamed from: N */
    public void mo32307N(rl1 rl1Var, long j) throws EOFException {
        sq8.m48649h(rl1Var, "sink");
        try {
            k1(j);
            this.f53528b.mo32307N(rl1Var, j);
        } catch (EOFException e) {
            rl1Var.p0(this.f53528b);
            throw e;
        }
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(true ^ this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f53528b.f0() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return -1L;
            }
        }
        return this.f53528b.N0(rl1Var, Math.min(j, this.f53528b.f0()));
    }

    @Override // p001o.im1
    public String Q0() {
        return c0(Long.MAX_VALUE);
    }

    @Override // p001o.im1
    public byte[] T0(long j) throws EOFException {
        k1(j);
        return this.f53528b.T0(j);
    }

    @Override // p001o.im1
    public long T2(dvf dvfVar) {
        sq8.m48649h(dvfVar, "sink");
        long j = 0;
        while (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) != -1) {
            long jM46913c = this.f53528b.m46913c();
            if (jM46913c > 0) {
                j += jM46913c;
                dvfVar.M0(this.f53528b, jM46913c);
            }
        }
        if (this.f53528b.f0() <= 0) {
            return j;
        }
        long jF0 = j + this.f53528b.f0();
        rl1 rl1Var = this.f53528b;
        dvfVar.M0(rl1Var, rl1Var.f0());
        return jF0;
    }

    @Override // p001o.im1
    /* renamed from: W */
    public long mo32308W(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        return m56025d(zq1Var, 0L);
    }

    @Override // p001o.im1
    public short X0() throws EOFException {
        k1(2L);
        return this.f53528b.X0();
    }

    /* renamed from: a */
    public long m56023a(byte b) {
        return m56024c(b, 0L, Long.MAX_VALUE);
    }

    /* renamed from: c */
    public long m56024c(byte b, long j, long j2) {
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j && j <= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jM46919t = this.f53528b.m46919t(b, j, j2);
            if (jM46919t != -1) {
                return jM46919t;
            }
            long jF0 = this.f53528b.f0();
            if (jF0 >= j2 || this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return -1L;
            }
            j = Math.max(j, jF0);
        }
        return -1L;
    }

    @Override // p001o.im1
    public String c0(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM56024c = m56024c((byte) 10, 0L, j2);
        if (jM56024c != -1) {
            return AbstractC12275b.m18070e(this.f53528b, jM56024c);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.f53528b.m46918s(j2 - 1) == 13 && request(1 + j2) && this.f53528b.m46918s(j2) == 10) {
            return AbstractC12275b.m18070e(this.f53528b, j2);
        }
        rl1 rl1Var = new rl1();
        rl1 rl1Var2 = this.f53528b;
        rl1Var2.m46915g(rl1Var, 0L, Math.min(32, rl1Var2.f0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f53528b.f0(), j) + " content=" + rl1Var.m46906O().mo38697s() + (char) 8230);
    }

    @Override // p001o.im1
    public long c1() throws EOFException {
        k1(8L);
        return this.f53528b.c1();
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f53529c) {
            return;
        }
        this.f53529c = true;
        this.f53527a.close();
        this.f53528b.clear();
    }

    /* renamed from: d */
    public long m56025d(zq1 zq1Var, long j) {
        sq8.m48649h(zq1Var, "bytes");
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jM46920u = this.f53528b.m46920u(zq1Var, j);
            if (jM46920u != -1) {
                return jM46920u;
            }
            long jF0 = this.f53528b.f0();
            if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return -1L;
            }
            j = Math.max(j, (jF0 - zq1Var.m59694L()) + 1);
        }
    }

    @Override // p001o.im1
    /* renamed from: e */
    public rl1 mo32309e() {
        return this.f53528b;
    }

    /* renamed from: f */
    public long m56026f(zq1 zq1Var, long j) {
        sq8.m48649h(zq1Var, "targetBytes");
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jM46902C = this.f53528b.m46902C(zq1Var, j);
            if (jM46902C != -1) {
                return jM46902C;
            }
            long jF0 = this.f53528b.f0();
            if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return -1L;
            }
            j = Math.max(j, jF0);
        }
    }

    @Override // p001o.im1, p001o.gm1
    public rl1 getBuffer() {
        return this.f53528b;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f53529c;
    }

    @Override // p001o.im1
    public void k1(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p001o.im1
    /* renamed from: m */
    public byte[] mo32310m() {
        this.f53528b.p0(this.f53527a);
        return this.f53528b.mo32310m();
    }

    @Override // p001o.im1
    public long m3() throws EOFException {
        byte bM46918s;
        k1(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            bM46918s = this.f53528b.m46918s(i);
            if ((bM46918s < 48 || bM46918s > 57) && ((bM46918s < 97 || bM46918s > 102) && (bM46918s < 65 || bM46918s > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bM46918s, ph2.m43651a(16));
            sq8.m48648g(string, "toString(...)");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f53528b.m3();
    }

    @Override // p001o.im1
    /* renamed from: n */
    public boolean mo32311n() {
        if (!this.f53529c) {
            return this.f53528b.mo32311n() && this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p001o.im1
    public String n2(Charset charset) {
        sq8.m48649h(charset, "charset");
        this.f53528b.p0(this.f53527a);
        return this.f53528b.n2(charset);
    }

    @Override // p001o.im1
    public int n3(qec qecVar) throws EOFException {
        sq8.m48649h(qecVar, "options");
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iM18071f = AbstractC12275b.m18071f(this.f53528b, qecVar, true);
            if (iM18071f != -2) {
                if (iM18071f != -1) {
                    this.f53528b.skip(qecVar.m45283o()[iM18071f].m59694L());
                    return iM18071f;
                }
            } else if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p001o.im1
    public InputStream o3() {
        return new C18114a();
    }

    @Override // p001o.im1
    public im1 peek() {
        return uac.m51310c(new b3d(this));
    }

    @Override // p001o.im1
    public long r2(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "targetBytes");
        return m56026f(zq1Var, 0L);
    }

    @Override // p001o.im1
    public int read(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "sink");
        long j = i2;
        AbstractC13298f.m25885b(bArr.length, i, j);
        if (this.f53528b.f0() == 0) {
            if (i2 == 0) {
                return 0;
            }
            if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return -1;
            }
        }
        return this.f53528b.read(bArr, i, (int) Math.min(j, this.f53528b.f0()));
    }

    @Override // p001o.im1
    public byte readByte() throws EOFException {
        k1(1L);
        return this.f53528b.readByte();
    }

    @Override // p001o.im1
    public void readFully(byte[] bArr) throws EOFException {
        sq8.m48649h(bArr, "sink");
        try {
            k1(bArr.length);
            this.f53528b.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f53528b.f0() > 0) {
                rl1 rl1Var = this.f53528b;
                int i2 = rl1Var.read(bArr, i, (int) rl1Var.f0());
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    @Override // p001o.im1
    public int readInt() throws EOFException {
        k1(4L);
        return this.f53528b.readInt();
    }

    @Override // p001o.im1
    public long readLong() throws EOFException {
        k1(8L);
        return this.f53528b.readLong();
    }

    @Override // p001o.im1
    public short readShort() throws EOFException {
        k1(2L);
        return this.f53528b.readShort();
    }

    @Override // p001o.im1
    public boolean request(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f53528b.f0() < j) {
            if (this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.im1
    public void skip(long j) throws EOFException {
        if (!(!this.f53529c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.f53528b.f0() == 0 && this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f53528b.f0());
            this.f53528b.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p001o.im1
    public String t1(long j) throws EOFException {
        k1(j);
        return this.f53528b.t1(j);
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f53527a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f53527a + ')';
    }

    @Override // p001o.im1
    public zq1 y1(long j) throws EOFException {
        k1(j);
        return this.f53528b.y1(j);
    }

    /* renamed from: o.xce$a */
    public static final class C18114a extends InputStream {
        public C18114a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            xce xceVar = xce.this;
            if (xceVar.f53529c) {
                throw new IOException("closed");
            }
            return (int) Math.min(xceVar.f53528b.f0(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            xce.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            xce xceVar = xce.this;
            if (xceVar.f53529c) {
                throw new IOException("closed");
            }
            if (xceVar.f53528b.f0() == 0) {
                xce xceVar2 = xce.this;
                if (xceVar2.f53527a.N0(xceVar2.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                    return -1;
                }
            }
            return xce.this.f53528b.readByte() & 255;
        }

        public String toString() {
            return xce.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!xce.this.f53529c) {
                AbstractC13298f.m25885b(bArr.length, i, i2);
                if (xce.this.f53528b.f0() == 0) {
                    xce xceVar = xce.this;
                    if (xceVar.f53527a.N0(xceVar.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                        return -1;
                    }
                }
                return xce.this.f53528b.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "sink");
        if (this.f53528b.f0() == 0 && this.f53527a.N0(this.f53528b, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
            return -1;
        }
        return this.f53528b.read(byteBuffer);
    }
}
