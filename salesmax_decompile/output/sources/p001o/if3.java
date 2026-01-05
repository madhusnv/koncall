package p001o;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class if3 {

    /* renamed from: a */
    public int f28576a;

    /* renamed from: b */
    public int f28577b;

    /* renamed from: c */
    public int f28578c;

    /* renamed from: d */
    public lf3 f28579d;

    /* renamed from: e */
    public boolean f28580e;

    /* renamed from: o.if3$b */
    public static final class C14275b extends if3 {

        /* renamed from: f */
        public final byte[] f28581f;

        /* renamed from: g */
        public final boolean f28582g;

        /* renamed from: h */
        public int f28583h;

        /* renamed from: i */
        public int f28584i;

        /* renamed from: j */
        public int f28585j;

        /* renamed from: k */
        public int f28586k;

        /* renamed from: l */
        public int f28587l;

        /* renamed from: m */
        public boolean f28588m;

        /* renamed from: n */
        public int f28589n;

        @Override // p001o.if3
        /* renamed from: A */
        public int mo32011A() {
            return m32039H();
        }

        @Override // p001o.if3
        /* renamed from: B */
        public long mo32012B() {
            return m32040I();
        }

        @Override // p001o.if3
        /* renamed from: C */
        public boolean mo32013C(int i) throws bt8 {
            int iM24742b = ebj.m24742b(i);
            if (iM24742b == 0) {
                m32045N();
                return true;
            }
            if (iM24742b == 1) {
                m32044M(8);
                return true;
            }
            if (iM24742b == 2) {
                m32044M(m32039H());
                return true;
            }
            if (iM24742b == 3) {
                m32043L();
                mo32014a(ebj.m24743c(ebj.m24741a(i), 4));
                return true;
            }
            if (iM24742b == 4) {
                return false;
            }
            if (iM24742b != 5) {
                throw bt8.m19719d();
            }
            m32044M(4);
            return true;
        }

        /* renamed from: D */
        public byte m32035D() throws bt8 {
            int i = this.f28585j;
            if (i == this.f28583h) {
                throw bt8.m19724j();
            }
            byte[] bArr = this.f28581f;
            this.f28585j = i + 1;
            return bArr[i];
        }

        /* renamed from: E */
        public byte[] m32036E(int i) throws bt8 {
            if (i > 0) {
                int i2 = this.f28583h;
                int i3 = this.f28585j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f28585j = i4;
                    return Arrays.copyOfRange(this.f28581f, i3, i4);
                }
            }
            if (i > 0) {
                throw bt8.m19724j();
            }
            if (i == 0) {
                return xn8.f53958c;
            }
            throw bt8.m19721f();
        }

        /* renamed from: F */
        public int m32037F() throws bt8 {
            int i = this.f28585j;
            if (this.f28583h - i < 4) {
                throw bt8.m19724j();
            }
            byte[] bArr = this.f28581f;
            this.f28585j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: G */
        public long m32038G() throws bt8 {
            int i = this.f28585j;
            if (this.f28583h - i < 8) {
                throw bt8.m19724j();
            }
            byte[] bArr = this.f28581f;
            this.f28585j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m32039H() {
            int i;
            int i2 = this.f28585j;
            int i3 = this.f28583h;
            if (i3 != i2) {
                byte[] bArr = this.f28581f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f28585j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.f28585j = i5;
                    return i;
                }
            }
            return (int) m32041J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long m32040I() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f28585j;
            int i3 = this.f28583h;
            if (i3 != i2) {
                byte[] bArr = this.f28581f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f28585j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (bArr[i5] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (bArr[i5] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (bArr[i10] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                i5 = j7 < 0 ? i11 + 1 : i11;
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.f28585j = i5;
                        return j;
                    }
                    i = i6 ^ (-128);
                    j = i;
                    this.f28585j = i5;
                    return j;
                }
            }
            return m32041J();
        }

        /* renamed from: J */
        public long m32041J() throws bt8 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((m32035D() & 128) == 0) {
                    return j;
                }
            }
            throw bt8.m19720e();
        }

        /* renamed from: K */
        public final void m32042K() {
            int i = this.f28583h + this.f28584i;
            this.f28583h = i;
            int i2 = i - this.f28586k;
            int i3 = this.f28589n;
            if (i2 <= i3) {
                this.f28584i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f28584i = i4;
            this.f28583h = i - i4;
        }

        /* renamed from: L */
        public void m32043L() throws bt8 {
            int iMo32034z;
            do {
                iMo32034z = mo32034z();
                if (iMo32034z == 0) {
                    return;
                }
            } while (mo32013C(iMo32034z));
        }

        /* renamed from: M */
        public void m32044M(int i) throws bt8 {
            if (i >= 0) {
                int i2 = this.f28583h;
                int i3 = this.f28585j;
                if (i <= i2 - i3) {
                    this.f28585j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw bt8.m19724j();
            }
            throw bt8.m19721f();
        }

        /* renamed from: N */
        public final void m32045N() throws bt8 {
            if (this.f28583h - this.f28585j >= 10) {
                m32046O();
            } else {
                m32047P();
            }
        }

        /* renamed from: O */
        public final void m32046O() throws bt8 {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f28581f;
                int i2 = this.f28585j;
                this.f28585j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw bt8.m19720e();
        }

        /* renamed from: P */
        public final void m32047P() throws bt8 {
            for (int i = 0; i < 10; i++) {
                if (m32035D() >= 0) {
                    return;
                }
            }
            throw bt8.m19720e();
        }

        @Override // p001o.if3
        /* renamed from: a */
        public void mo32014a(int i) throws bt8 {
            if (this.f28587l != i) {
                throw bt8.m19716a();
            }
        }

        @Override // p001o.if3
        /* renamed from: d */
        public int mo32015d() {
            return this.f28585j - this.f28586k;
        }

        @Override // p001o.if3
        /* renamed from: e */
        public boolean mo32016e() {
            return this.f28585j == this.f28583h;
        }

        @Override // p001o.if3
        /* renamed from: i */
        public void mo32017i(int i) {
            this.f28589n = i;
            m32042K();
        }

        @Override // p001o.if3
        /* renamed from: j */
        public int mo32018j(int i) throws bt8 {
            if (i < 0) {
                throw bt8.m19721f();
            }
            int iMo32015d = i + mo32015d();
            int i2 = this.f28589n;
            if (iMo32015d > i2) {
                throw bt8.m19724j();
            }
            this.f28589n = iMo32015d;
            m32042K();
            return i2;
        }

        @Override // p001o.if3
        /* renamed from: k */
        public boolean mo32019k() {
            return m32040I() != 0;
        }

        @Override // p001o.if3
        /* renamed from: l */
        public yq1 mo32020l() {
            int iM32039H = m32039H();
            if (iM32039H > 0) {
                int i = this.f28583h;
                int i2 = this.f28585j;
                if (iM32039H <= i - i2) {
                    yq1 yq1VarM58076N = (this.f28582g && this.f28588m) ? yq1.m58076N(this.f28581f, i2, iM32039H) : yq1.m58081l(this.f28581f, i2, iM32039H);
                    this.f28585j += iM32039H;
                    return yq1VarM58076N;
                }
            }
            return iM32039H == 0 ? yq1.f55802b : yq1.m58075M(m32036E(iM32039H));
        }

        @Override // p001o.if3
        /* renamed from: m */
        public double mo32021m() {
            return Double.longBitsToDouble(m32038G());
        }

        @Override // p001o.if3
        /* renamed from: n */
        public int mo32022n() {
            return m32039H();
        }

        @Override // p001o.if3
        /* renamed from: o */
        public int mo32023o() {
            return m32037F();
        }

        @Override // p001o.if3
        /* renamed from: p */
        public long mo32024p() {
            return m32038G();
        }

        @Override // p001o.if3
        /* renamed from: q */
        public float mo32025q() {
            return Float.intBitsToFloat(m32037F());
        }

        @Override // p001o.if3
        /* renamed from: r */
        public int mo32026r() {
            return m32039H();
        }

        @Override // p001o.if3
        /* renamed from: s */
        public long mo32027s() {
            return m32040I();
        }

        @Override // p001o.if3
        /* renamed from: t */
        public int mo32028t() {
            return m32037F();
        }

        @Override // p001o.if3
        /* renamed from: u */
        public long mo32029u() {
            return m32038G();
        }

        @Override // p001o.if3
        /* renamed from: v */
        public int mo32030v() {
            return if3.m32006b(m32039H());
        }

        @Override // p001o.if3
        /* renamed from: w */
        public long mo32031w() {
            return if3.m32007c(m32040I());
        }

        @Override // p001o.if3
        /* renamed from: x */
        public String mo32032x() throws bt8 {
            int iM32039H = m32039H();
            if (iM32039H > 0) {
                int i = this.f28583h;
                int i2 = this.f28585j;
                if (iM32039H <= i - i2) {
                    String str = new String(this.f28581f, i2, iM32039H, xn8.f53956a);
                    this.f28585j += iM32039H;
                    return str;
                }
            }
            if (iM32039H == 0) {
                return "";
            }
            if (iM32039H < 0) {
                throw bt8.m19721f();
            }
            throw bt8.m19724j();
        }

        @Override // p001o.if3
        /* renamed from: y */
        public String mo32033y() throws bt8 {
            int iM32039H = m32039H();
            if (iM32039H > 0) {
                int i = this.f28583h;
                int i2 = this.f28585j;
                if (iM32039H <= i - i2) {
                    String strM32563e = iqi.m32563e(this.f28581f, i2, iM32039H);
                    this.f28585j += iM32039H;
                    return strM32563e;
                }
            }
            if (iM32039H == 0) {
                return "";
            }
            if (iM32039H <= 0) {
                throw bt8.m19721f();
            }
            throw bt8.m19724j();
        }

        @Override // p001o.if3
        /* renamed from: z */
        public int mo32034z() throws bt8 {
            if (mo32016e()) {
                this.f28587l = 0;
                return 0;
            }
            int iM32039H = m32039H();
            this.f28587l = iM32039H;
            if (ebj.m24741a(iM32039H) != 0) {
                return this.f28587l;
            }
            throw bt8.m19717b();
        }

        public C14275b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f28589n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f28581f = bArr;
            this.f28583h = i2 + i;
            this.f28585j = i;
            this.f28586k = i;
            this.f28582g = z;
        }
    }

    /* renamed from: b */
    public static int m32006b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m32007c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static if3 m32008f(byte[] bArr) {
        return m32009g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static if3 m32009g(byte[] bArr, int i, int i2) {
        return m32010h(bArr, i, i2, false);
    }

    /* renamed from: h */
    public static if3 m32010h(byte[] bArr, int i, int i2, boolean z) {
        C14275b c14275b = new C14275b(bArr, i, i2, z);
        try {
            c14275b.mo32018j(i2);
            return c14275b;
        } catch (bt8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo32011A();

    /* renamed from: B */
    public abstract long mo32012B();

    /* renamed from: C */
    public abstract boolean mo32013C(int i);

    /* renamed from: a */
    public abstract void mo32014a(int i);

    /* renamed from: d */
    public abstract int mo32015d();

    /* renamed from: e */
    public abstract boolean mo32016e();

    /* renamed from: i */
    public abstract void mo32017i(int i);

    /* renamed from: j */
    public abstract int mo32018j(int i);

    /* renamed from: k */
    public abstract boolean mo32019k();

    /* renamed from: l */
    public abstract yq1 mo32020l();

    /* renamed from: m */
    public abstract double mo32021m();

    /* renamed from: n */
    public abstract int mo32022n();

    /* renamed from: o */
    public abstract int mo32023o();

    /* renamed from: p */
    public abstract long mo32024p();

    /* renamed from: q */
    public abstract float mo32025q();

    /* renamed from: r */
    public abstract int mo32026r();

    /* renamed from: s */
    public abstract long mo32027s();

    /* renamed from: t */
    public abstract int mo32028t();

    /* renamed from: u */
    public abstract long mo32029u();

    /* renamed from: v */
    public abstract int mo32030v();

    /* renamed from: w */
    public abstract long mo32031w();

    /* renamed from: x */
    public abstract String mo32032x();

    /* renamed from: y */
    public abstract String mo32033y();

    /* renamed from: z */
    public abstract int mo32034z();

    public if3() {
        this.f28577b = 100;
        this.f28578c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f28580e = false;
    }
}
