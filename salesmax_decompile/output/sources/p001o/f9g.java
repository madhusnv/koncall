package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class f9g extends e9g {

    /* renamed from: o.f9g$a */
    public static final class C13369a extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ char[] f22999a;

        /* renamed from: b */
        public final /* synthetic */ boolean f23000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13369a(char[] cArr, boolean z) {
            super(2);
            this.f22999a = cArr;
            this.f23000b = z;
        }

        /* renamed from: a */
        public final hwc m26317a(CharSequence charSequence, int i) {
            sq8.m48649h(charSequence, "$this$$receiver");
            int iC0 = f9g.c0(charSequence, this.f22999a, i, this.f23000b);
            if (iC0 < 0) {
                return null;
            }
            return vyh.m53620a(Integer.valueOf(iC0), 1);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m26317a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.f9g$b */
    public static final class C13370b extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ List f23001a;

        /* renamed from: b */
        public final /* synthetic */ boolean f23002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13370b(List list, boolean z) {
            super(2);
            this.f23001a = list;
            this.f23002b = z;
        }

        /* renamed from: a */
        public final hwc m26318a(CharSequence charSequence, int i) {
            sq8.m48649h(charSequence, "$this$$receiver");
            hwc hwcVarM26311U = f9g.m26311U(charSequence, this.f23001a, i, this.f23002b, false);
            if (hwcVarM26311U != null) {
                return vyh.m53620a(hwcVarM26311U.m31229c(), Integer.valueOf(((String) hwcVarM26311U.m31230d()).length()));
            }
            return null;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m26318a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.f9g$c */
    public static final class C13371c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f23003a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13371c(CharSequence charSequence) {
            super(1);
            this.f23003a = charSequence;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(kl8 kl8Var) {
            sq8.m48649h(kl8Var, "it");
            return f9g.K0(this.f23003a, kl8Var);
        }
    }

    public static final List A0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return B0(charSequence, str, z, i);
            }
        }
        Iterable iterableM45307j = qef.m45307j(s0(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(dh3.m23088v(iterableM45307j, 10));
        Iterator it = iterableM45307j.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (kl8) it.next()));
        }
        return arrayList;
    }

    public static final List B0(CharSequence charSequence, String str, boolean z, int i) {
        y0(i);
        int length = 0;
        int iM26314X = m26314X(charSequence, str, 0, z);
        if (iM26314X == -1 || i == 1) {
            return bh3.m18963e(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? bce.m18604g(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM26314X).toString());
            length = str.length() + iM26314X;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM26314X = m26314X(charSequence, str, length, z);
        } while (iM26314X != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List C0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return z0(charSequence, cArr, z, i);
    }

    public static /* synthetic */ List D0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return A0(charSequence, strArr, z, i);
    }

    public static final ief E0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(strArr, "delimiters");
        return qef.m45319v(s0(charSequence, strArr, 0, z, i, 2, null), new C13371c(charSequence));
    }

    public static /* synthetic */ ief F0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return E0(charSequence, strArr, z, i);
    }

    public static final boolean G0(CharSequence charSequence, char c, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return charSequence.length() > 0 && qh2.m45486g(charSequence.charAt(0), c, z);
    }

    public static final boolean H0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e9g.m24597K((String) charSequence, (String) charSequence2, false, 2, null) : t0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean I0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return G0(charSequence, c, z);
    }

    public static /* synthetic */ boolean J0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return H0(charSequence, charSequence2, z);
    }

    public static final String K0(CharSequence charSequence, kl8 kl8Var) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(kl8Var, "range");
        return charSequence.subSequence(kl8Var.getStart().intValue(), kl8Var.getEndInclusive().intValue() + 1).toString();
    }

    public static final String L0(String str, kl8 kl8Var) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(kl8Var, "range");
        String strSubstring = str.substring(kl8Var.getStart().intValue(), kl8Var.getEndInclusive().intValue() + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: M */
    public static final boolean m26303M(CharSequence charSequence, char c, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return a0(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static final String M0(String str, char c, String str2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "missingDelimiterValue");
        int iA0 = a0(str, c, 0, false, 6, null);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA0 + 1, str.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: N */
    public static final boolean m26304N(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (b0(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (m26316Z(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String N0(String str, String str2, String str3) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "delimiter");
        sq8.m48649h(str3, "missingDelimiterValue");
        int iB0 = b0(str, str2, 0, false, 6, null);
        if (iB0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iB0 + str2.length(), str.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m26305O(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m26303M(charSequence, c, z);
    }

    public static /* synthetic */ String O0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return M0(str, c, str2);
    }

    /* renamed from: P */
    public static /* synthetic */ boolean m26306P(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m26304N(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return N0(str, str2, str3);
    }

    /* renamed from: Q */
    public static final boolean m26307Q(CharSequence charSequence, char c, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return charSequence.length() > 0 && qh2.m45486g(charSequence.charAt(m26312V(charSequence)), c, z);
    }

    public static final String Q0(String str, char c, String str2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "missingDelimiterValue");
        int iG0 = g0(str, c, 0, false, 6, null);
        if (iG0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iG0 + 1, str.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: R */
    public static final boolean m26308R(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e9g.m24605w((String) charSequence, (String) charSequence2, false, 2, null) : t0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ String R0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c, str2);
    }

    /* renamed from: S */
    public static /* synthetic */ boolean m26309S(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m26307Q(charSequence, c, z);
    }

    public static final String S0(String str, char c, String str2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "missingDelimiterValue");
        int iA0 = a0(str, c, 0, false, 6, null);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iA0);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: T */
    public static /* synthetic */ boolean m26310T(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m26308R(charSequence, charSequence2, z);
    }

    public static final String T0(String str, String str2, String str3) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "delimiter");
        sq8.m48649h(str3, "missingDelimiterValue");
        int iB0 = b0(str, str2, 0, false, 6, null);
        if (iB0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iB0);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: U */
    public static final hwc m26311U(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) kh3.C0(collection);
            int iB0 = !z2 ? b0(charSequence, str, i, false, 4, null) : h0(charSequence, str, i, false, 4, null);
            if (iB0 < 0) {
                return null;
            }
            return vyh.m53620a(Integer.valueOf(iB0), str);
        }
        il8 kl8Var = !z2 ? new kl8(bce.m18601d(i, 0), charSequence.length()) : bce.m18613p(bce.m18604g(i, m26312V(charSequence)), 0);
        if (charSequence instanceof String) {
            int iM32260e = kl8Var.m32260e();
            int iM32261j = kl8Var.m32261j();
            int iM32262n = kl8Var.m32262n();
            if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (e9g.m24587A(str2, 0, (String) charSequence, iM32260e, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iM32260e == iM32261j) {
                            break;
                        }
                        iM32260e += iM32262n;
                    } else {
                        return vyh.m53620a(Integer.valueOf(iM32260e), str3);
                    }
                }
            }
        } else {
            int iM32260e2 = kl8Var.m32260e();
            int iM32261j2 = kl8Var.m32261j();
            int iM32262n2 = kl8Var.m32262n();
            if ((iM32262n2 > 0 && iM32260e2 <= iM32261j2) || (iM32262n2 < 0 && iM32261j2 <= iM32260e2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (t0(str4, 0, charSequence, iM32260e2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iM32260e2 == iM32261j2) {
                            break;
                        }
                        iM32260e2 += iM32262n2;
                    } else {
                        return vyh.m53620a(Integer.valueOf(iM32260e2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String U0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return S0(str, c, str2);
    }

    /* renamed from: V */
    public static final int m26312V(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String V0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return T0(str, str2, str3);
    }

    /* renamed from: W */
    public static final int m26313W(CharSequence charSequence, char c, int i, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? c0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final String W0(String str, String str2, String str3) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "delimiter");
        sq8.m48649h(str3, "missingDelimiterValue");
        int iH0 = h0(str, str2, 0, false, 6, null);
        if (iH0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iH0);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: X */
    public static final int m26314X(CharSequence charSequence, String str, int i, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(str, "string");
        return (z || !(charSequence instanceof String)) ? m26316Z(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ String X0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return W0(str, str2, str3);
    }

    /* renamed from: Y */
    public static final int m26315Y(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        il8 kl8Var = !z2 ? new kl8(bce.m18601d(i, 0), bce.m18604g(i2, charSequence.length())) : bce.m18613p(bce.m18604g(i, m26312V(charSequence)), bce.m18601d(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM32260e = kl8Var.m32260e();
            int iM32261j = kl8Var.m32261j();
            int iM32262n = kl8Var.m32262n();
            if ((iM32262n <= 0 || iM32260e > iM32261j) && (iM32262n >= 0 || iM32261j > iM32260e)) {
                return -1;
            }
            while (!e9g.m24587A((String) charSequence2, 0, (String) charSequence, iM32260e, charSequence2.length(), z)) {
                if (iM32260e == iM32261j) {
                    return -1;
                }
                iM32260e += iM32262n;
            }
            return iM32260e;
        }
        int iM32260e2 = kl8Var.m32260e();
        int iM32261j2 = kl8Var.m32261j();
        int iM32262n2 = kl8Var.m32262n();
        if ((iM32262n2 <= 0 || iM32260e2 > iM32261j2) && (iM32262n2 >= 0 || iM32261j2 > iM32260e2)) {
            return -1;
        }
        while (!t0(charSequence2, 0, charSequence, iM32260e2, charSequence2.length(), z)) {
            if (iM32260e2 == iM32261j2) {
                return -1;
            }
            iM32260e2 += iM32262n2;
        }
        return iM32260e2;
    }

    public static final Boolean Y0(String str) {
        sq8.m48649h(str, "<this>");
        if (sq8.m48644c(str, "true")) {
            return Boolean.TRUE;
        }
        if (sq8.m48644c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: Z */
    public static /* synthetic */ int m26316Z(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m26315Y(charSequence, charSequence2, i, i2, z, z2);
    }

    public static final CharSequence Z0(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM43653c = ph2.m43653c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM43653c) {
                    break;
                }
                length--;
            } else if (zM43653c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m26313W(charSequence, c, i, z);
    }

    public static final CharSequence a1(CharSequence charSequence, char... cArr) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!gp0.m29248O(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m26314X(charSequence, str, i, z);
    }

    public static final CharSequence b1(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ph2.m43653c(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final int c0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(gp0.t0(cArr), i);
        }
        int iM18601d = bce.m18601d(i, 0);
        int iM26312V = m26312V(charSequence);
        if (iM18601d > iM26312V) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM18601d);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (qh2.m45486g(cArr[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return iM18601d;
            }
            if (iM18601d == iM26312V) {
                return -1;
            }
            iM18601d++;
        }
    }

    public static final String c1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        sq8.m48649h(str, "<this>");
        sq8.m48649h(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!gp0.m29248O(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean d0(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ph2.m43653c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int e0(CharSequence charSequence, char c, int i, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int f0(CharSequence charSequence, String str, int i, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(str, "string");
        return (z || !(charSequence instanceof String)) ? m26315Y(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m26312V(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e0(charSequence, c, i, z);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m26312V(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return f0(charSequence, str, i, z);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(gp0.t0(cArr), i);
        }
        for (int iM18604g = bce.m18604g(i, m26312V(charSequence)); -1 < iM18604g; iM18604g--) {
            char cCharAt = charSequence.charAt(iM18604g);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (qh2.m45486g(cArr[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return iM18604g;
            }
        }
        return -1;
    }

    public static final ief j0(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        return F0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List k0(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        return qef.m45302A(j0(charSequence));
    }

    public static final CharSequence l0(CharSequence charSequence, int i, char c) {
        sq8.m48649h(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb;
    }

    public static final String m0(String str, int i, char c) {
        sq8.m48649h(str, "<this>");
        return l0(str, i, c).toString();
    }

    public static final CharSequence n0(CharSequence charSequence, int i, char c) {
        sq8.m48649h(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static final String o0(String str, int i, char c) {
        sq8.m48649h(str, "<this>");
        return n0(str, i, c).toString();
    }

    public static final ief p0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        y0(i2);
        return new wl5(charSequence, i, i2, new C13369a(cArr, z));
    }

    public static final ief q0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        y0(i2);
        return new wl5(charSequence, i, i2, new C13370b(fp0.m27255d(strArr), z));
    }

    public static /* synthetic */ ief r0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return p0(charSequence, cArr, i, z, i2);
    }

    public static /* synthetic */ ief s0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return q0(charSequence, strArr, i, z, i2);
    }

    public static final boolean t0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!qh2.m45486g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String u0(String str, CharSequence charSequence) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(charSequence, "prefix");
        if (!J0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String v0(String str, CharSequence charSequence) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(charSequence, "suffix");
        if (!m26310T(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String w0(String str, CharSequence charSequence) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(charSequence, "delimiter");
        return x0(str, charSequence, charSequence);
    }

    public static final String x0(String str, CharSequence charSequence, CharSequence charSequence2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(charSequence, "prefix");
        sq8.m48649h(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !J0(str, charSequence, false, 2, null) || !m26310T(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void y0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final List z0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(cArr, "delimiters");
        if (cArr.length == 1) {
            return B0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable iterableM45307j = qef.m45307j(r0(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(dh3.m23088v(iterableM45307j, 10));
        Iterator it = iterableM45307j.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (kl8) it.next()));
        }
        return arrayList;
    }
}
