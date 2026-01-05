package p001o;

import org.objectweb.asm.Opcodes;
import p001o.xn8;

/* loaded from: classes4.dex */
public abstract class mo0 {

    /* renamed from: o.mo0$a */
    public static final class C15370a {

        /* renamed from: a */
        public int f35764a;

        /* renamed from: b */
        public long f35765b;

        /* renamed from: c */
        public Object f35766c;

        /* renamed from: d */
        public final pp6 f35767d;

        public C15370a(pp6 pp6Var) {
            pp6Var.getClass();
            this.f35767d = pp6Var;
        }
    }

    /* renamed from: A */
    public static int m39405A(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        ela elaVar = (ela) interfaceC18196d;
        int iM39415K = m39415K(bArr, i2, c15370a);
        elaVar.Z1(if3.m32007c(c15370a.f35765b));
        while (iM39415K < i3) {
            int iM39412H = m39412H(bArr, iM39415K, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39415K = m39415K(bArr, iM39412H, c15370a);
            elaVar.Z1(if3.m32007c(c15370a.f35765b));
        }
        return iM39415K;
    }

    /* renamed from: B */
    public static int m39406B(byte[] bArr, int i, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a;
        if (i2 < 0) {
            throw bt8.m19721f();
        }
        if (i2 == 0) {
            c15370a.f35766c = "";
            return iM39412H;
        }
        c15370a.f35766c = new String(bArr, iM39412H, i2, xn8.f53956a);
        return iM39412H + i2;
    }

    /* renamed from: C */
    public static int m39407C(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i2, c15370a);
        int i4 = c15370a.f35764a;
        if (i4 < 0) {
            throw bt8.m19721f();
        }
        if (i4 == 0) {
            interfaceC18196d.add("");
        } else {
            interfaceC18196d.add(new String(bArr, iM39412H, i4, xn8.f53956a));
            iM39412H += i4;
        }
        while (iM39412H < i3) {
            int iM39412H2 = m39412H(bArr, iM39412H, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39412H = m39412H(bArr, iM39412H2, c15370a);
            int i5 = c15370a.f35764a;
            if (i5 < 0) {
                throw bt8.m19721f();
            }
            if (i5 == 0) {
                interfaceC18196d.add("");
            } else {
                interfaceC18196d.add(new String(bArr, iM39412H, i5, xn8.f53956a));
                iM39412H += i5;
            }
        }
        return iM39412H;
    }

    /* renamed from: D */
    public static int m39408D(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i2, c15370a);
        int i4 = c15370a.f35764a;
        if (i4 < 0) {
            throw bt8.m19721f();
        }
        if (i4 == 0) {
            interfaceC18196d.add("");
        } else {
            int i5 = iM39412H + i4;
            if (!iqi.m32572n(bArr, iM39412H, i5)) {
                throw bt8.m19718c();
            }
            interfaceC18196d.add(new String(bArr, iM39412H, i4, xn8.f53956a));
            iM39412H = i5;
        }
        while (iM39412H < i3) {
            int iM39412H2 = m39412H(bArr, iM39412H, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39412H = m39412H(bArr, iM39412H2, c15370a);
            int i6 = c15370a.f35764a;
            if (i6 < 0) {
                throw bt8.m19721f();
            }
            if (i6 == 0) {
                interfaceC18196d.add("");
            } else {
                int i7 = iM39412H + i6;
                if (!iqi.m32572n(bArr, iM39412H, i7)) {
                    throw bt8.m19718c();
                }
                interfaceC18196d.add(new String(bArr, iM39412H, i6, xn8.f53956a));
                iM39412H = i7;
            }
        }
        return iM39412H;
    }

    /* renamed from: E */
    public static int m39409E(byte[] bArr, int i, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a;
        if (i2 < 0) {
            throw bt8.m19721f();
        }
        if (i2 == 0) {
            c15370a.f35766c = "";
            return iM39412H;
        }
        c15370a.f35766c = iqi.m32563e(bArr, iM39412H, i2);
        return iM39412H + i2;
    }

    /* renamed from: F */
    public static int m39410F(int i, byte[] bArr, int i2, int i3, m4i m4iVar, C15370a c15370a) throws bt8 {
        if (ebj.m24741a(i) == 0) {
            throw bt8.m19717b();
        }
        int iM24742b = ebj.m24742b(i);
        if (iM24742b == 0) {
            int iM39415K = m39415K(bArr, i2, c15370a);
            m4iVar.m38374n(i, Long.valueOf(c15370a.f35765b));
            return iM39415K;
        }
        if (iM24742b == 1) {
            m4iVar.m38374n(i, Long.valueOf(m39425i(bArr, i2)));
            return i2 + 8;
        }
        if (iM24742b == 2) {
            int iM39412H = m39412H(bArr, i2, c15370a);
            int i4 = c15370a.f35764a;
            if (i4 < 0) {
                throw bt8.m19721f();
            }
            if (i4 > bArr.length - iM39412H) {
                throw bt8.m19724j();
            }
            if (i4 == 0) {
                m4iVar.m38374n(i, yq1.f55802b);
            } else {
                m4iVar.m38374n(i, yq1.m58081l(bArr, iM39412H, i4));
            }
            return iM39412H + i4;
        }
        if (iM24742b != 3) {
            if (iM24742b != 5) {
                throw bt8.m19717b();
            }
            m4iVar.m38374n(i, Integer.valueOf(m39423g(bArr, i2)));
            return i2 + 4;
        }
        m4i m4iVarM38366l = m4i.m38366l();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM39412H2 = m39412H(bArr, i2, c15370a);
            int i7 = c15370a.f35764a;
            if (i7 == i5) {
                i6 = i7;
                i2 = iM39412H2;
                break;
            }
            i6 = i7;
            i2 = m39410F(i7, bArr, iM39412H2, i3, m4iVarM38366l, c15370a);
        }
        if (i2 > i3 || i6 != i5) {
            throw bt8.m19722g();
        }
        m4iVar.m38374n(i, m4iVarM38366l);
        return i2;
    }

    /* renamed from: G */
    public static int m39411G(int i, byte[] bArr, int i2, C15370a c15370a) {
        int i3 = i & Opcodes.LAND;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c15370a.f35764a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c15370a.f35764a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c15370a.f35764a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c15370a.f35764a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c15370a.f35764a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: H */
    public static int m39412H(byte[] bArr, int i, C15370a c15370a) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m39411G(b, bArr, i2, c15370a);
        }
        c15370a.f35764a = b;
        return i2;
    }

    /* renamed from: I */
    public static int m39413I(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        al8 al8Var = (al8) interfaceC18196d;
        int iM39412H = m39412H(bArr, i2, c15370a);
        al8Var.R1(c15370a.f35764a);
        while (iM39412H < i3) {
            int iM39412H2 = m39412H(bArr, iM39412H, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39412H = m39412H(bArr, iM39412H2, c15370a);
            al8Var.R1(c15370a.f35764a);
        }
        return iM39412H;
    }

    /* renamed from: J */
    public static int m39414J(long j, byte[] bArr, int i, C15370a c15370a) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & 127) << i3;
            i2 = i4;
            b = b2;
        }
        c15370a.f35765b = j2;
        return i2;
    }

    /* renamed from: K */
    public static int m39415K(byte[] bArr, int i, C15370a c15370a) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return m39414J(j, bArr, i2, c15370a);
        }
        c15370a.f35765b = j;
        return i2;
    }

    /* renamed from: L */
    public static int m39416L(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        ela elaVar = (ela) interfaceC18196d;
        int iM39415K = m39415K(bArr, i2, c15370a);
        elaVar.Z1(c15370a.f35765b);
        while (iM39415K < i3) {
            int iM39412H = m39412H(bArr, iM39415K, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39415K = m39415K(bArr, iM39412H, c15370a);
            elaVar.Z1(c15370a.f35765b);
        }
        return iM39415K;
    }

    /* renamed from: a */
    public static int m39417a(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        ek1 ek1Var = (ek1) interfaceC18196d;
        int iM39415K = m39415K(bArr, i2, c15370a);
        ek1Var.m25184d(c15370a.f35765b != 0);
        while (iM39415K < i3) {
            int iM39412H = m39412H(bArr, iM39415K, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39415K = m39415K(bArr, iM39412H, c15370a);
            ek1Var.m25184d(c15370a.f35765b != 0);
        }
        return iM39415K;
    }

    /* renamed from: b */
    public static int m39418b(byte[] bArr, int i, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a;
        if (i2 < 0) {
            throw bt8.m19721f();
        }
        if (i2 > bArr.length - iM39412H) {
            throw bt8.m19724j();
        }
        if (i2 == 0) {
            c15370a.f35766c = yq1.f55802b;
            return iM39412H;
        }
        c15370a.f35766c = yq1.m58081l(bArr, iM39412H, i2);
        return iM39412H + i2;
    }

    /* renamed from: c */
    public static int m39419c(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        int iM39412H = m39412H(bArr, i2, c15370a);
        int i4 = c15370a.f35764a;
        if (i4 < 0) {
            throw bt8.m19721f();
        }
        if (i4 > bArr.length - iM39412H) {
            throw bt8.m19724j();
        }
        if (i4 == 0) {
            interfaceC18196d.add(yq1.f55802b);
        } else {
            interfaceC18196d.add(yq1.m58081l(bArr, iM39412H, i4));
            iM39412H += i4;
        }
        while (iM39412H < i3) {
            int iM39412H2 = m39412H(bArr, iM39412H, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39412H = m39412H(bArr, iM39412H2, c15370a);
            int i5 = c15370a.f35764a;
            if (i5 < 0) {
                throw bt8.m19721f();
            }
            if (i5 > bArr.length - iM39412H) {
                throw bt8.m19724j();
            }
            if (i5 == 0) {
                interfaceC18196d.add(yq1.f55802b);
            } else {
                interfaceC18196d.add(yq1.m58081l(bArr, iM39412H, i5));
                iM39412H += i5;
            }
        }
        return iM39412H;
    }

    /* renamed from: d */
    public static double m39420d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m39425i(bArr, i));
    }

    /* renamed from: e */
    public static int m39421e(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        bx5 bx5Var = (bx5) interfaceC18196d;
        bx5Var.m2(m39420d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM39412H = m39412H(bArr, i4, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            bx5Var.m2(m39420d(bArr, iM39412H));
            i4 = iM39412H + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m39422f(int i, byte[] bArr, int i2, int i3, Object obj, rcb rcbVar, k4i k4iVar, C15370a c15370a) {
        c15370a.f35767d.m44005a(rcbVar, i >>> 3);
        return m39410F(i, bArr, i2, i3, ycb.m57539v(obj), c15370a);
    }

    /* renamed from: g */
    public static int m39423g(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: h */
    public static int m39424h(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        al8 al8Var = (al8) interfaceC18196d;
        al8Var.R1(m39423g(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM39412H = m39412H(bArr, i4, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            al8Var.R1(m39423g(bArr, iM39412H));
            i4 = iM39412H + 4;
        }
        return i4;
    }

    /* renamed from: i */
    public static long m39425i(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: j */
    public static int m39426j(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        ela elaVar = (ela) interfaceC18196d;
        elaVar.Z1(m39425i(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM39412H = m39412H(bArr, i4, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            elaVar.Z1(m39425i(bArr, iM39412H));
            i4 = iM39412H + 8;
        }
        return i4;
    }

    /* renamed from: k */
    public static float m39427k(byte[] bArr, int i) {
        return Float.intBitsToFloat(m39423g(bArr, i));
    }

    /* renamed from: l */
    public static int m39428l(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        c37 c37Var = (c37) interfaceC18196d;
        c37Var.m20164d(m39427k(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM39412H = m39412H(bArr, i4, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            c37Var.m20164d(m39427k(bArr, iM39412H));
            i4 = iM39412H + 4;
        }
        return i4;
    }

    /* renamed from: m */
    public static int m39429m(o5f o5fVar, byte[] bArr, int i, int i2, int i3, C15370a c15370a) {
        ycb ycbVar = (ycb) o5fVar;
        Object objMo16908e = ycbVar.mo16908e();
        int iC0 = ycbVar.c0(objMo16908e, bArr, i, i2, i3, c15370a);
        ycbVar.mo16905b(objMo16908e);
        c15370a.f35766c = objMo16908e;
        return iC0;
    }

    /* renamed from: n */
    public static int m39430n(o5f o5fVar, int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        int i4 = (i & (-8)) | 4;
        int iM39429m = m39429m(o5fVar, bArr, i2, i3, i4, c15370a);
        interfaceC18196d.add(c15370a.f35766c);
        while (iM39429m < i3) {
            int iM39412H = m39412H(bArr, iM39429m, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39429m = m39429m(o5fVar, bArr, iM39412H, i3, i4, c15370a);
            interfaceC18196d.add(c15370a.f35766c);
        }
        return iM39429m;
    }

    /* renamed from: o */
    public static int m39431o(o5f o5fVar, byte[] bArr, int i, int i2, C15370a c15370a) throws bt8 {
        int iM39411G = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM39411G = m39411G(i3, bArr, iM39411G, c15370a);
            i3 = c15370a.f35764a;
        }
        int i4 = iM39411G;
        if (i3 < 0 || i3 > i2 - i4) {
            throw bt8.m19724j();
        }
        Object objMo16908e = o5fVar.mo16908e();
        int i5 = i3 + i4;
        o5fVar.mo16911h(objMo16908e, bArr, i4, i5, c15370a);
        o5fVar.mo16905b(objMo16908e);
        c15370a.f35766c = objMo16908e;
        return i5;
    }

    /* renamed from: p */
    public static int m39432p(o5f o5fVar, int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        int iM39431o = m39431o(o5fVar, bArr, i2, i3, c15370a);
        interfaceC18196d.add(c15370a.f35766c);
        while (iM39431o < i3) {
            int iM39412H = m39412H(bArr, iM39431o, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39431o = m39431o(o5fVar, bArr, iM39412H, i3, c15370a);
            interfaceC18196d.add(c15370a.f35766c);
        }
        return iM39431o;
    }

    /* renamed from: q */
    public static int m39433q(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        ek1 ek1Var = (ek1) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            iM39412H = m39415K(bArr, iM39412H, c15370a);
            ek1Var.m25184d(c15370a.f35765b != 0);
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: r */
    public static int m39434r(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        bx5 bx5Var = (bx5) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            bx5Var.m2(m39420d(bArr, iM39412H));
            iM39412H += 8;
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: s */
    public static int m39435s(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        al8 al8Var = (al8) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            al8Var.R1(m39423g(bArr, iM39412H));
            iM39412H += 4;
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: t */
    public static int m39436t(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        ela elaVar = (ela) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            elaVar.Z1(m39425i(bArr, iM39412H));
            iM39412H += 8;
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: u */
    public static int m39437u(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        c37 c37Var = (c37) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            c37Var.m20164d(m39427k(bArr, iM39412H));
            iM39412H += 4;
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: v */
    public static int m39438v(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        al8 al8Var = (al8) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            iM39412H = m39412H(bArr, iM39412H, c15370a);
            al8Var.R1(if3.m32006b(c15370a.f35764a));
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: w */
    public static int m39439w(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        ela elaVar = (ela) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            iM39412H = m39415K(bArr, iM39412H, c15370a);
            elaVar.Z1(if3.m32007c(c15370a.f35765b));
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: x */
    public static int m39440x(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        al8 al8Var = (al8) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            iM39412H = m39412H(bArr, iM39412H, c15370a);
            al8Var.R1(c15370a.f35764a);
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: y */
    public static int m39441y(byte[] bArr, int i, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) throws bt8 {
        ela elaVar = (ela) interfaceC18196d;
        int iM39412H = m39412H(bArr, i, c15370a);
        int i2 = c15370a.f35764a + iM39412H;
        while (iM39412H < i2) {
            iM39412H = m39415K(bArr, iM39412H, c15370a);
            elaVar.Z1(c15370a.f35765b);
        }
        if (iM39412H == i2) {
            return iM39412H;
        }
        throw bt8.m19724j();
    }

    /* renamed from: z */
    public static int m39442z(int i, byte[] bArr, int i2, int i3, xn8.InterfaceC18196d interfaceC18196d, C15370a c15370a) {
        al8 al8Var = (al8) interfaceC18196d;
        int iM39412H = m39412H(bArr, i2, c15370a);
        al8Var.R1(if3.m32006b(c15370a.f35764a));
        while (iM39412H < i3) {
            int iM39412H2 = m39412H(bArr, iM39412H, c15370a);
            if (i != c15370a.f35764a) {
                break;
            }
            iM39412H = m39412H(bArr, iM39412H2, c15370a);
            al8Var.R1(if3.m32006b(c15370a.f35764a));
        }
        return iM39412H;
    }
}
