package fm;

import b2.C0558p;
import com.sun.mail.util.AbstractC1452a;
import h4.C2832i;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Vector;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;
import pg.y5;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fm.a */
/* loaded from: classes.dex */
public final class C2322a {

    /* renamed from: a */
    public final /* synthetic */ int f10536a;

    /* renamed from: b */
    public int f10537b;

    /* renamed from: c */
    public int f10538c;

    /* renamed from: d */
    public CharSequence f10539d;

    /* renamed from: e */
    public Object f10540e;

    /* renamed from: a */
    public void m5991a(int i10) {
        int i11 = this.f10537b;
        int i12 = this.f10538c;
        boolean z6 = false;
        if (i10 <= i12 && i11 <= i10) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "Invalid offset: ", ". Valid range is [", " , ");
        sbM4566m.append(i12);
        sbM4566m.append(']');
        AbstractC4646a.m9525a(sbM4566m.toString());
    }

    /* renamed from: b */
    public int m5992b() {
        C0558p c0558p = (C0558p) this.f10540e;
        if (c0558p == null) {
            return ((String) this.f10539d).length();
        }
        return (c0558p.f3795b - c0558p.m1657e()) + (((String) this.f10539d).length() - (this.f10538c - this.f10537b));
    }

    /* renamed from: c */
    public boolean m5993c() {
        int i10 = this.f10538c;
        if (((Vector) this.f10540e).size() <= 0) {
            while (true) {
                int i11 = this.f10537b;
                if (i11 >= i10 || !Character.isWhitespace(((String) this.f10539d).charAt(i11))) {
                    break;
                }
                this.f10537b++;
            }
            if (this.f10537b >= i10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public boolean m5994d(int i10) {
        CharSequence charSequence = this.f10539d;
        int i11 = this.f10537b + 1;
        if (i10 > this.f10538c || i11 > i10) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10)) || Character.isSurrogate(charSequence.charAt(i10 - 1));
    }

    /* renamed from: e */
    public boolean m5995e(int i10) {
        int i11 = this.f10537b + 1;
        if (i10 > this.f10538c || i11 > i10) {
            return false;
        }
        return y5.m11943f(Character.codePointBefore(this.f10539d, i10));
    }

    /* renamed from: f */
    public boolean m5996f(int i10) {
        m5991a(i10);
        if (!((BreakIterator) this.f10540e).isBoundary(i10)) {
            return false;
        }
        if (m5998h(i10) && m5998h(i10 - 1) && m5998h(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= this.f10539d.length() - 1 || !(m5997g(i10) || m5997g(i10 + 1));
    }

    /* renamed from: g */
    public boolean m5997g(int i10) {
        CharSequence charSequence = this.f10539d;
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC4154l.m8918a(unicodeBlockOf, unicodeBlock) && AbstractC4154l.m8918a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC4154l.m8918a(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && AbstractC4154l.m8918a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    /* renamed from: h */
    public boolean m5998h(int i10) {
        CharSequence charSequence = this.f10539d;
        int i11 = this.f10537b;
        if (i10 >= this.f10538c || i11 > i10) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) || Character.isSurrogate(charSequence.charAt(i10));
    }

    /* renamed from: i */
    public boolean m5999i(int i10) {
        int i11 = this.f10537b;
        if (i10 >= this.f10538c || i11 > i10) {
            return false;
        }
        return y5.m11943f(Character.codePointAt(this.f10539d, i10));
    }

    /* renamed from: j */
    public int m6000j(int i10) {
        m5991a(i10);
        int iFollowing = ((BreakIterator) this.f10540e).following(i10);
        return (m5998h(iFollowing + (-1)) && m5998h(iFollowing) && !m5997g(iFollowing)) ? m6000j(iFollowing) : iFollowing;
    }

    /* renamed from: k */
    public String m6001k() {
        int i10 = this.f10538c;
        String str = (String) this.f10539d;
        Vector vector = (Vector) this.f10540e;
        int size = vector.size();
        if (size > 0) {
            int i11 = size - 1;
            String str2 = (String) vector.elementAt(i11);
            vector.removeElementAt(i11);
            return str2;
        }
        while (true) {
            int i12 = this.f10537b;
            if (i12 >= i10 || !Character.isWhitespace(str.charAt(i12))) {
                break;
            }
            this.f10537b++;
        }
        int i13 = this.f10537b;
        if (i13 >= i10) {
            throw new NoSuchElementException();
        }
        char cCharAt = str.charAt(i13);
        if (cCharAt == '\"') {
            this.f10537b++;
            boolean z6 = false;
            while (true) {
                int i14 = this.f10537b;
                if (i14 >= i10) {
                    break;
                }
                this.f10537b = i14 + 1;
                char cCharAt2 = str.charAt(i14);
                if (cCharAt2 == '\\') {
                    this.f10537b++;
                    z6 = true;
                } else if (cCharAt2 == '\"') {
                    if (!z6) {
                        return str.substring(i13 + 1, this.f10537b - 1);
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i15 = i13 + 1; i15 < this.f10537b - 1; i15++) {
                        char cCharAt3 = str.charAt(i15);
                        if (cCharAt3 != '\\') {
                            stringBuffer.append(cCharAt3);
                        }
                    }
                    return stringBuffer.toString();
                }
            }
        } else if ("=".indexOf(cCharAt) >= 0) {
            this.f10537b++;
        } else {
            while (true) {
                int i16 = this.f10537b;
                if (i16 >= i10 || "=".indexOf(str.charAt(i16)) >= 0 || Character.isWhitespace(str.charAt(this.f10537b))) {
                    break;
                }
                this.f10537b++;
            }
        }
        return str.substring(i13, this.f10537b);
    }

    /* renamed from: l */
    public int m6002l(int i10) {
        m5991a(i10);
        int iPreceding = ((BreakIterator) this.f10540e).preceding(i10);
        return (m5998h(iPreceding) && m5994d(iPreceding) && !m5997g(iPreceding)) ? m6002l(iPreceding) : iPreceding;
    }

    /* renamed from: m */
    public void m6003m(int i10, int i11, String str) {
        if (i10 > i11) {
            AbstractC4646a.m9525a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            AbstractC4646a.m9525a("start must be non-negative, but was " + i10);
        }
        C0558p c0558p = (C0558p) this.f10540e;
        if (c0558p == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f10539d).length() - i11, 64);
            String str2 = (String) this.f10539d;
            int i12 = i10 - iMin;
            AbstractC4154l.m8921d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f10539d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            AbstractC4154l.m8921d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0558p c0558p2 = new C0558p(3);
            c0558p2.f3795b = iMax;
            c0558p2.f3798e = cArr;
            c0558p2.f3796c = length;
            c0558p2.f3797d = i13;
            this.f10540e = c0558p2;
            this.f10537b = i12;
            this.f10538c = i14;
            return;
        }
        int i15 = this.f10537b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > c0558p.f3795b - c0558p.m1657e()) {
            this.f10539d = toString();
            this.f10540e = null;
            this.f10537b = -1;
            this.f10538c = -1;
            m6003m(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > c0558p.m1657e()) {
            int iM1657e = length2 - c0558p.m1657e();
            int i18 = c0558p.f3795b;
            do {
                i18 *= 2;
            } while (i18 - c0558p.f3795b < iM1657e);
            char[] cArr2 = new char[i18];
            AbstractC6662l.m12719i((char[]) c0558p.f3798e, cArr2, 0, 0, c0558p.f3796c);
            int i19 = c0558p.f3795b;
            int i20 = c0558p.f3797d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            AbstractC6662l.m12719i((char[]) c0558p.f3798e, cArr2, i22, i20, i21 + i20);
            c0558p.f3798e = cArr2;
            c0558p.f3795b = i18;
            c0558p.f3797d = i22;
        }
        int i23 = c0558p.f3796c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) c0558p.f3798e;
            AbstractC6662l.m12719i(cArr3, cArr3, c0558p.f3797d - i24, i17, i23);
            c0558p.f3796c = i16;
            c0558p.f3797d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iM1657e2 = c0558p.m1657e() + i16;
            int iM1657e3 = c0558p.m1657e() + i17;
            int i25 = c0558p.f3797d;
            char[] cArr4 = (char[]) c0558p.f3798e;
            AbstractC6662l.m12719i(cArr4, cArr4, c0558p.f3796c, i25, iM1657e2);
            c0558p.f3796c += iM1657e2 - i25;
            c0558p.f3797d = iM1657e3;
        } else {
            c0558p.f3797d = c0558p.m1657e() + i17;
            c0558p.f3796c = i16;
        }
        str.getChars(0, str.length(), (char[]) c0558p.f3798e, c0558p.f3796c);
        c0558p.f3796c = str.length() + c0558p.f3796c;
    }

    public String toString() {
        switch (this.f10536a) {
            case 2:
                C0558p c0558p = (C0558p) this.f10540e;
                if (c0558p == null) {
                    return (String) this.f10539d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f10539d, 0, this.f10537b);
                sb2.append((char[]) c0558p.f3798e, 0, c0558p.f3796c);
                char[] cArr = (char[]) c0558p.f3798e;
                int i10 = c0558p.f3797d;
                sb2.append(cArr, i10, c0558p.f3795b - i10);
                String str = (String) this.f10539d;
                sb2.append((CharSequence) str, this.f10538c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C2322a(CharSequence charSequence, int i10, Locale locale) {
        this.f10536a = 1;
        this.f10539d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC4646a.m9525a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            AbstractC4646a.m9525a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f10540e = wordInstance;
        this.f10537b = Math.max(0, -50);
        this.f10538c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new C2832i(charSequence, i10));
    }
}
