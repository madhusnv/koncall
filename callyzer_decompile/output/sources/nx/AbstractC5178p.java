package nx;

import com.amplifyframework.storage.s3.C1230b;
import hy.C3057h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4264f;
import kx.C4266h;
import mm.AbstractC4801l;
import og.d2;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;
import rw.AbstractC6664n;

/* renamed from: nx.p */
/* loaded from: classes3.dex */
public abstract class AbstractC5178p extends AbstractC5185w {
    /* renamed from: A */
    public static String m10090A(int i10, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: B */
    public static String m10091B(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return f0(length, str);
    }

    /* renamed from: C */
    public static boolean m10092C(CharSequence charSequence, String str) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC5185w.m10129k((String) charSequence, str, false) : m10106Q(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* renamed from: D */
    public static boolean m10093D(String str, char c2) {
        AbstractC4154l.m8923f(str, "<this>");
        return str.length() > 0 && d2.m10601d(str.charAt(m10095F(str)), c2, false);
    }

    /* renamed from: E */
    public static char m10094E(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: F */
    public static final int m10095F(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: G */
    public static final int m10096G(CharSequence charSequence, String string, int i10, boolean z6) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        AbstractC4154l.m8923f(string, "string");
        return (z6 || !(charSequence instanceof String)) ? m10097H(charSequence, string, i10, charSequence.length(), z6, false) : ((String) charSequence).indexOf(string, i10);
    }

    /* renamed from: H */
    public static final int m10097H(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z6, boolean z10) {
        C4264f c4264f;
        if (z10) {
            int iM10095F = m10095F(charSequence);
            if (i10 > iM10095F) {
                i10 = iM10095F;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            c4264f = new C4264f(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            c4264f = new C4266h(i10, i11, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i12 = c4264f.f21648c;
        int i13 = c4264f.f21647b;
        int i14 = c4264f.f21646a;
        if (!z11 || !(charSequence2 instanceof String)) {
            boolean z12 = z6;
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z13 = z12;
                    z12 = z13;
                    if (!m10106Q(charSequence4, 0, charSequence3, i14, charSequence2.length(), z13)) {
                        if (i14 == i13) {
                            break;
                        }
                        i14 += i12;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i14;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            int i15 = i14;
            while (true) {
                String str = (String) charSequence2;
                boolean z14 = z6;
                if (!AbstractC5185w.m10133o(0, i15, str.length(), str, (String) charSequence, z14)) {
                    if (i15 == i13) {
                        break;
                    }
                    i15 += i12;
                    z6 = z14;
                } else {
                    return i15;
                }
            }
        }
        return -1;
    }

    /* renamed from: I */
    public static int m10098I(CharSequence charSequence, char c2, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        AbstractC4154l.m8923f(charSequence, "<this>");
        return !(charSequence instanceof String) ? m10100K(charSequence, new char[]{c2}, i10, false) : ((String) charSequence).indexOf(c2, i10);
    }

    /* renamed from: J */
    public static /* synthetic */ int m10099J(CharSequence charSequence, String str, int i10, boolean z6, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        return m10096G(charSequence, str, i10, z6);
    }

    /* renamed from: K */
    public static final int m10100K(CharSequence charSequence, char[] cArr, int i10, boolean z6) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC6662l.m12706I(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iM10095F = m10095F(charSequence);
        if (i10 > iM10095F) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c2 : cArr) {
                if (d2.m10601d(c2, cCharAt, z6)) {
                    return i10;
                }
            }
            if (i10 == iM10095F) {
                return -1;
            }
            i10++;
        }
    }

    /* renamed from: L */
    public static boolean m10101L(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!d2.m10603f(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public static char m10102M(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m10095F(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: N */
    public static int m10103N(CharSequence charSequence, char c2, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = m10095F(charSequence);
        }
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i10);
        }
        char[] cArr = {c2};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC6662l.m12706I(cArr), i10);
        }
        int iM10095F = m10095F(charSequence);
        if (i10 > iM10095F) {
            i10 = iM10095F;
        }
        while (-1 < i10) {
            if (d2.m10601d(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    /* renamed from: O */
    public static int m10104O(CharSequence charSequence, String string, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = m10095F(charSequence);
        }
        int i12 = i10;
        AbstractC4154l.m8923f(charSequence, "<this>");
        AbstractC4154l.m8923f(string, "string");
        return !(charSequence instanceof String) ? m10097H(charSequence, string, i12, 0, false, true) : ((String) charSequence).lastIndexOf(string, i12);
    }

    /* renamed from: P */
    public static String m10105P(int i10, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC4154l.m8923f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: Q */
    public static final boolean m10106Q(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z6) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        AbstractC4154l.m8923f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!d2.m10601d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z6)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public static String m10107R(String str, String str2) {
        AbstractC4154l.m8923f(str, "<this>");
        if (!AbstractC5185w.m10138t(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: S */
    public static String m10108S(String str, String str2) {
        AbstractC4154l.m8923f(str, "<this>");
        if (!m10092C(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: T */
    public static final void m10109T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    /* renamed from: U */
    public static final List m10110U(int i10, CharSequence charSequence, String str) {
        m10109T(i10);
        int iM10096G = m10096G(charSequence, str, 0, false);
        if (iM10096G == -1 || i10 == 1) {
            return pe.m10833h(charSequence.toString());
        }
        boolean z6 = i10 > 0;
        int i11 = 10;
        if (z6 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM10096G).toString());
            length = str.length() + iM10096G;
            if (z6 && arrayList.size() == i10 - 1) {
                break;
            }
            iM10096G = m10096G(charSequence, str, length, false);
        } while (iM10096G != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: V */
    public static List m10111V(CharSequence charSequence, char[] cArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (cArr.length == 1) {
            return m10110U(i10, charSequence, String.valueOf(cArr[0]));
        }
        m10109T(i10);
        C3057h c3057h = new C3057h(1, new C5165c(charSequence, i10, new C1230b(21, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c3057h, 10));
        Iterator it = c3057h.iterator();
        while (true) {
            C5164b c5164b = (C5164b) it;
            if (!c5164b.hasNext()) {
                return arrayList;
            }
            C4266h range = (C4266h) c5164b.next();
            AbstractC4154l.m8923f(range, "range");
            arrayList.add(charSequence.subSequence(range.f21646a, range.f21647b + 1).toString());
        }
    }

    /* renamed from: W */
    public static List m10112W(CharSequence charSequence, String[] strArr, int i10) {
        int i11 = (i10 & 4) != 0 ? 0 : 2;
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m10110U(i11, charSequence, str);
            }
        }
        m10109T(i11);
        C3057h c3057h = new C3057h(1, new C5165c(charSequence, i11, new C5186x(AbstractC6662l.m12711a(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c3057h, 10));
        Iterator it = c3057h.iterator();
        while (true) {
            C5164b c5164b = (C5164b) it;
            if (!c5164b.hasNext()) {
                return arrayList;
            }
            C4266h range = (C4266h) c5164b.next();
            AbstractC4154l.m8923f(range, "range");
            arrayList.add(charSequence.subSequence(range.f21646a, range.f21647b + 1).toString());
        }
    }

    /* renamed from: X */
    public static boolean m10113X(String str, char c2) {
        AbstractC4154l.m8923f(str, "<this>");
        return str.length() > 0 && d2.m10601d(str.charAt(0), c2, false);
    }

    /* renamed from: Y */
    public static String m10114Y(String str, C4266h range) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(range, "range");
        String strSubstring = str.substring(range.f21646a, range.f21647b + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Z */
    public static String m10115Z(char c2, String str, String missingDelimiterValue) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(missingDelimiterValue, "missingDelimiterValue");
        int iM10098I = m10098I(str, c2, 0, 6);
        if (iM10098I == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM10098I + 1, str.length());
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a0(String missingDelimiterValue, String delimiter) {
        AbstractC4154l.m8923f(missingDelimiterValue, "<this>");
        AbstractC4154l.m8923f(delimiter, "delimiter");
        AbstractC4154l.m8923f(missingDelimiterValue, "missingDelimiterValue");
        int iM10099J = m10099J(missingDelimiterValue, delimiter, 0, false, 6);
        if (iM10099J == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iM10099J, missingDelimiterValue.length());
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b0(char c2, String str, String str2) {
        int iM10103N = m10103N(str, c2, 0, 6);
        if (iM10103N == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM10103N + 1, str.length());
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c0(String str, String str2, String str3) {
        AbstractC4154l.m8923f(str, "<this>");
        int iM10099J = m10099J(str, str2, 0, false, 6);
        if (iM10099J == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM10099J);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String d0(String str, char c2) {
        int iM10098I = m10098I(str, c2, 0, 6);
        if (iM10098I == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM10098I);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String e0(String missingDelimiterValue, char c2) {
        AbstractC4154l.m8923f(missingDelimiterValue, "<this>");
        AbstractC4154l.m8923f(missingDelimiterValue, "missingDelimiterValue");
        int iM10103N = m10103N(missingDelimiterValue, c2, 0, 6);
        if (iM10103N == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM10103N);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f0(int i10, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence g0(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean zM10603f = d2.m10603f(charSequence.charAt(!z6 ? i10 : length));
            if (z6) {
                if (!zM10603f) {
                    break;
                }
                length--;
            } else if (zM10603f) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static CharSequence h0(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!d2.m10603f(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static String i0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC4154l.m8923f(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str.charAt(i10);
            int length2 = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    i11 = -1;
                    break;
                }
                if (cCharAt == cArr[i11]) {
                    break;
                }
                i11++;
            }
            if (!(i11 >= 0)) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: x */
    public static boolean m10116x(CharSequence charSequence, CharSequence other, boolean z6) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        AbstractC4154l.m8923f(other, "other");
        if (other instanceof String) {
            if (m10099J(charSequence, (String) other, 0, z6, 2) >= 0) {
                return true;
            }
        } else if (m10097H(charSequence, other, 0, charSequence.length(), z6, false) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m10117y(CharSequence charSequence, char c2) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        return m10098I(charSequence, c2, 0, 2) >= 0;
    }
}
