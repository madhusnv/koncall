package p001o;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class fgj {

    /* renamed from: a */
    public static final char[] f23309a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final String m26667a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "encodeSet");
        return m26670d(str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    /* renamed from: c */
    public static final String m26669c(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "encodeSet");
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || f9g.m26305O(str2, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z || (z2 && !m26671e(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                rl1 rl1Var = new rl1();
                rl1Var.mo29025i(str, i, iCharCount);
                m26674h(rl1Var, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return rl1Var.m46909T();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i, i2);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public static /* synthetic */ String m26670d(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        return m26669c(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
    }

    /* renamed from: e */
    public static final boolean m26671e(String str, int i, int i2) {
        sq8.m48649h(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ggj.m28612A(str.charAt(i + 1)) != -1 && ggj.m28612A(str.charAt(i3)) != -1;
    }

    /* renamed from: f */
    public static final String m26672f(String str, int i, int i2, boolean z) {
        sq8.m48649h(str, "<this>");
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                rl1 rl1Var = new rl1();
                rl1Var.mo29025i(str, i, i3);
                m26675i(rl1Var, str, i3, i2, z);
                return rl1Var.m46909T();
            }
        }
        String strSubstring = str.substring(i, i2);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: g */
    public static /* synthetic */ String m26673g(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m26672f(str, i, i2, z);
    }

    /* renamed from: h */
    public static final void m26674h(rl1 rl1Var, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        sq8.m48649h(rl1Var, "<this>");
        sq8.m48649h(str, "input");
        sq8.m48649h(str2, "encodeSet");
        int iCharCount = i;
        rl1 rl1Var2 = null;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    rl1Var.n0("+");
                } else if (iCodePointAt == 43 && z3) {
                    rl1Var.n0(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || f9g.m26305O(str2, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z || (z2 && !m26671e(str, iCharCount, i2)))))) {
                    if (rl1Var2 == null) {
                        rl1Var2 = new rl1();
                    }
                    if (charset == null || sq8.m48644c(charset, sh2.f45422b)) {
                        rl1Var2.mo29022G(iCodePointAt);
                    } else {
                        rl1Var2.b1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                    }
                    while (!rl1Var2.mo32311n()) {
                        int i3 = rl1Var2.readByte() & 255;
                        rl1Var.T1(37);
                        char[] cArr = f23309a;
                        rl1Var.T1(cArr[(i3 >> 4) & 15]);
                        rl1Var.T1(cArr[i3 & 15]);
                    }
                } else {
                    rl1Var.mo29022G(iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: i */
    public static final void m26675i(rl1 rl1Var, String str, int i, int i2, boolean z) {
        int i3;
        sq8.m48649h(rl1Var, "<this>");
        sq8.m48649h(str, "encoded");
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM28612A = ggj.m28612A(str.charAt(i + 1));
                int iM28612A2 = ggj.m28612A(str.charAt(i3));
                if (iM28612A == -1 || iM28612A2 == -1) {
                    rl1Var.mo29022G(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                } else {
                    rl1Var.T1((iM28612A << 4) + iM28612A2);
                    i = Character.charCount(iCodePointAt) + i3;
                }
            } else if (iCodePointAt == 43 && z) {
                rl1Var.T1(32);
                i++;
            } else {
                rl1Var.mo29022G(iCodePointAt);
                i += Character.charCount(iCodePointAt);
            }
        }
    }
}
