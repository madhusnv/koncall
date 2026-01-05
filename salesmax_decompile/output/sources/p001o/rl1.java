package p001o;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class rl1 implements im1, gm1, Cloneable, ByteChannel {

    /* renamed from: a */
    public hbf f43757a;

    /* renamed from: b */
    public long f43758b;

    /* renamed from: o.rl1$b */
    public static final class C16621b implements Closeable {

        /* renamed from: a */
        public rl1 f43760a;

        /* renamed from: b */
        public boolean f43761b;

        /* renamed from: c */
        public hbf f43762c;

        /* renamed from: e */
        public byte[] f43764e;

        /* renamed from: d */
        public long f43763d = -1;

        /* renamed from: f */
        public int f43765f = -1;

        /* renamed from: g */
        public int f43766g = -1;

        /* renamed from: a */
        public final hbf m46921a() {
            return this.f43762c;
        }

        /* renamed from: c */
        public final int m46922c() {
            long j = this.f43763d;
            rl1 rl1Var = this.f43760a;
            sq8.m48646e(rl1Var);
            if (!(j != rl1Var.f0())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j2 = this.f43763d;
            return m46924f(j2 == -1 ? 0L : j2 + (this.f43766g - this.f43765f));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f43760a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f43760a = null;
            m46925g(null);
            this.f43763d = -1L;
            this.f43764e = null;
            this.f43765f = -1;
            this.f43766g = -1;
        }

        /* renamed from: d */
        public final long m46923d(long j) {
            rl1 rl1Var = this.f43760a;
            if (rl1Var == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f43761b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long jF0 = rl1Var.f0();
            int i = 1;
            if (j <= jF0) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = jF0 - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    hbf hbfVar = rl1Var.f43757a;
                    sq8.m48646e(hbfVar);
                    hbf hbfVar2 = hbfVar.f26593g;
                    sq8.m48646e(hbfVar2);
                    int i2 = hbfVar2.f26589c;
                    long j3 = i2 - hbfVar2.f26588b;
                    if (j3 > j2) {
                        hbfVar2.f26589c = i2 - ((int) j2);
                        break;
                    }
                    rl1Var.f43757a = hbfVar2.m30154b();
                    lbf.m36864b(hbfVar2);
                    j2 -= j3;
                }
                m46925g(null);
                this.f43763d = j;
                this.f43764e = null;
                this.f43765f = -1;
                this.f43766g = -1;
            } else if (j > jF0) {
                long j4 = j - jF0;
                boolean z = true;
                while (j4 > 0) {
                    hbf hbfVarR0 = rl1Var.r0(i);
                    int iMin = (int) Math.min(j4, 8192 - hbfVarR0.f26589c);
                    hbfVarR0.f26589c += iMin;
                    j4 -= iMin;
                    if (z) {
                        m46925g(hbfVarR0);
                        this.f43763d = jF0;
                        this.f43764e = hbfVarR0.f26587a;
                        int i3 = hbfVarR0.f26589c;
                        this.f43765f = i3 - iMin;
                        this.f43766g = i3;
                        z = false;
                    }
                    i = 1;
                }
            }
            rl1Var.m46911Y(j);
            return jF0;
        }

        /* renamed from: f */
        public final int m46924f(long j) {
            hbf hbfVarM30155c;
            rl1 rl1Var = this.f43760a;
            if (rl1Var == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j < -1 || j > rl1Var.f0()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + rl1Var.f0());
            }
            if (j == -1 || j == rl1Var.f0()) {
                m46925g(null);
                this.f43763d = j;
                this.f43764e = null;
                this.f43765f = -1;
                this.f43766g = -1;
                return -1;
            }
            long jF0 = rl1Var.f0();
            hbf hbfVarM46921a = rl1Var.f43757a;
            long j2 = 0;
            if (m46921a() != null) {
                long j3 = this.f43763d;
                int i = this.f43765f;
                sq8.m48646e(m46921a());
                long j4 = j3 - (i - r9.f26588b);
                if (j4 > j) {
                    hbfVarM30155c = hbfVarM46921a;
                    hbfVarM46921a = m46921a();
                    jF0 = j4;
                } else {
                    hbfVarM30155c = m46921a();
                    j2 = j4;
                }
            } else {
                hbfVarM30155c = hbfVarM46921a;
            }
            if (jF0 - j > j - j2) {
                while (true) {
                    sq8.m48646e(hbfVarM30155c);
                    int i2 = hbfVarM30155c.f26589c;
                    int i3 = hbfVarM30155c.f26588b;
                    if (j < (i2 - i3) + j2) {
                        break;
                    }
                    j2 += i2 - i3;
                    hbfVarM30155c = hbfVarM30155c.f26592f;
                }
            } else {
                while (jF0 > j) {
                    sq8.m48646e(hbfVarM46921a);
                    hbfVarM46921a = hbfVarM46921a.f26593g;
                    sq8.m48646e(hbfVarM46921a);
                    jF0 -= hbfVarM46921a.f26589c - hbfVarM46921a.f26588b;
                }
                j2 = jF0;
                hbfVarM30155c = hbfVarM46921a;
            }
            if (this.f43761b) {
                sq8.m48646e(hbfVarM30155c);
                if (hbfVarM30155c.f26590d) {
                    hbf hbfVarM30158f = hbfVarM30155c.m30158f();
                    if (rl1Var.f43757a == hbfVarM30155c) {
                        rl1Var.f43757a = hbfVarM30158f;
                    }
                    hbfVarM30155c = hbfVarM30155c.m30155c(hbfVarM30158f);
                    hbf hbfVar = hbfVarM30155c.f26593g;
                    sq8.m48646e(hbfVar);
                    hbfVar.m30154b();
                }
            }
            m46925g(hbfVarM30155c);
            this.f43763d = j;
            sq8.m48646e(hbfVarM30155c);
            this.f43764e = hbfVarM30155c.f26587a;
            int i4 = hbfVarM30155c.f26588b + ((int) (j - j2));
            this.f43765f = i4;
            int i5 = hbfVarM30155c.f26589c;
            this.f43766g = i5;
            return i5 - i4;
        }

        /* renamed from: g */
        public final void m46925g(hbf hbfVar) {
            this.f43762c = hbfVar;
        }
    }

    /* renamed from: K */
    public static /* synthetic */ C16621b m46901K(rl1 rl1Var, C16621b c16621b, int i, Object obj) {
        if ((i & 1) != 0) {
            c16621b = AbstractC13298f.m25887d();
        }
        return rl1Var.m46905J(c16621b);
    }

    @Override // p001o.gm1
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public rl1 write(byte[] bArr) {
        sq8.m48649h(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: C */
    public long m46902C(zq1 zq1Var, long j) {
        int i;
        int i2;
        sq8.m48649h(zq1Var, "targetBytes");
        long jF0 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        hbf hbfVar = this.f43757a;
        if (hbfVar == null) {
            return -1L;
        }
        if (f0() - j < j) {
            jF0 = f0();
            while (jF0 > j) {
                hbfVar = hbfVar.f26593g;
                sq8.m48646e(hbfVar);
                jF0 -= hbfVar.f26589c - hbfVar.f26588b;
            }
            if (zq1Var.m59694L() == 2) {
                byte bM59699h = zq1Var.m59699h(0);
                byte bM59699h2 = zq1Var.m59699h(1);
                while (jF0 < f0()) {
                    byte[] bArr = hbfVar.f26587a;
                    i = (int) ((hbfVar.f26588b + j) - jF0);
                    int i3 = hbfVar.f26589c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bM59699h || b == bM59699h2) {
                            i2 = hbfVar.f26588b;
                        } else {
                            i++;
                        }
                    }
                    jF0 += hbfVar.f26589c - hbfVar.f26588b;
                    hbfVar = hbfVar.f26592f;
                    sq8.m48646e(hbfVar);
                    j = jF0;
                }
                return -1L;
            }
            byte[] bArrMo38699y = zq1Var.mo38699y();
            while (jF0 < f0()) {
                byte[] bArr2 = hbfVar.f26587a;
                i = (int) ((hbfVar.f26588b + j) - jF0);
                int i4 = hbfVar.f26589c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : bArrMo38699y) {
                        if (b2 == b3) {
                            i2 = hbfVar.f26588b;
                        }
                    }
                    i++;
                }
                jF0 += hbfVar.f26589c - hbfVar.f26588b;
                hbfVar = hbfVar.f26592f;
                sq8.m48646e(hbfVar);
                j = jF0;
            }
            return -1L;
        }
        while (true) {
            long j2 = (hbfVar.f26589c - hbfVar.f26588b) + jF0;
            if (j2 > j) {
                break;
            }
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            jF0 = j2;
        }
        if (zq1Var.m59694L() == 2) {
            byte bM59699h3 = zq1Var.m59699h(0);
            byte bM59699h4 = zq1Var.m59699h(1);
            while (jF0 < f0()) {
                byte[] bArr3 = hbfVar.f26587a;
                i = (int) ((hbfVar.f26588b + j) - jF0);
                int i5 = hbfVar.f26589c;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bM59699h3 || b4 == bM59699h4) {
                        i2 = hbfVar.f26588b;
                    } else {
                        i++;
                    }
                }
                jF0 += hbfVar.f26589c - hbfVar.f26588b;
                hbfVar = hbfVar.f26592f;
                sq8.m48646e(hbfVar);
                j = jF0;
            }
            return -1L;
        }
        byte[] bArrMo38699y2 = zq1Var.mo38699y();
        while (jF0 < f0()) {
            byte[] bArr4 = hbfVar.f26587a;
            i = (int) ((hbfVar.f26588b + j) - jF0);
            int i6 = hbfVar.f26589c;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : bArrMo38699y2) {
                    if (b5 == b6) {
                        i2 = hbfVar.f26588b;
                    }
                }
                i++;
            }
            jF0 += hbfVar.f26589c - hbfVar.f26588b;
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            j = jF0;
        }
        return -1L;
        return (i - i2) + jF0;
    }

    @Override // p001o.im1
    public int C2() {
        return AbstractC13298f.m25891h(readInt());
    }

    /* renamed from: D */
    public boolean m46903D(long j, zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        return m46904H(j, zq1Var, 0, zq1Var.m59694L());
    }

    @Override // p001o.gm1
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public rl1 write(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "source");
        long j = i2;
        AbstractC13298f.m25885b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            hbf hbfVarR0 = r0(1);
            int iMin = Math.min(i3 - i, 8192 - hbfVarR0.f26589c);
            int i4 = i + iMin;
            fp0.m27256e(bArr, hbfVarR0.f26587a, hbfVarR0.f26589c, i, i4);
            hbfVarR0.f26589c += iMin;
            i = i4;
        }
        m46911Y(f0() + j);
        return this;
    }

    @Override // p001o.gm1
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public rl1 T1(int i) {
        hbf hbfVarR0 = r0(1);
        byte[] bArr = hbfVarR0.f26587a;
        int i2 = hbfVarR0.f26589c;
        hbfVarR0.f26589c = i2 + 1;
        bArr[i2] = (byte) i;
        m46911Y(f0() + 1);
        return this;
    }

    /* renamed from: H */
    public boolean m46904H(long j, zq1 zq1Var, int i, int i2) {
        sq8.m48649h(zq1Var, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || f0() - j < i2 || zq1Var.m59694L() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m46918s(i3 + j) != zq1Var.m59699h(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public rl1 I0(long j) {
        boolean z;
        if (j == 0) {
            return T1(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return n0("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        hbf hbfVarR0 = r0(i);
        byte[] bArr = hbfVarR0.f26587a;
        int i2 = hbfVarR0.f26589c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC12275b.m18068c()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        hbfVarR0.f26589c += i;
        m46911Y(f0() + i);
        return this;
    }

    /* renamed from: J */
    public final C16621b m46905J(C16621b c16621b) {
        sq8.m48649h(c16621b, "unsafeCursor");
        return AbstractC12275b.m18066a(this, c16621b);
    }

    @Override // p001o.gm1
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public rl1 t2(long j) {
        if (j == 0) {
            return T1(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        hbf hbfVarR0 = r0(i);
        byte[] bArr = hbfVarR0.f26587a;
        int i2 = hbfVarR0.f26589c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC12275b.m18068c()[(int) (15 & j)];
            j >>>= 4;
        }
        hbfVarR0.f26589c += i;
        m46911Y(f0() + i);
        return this;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) {
        hbf hbfVar;
        sq8.m48649h(rl1Var, "source");
        if (!(rl1Var != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        AbstractC13298f.m25885b(rl1Var.f0(), 0L, j);
        while (j > 0) {
            hbf hbfVar2 = rl1Var.f43757a;
            sq8.m48646e(hbfVar2);
            int i = hbfVar2.f26589c;
            sq8.m48646e(rl1Var.f43757a);
            if (j < i - r2.f26588b) {
                hbf hbfVar3 = this.f43757a;
                if (hbfVar3 != null) {
                    sq8.m48646e(hbfVar3);
                    hbfVar = hbfVar3.f26593g;
                } else {
                    hbfVar = null;
                }
                if (hbfVar != null && hbfVar.f26591e) {
                    if ((hbfVar.f26589c + j) - (hbfVar.f26590d ? 0 : hbfVar.f26588b) <= MediaStatus.COMMAND_PLAYBACK_RATE) {
                        hbf hbfVar4 = rl1Var.f43757a;
                        sq8.m48646e(hbfVar4);
                        hbfVar4.m30159g(hbfVar, (int) j);
                        rl1Var.m46911Y(rl1Var.f0() - j);
                        m46911Y(f0() + j);
                        return;
                    }
                }
                hbf hbfVar5 = rl1Var.f43757a;
                sq8.m48646e(hbfVar5);
                rl1Var.f43757a = hbfVar5.m30157e((int) j);
            }
            hbf hbfVar6 = rl1Var.f43757a;
            sq8.m48646e(hbfVar6);
            long j2 = hbfVar6.f26589c - hbfVar6.f26588b;
            rl1Var.f43757a = hbfVar6.m30154b();
            hbf hbfVar7 = this.f43757a;
            if (hbfVar7 == null) {
                this.f43757a = hbfVar6;
                hbfVar6.f26593g = hbfVar6;
                hbfVar6.f26592f = hbfVar6;
            } else {
                sq8.m48646e(hbfVar7);
                hbf hbfVar8 = hbfVar7.f26593g;
                sq8.m48646e(hbfVar8);
                hbfVar8.m30155c(hbfVar6).m30153a();
            }
            rl1Var.m46911Y(rl1Var.f0() - j2);
            m46911Y(f0() + j2);
            j -= j2;
        }
    }

    @Override // p001o.im1
    /* renamed from: N */
    public void mo32307N(rl1 rl1Var, long j) throws EOFException {
        sq8.m48649h(rl1Var, "sink");
        if (f0() >= j) {
            rl1Var.M0(this, j);
        } else {
            rl1Var.M0(this, f0());
            throw new EOFException();
        }
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (f0() == 0) {
            return -1L;
        }
        if (j > f0()) {
            j = f0();
        }
        rl1Var.M0(this, j);
        return j;
    }

    /* renamed from: O */
    public zq1 m46906O() {
        return y1(f0());
    }

    @Override // p001o.gm1
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public rl1 mo29023I(int i) {
        hbf hbfVarR0 = r0(4);
        byte[] bArr = hbfVarR0.f26587a;
        int i2 = hbfVarR0.f26589c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & Constants.MAX_HOST_LENGTH);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & Constants.MAX_HOST_LENGTH);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & Constants.MAX_HOST_LENGTH);
        bArr[i5] = (byte) (i & Constants.MAX_HOST_LENGTH);
        hbfVarR0.f26589c = i5 + 1;
        m46911Y(f0() + 4);
        return this;
    }

    public rl1 P0(long j) {
        hbf hbfVarR0 = r0(8);
        byte[] bArr = hbfVarR0.f26587a;
        int i = hbfVarR0.f26589c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        hbfVarR0.f26589c = i8 + 1;
        m46911Y(f0() + 8);
        return this;
    }

    /* renamed from: Q */
    public String m46907Q(long j, Charset charset) throws EOFException {
        sq8.m48649h(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f43758b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26588b;
        if (i + j > hbfVar.f26589c) {
            return new String(T0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(hbfVar.f26587a, i, i2, charset);
        int i3 = hbfVar.f26588b + i2;
        hbfVar.f26588b = i3;
        this.f43758b -= j;
        if (i3 == hbfVar.f26589c) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        }
        return str;
    }

    @Override // p001o.im1
    public String Q0() {
        return c0(Long.MAX_VALUE);
    }

    /* renamed from: S */
    public final C16621b m46908S(C16621b c16621b) {
        sq8.m48649h(c16621b, "unsafeCursor");
        return AbstractC12275b.m18067b(this, c16621b);
    }

    @Override // p001o.gm1
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public rl1 E1(int i) {
        hbf hbfVarR0 = r0(2);
        byte[] bArr = hbfVarR0.f26587a;
        int i2 = hbfVarR0.f26589c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & Constants.MAX_HOST_LENGTH);
        bArr[i3] = (byte) (i & Constants.MAX_HOST_LENGTH);
        hbfVarR0.f26589c = i3 + 1;
        m46911Y(f0() + 2);
        return this;
    }

    /* renamed from: T */
    public String m46909T() {
        return m46907Q(this.f43758b, sh2.f45422b);
    }

    @Override // p001o.im1
    public byte[] T0(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (f0() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // p001o.im1
    public long T2(dvf dvfVar) {
        sq8.m48649h(dvfVar, "sink");
        long jF0 = f0();
        if (jF0 > 0) {
            dvfVar.M0(this, jF0);
        }
        return jF0;
    }

    @Override // p001o.im1
    /* renamed from: W */
    public long mo32308W(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        return m46920u(zq1Var, 0L);
    }

    /* renamed from: X */
    public int m46910X() throws EOFException {
        int i;
        int i2;
        int i3;
        if (f0() == 0) {
            throw new EOFException();
        }
        byte bM46918s = m46918s(0L);
        boolean z = false;
        if ((bM46918s & 128) == 0) {
            i = bM46918s & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bM46918s & 224) == 192) {
            i = bM46918s & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM46918s & 240) == 224) {
            i = bM46918s & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM46918s & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM46918s & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (f0() < j) {
            throw new EOFException("size < " + i2 + ": " + f0() + " (to read code point prefixed 0x" + AbstractC13298f.m25894k(bM46918s) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM46918s2 = m46918s(j2);
            if ((bM46918s2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bM46918s2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if (55296 <= i && i < 57344) {
            z = true;
        }
        if (!z && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // p001o.im1
    public short X0() {
        return AbstractC13298f.m25893j(readShort());
    }

    /* renamed from: Y */
    public final void m46911Y(long j) {
        this.f43758b = j;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rl1 clone() {
        return m46914f();
    }

    public rl1 b1(String str, int i, int i2, Charset charset) {
        sq8.m48649h(str, "string");
        sq8.m48649h(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        if (sq8.m48644c(charset, sh2.f45422b)) {
            return mo29025i(str, i, i2);
        }
        String strSubstring = str.substring(i, i2);
        sq8.m48648g(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        sq8.m48648g(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    /* renamed from: c */
    public final long m46913c() {
        long jF0 = f0();
        if (jF0 == 0) {
            return 0L;
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        hbf hbfVar2 = hbfVar.f26593g;
        sq8.m48646e(hbfVar2);
        if (hbfVar2.f26589c < 8192 && hbfVar2.f26591e) {
            jF0 -= r3 - hbfVar2.f26588b;
        }
        return jF0;
    }

    @Override // p001o.im1
    public String c0(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM46919t = m46919t((byte) 10, 0L, j2);
        if (jM46919t != -1) {
            return AbstractC12275b.m18070e(this, jM46919t);
        }
        if (j2 < f0() && m46918s(j2 - 1) == 13 && m46918s(j2) == 10) {
            return AbstractC12275b.m18070e(this, j2);
        }
        rl1 rl1Var = new rl1();
        m46915g(rl1Var, 0L, Math.min(32, f0()));
        throw new EOFException("\\n not found: limit=" + Math.min(f0(), j) + " content=" + rl1Var.m46906O().mo38697s() + (char) 8230);
    }

    @Override // p001o.im1
    public long c1() {
        return AbstractC13298f.m25892i(readLong());
    }

    public final void clear() throws EOFException {
        skip(f0());
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.im1
    /* renamed from: e */
    public rl1 mo32309e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rl1) {
            rl1 rl1Var = (rl1) obj;
            if (f0() == rl1Var.f0()) {
                if (f0() == 0) {
                    return true;
                }
                hbf hbfVar = this.f43757a;
                sq8.m48646e(hbfVar);
                hbf hbfVar2 = rl1Var.f43757a;
                sq8.m48646e(hbfVar2);
                int i = hbfVar.f26588b;
                int i2 = hbfVar2.f26588b;
                long j = 0;
                while (j < f0()) {
                    long jMin = Math.min(hbfVar.f26589c - i, hbfVar2.f26589c - i2);
                    long j2 = 0;
                    while (j2 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (hbfVar.f26587a[i] == hbfVar2.f26587a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == hbfVar.f26589c) {
                        hbfVar = hbfVar.f26592f;
                        sq8.m48646e(hbfVar);
                        i = hbfVar.f26588b;
                    }
                    if (i2 == hbfVar2.f26589c) {
                        hbfVar2 = hbfVar2.f26592f;
                        sq8.m48646e(hbfVar2);
                        i2 = hbfVar2.f26588b;
                    }
                    j += jMin;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final rl1 m46914f() {
        rl1 rl1Var = new rl1();
        if (f0() != 0) {
            hbf hbfVar = this.f43757a;
            sq8.m48646e(hbfVar);
            hbf hbfVarM30156d = hbfVar.m30156d();
            rl1Var.f43757a = hbfVarM30156d;
            hbfVarM30156d.f26593g = hbfVarM30156d;
            hbfVarM30156d.f26592f = hbfVarM30156d;
            for (hbf hbfVar2 = hbfVar.f26592f; hbfVar2 != hbfVar; hbfVar2 = hbfVar2.f26592f) {
                hbf hbfVar3 = hbfVarM30156d.f26593g;
                sq8.m48646e(hbfVar3);
                sq8.m48646e(hbfVar2);
                hbfVar3.m30155c(hbfVar2.m30156d());
            }
            rl1Var.m46911Y(f0());
        }
        return rl1Var;
    }

    public final long f0() {
        return this.f43758b;
    }

    @Override // p001o.gm1, p001o.dvf, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public final rl1 m46915g(rl1 rl1Var, long j, long j2) {
        sq8.m48649h(rl1Var, "out");
        AbstractC13298f.m25885b(f0(), j, j2);
        if (j2 != 0) {
            rl1Var.m46911Y(rl1Var.f0() + j2);
            hbf hbfVar = this.f43757a;
            while (true) {
                sq8.m48646e(hbfVar);
                int i = hbfVar.f26589c;
                int i2 = hbfVar.f26588b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                hbfVar = hbfVar.f26592f;
            }
            while (j2 > 0) {
                sq8.m48646e(hbfVar);
                hbf hbfVarM30156d = hbfVar.m30156d();
                int i3 = hbfVarM30156d.f26588b + ((int) j);
                hbfVarM30156d.f26588b = i3;
                hbfVarM30156d.f26589c = Math.min(i3 + ((int) j2), hbfVarM30156d.f26589c);
                hbf hbfVar2 = rl1Var.f43757a;
                if (hbfVar2 == null) {
                    hbfVarM30156d.f26593g = hbfVarM30156d;
                    hbfVarM30156d.f26592f = hbfVarM30156d;
                    rl1Var.f43757a = hbfVarM30156d;
                } else {
                    sq8.m48646e(hbfVar2);
                    hbf hbfVar3 = hbfVar2.f26593g;
                    sq8.m48646e(hbfVar3);
                    hbfVar3.m30155c(hbfVarM30156d);
                }
                j2 -= hbfVarM30156d.f26589c - hbfVarM30156d.f26588b;
                hbfVar = hbfVar.f26592f;
                j = 0;
            }
        }
        return this;
    }

    @Override // p001o.im1, p001o.gm1
    public rl1 getBuffer() {
        return this;
    }

    @Override // p001o.gm1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public rl1 mo29024b() {
        return this;
    }

    public int hashCode() {
        hbf hbfVar = this.f43757a;
        if (hbfVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = hbfVar.f26589c;
            for (int i3 = hbfVar.f26588b; i3 < i2; i3++) {
                i = (i * 31) + hbfVar.f26587a[i3];
            }
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
        } while (hbfVar != this.f43757a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p001o.gm1
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public rl1 n0(String str) {
        sq8.m48649h(str, "string");
        return mo29025i(str, 0, str.length());
    }

    @Override // p001o.gm1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public rl1 a0() {
        return this;
    }

    @Override // p001o.im1
    public void k1(long j) throws EOFException {
        if (this.f43758b < j) {
            throw new EOFException();
        }
    }

    public final zq1 l0() {
        if (f0() <= 2147483647L) {
            return o0((int) f0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + f0()).toString());
    }

    @Override // p001o.im1
    /* renamed from: m */
    public byte[] mo32310m() {
        return T0(f0());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[EDGE_INSN: B:44:0x00aa->B:38:0x00aa BREAK  A[LOOP:0: B:5:0x000d->B:46:?], SYNTHETIC] */
    @Override // p001o.im1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m3() throws EOFException {
        int i;
        int i2;
        if (f0() == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        boolean z = false;
        long j = 0;
        do {
            hbf hbfVar = this.f43757a;
            sq8.m48646e(hbfVar);
            byte[] bArr = hbfVar.f26587a;
            int i4 = hbfVar.f26588b;
            int i5 = hbfVar.f26589c;
            while (i4 < i5) {
                byte b = bArr[i4];
                if (b < 48 || b > 57) {
                    if (b >= 97 && b <= 102) {
                        i = b - 97;
                    } else if (b >= 65 && b <= 70) {
                        i = b - 65;
                    } else {
                        if (i3 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC13298f.m25894k(b));
                        }
                        z = true;
                        if (i4 != i5) {
                            this.f43757a = hbfVar.m30154b();
                            lbf.m36864b(hbfVar);
                        } else {
                            hbfVar.f26588b = i4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    i2 = i + 10;
                } else {
                    i2 = b - 48;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new rl1().t2(j).T1(b).m46909T());
                }
                j = (j << 4) | i2;
                i4++;
                i3++;
            }
            if (i4 != i5) {
            }
            if (!z) {
            }
        } while (this.f43757a != null);
        m46911Y(f0() - i3);
        return j;
    }

    @Override // p001o.im1
    /* renamed from: n */
    public boolean mo32311n() {
        return this.f43758b == 0;
    }

    @Override // p001o.gm1
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public rl1 mo29025i(String str, int i, int i2) {
        char cCharAt;
        sq8.m48649h(str, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                hbf hbfVarR0 = r0(1);
                byte[] bArr = hbfVarR0.f26587a;
                int i3 = hbfVarR0.f26589c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = hbfVarR0.f26589c;
                int i6 = (i3 + i) - i5;
                hbfVarR0.f26589c = i5 + i6;
                m46911Y(f0() + i6);
            } else {
                if (cCharAt2 < 2048) {
                    hbf hbfVarR02 = r0(2);
                    byte[] bArr2 = hbfVarR02.f26587a;
                    int i7 = hbfVarR02.f26589c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    hbfVarR02.f26589c = i7 + 2;
                    m46911Y(f0() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    hbf hbfVarR03 = r0(3);
                    byte[] bArr3 = hbfVarR03.f26587a;
                    int i8 = hbfVarR03.f26589c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    hbfVarR03.f26589c = i8 + 3;
                    m46911Y(f0() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            hbf hbfVarR04 = r0(4);
                            byte[] bArr4 = hbfVarR04.f26587a;
                            int i11 = hbfVarR04.f26589c;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            hbfVarR04.f26589c = i11 + 4;
                            m46911Y(f0() + 4);
                            i += 2;
                        }
                    }
                    T1(63);
                    i = i9;
                }
                i++;
            }
        }
        return this;
    }

    @Override // p001o.im1
    public String n2(Charset charset) {
        sq8.m48649h(charset, "charset");
        return m46907Q(this.f43758b, charset);
    }

    @Override // p001o.im1
    public int n3(qec qecVar) throws EOFException {
        sq8.m48649h(qecVar, "options");
        int iM18072g = AbstractC12275b.m18072g(this, qecVar, false, 2, null);
        if (iM18072g == -1) {
            return -1;
        }
        skip(qecVar.m45283o()[iM18072g].m59694L());
        return iM18072g;
    }

    public final zq1 o0(int i) {
        if (i == 0) {
            return zq1.f57498e;
        }
        AbstractC13298f.m25885b(f0(), 0L, i);
        hbf hbfVar = this.f43757a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            sq8.m48646e(hbfVar);
            int i5 = hbfVar.f26589c;
            int i6 = hbfVar.f26588b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            hbfVar = hbfVar.f26592f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        hbf hbfVar2 = this.f43757a;
        int i7 = 0;
        while (i2 < i) {
            sq8.m48646e(hbfVar2);
            bArr[i7] = hbfVar2.f26587a;
            i2 += hbfVar2.f26589c - hbfVar2.f26588b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = hbfVar2.f26588b;
            hbfVar2.f26590d = true;
            i7++;
            hbfVar2 = hbfVar2.f26592f;
        }
        return new mbf(bArr, iArr);
    }

    @Override // p001o.im1
    public InputStream o3() {
        return new C16620a();
    }

    @Override // p001o.gm1
    public long p0(lzf lzfVar) {
        sq8.m48649h(lzfVar, "source");
        long j = 0;
        while (true) {
            long jN0 = lzfVar.N0(this, MediaStatus.COMMAND_PLAYBACK_RATE);
            if (jN0 == -1) {
                return j;
            }
            j += jN0;
        }
    }

    @Override // p001o.gm1
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public rl1 mo29022G(int i) {
        if (i < 128) {
            T1(i);
        } else if (i < 2048) {
            hbf hbfVarR0 = r0(2);
            byte[] bArr = hbfVarR0.f26587a;
            int i2 = hbfVarR0.f26589c;
            bArr[i2] = (byte) ((i >> 6) | Opcodes.CHECKCAST);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            hbfVarR0.f26589c = i2 + 2;
            m46911Y(f0() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                T1(63);
            } else if (i < 65536) {
                hbf hbfVarR02 = r0(3);
                byte[] bArr2 = hbfVarR02.f26587a;
                int i3 = hbfVarR02.f26589c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                hbfVarR02.f26589c = i3 + 3;
                m46911Y(f0() + 3);
            } else {
                if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC13298f.m25895l(i));
                }
                hbf hbfVarR03 = r0(4);
                byte[] bArr3 = hbfVarR03.f26587a;
                int i4 = hbfVarR03.f26589c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                hbfVarR03.f26589c = i4 + 4;
                m46911Y(f0() + 4);
            }
        }
        return this;
    }

    @Override // p001o.im1
    public im1 peek() {
        return uac.m51310c(new b3d(this));
    }

    public final hbf r0(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        hbf hbfVar = this.f43757a;
        if (hbfVar != null) {
            sq8.m48646e(hbfVar);
            hbf hbfVar2 = hbfVar.f26593g;
            sq8.m48646e(hbfVar2);
            return (hbfVar2.f26589c + i > 8192 || !hbfVar2.f26591e) ? hbfVar2.m30155c(lbf.m36865c()) : hbfVar2;
        }
        hbf hbfVarM36865c = lbf.m36865c();
        this.f43757a = hbfVarM36865c;
        hbfVarM36865c.f26593g = hbfVarM36865c;
        hbfVarM36865c.f26592f = hbfVarM36865c;
        return hbfVarM36865c;
    }

    @Override // p001o.im1
    public long r2(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "targetBytes");
        return m46902C(zq1Var, 0L);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "sink");
        hbf hbfVar = this.f43757a;
        if (hbfVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), hbfVar.f26589c - hbfVar.f26588b);
        byteBuffer.put(hbfVar.f26587a, hbfVar.f26588b, iMin);
        int i = hbfVar.f26588b + iMin;
        hbfVar.f26588b = i;
        this.f43758b -= iMin;
        if (i == hbfVar.f26589c) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        }
        return iMin;
    }

    @Override // p001o.im1
    public byte readByte() throws EOFException {
        if (f0() == 0) {
            throw new EOFException();
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26588b;
        int i2 = hbfVar.f26589c;
        int i3 = i + 1;
        byte b = hbfVar.f26587a[i];
        m46911Y(f0() - 1);
        if (i3 == i2) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        } else {
            hbfVar.f26588b = i3;
        }
        return b;
    }

    @Override // p001o.im1
    public void readFully(byte[] bArr) throws EOFException {
        sq8.m48649h(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p001o.im1
    public int readInt() throws EOFException {
        if (f0() < 4) {
            throw new EOFException();
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26588b;
        int i2 = hbfVar.f26589c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = hbfVar.f26587a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        m46911Y(f0() - 4);
        if (i8 == i2) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        } else {
            hbfVar.f26588b = i8;
        }
        return i9;
    }

    @Override // p001o.im1
    public long readLong() throws EOFException {
        if (f0() < 8) {
            throw new EOFException();
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26588b;
        int i2 = hbfVar.f26589c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = hbfVar.f26587a;
        long j = (bArr[i] & 255) << 56;
        int i3 = i + 1 + 1 + 1;
        long j2 = j | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j3 = j2 | ((bArr[i3] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j4 = j3 | ((bArr[r8] & 255) << 16);
        long j5 = j4 | ((bArr[r1] & 255) << 8);
        int i4 = i3 + 1 + 1 + 1 + 1 + 1;
        long j6 = j5 | (bArr[r8] & 255);
        m46911Y(f0() - 8);
        if (i4 == i2) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        } else {
            hbfVar.f26588b = i4;
        }
        return j6;
    }

    @Override // p001o.im1
    public short readShort() throws EOFException {
        if (f0() < 2) {
            throw new EOFException();
        }
        hbf hbfVar = this.f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26588b;
        int i2 = hbfVar.f26589c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = hbfVar.f26587a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        m46911Y(f0() - 2);
        if (i4 == i2) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        } else {
            hbfVar.f26588b = i4;
        }
        return (short) i5;
    }

    @Override // p001o.im1
    public boolean request(long j) {
        return this.f43758b >= j;
    }

    /* renamed from: s */
    public final byte m46918s(long j) {
        AbstractC13298f.m25885b(f0(), j, 1L);
        hbf hbfVar = this.f43757a;
        if (hbfVar == null) {
            sq8.m48646e(null);
            throw null;
        }
        if (f0() - j < j) {
            long jF0 = f0();
            while (jF0 > j) {
                hbfVar = hbfVar.f26593g;
                sq8.m48646e(hbfVar);
                jF0 -= hbfVar.f26589c - hbfVar.f26588b;
            }
            sq8.m48646e(hbfVar);
            return hbfVar.f26587a[(int) ((hbfVar.f26588b + j) - jF0)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (hbfVar.f26589c - hbfVar.f26588b) + j2;
            if (j3 > j) {
                sq8.m48646e(hbfVar);
                return hbfVar.f26587a[(int) ((hbfVar.f26588b + j) - j2)];
            }
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            j2 = j3;
        }
    }

    @Override // p001o.im1
    public void skip(long j) throws EOFException {
        while (j > 0) {
            hbf hbfVar = this.f43757a;
            if (hbfVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, hbfVar.f26589c - hbfVar.f26588b);
            long j2 = iMin;
            m46911Y(f0() - j2);
            j -= j2;
            int i = hbfVar.f26588b + iMin;
            hbfVar.f26588b = i;
            if (i == hbfVar.f26589c) {
                this.f43757a = hbfVar.m30154b();
                lbf.m36864b(hbfVar);
            }
        }
    }

    /* renamed from: t */
    public long m46919t(byte b, long j, long j2) {
        hbf hbfVar;
        int i;
        long jF0 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("size=" + f0() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > f0()) {
            j2 = f0();
        }
        if (j == j2 || (hbfVar = this.f43757a) == null) {
            return -1L;
        }
        if (f0() - j < j) {
            jF0 = f0();
            while (jF0 > j) {
                hbfVar = hbfVar.f26593g;
                sq8.m48646e(hbfVar);
                jF0 -= hbfVar.f26589c - hbfVar.f26588b;
            }
            while (jF0 < j2) {
                byte[] bArr = hbfVar.f26587a;
                int iMin = (int) Math.min(hbfVar.f26589c, (hbfVar.f26588b + j2) - jF0);
                i = (int) ((hbfVar.f26588b + j) - jF0);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                jF0 += hbfVar.f26589c - hbfVar.f26588b;
                hbfVar = hbfVar.f26592f;
                sq8.m48646e(hbfVar);
                j = jF0;
            }
            return -1L;
        }
        while (true) {
            long j3 = (hbfVar.f26589c - hbfVar.f26588b) + jF0;
            if (j3 > j) {
                break;
            }
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            jF0 = j3;
        }
        while (jF0 < j2) {
            byte[] bArr2 = hbfVar.f26587a;
            int iMin2 = (int) Math.min(hbfVar.f26589c, (hbfVar.f26588b + j2) - jF0);
            i = (int) ((hbfVar.f26588b + j) - jF0);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            jF0 += hbfVar.f26589c - hbfVar.f26588b;
            hbfVar = hbfVar.f26592f;
            sq8.m48646e(hbfVar);
            j = jF0;
        }
        return -1L;
        return (i - hbfVar.f26588b) + jF0;
    }

    @Override // p001o.im1
    public String t1(long j) throws EOFException {
        return m46907Q(j, sh2.f45422b);
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return nmh.f37049e;
    }

    public String toString() {
        return l0().toString();
    }

    /* renamed from: u */
    public long m46920u(zq1 zq1Var, long j) {
        long j2 = j;
        sq8.m48649h(zq1Var, "bytes");
        if (!(zq1Var.m59694L() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j3 = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        hbf hbfVar = this.f43757a;
        if (hbfVar != null) {
            if (f0() - j2 < j2) {
                long jF0 = f0();
                while (jF0 > j2) {
                    hbfVar = hbfVar.f26593g;
                    sq8.m48646e(hbfVar);
                    jF0 -= hbfVar.f26589c - hbfVar.f26588b;
                }
                byte[] bArrMo38699y = zq1Var.mo38699y();
                byte b = bArrMo38699y[0];
                int iM59694L = zq1Var.m59694L();
                long jF02 = (f0() - iM59694L) + 1;
                while (jF0 < jF02) {
                    byte[] bArr = hbfVar.f26587a;
                    long j4 = jF0;
                    int iMin = (int) Math.min(hbfVar.f26589c, (hbfVar.f26588b + jF02) - jF0);
                    for (int i = (int) ((hbfVar.f26588b + j2) - j4); i < iMin; i++) {
                        if (bArr[i] == b && AbstractC12275b.m18069d(hbfVar, i + 1, bArrMo38699y, 1, iM59694L)) {
                            return (i - hbfVar.f26588b) + j4;
                        }
                    }
                    jF0 = j4 + (hbfVar.f26589c - hbfVar.f26588b);
                    hbfVar = hbfVar.f26592f;
                    sq8.m48646e(hbfVar);
                    j2 = jF0;
                }
            } else {
                while (true) {
                    long j5 = (hbfVar.f26589c - hbfVar.f26588b) + j3;
                    if (j5 > j2) {
                        break;
                    }
                    hbfVar = hbfVar.f26592f;
                    sq8.m48646e(hbfVar);
                    j3 = j5;
                }
                byte[] bArrMo38699y2 = zq1Var.mo38699y();
                byte b2 = bArrMo38699y2[0];
                int iM59694L2 = zq1Var.m59694L();
                long jF03 = (f0() - iM59694L2) + 1;
                while (j3 < jF03) {
                    byte[] bArr2 = hbfVar.f26587a;
                    long j6 = jF03;
                    int iMin2 = (int) Math.min(hbfVar.f26589c, (hbfVar.f26588b + jF03) - j3);
                    for (int i2 = (int) ((hbfVar.f26588b + j2) - j3); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b2 && AbstractC12275b.m18069d(hbfVar, i2 + 1, bArrMo38699y2, 1, iM59694L2)) {
                            return (i2 - hbfVar.f26588b) + j3;
                        }
                    }
                    j3 += hbfVar.f26589c - hbfVar.f26588b;
                    hbfVar = hbfVar.f26592f;
                    sq8.m48646e(hbfVar);
                    j2 = j3;
                    jF03 = j6;
                }
            }
        }
        return -1L;
    }

    @Override // p001o.im1
    public zq1 y1(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (f0() < j) {
            throw new EOFException();
        }
        if (j < MediaStatus.COMMAND_EDIT_TRACKS) {
            return new zq1(T0(j));
        }
        zq1 zq1VarO0 = o0((int) j);
        skip(j);
        return zq1VarO0;
    }

    @Override // p001o.gm1
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public rl1 M2(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "byteString");
        zq1Var.mo38690S(this, 0, zq1Var.m59694L());
        return this;
    }

    /* renamed from: o.rl1$a */
    public static final class C16620a extends InputStream {
        public C16620a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(rl1.this.f0(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (rl1.this.f0() > 0) {
                return rl1.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return rl1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            sq8.m48649h(bArr, "sink");
            return rl1.this.read(bArr, i, i2);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            hbf hbfVarR0 = r0(1);
            int iMin = Math.min(i, 8192 - hbfVarR0.f26589c);
            byteBuffer.get(hbfVarR0.f26587a, hbfVarR0.f26589c, iMin);
            i -= iMin;
            hbfVarR0.f26589c += iMin;
        }
        this.f43758b += iRemaining;
        return iRemaining;
    }

    @Override // p001o.im1
    public int read(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "sink");
        AbstractC13298f.m25885b(bArr.length, i, i2);
        hbf hbfVar = this.f43757a;
        if (hbfVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, hbfVar.f26589c - hbfVar.f26588b);
        byte[] bArr2 = hbfVar.f26587a;
        int i3 = hbfVar.f26588b;
        fp0.m27256e(bArr2, bArr, i, i3, i3 + iMin);
        hbfVar.f26588b += iMin;
        m46911Y(f0() - iMin);
        if (hbfVar.f26588b == hbfVar.f26589c) {
            this.f43757a = hbfVar.m30154b();
            lbf.m36864b(hbfVar);
        }
        return iMin;
    }
}
