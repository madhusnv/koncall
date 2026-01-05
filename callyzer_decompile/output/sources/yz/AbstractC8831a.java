package yz;

import b00.C0526k;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yz.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8831a {

    /* renamed from: a */
    public static final char[] f42533a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m16284a(int i10, int i11, int i12, String str, String str2) {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        int i14 = i11;
        boolean z6 = (i12 & 8) == 0;
        boolean z10 = (i12 & 16) == 0;
        boolean z11 = (i12 & 32) == 0;
        boolean z12 = (i12 & 64) == 0;
        AbstractC4154l.m8923f(str, "<this>");
        return m16285b(str, i13, i14, str2, z6, z10, z11, z12, 128);
    }

    /* renamed from: b */
    public static String m16285b(String str, int i10, int i11, String str2, boolean z6, boolean z10, boolean z11, boolean z12, int i12) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z13 = (i12 & 8) != 0 ? false : z6;
        boolean z14 = (i12 & 16) != 0 ? false : z10;
        boolean z15 = (i12 & 64) == 0 ? z12 : false;
        AbstractC4154l.m8923f(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z15) || AbstractC5178p.m10117y(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z13 || (z14 && !m16286c(iCharCount, length, str)))) || (iCodePointAt == 43 && z11)))) {
                C0526k c0526k = new C0526k();
                c0526k.G0(i13, iCharCount, str);
                C0526k c0526k2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z13 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c0526k.H0("+");
                        } else if (iCodePointAt2 == 43 && z11) {
                            c0526k.H0(z13 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z15) || AbstractC5178p.m10117y(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z13 || (z14 && !m16286c(iCharCount, length, str)))))) {
                            if (c0526k2 == null) {
                                c0526k2 = new C0526k();
                            }
                            c0526k2.I0(iCodePointAt2);
                            while (!c0526k2.mo1545e()) {
                                byte b10 = c0526k2.readByte();
                                c0526k.B0(37);
                                char[] cArr = f42533a;
                                c0526k.B0(cArr[((b10 & 255) >> 4) & 15]);
                                c0526k.B0(cArr[b10 & 15]);
                            }
                        } else {
                            c0526k.I0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 128;
                }
                return c0526k.o0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c */
    public static final boolean m16286c(int i10, int i11, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && AbstractC4297c.m9007k(str.charAt(i10 + 1)) != -1 && AbstractC4297c.m9007k(str.charAt(i12)) != -1;
    }

    /* renamed from: d */
    public static String m16287d(int i10, int i11, int i12, String str) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z6 = (i12 & 4) == 0;
        AbstractC4154l.m8923f(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                C0526k c0526k = new C0526k();
                c0526k.G0(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iM9007k = AbstractC4297c.m9007k(str.charAt(iCharCount + 1));
                        int iM9007k2 = AbstractC4297c.m9007k(str.charAt(i13));
                        if (iM9007k == -1 || iM9007k2 == -1) {
                            c0526k.I0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0526k.B0((iM9007k << 4) + iM9007k2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z6) {
                        c0526k.B0(32);
                        iCharCount++;
                    } else {
                        c0526k.I0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0526k.o0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
