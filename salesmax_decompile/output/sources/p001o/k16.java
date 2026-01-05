package p001o;

import lombok.javac.Javac;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class k16 implements Comparable {

    /* renamed from: b */
    public static final C14700a f31358b = new C14700a(null);

    /* renamed from: c */
    public static final long f31359c = m34885n(0);

    /* renamed from: d */
    public static final long f31360d = m16.m38166j(4611686018427387903L);

    /* renamed from: e */
    public static final long f31361e = m16.m38166j(-4611686018427387903L);

    /* renamed from: a */
    public final long f31362a;

    /* renamed from: o.k16$a */
    public static final class C14700a {
        public C14700a() {
        }

        public /* synthetic */ C14700a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m34898a() {
            return k16.f31360d;
        }

        /* renamed from: b */
        public final long m34899b() {
            return k16.f31361e;
        }

        /* renamed from: c */
        public final long m34900c() {
            return k16.f31359c;
        }

        /* renamed from: d */
        public final long m34901d(String str) {
            sq8.m48649h(str, "value");
            try {
                return m16.m38172p(str, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }
    }

    public /* synthetic */ k16(long j) {
        this.f31362a = j;
    }

    /* renamed from: A */
    public static final long m34855A(long j) {
        long jM34861G = m34861G(j);
        if (m34865K(j)) {
            return jM34861G;
        }
        if (jM34861G > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM34861G < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return m16.m38170n(jM34861G);
    }

    /* renamed from: B */
    public static final long m34856B(long j) {
        return m34875U(j, o16.SECONDS);
    }

    /* renamed from: C */
    public static final int m34857C(long j) {
        if (m34866L(j)) {
            return 0;
        }
        return (int) (m34895z(j) % 60);
    }

    /* renamed from: D */
    public static final int m34858D(long j) {
        if (m34866L(j)) {
            return 0;
        }
        return (int) (m34864J(j) ? m16.m38170n(m34861G(j) % 1000) : m34861G(j) % 1000000000);
    }

    /* renamed from: E */
    public static final int m34859E(long j) {
        if (m34866L(j)) {
            return 0;
        }
        return (int) (m34856B(j) % 60);
    }

    /* renamed from: F */
    public static final o16 m34860F(long j) {
        return m34865K(j) ? o16.NANOSECONDS : o16.MILLISECONDS;
    }

    /* renamed from: G */
    public static final long m34861G(long j) {
        return j >> 1;
    }

    /* renamed from: H */
    public static int m34862H(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: I */
    public static final boolean m34863I(long j) {
        return !m34866L(j);
    }

    /* renamed from: J */
    public static final boolean m34864J(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: K */
    public static final boolean m34865K(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: L */
    public static final boolean m34866L(long j) {
        return j == f31360d || j == f31361e;
    }

    /* renamed from: M */
    public static final boolean m34867M(long j) {
        return j < 0;
    }

    /* renamed from: N */
    public static final boolean m34868N(long j) {
        return j > 0;
    }

    /* renamed from: O */
    public static final long m34869O(long j, long j2) {
        return m34870P(j, m34877W(j2));
    }

    /* renamed from: P */
    public static final long m34870P(long j, long j2) {
        if (m34866L(j)) {
            if (m34863I(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m34866L(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m34864J(j) ? m34881e(j, m34861G(j), m34861G(j2)) : m34881e(j, m34861G(j2), m34861G(j));
        }
        long jM34861G = m34861G(j) + m34861G(j2);
        return m34865K(j) ? m16.m38169m(jM34861G) : m16.m38167k(jM34861G);
    }

    /* renamed from: Q */
    public static final long m34871Q(long j, double d) {
        int iM38120c = lza.m38120c(d);
        if (((double) iM38120c) == d) {
            return m34872R(j, iM38120c);
        }
        o16 o16VarM34860F = m34860F(j);
        return m16.m38174r(m34873S(j, o16VarM34860F) * d, o16VarM34860F);
    }

    /* renamed from: R */
    public static final long m34872R(long j, int i) {
        if (m34866L(j)) {
            if (i != 0) {
                return i > 0 ? j : m34877W(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return f31359c;
        }
        long jM34861G = m34861G(j);
        long j2 = i;
        long j3 = jM34861G * j2;
        if (!m34865K(j)) {
            return j3 / j2 == jM34861G ? m16.m38166j(bce.m18611n(j3, new nla(-4611686018427387903L, 4611686018427387903L))) : lza.m38119b(jM34861G) * lza.m38118a(i) > 0 ? f31360d : f31361e;
        }
        boolean z = false;
        if (-2147483647L <= jM34861G && jM34861G < 2147483648L) {
            z = true;
        }
        if (z) {
            return m16.m38168l(j3);
        }
        if (j3 / j2 == jM34861G) {
            return m16.m38169m(j3);
        }
        long jM38171o = m16.m38171o(jM34861G);
        long j4 = jM38171o * j2;
        long jM38171o2 = m16.m38171o((jM34861G - m16.m38170n(jM38171o)) * j2) + j4;
        return (j4 / j2 != jM38171o || (jM38171o2 ^ j4) < 0) ? lza.m38119b(jM34861G) * lza.m38118a(i) > 0 ? f31360d : f31361e : m16.m38166j(bce.m18611n(jM38171o2, new nla(-4611686018427387903L, 4611686018427387903L)));
    }

    /* renamed from: S */
    public static final double m34873S(long j, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        if (j == f31360d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f31361e) {
            return Double.NEGATIVE_INFINITY;
        }
        return p16.m42863a(m34861G(j), m34860F(j), o16Var);
    }

    /* renamed from: T */
    public static final String m34874T(long j) {
        StringBuilder sb = new StringBuilder();
        if (m34867M(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM34890u = m34890u(j);
        long jM34893x = m34893x(jM34890u);
        int iM34857C = m34857C(jM34890u);
        int iM34859E = m34859E(jM34890u);
        int iM34858D = m34858D(jM34890u);
        if (m34866L(j)) {
            jM34893x = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = jM34893x != 0;
        boolean z3 = (iM34859E == 0 && iM34858D == 0) ? false : true;
        if (iM34857C == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM34893x);
            sb.append('H');
        }
        if (z) {
            sb.append(iM34857C);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m34882g(j, sb, iM34859E, iM34858D, 9, "S", true);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: U */
    public static final long m34875U(long j, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        if (j == f31360d) {
            return Long.MAX_VALUE;
        }
        if (j == f31361e) {
            return Long.MIN_VALUE;
        }
        return p16.m42864b(m34861G(j), m34860F(j), o16Var);
    }

    /* renamed from: V */
    public static String m34876V(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f31360d) {
            return "Infinity";
        }
        if (j == f31361e) {
            return "-Infinity";
        }
        boolean zM34867M = m34867M(j);
        StringBuilder sb = new StringBuilder();
        if (zM34867M) {
            sb.append('-');
        }
        long jM34890u = m34890u(j);
        long jM34892w = m34892w(jM34890u);
        int iM34891v = m34891v(jM34890u);
        int iM34857C = m34857C(jM34890u);
        int iM34859E = m34859E(jM34890u);
        int iM34858D = m34858D(jM34890u);
        int i = 0;
        boolean z = jM34892w != 0;
        boolean z2 = iM34891v != 0;
        boolean z3 = iM34857C != 0;
        boolean z4 = (iM34859E == 0 && iM34858D == 0) ? false : true;
        if (z) {
            sb.append(jM34892w);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(iM34891v);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(iM34857C);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.SP);
            }
            if (iM34859E != 0 || z || z2 || z3) {
                m34882g(j, sb, iM34859E, iM34858D, 9, "s", false);
            } else if (iM34858D >= 1000000) {
                m34882g(j, sb, iM34858D / 1000000, iM34858D % 1000000, 6, "ms", false);
            } else if (iM34858D >= 1000) {
                m34882g(j, sb, iM34858D / 1000, iM34858D % 1000, 3, "us", false);
            } else {
                sb.append(iM34858D);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM34867M && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: W */
    public static final long m34877W(long j) {
        return m16.m38165i(-m34861G(j), ((int) j) & 1);
    }

    /* renamed from: e */
    public static final long m34881e(long j, long j2, long j3) {
        long jM38171o = m16.m38171o(j3);
        long j4 = j2 + jM38171o;
        boolean z = false;
        if (-4611686018426L <= j4 && j4 < 4611686018427L) {
            z = true;
        }
        if (!z) {
            return m16.m38166j(bce.m18610m(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return m16.m38168l(m16.m38170n(j4) + (j3 - m16.m38170n(jM38171o)));
    }

    /* renamed from: g */
    public static final void m34882g(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strO0 = f9g.o0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i6 + 2) / 3) * 3);
                sq8.m48648g(sb, "append(...)");
            } else {
                sb.append((CharSequence) strO0, 0, i6);
                sq8.m48648g(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: h */
    public static final /* synthetic */ k16 m34883h(long j) {
        return new k16(j);
    }

    /* renamed from: m */
    public static int m34884m(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return sq8.m48652k(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m34867M(j) ? -i : i;
    }

    /* renamed from: n */
    public static long m34885n(long j) {
        if (l16.m36444a()) {
            if (m34865K(j)) {
                long jM34861G = m34861G(j);
                if (!(-4611686018426999999L <= jM34861G && jM34861G < 4611686018427000000L)) {
                    throw new AssertionError(m34861G(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM34861G2 = m34861G(j);
                if (!(-4611686018427387903L <= jM34861G2 && jM34861G2 < Javac.SEALED)) {
                    throw new AssertionError(m34861G(j) + " ms is out of milliseconds range");
                }
                long jM34861G3 = m34861G(j);
                if (-4611686018426L <= jM34861G3 && jM34861G3 < 4611686018427L) {
                    throw new AssertionError(m34861G(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* renamed from: o */
    public static final double m34886o(long j, long j2) {
        o16 o16Var = (o16) vk3.m52898j(m34860F(j), m34860F(j2));
        return m34873S(j, o16Var) / m34873S(j2, o16Var);
    }

    /* renamed from: r */
    public static final long m34887r(long j, int i) {
        if (i == 0) {
            if (m34868N(j)) {
                return f31360d;
            }
            if (m34867M(j)) {
                return f31361e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m34865K(j)) {
            return m16.m38168l(m34861G(j) / i);
        }
        if (m34866L(j)) {
            return m34872R(j, lza.m38118a(i));
        }
        long j2 = i;
        long jM34861G = m34861G(j) / j2;
        boolean z = false;
        if (-4611686018426L <= jM34861G && jM34861G < 4611686018427L) {
            z = true;
        }
        if (!z) {
            return m16.m38166j(jM34861G);
        }
        return m16.m38168l(m16.m38170n(jM34861G) + (m16.m38170n(m34861G(j) - (jM34861G * j2)) / j2));
    }

    /* renamed from: s */
    public static boolean m34888s(long j, Object obj) {
        return (obj instanceof k16) && j == ((k16) obj).m34896X();
    }

    /* renamed from: t */
    public static final boolean m34889t(long j, long j2) {
        return j == j2;
    }

    /* renamed from: u */
    public static final long m34890u(long j) {
        return m34867M(j) ? m34877W(j) : j;
    }

    /* renamed from: v */
    public static final int m34891v(long j) {
        if (m34866L(j)) {
            return 0;
        }
        return (int) (m34893x(j) % 24);
    }

    /* renamed from: w */
    public static final long m34892w(long j) {
        return m34875U(j, o16.DAYS);
    }

    /* renamed from: x */
    public static final long m34893x(long j) {
        return m34875U(j, o16.HOURS);
    }

    /* renamed from: y */
    public static final long m34894y(long j) {
        return (m34864J(j) && m34863I(j)) ? m34861G(j) : m34875U(j, o16.MILLISECONDS);
    }

    /* renamed from: z */
    public static final long m34895z(long j) {
        return m34875U(j, o16.MINUTES);
    }

    /* renamed from: X */
    public final /* synthetic */ long m34896X() {
        return this.f31362a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m34897j(((k16) obj).m34896X());
    }

    public boolean equals(Object obj) {
        return m34888s(this.f31362a, obj);
    }

    public int hashCode() {
        return m34862H(this.f31362a);
    }

    /* renamed from: j */
    public int m34897j(long j) {
        return m34884m(this.f31362a, j);
    }

    public String toString() {
        return m34876V(this.f31362a);
    }
}
