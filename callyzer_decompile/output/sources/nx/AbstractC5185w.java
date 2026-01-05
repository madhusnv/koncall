package nx;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;
import og.d2;
import og.oe;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.w */
/* loaded from: classes3.dex */
public abstract class AbstractC5185w extends AbstractC5184v {
    /* renamed from: g */
    public static boolean m10125g(CharSequence charSequence, CharSequence charSequence2) {
        boolean z6 = charSequence instanceof String;
        if (z6 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z6 && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (charSequence.charAt(i10) == charSequence2.charAt(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static String m10126h(byte[] bArr) {
        AbstractC4154l.m8923f(bArr, "<this>");
        return new String(bArr, AbstractC5163a.f25245a);
    }

    /* renamed from: i */
    public static String m10127i(byte[] bArr, int i10, int i11, boolean z6) {
        AbstractC4154l.m8923f(bArr, "<this>");
        oe.m10799a(i10, i11, bArr.length);
        if (!z6) {
            return new String(bArr, i10, i11 - i10, AbstractC5163a.f25245a);
        }
        CharsetDecoder charsetDecoderNewDecoder = AbstractC5163a.f25245a.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    /* renamed from: j */
    public static byte[] m10128j(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC5163a.f25245a);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        return bytes;
    }

    /* renamed from: k */
    public static boolean m10129k(String str, String suffix, boolean z6) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(suffix, "suffix");
        return !z6 ? str.endsWith(suffix) : m10133o(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    /* renamed from: l */
    public static boolean m10130l(String str, String str2, boolean z6) {
        return str == null ? str2 == null : !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: m */
    public static void m10131m() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC4154l.m8922e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    /* renamed from: n */
    public static final void m10132n(String input) {
        AbstractC4154l.m8923f(input, "input");
        throw new NumberFormatException(a1.m14328h('\'', "Invalid number format: '", input));
    }

    /* renamed from: o */
    public static boolean m10133o(int i10, int i11, int i12, String str, String other, boolean z6) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(other, "other");
        return !z6 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z6, i10, other, i11, i12);
    }

    /* renamed from: p */
    public static String m10134p(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC4154l.m8920c(string);
        return string;
    }

    /* renamed from: q */
    public static String m10135q(String str, char c2, char c10) {
        AbstractC4154l.m8923f(str, "<this>");
        String strReplace = str.replace(c2, c10);
        AbstractC4154l.m8922e(strReplace, "replace(...)");
        return strReplace;
    }

    /* renamed from: r */
    public static String m10136r(String str, String oldValue, String newValue) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(oldValue, "oldValue");
        AbstractC4154l.m8923f(newValue, "newValue");
        int iM10096G = AbstractC5178p.m10096G(str, oldValue, 0, false);
        if (iM10096G < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iM10096G);
            sb2.append(newValue);
            i11 = iM10096G + length;
            if (iM10096G >= str.length()) {
                break;
            }
            iM10096G = AbstractC5178p.m10096G(str, oldValue, iM10096G + i10, false);
        } while (iM10096G > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    /* renamed from: s */
    public static boolean m10137s(int i10, String str, String str2, boolean z6) {
        AbstractC4154l.m8923f(str, "<this>");
        return !z6 ? str.startsWith(str2, i10) : m10133o(i10, 0, str2.length(), str, str2, z6);
    }

    /* renamed from: t */
    public static boolean m10138t(String str, String prefix, boolean z6) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(prefix, "prefix");
        return !z6 ? str.startsWith(prefix) : m10133o(0, 0, prefix.length(), str, prefix, z6);
    }

    /* renamed from: u */
    public static Integer m10139u(int i10, String str) {
        boolean z6;
        int i11;
        int i12;
        AbstractC4154l.m8923f(str, "<this>");
        d2.m10599b(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (AbstractC4154l.m8924g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigit) {
                return null;
            }
            i13 = i12 - iDigit;
            i11++;
        }
        return z6 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    /* renamed from: v */
    public static Integer m10140v(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        return m10139u(10, str);
    }

    /* renamed from: w */
    public static Long m10141w(String str) {
        boolean z6;
        AbstractC4154l.m8923f(str, "<this>");
        d2.m10599b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j6 = -9223372036854775807L;
        if (AbstractC4154l.m8924g(cCharAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j6 = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z6 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j6 / 10;
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * 10;
            long j13 = iDigit;
            if (j12 < j6 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i10++;
        }
        return z6 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
