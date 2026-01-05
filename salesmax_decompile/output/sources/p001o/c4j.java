package p001o;

import android.util.Pair;
import androidx.media3.common.C2181a;
import com.google.firebase.perf.util.Constants;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class c4j implements tq6 {

    /* renamed from: h */
    public static final yq6 f17280h = new yq6() { // from class: o.b4j
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return c4j.m20205g();
        }
    };

    /* renamed from: a */
    public vq6 f17281a;

    /* renamed from: b */
    public uth f17282b;

    /* renamed from: e */
    public InterfaceC12552b f17285e;

    /* renamed from: c */
    public int f17283c = 0;

    /* renamed from: d */
    public long f17284d = -1;

    /* renamed from: f */
    public int f17286f = -1;

    /* renamed from: g */
    public long f17287g = -1;

    /* renamed from: o.c4j$a */
    public static final class C12551a implements InterfaceC12552b {

        /* renamed from: m */
        public static final int[] f17288m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f17289n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, Opcodes.DMUL, Opcodes.FNEG, 130, Opcodes.D2L, 157, Opcodes.LRETURN, Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final vq6 f17290a;

        /* renamed from: b */
        public final uth f17291b;

        /* renamed from: c */
        public final d4j f17292c;

        /* renamed from: d */
        public final int f17293d;

        /* renamed from: e */
        public final byte[] f17294e;

        /* renamed from: f */
        public final zwc f17295f;

        /* renamed from: g */
        public final int f17296g;

        /* renamed from: h */
        public final C2181a f17297h;

        /* renamed from: i */
        public int f17298i;

        /* renamed from: j */
        public long f17299j;

        /* renamed from: k */
        public int f17300k;

        /* renamed from: l */
        public long f17301l;

        public C12551a(vq6 vq6Var, uth uthVar, d4j d4jVar) throws byc {
            this.f17290a = vq6Var;
            this.f17291b = uthVar;
            this.f17292c = d4jVar;
            int iMax = Math.max(1, d4jVar.f19094c / 10);
            this.f17296g = iMax;
            zwc zwcVar = new zwc(d4jVar.f19098g);
            zwcVar.m60045z();
            int iM60045z = zwcVar.m60045z();
            this.f17293d = iM60045z;
            int i = d4jVar.f19093b;
            int i2 = (((d4jVar.f19096e - (i * 4)) * 8) / (d4jVar.f19097f * i)) + 1;
            if (iM60045z == i2) {
                int iM48731j = sqi.m48731j(iMax, iM60045z);
                this.f17294e = new byte[d4jVar.f19096e * iM48731j];
                this.f17295f = new zwc(iM48731j * m20212h(iM60045z, i));
                int i3 = ((d4jVar.f19094c * d4jVar.f19096e) * 8) / iM60045z;
                this.f17297h = new C2181a.b().o0("audio/raw").m6750M(i3).j0(i3).f0(m20212h(iMax, i)).m6751N(d4jVar.f19093b).p0(d4jVar.f19094c).i0(2).m6748K();
                return;
            }
            throw byc.m19921a("Expected frames per block: " + i2 + "; got: " + iM60045z, null);
        }

        /* renamed from: h */
        public static int m20212h(int i, int i2) {
            return i * 2 * i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo20213a(uq6 uq6Var, long j) {
            int iM20218f;
            int iM48731j = sqi.m48731j(this.f17296g - m20218f(this.f17300k), this.f17293d) * this.f17292c.f19096e;
            boolean z = j == 0;
            while (!z) {
                if (this.f17298i >= iM48731j) {
                    break;
                }
                int i = uq6Var.read(this.f17294e, this.f17298i, (int) Math.min(iM48731j - r3, j));
                if (i == -1) {
                    while (!z) {
                    }
                } else {
                    this.f17298i += i;
                }
            }
            int i2 = this.f17298i / this.f17292c.f19096e;
            if (i2 > 0) {
                m20216d(this.f17294e, i2, this.f17295f);
                this.f17298i -= i2 * this.f17292c.f19096e;
                int iM60026g = this.f17295f.m60026g();
                this.f17291b.m52027e(this.f17295f, iM60026g);
                int i3 = this.f17300k + iM60026g;
                this.f17300k = i3;
                int iM20218f2 = m20218f(i3);
                int i4 = this.f17296g;
                if (iM20218f2 >= i4) {
                    m20220i(i4);
                }
            }
            if (z && (iM20218f = m20218f(this.f17300k)) > 0) {
                m20220i(iM20218f);
            }
            return z;
        }

        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: b */
        public void mo20214b(int i, long j) {
            this.f17290a.mo32490r(new f4j(this.f17292c, this.f17293d, i, j));
            this.f17291b.mo7072b(this.f17297h);
        }

        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: c */
        public void mo20215c(long j) {
            this.f17298i = 0;
            this.f17299j = j;
            this.f17300k = 0;
            this.f17301l = 0L;
        }

        /* renamed from: d */
        public final void m20216d(byte[] bArr, int i, zwc zwcVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f17292c.f19093b; i3++) {
                    m20217e(bArr, i2, i3, zwcVar.m60024e());
                }
            }
            int iM20219g = m20219g(this.f17293d * i);
            zwcVar.m60017U(0);
            zwcVar.m60016T(iM20219g);
        }

        /* renamed from: e */
        public final void m20217e(byte[] bArr, int i, int i2, byte[] bArr2) {
            d4j d4jVar = this.f17292c;
            int i3 = d4jVar.f19096e;
            int i4 = d4jVar.f19093b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iM48736o = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = f17289n[iMin];
            int i9 = ((i * this.f17293d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iM48736o & Constants.MAX_HOST_LENGTH);
            bArr2[i9 + 1] = (byte) (iM48736o >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                int i11 = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)] & 255;
                int i12 = i10 % 2 == 0 ? i11 & 15 : i11 >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i8) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                iM48736o = sqi.m48736o(iM48736o + i13, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iM48736o & Constants.MAX_HOST_LENGTH);
                bArr2[i9 + 1] = (byte) (iM48736o >> 8);
                int i14 = iMin + f17288m[i12];
                int[] iArr = f17289n;
                iMin = sqi.m48736o(i14, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        /* renamed from: f */
        public final int m20218f(int i) {
            return i / (this.f17292c.f19093b * 2);
        }

        /* renamed from: g */
        public final int m20219g(int i) {
            return m20212h(i, this.f17292c.f19093b);
        }

        /* renamed from: i */
        public final void m20220i(int i) {
            long jA1 = this.f17299j + sqi.a1(this.f17301l, 1000000L, this.f17292c.f19094c);
            int iM20219g = m20219g(i);
            this.f17291b.mo7071a(jA1, 1, iM20219g, this.f17300k - iM20219g, null);
            this.f17301l += i;
            this.f17300k -= iM20219g;
        }
    }

    /* renamed from: o.c4j$b */
    public interface InterfaceC12552b {
        /* renamed from: a */
        boolean mo20213a(uq6 uq6Var, long j);

        /* renamed from: b */
        void mo20214b(int i, long j);

        /* renamed from: c */
        void mo20215c(long j);
    }

    /* renamed from: o.c4j$c */
    public static final class C12553c implements InterfaceC12552b {

        /* renamed from: a */
        public final vq6 f17302a;

        /* renamed from: b */
        public final uth f17303b;

        /* renamed from: c */
        public final d4j f17304c;

        /* renamed from: d */
        public final C2181a f17305d;

        /* renamed from: e */
        public final int f17306e;

        /* renamed from: f */
        public long f17307f;

        /* renamed from: g */
        public int f17308g;

        /* renamed from: h */
        public long f17309h;

        public C12553c(vq6 vq6Var, uth uthVar, d4j d4jVar, String str, int i) throws byc {
            this.f17302a = vq6Var;
            this.f17303b = uthVar;
            this.f17304c = d4jVar;
            int i2 = (d4jVar.f19093b * d4jVar.f19097f) / 8;
            if (d4jVar.f19096e == i2) {
                int i3 = d4jVar.f19094c;
                int i4 = i3 * i2 * 8;
                int iMax = Math.max(i2, (i3 * i2) / 10);
                this.f17306e = iMax;
                this.f17305d = new C2181a.b().o0(str).m6750M(i4).j0(i4).f0(iMax).m6751N(d4jVar.f19093b).p0(d4jVar.f19094c).i0(i).m6748K();
                return;
            }
            throw byc.m19921a("Expected block size: " + i2 + "; got: " + d4jVar.f19096e, null);
        }

        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: a */
        public boolean mo20213a(uq6 uq6Var, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f17308g) < (i2 = this.f17306e)) {
                int iM52026c = this.f17303b.m52026c(uq6Var, (int) Math.min(i2 - i, j2), true);
                if (iM52026c == -1) {
                    j2 = 0;
                } else {
                    this.f17308g += iM52026c;
                    j2 -= iM52026c;
                }
            }
            int i3 = this.f17304c.f19096e;
            int i4 = this.f17308g / i3;
            if (i4 > 0) {
                long jA1 = this.f17307f + sqi.a1(this.f17309h, 1000000L, r1.f19094c);
                int i5 = i4 * i3;
                int i6 = this.f17308g - i5;
                this.f17303b.mo7071a(jA1, 1, i5, i6, null);
                this.f17309h += i4;
                this.f17308g = i6;
            }
            return j2 <= 0;
        }

        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: b */
        public void mo20214b(int i, long j) {
            this.f17302a.mo32490r(new f4j(this.f17304c, 1, i, j));
            this.f17303b.mo7072b(this.f17305d);
        }

        @Override // p001o.c4j.InterfaceC12552b
        /* renamed from: c */
        public void mo20215c(long j) {
            this.f17307f = j;
            this.f17308g = 0;
            this.f17309h = 0L;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ tq6[] m20205g() {
        return new tq6[]{new c4j()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f17283c = j == 0 ? 0 : 4;
        InterfaceC12552b interfaceC12552b = this.f17285e;
        if (interfaceC12552b != null) {
            interfaceC12552b.mo20215c(j2);
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return e4j.m24307a(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f17281a = vq6Var;
        this.f17282b = vq6Var.mo32487f(0, 1);
        vq6Var.mo32489p();
    }

    /* renamed from: e */
    public final void m20206e() {
        op0.m42519i(this.f17282b);
        sqi.m48729h(this.f17281a);
    }

    /* renamed from: h */
    public final void m20207h(uq6 uq6Var) throws byc {
        op0.m42517g(uq6Var.getPosition() == 0);
        int i = this.f17286f;
        if (i != -1) {
            uq6Var.mo40496k(i);
            this.f17283c = 4;
        } else {
            if (!e4j.m24307a(uq6Var)) {
                throw byc.m19921a("Unsupported or unrecognized wav file type.", null);
            }
            uq6Var.mo40496k((int) (uq6Var.mo40493g() - uq6Var.getPosition()));
            this.f17283c = 1;
        }
    }

    /* renamed from: j */
    public final void m20208j(uq6 uq6Var) throws byc {
        d4j d4jVarM24308b = e4j.m24308b(uq6Var);
        int i = d4jVarM24308b.f19092a;
        if (i == 17) {
            this.f17285e = new C12551a(this.f17281a, this.f17282b, d4jVarM24308b);
        } else if (i == 6) {
            this.f17285e = new C12553c(this.f17281a, this.f17282b, d4jVarM24308b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f17285e = new C12553c(this.f17281a, this.f17282b, d4jVarM24308b, "audio/g711-mlaw", -1);
        } else {
            int iM28047a = g4j.m28047a(i, d4jVarM24308b.f19097f);
            if (iM28047a == 0) {
                throw byc.m19924d("Unsupported WAV format type: " + d4jVarM24308b.f19092a);
            }
            this.f17285e = new C12553c(this.f17281a, this.f17282b, d4jVarM24308b, "audio/raw", iM28047a);
        }
        this.f17283c = 3;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        m20206e();
        int i = this.f17283c;
        if (i == 0) {
            m20207h(uq6Var);
            return 0;
        }
        if (i == 1) {
            m20209l(uq6Var);
            return 0;
        }
        if (i == 2) {
            m20208j(uq6Var);
            return 0;
        }
        if (i == 3) {
            m20211n(uq6Var);
            return 0;
        }
        if (i == 4) {
            return m20210m(uq6Var);
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public final void m20209l(uq6 uq6Var) {
        this.f17284d = e4j.m24309c(uq6Var);
        this.f17283c = 2;
    }

    /* renamed from: m */
    public final int m20210m(uq6 uq6Var) {
        op0.m42517g(this.f17287g != -1);
        return ((InterfaceC12552b) op0.m42515e(this.f17285e)).mo20213a(uq6Var, this.f17287g - uq6Var.getPosition()) ? -1 : 0;
    }

    /* renamed from: n */
    public final void m20211n(uq6 uq6Var) throws byc {
        Pair pairM24311e = e4j.m24311e(uq6Var);
        this.f17286f = ((Long) pairM24311e.first).intValue();
        long jLongValue = ((Long) pairM24311e.second).longValue();
        long j = this.f17284d;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f17287g = this.f17286f + jLongValue;
        long length = uq6Var.getLength();
        if (length != -1 && this.f17287g > length) {
            ria.m46824h("WavExtractor", "Data exceeds input length: " + this.f17287g + ", " + length);
            this.f17287g = length;
        }
        ((InterfaceC12552b) op0.m42515e(this.f17285e)).mo20214b(this.f17286f, this.f17287g);
        this.f17283c = 4;
    }

    @Override // p001o.tq6
    public void release() {
    }
}
