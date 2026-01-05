package p001o;

import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;

/* loaded from: classes6.dex */
public abstract class e9g extends d9g {
    /* renamed from: A */
    public static final boolean m24587A(String str, int i, String str2, int i2, int i3, boolean z) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m24588B(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m24587A(str, i, str2, i2, i3, z);
    }

    /* renamed from: C */
    public static final String m24589C(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "<this>");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        sq8.m48646e(string);
        return string;
    }

    /* renamed from: D */
    public static final String m24590D(String str, char c, char c2, boolean z) {
        sq8.m48649h(str, "<this>");
        if (!z) {
            String strReplace = str.replace(c, c2);
            sq8.m48648g(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (qh2.m45486g(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: E */
    public static final String m24591E(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "oldValue");
        sq8.m48649h(str3, "newValue");
        int i = 0;
        int iM26314X = f9g.m26314X(str, str2, 0, z);
        if (iM26314X < 0) {
            return str;
        }
        int length = str2.length();
        int iM18601d = bce.m18601d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iM26314X);
            sb.append(str3);
            i = iM26314X + length;
            if (iM26314X >= str.length()) {
                break;
            }
            iM26314X = f9g.m26314X(str, str2, iM26314X + iM18601d, z);
        } while (iM26314X > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: F */
    public static /* synthetic */ String m24592F(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m24590D(str, c, c2, z);
    }

    /* renamed from: G */
    public static /* synthetic */ String m24593G(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m24591E(str, str2, str3, z);
    }

    /* renamed from: H */
    public static final boolean m24594H(String str, String str2, int i, boolean z) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "prefix");
        return !z ? str.startsWith(str2, i) : m24587A(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: I */
    public static final boolean m24595I(String str, String str2, boolean z) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "prefix");
        return !z ? str.startsWith(str2) : m24587A(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m24596J(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24594H(str, str2, i, z);
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m24597K(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24595I(str, str2, z);
    }

    /* renamed from: p */
    public static final String m24598p(char[] cArr) {
        sq8.m48649h(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: q */
    public static final String m24599q(char[] cArr, int i, int i2) {
        sq8.m48649h(cArr, "<this>");
        e8.f21141a.m24503a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: r */
    public static final String m24600r(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return new String(bArr, sh2.f45422b);
    }

    /* renamed from: s */
    public static final String m24601s(byte[] bArr, int i, int i2, boolean z) {
        sq8.m48649h(bArr, "<this>");
        e8.f21141a.m24503a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, sh2.f45422b);
        }
        String string = sh2.f45422b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: t */
    public static /* synthetic */ String m24602t(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m24601s(bArr, i, i2, z);
    }

    /* renamed from: u */
    public static final byte[] m24603u(String str) {
        sq8.m48649h(str, "<this>");
        byte[] bytes = str.getBytes(sh2.f45422b);
        sq8.m48648g(bytes, "getBytes(...)");
        return bytes;
    }

    /* renamed from: v */
    public static final boolean m24604v(String str, String str2, boolean z) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "suffix");
        return !z ? str.endsWith(str2) : m24587A(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m24605w(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24604v(str, str2, z);
    }

    /* renamed from: x */
    public static final boolean m24606x(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m24607y(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24606x(str, str2, z);
    }

    /* renamed from: z */
    public static final Comparator m24608z(h8g h8gVar) {
        sq8.m48649h(h8gVar, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        sq8.m48648g(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }
}
