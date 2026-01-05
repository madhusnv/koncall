package j$.time.format;

import java.text.ParsePosition;

/* renamed from: j$.time.format.m */
/* loaded from: classes2.dex */
public class C3443m {

    /* renamed from: a */
    public String f18174a;

    /* renamed from: b */
    public String f18175b;

    /* renamed from: c */
    public final char f18176c;

    /* renamed from: d */
    public C3443m f18177d;

    /* renamed from: e */
    public C3443m f18178e;

    /* renamed from: b */
    public boolean mo7976b(char c2, char c10) {
        return c2 == c10;
    }

    public C3443m(String str, String str2, C3443m c3443m) {
        this.f18174a = str;
        this.f18175b = str2;
        this.f18177d = c3443m;
        if (str.isEmpty()) {
            this.f18176c = (char) 65535;
        } else {
            this.f18176c = this.f18174a.charAt(0);
        }
    }

    /* renamed from: c */
    public final String m7980c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo7978e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f18174a.length() + index;
        C3443m c3443m = this.f18177d;
        if (c3443m != null && length2 != length) {
            while (true) {
                if (mo7976b(c3443m.f18176c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strM7980c = c3443m.m7980c(charSequence, parsePosition);
                    if (strM7980c != null) {
                        return strM7980c;
                    }
                } else {
                    c3443m = c3443m.f18178e;
                    if (c3443m == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f18175b;
    }

    /* renamed from: d */
    public C3443m mo7977d(String str, String str2, C3443m c3443m) {
        return new C3443m(str, str2, c3443m);
    }

    /* renamed from: e */
    public boolean mo7978e(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f18174a, i10);
        }
        int length = this.f18174a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!mo7976b(this.f18174a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }

    /* renamed from: a */
    public final boolean m7979a(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f18174a.length() && mo7976b(str.charAt(i10), this.f18174a.charAt(i10))) {
            i10++;
        }
        if (i10 == this.f18174a.length()) {
            if (i10 < str.length()) {
                String strSubstring = str.substring(i10);
                for (C3443m c3443m = this.f18177d; c3443m != null; c3443m = c3443m.f18178e) {
                    if (mo7976b(c3443m.f18176c, strSubstring.charAt(0))) {
                        return c3443m.m7979a(strSubstring, str2);
                    }
                }
                C3443m c3443mMo7977d = mo7977d(strSubstring, str2, null);
                c3443mMo7977d.f18178e = this.f18177d;
                this.f18177d = c3443mMo7977d;
                return true;
            }
            this.f18175b = str2;
            return true;
        }
        C3443m c3443mMo7977d2 = mo7977d(this.f18174a.substring(i10), this.f18175b, this.f18177d);
        this.f18174a = str.substring(0, i10);
        this.f18177d = c3443mMo7977d2;
        if (i10 < str.length()) {
            this.f18177d.f18178e = mo7977d(str.substring(i10), str2, null);
            this.f18175b = null;
            return true;
        }
        this.f18175b = str2;
        return true;
    }
}
