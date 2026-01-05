package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ph3 {

    /* renamed from: h */
    public static final ph3 f40064h = new C16113b().m43672d(1).m43671c(2).m43673e(3).m43669a();

    /* renamed from: i */
    public static final ph3 f40065i = new C16113b().m43672d(1).m43671c(1).m43673e(2).m43669a();

    /* renamed from: j */
    public static final String f40066j = sqi.B0(0);

    /* renamed from: k */
    public static final String f40067k = sqi.B0(1);

    /* renamed from: l */
    public static final String f40068l = sqi.B0(2);

    /* renamed from: m */
    public static final String f40069m = sqi.B0(3);

    /* renamed from: n */
    public static final String f40070n = sqi.B0(4);

    /* renamed from: o */
    public static final String f40071o = sqi.B0(5);

    /* renamed from: a */
    public final int f40072a;

    /* renamed from: b */
    public final int f40073b;

    /* renamed from: c */
    public final int f40074c;

    /* renamed from: d */
    public final byte[] f40075d;

    /* renamed from: e */
    public final int f40076e;

    /* renamed from: f */
    public final int f40077f;

    /* renamed from: g */
    public int f40078g;

    /* renamed from: o.ph3$b */
    public static final class C16113b {

        /* renamed from: a */
        public int f40079a;

        /* renamed from: b */
        public int f40080b;

        /* renamed from: c */
        public int f40081c;

        /* renamed from: d */
        public byte[] f40082d;

        /* renamed from: e */
        public int f40083e;

        /* renamed from: f */
        public int f40084f;

        /* renamed from: a */
        public ph3 m43669a() {
            return new ph3(this.f40079a, this.f40080b, this.f40081c, this.f40082d, this.f40083e, this.f40084f);
        }

        /* renamed from: b */
        public C16113b m43670b(int i) {
            this.f40084f = i;
            return this;
        }

        /* renamed from: c */
        public C16113b m43671c(int i) {
            this.f40080b = i;
            return this;
        }

        /* renamed from: d */
        public C16113b m43672d(int i) {
            this.f40079a = i;
            return this;
        }

        /* renamed from: e */
        public C16113b m43673e(int i) {
            this.f40081c = i;
            return this;
        }

        /* renamed from: f */
        public C16113b m43674f(byte[] bArr) {
            this.f40082d = bArr;
            return this;
        }

        /* renamed from: g */
        public C16113b m43675g(int i) {
            this.f40083e = i;
            return this;
        }

        public C16113b() {
            this.f40079a = -1;
            this.f40080b = -1;
            this.f40081c = -1;
            this.f40083e = -1;
            this.f40084f = -1;
        }

        public C16113b(ph3 ph3Var) {
            this.f40079a = ph3Var.f40072a;
            this.f40080b = ph3Var.f40073b;
            this.f40081c = ph3Var.f40074c;
            this.f40082d = ph3Var.f40075d;
            this.f40083e = ph3Var.f40076e;
            this.f40084f = ph3Var.f40077f;
        }
    }

    /* renamed from: b */
    public static String m43656b(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Chroma";
    }

    /* renamed from: c */
    public static String m43657c(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    /* renamed from: d */
    public static String m43658d(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    /* renamed from: e */
    public static String m43659e(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    /* renamed from: h */
    public static boolean m43660h(ph3 ph3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        if (ph3Var == null) {
            return true;
        }
        int i5 = ph3Var.f40072a;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = ph3Var.f40073b) == -1 || i == 2) && (((i2 = ph3Var.f40074c) == -1 || i2 == 3) && ph3Var.f40075d == null && (((i3 = ph3Var.f40077f) == -1 || i3 == 8) && ((i4 = ph3Var.f40076e) == -1 || i4 == 8)));
    }

    /* renamed from: j */
    public static int m43661j(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: k */
    public static int m43662k(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: l */
    public static String m43663l(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Luma";
    }

    /* renamed from: a */
    public C16113b m43664a() {
        return new C16113b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph3.class != obj.getClass()) {
            return false;
        }
        ph3 ph3Var = (ph3) obj;
        return this.f40072a == ph3Var.f40072a && this.f40073b == ph3Var.f40073b && this.f40074c == ph3Var.f40074c && Arrays.equals(this.f40075d, ph3Var.f40075d) && this.f40076e == ph3Var.f40076e && this.f40077f == ph3Var.f40077f;
    }

    /* renamed from: f */
    public boolean m43665f() {
        return (this.f40076e == -1 || this.f40077f == -1) ? false : true;
    }

    /* renamed from: g */
    public boolean m43666g() {
        return (this.f40072a == -1 || this.f40073b == -1 || this.f40074c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f40078g == 0) {
            this.f40078g = ((((((((((527 + this.f40072a) * 31) + this.f40073b) * 31) + this.f40074c) * 31) + Arrays.hashCode(this.f40075d)) * 31) + this.f40076e) * 31) + this.f40077f;
        }
        return this.f40078g;
    }

    /* renamed from: i */
    public boolean m43667i() {
        return m43665f() || m43666g();
    }

    /* renamed from: m */
    public String m43668m() {
        String str;
        String strM48702G = m43666g() ? sqi.m48702G("%s/%s/%s", m43658d(this.f40072a), m43657c(this.f40073b), m43659e(this.f40074c)) : "NA/NA/NA";
        if (m43665f()) {
            str = this.f40076e + "/" + this.f40077f;
        } else {
            str = "NA/NA";
        }
        return strM48702G + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(m43658d(this.f40072a));
        sb.append(", ");
        sb.append(m43657c(this.f40073b));
        sb.append(", ");
        sb.append(m43659e(this.f40074c));
        sb.append(", ");
        sb.append(this.f40075d != null);
        sb.append(", ");
        sb.append(m43663l(this.f40076e));
        sb.append(", ");
        sb.append(m43656b(this.f40077f));
        sb.append(")");
        return sb.toString();
    }

    public ph3(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f40072a = i;
        this.f40073b = i2;
        this.f40074c = i3;
        this.f40075d = bArr;
        this.f40076e = i4;
        this.f40077f = i5;
    }
}
