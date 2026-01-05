package p001o;

import java.util.Collection;
import java.util.Iterator;
import p001o.k16;

/* loaded from: classes6.dex */
public abstract class m16 {
    /* renamed from: i */
    public static final long m38165i(long j, int i) {
        return k16.m34885n((j << 1) + i);
    }

    /* renamed from: j */
    public static final long m38166j(long j) {
        return k16.m34885n((j << 1) + 1);
    }

    /* renamed from: k */
    public static final long m38167k(long j) {
        boolean z = false;
        if (-4611686018426L <= j && j < 4611686018427L) {
            z = true;
        }
        return z ? m38168l(m38170n(j)) : m38166j(bce.m18610m(j, -4611686018427387903L, 4611686018427387903L));
    }

    /* renamed from: l */
    public static final long m38168l(long j) {
        return k16.m34885n(j << 1);
    }

    /* renamed from: m */
    public static final long m38169m(long j) {
        boolean z = false;
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            z = true;
        }
        return z ? m38168l(j) : m38166j(m38171o(j));
    }

    /* renamed from: n */
    public static final long m38170n(long j) {
        return j * 1000000;
    }

    /* renamed from: o */
    public static final long m38171o(long j) {
        return j / 1000000;
    }

    /* renamed from: p */
    public static final long m38172p(String str, boolean z) {
        boolean z2;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        k16.C14700a c14700a = k16.f31358b;
        long jM34900c = c14700a.m34900c();
        char cCharAt = str.charAt(0);
        boolean z3 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z4 = length2 > 0;
        boolean z5 = z4 && f9g.I0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i = length2 + 1;
            if (i == length) {
                throw new IllegalArgumentException();
            }
            boolean z6 = false;
            o16 o16Var = null;
            while (i < length) {
                if (str.charAt(i) != 'T') {
                    int i2 = i;
                    while (i2 < str.length()) {
                        char cCharAt2 = str.charAt(i2);
                        if (!(((c2 > cCharAt2 || cCharAt2 >= c) ? false : z3) || f9g.m26305O("+-.", cCharAt2, false, 2, null))) {
                            break;
                        }
                        i2++;
                        c2 = '0';
                        c = ':';
                        z3 = true;
                    }
                    sq8.m48647f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i, i2);
                    sq8.m48648g(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i + strSubstring.length();
                    if (!(length3 >= 0 && length3 < str.length())) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str.charAt(length3);
                    i = length3 + 1;
                    o16 o16VarM44669d = q16.m44669d(cCharAt3, z6);
                    if (o16Var != null && o16Var.compareTo(o16VarM44669d) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iA0 = f9g.a0(strSubstring, '.', 0, false, 6, null);
                    if (o16VarM44669d != o16.SECONDS || iA0 <= 0) {
                        z2 = z6;
                        jM34900c = k16.m34870P(jM34900c, m38176t(m38173q(strSubstring), o16VarM44669d));
                    } else {
                        sq8.m48647f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iA0);
                        sq8.m48648g(strSubstring2, "substring(...)");
                        z2 = z6;
                        long jM34870P = k16.m34870P(jM34900c, m38176t(m38173q(strSubstring2), o16VarM44669d));
                        sq8.m48647f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iA0);
                        sq8.m48648g(strSubstring3, "substring(...)");
                        jM34900c = k16.m34870P(jM34870P, m38174r(Double.parseDouble(strSubstring3), o16VarM44669d));
                    }
                    z6 = z2;
                    o16Var = o16VarM44669d;
                    c2 = '0';
                    c = ':';
                    z3 = true;
                } else {
                    if (z6 || (i = i + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z6 = z3;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (e9g.m24587A(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM34900c = c14700a.m34898a();
            } else {
                boolean z7 = !z4;
                if (z4 && str.charAt(length2) == '(' && h9g.i1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z7 = true;
                }
                o16 o16Var2 = null;
                boolean z8 = false;
                while (length2 < length) {
                    if (z8 && z7) {
                        while (length2 < str.length()) {
                            if (!(str.charAt(length2) == ' ')) {
                                break;
                            }
                            length2++;
                        }
                    }
                    int i3 = length2;
                    while (i3 < str.length()) {
                        char cCharAt4 = str.charAt(i3);
                        if (!(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '.')) {
                            break;
                        }
                        i3++;
                    }
                    sq8.m48647f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i3);
                    sq8.m48648g(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i4 = length4;
                    while (i4 < str.length()) {
                        char cCharAt5 = str.charAt(i4);
                        if (!('a' <= cCharAt5 && cCharAt5 < '{')) {
                            break;
                        }
                        i4++;
                    }
                    sq8.m48647f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i4);
                    sq8.m48648g(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    o16 o16VarM44670e = q16.m44670e(strSubstring5);
                    if (o16Var2 != null && o16Var2.compareTo(o16VarM44670e) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iA02 = f9g.a0(strSubstring4, '.', 0, false, 6, null);
                    if (iA02 > 0) {
                        sq8.m48647f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iA02);
                        sq8.m48648g(strSubstring6, "substring(...)");
                        long jM34870P2 = k16.m34870P(jM34900c, m38176t(Long.parseLong(strSubstring6), o16VarM44670e));
                        sq8.m48647f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iA02);
                        sq8.m48648g(strSubstring7, "substring(...)");
                        jM34900c = k16.m34870P(jM34870P2, m38174r(Double.parseDouble(strSubstring7), o16VarM44670e));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM34900c = k16.m34870P(jM34900c, m38176t(Long.parseLong(strSubstring4), o16VarM44670e));
                    }
                    str2 = str3;
                    o16Var2 = o16VarM44670e;
                    z8 = true;
                }
            }
        }
        return z5 ? k16.m34877W(jM34900c) : jM34900c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m38173q(String str) {
        boolean z;
        int length = str.length();
        int i = (length <= 0 || !f9g.m26305O("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable kl8Var = new kl8(i, f9g.m26312V(str));
            if ((kl8Var instanceof Collection) && ((Collection) kl8Var).isEmpty()) {
                z = true;
                if (z) {
                }
            } else {
                Iterator it = kl8Var.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((dl8) it).mo23412a());
                    if (!('0' <= cCharAt && cCharAt < ':')) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        if (e9g.m24597K(str, "+", false, 2, null)) {
            str = h9g.e1(str, 1);
        }
        return Long.parseLong(str);
    }

    /* renamed from: r */
    public static final long m38174r(double d, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        double dM42863a = p16.m42863a(d, o16Var, o16.NANOSECONDS);
        if (!(!Double.isNaN(dM42863a))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jM38122e = lza.m38122e(dM42863a);
        return -4611686018426999999L <= jM38122e && jM38122e < 4611686018427000000L ? m38168l(jM38122e) : m38167k(lza.m38122e(p16.m42863a(d, o16Var, o16.MILLISECONDS)));
    }

    /* renamed from: s */
    public static final long m38175s(int i, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        return o16Var.compareTo(o16.SECONDS) <= 0 ? m38168l(p16.m42865c(i, o16Var, o16.NANOSECONDS)) : m38176t(i, o16Var);
    }

    /* renamed from: t */
    public static final long m38176t(long j, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        o16 o16Var2 = o16.NANOSECONDS;
        long jM42865c = p16.m42865c(4611686018426999999L, o16Var2, o16Var);
        boolean z = false;
        if ((-jM42865c) <= j && j <= jM42865c) {
            z = true;
        }
        return z ? m38168l(p16.m42865c(j, o16Var, o16Var2)) : m38166j(bce.m18610m(p16.m42864b(j, o16Var, o16.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
