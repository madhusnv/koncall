package p001o;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class lh1 {

    /* renamed from: d */
    public static final vgh f33774d;

    /* renamed from: e */
    public static final String f33775e;

    /* renamed from: f */
    public static final String f33776f;

    /* renamed from: g */
    public static final lh1 f33777g;

    /* renamed from: h */
    public static final lh1 f33778h;

    /* renamed from: a */
    public final boolean f33779a;

    /* renamed from: b */
    public final int f33780b;

    /* renamed from: c */
    public final vgh f33781c;

    /* renamed from: o.lh1$a */
    public static final class C15073a {

        /* renamed from: a */
        public boolean f33782a;

        /* renamed from: b */
        public int f33783b;

        /* renamed from: c */
        public vgh f33784c;

        public C15073a() {
            m37180c(lh1.m37170e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static lh1 m37178b(boolean z) {
            return z ? lh1.f33778h : lh1.f33777g;
        }

        /* renamed from: a */
        public lh1 m37179a() {
            return (this.f33783b == 2 && this.f33784c == lh1.f33774d) ? m37178b(this.f33782a) : new lh1(this.f33782a, this.f33783b, this.f33784c);
        }

        /* renamed from: c */
        public final void m37180c(boolean z) {
            this.f33782a = z;
            this.f33784c = lh1.f33774d;
            this.f33783b = 2;
        }
    }

    /* renamed from: o.lh1$b */
    public static class C15074b {

        /* renamed from: f */
        public static final byte[] f33785f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f33786a;

        /* renamed from: b */
        public final boolean f33787b;

        /* renamed from: c */
        public final int f33788c;

        /* renamed from: d */
        public int f33789d;

        /* renamed from: e */
        public char f33790e;

        static {
            for (int i = 0; i < 1792; i++) {
                f33785f[i] = Character.getDirectionality(i);
            }
        }

        public C15074b(CharSequence charSequence, boolean z) {
            this.f33786a = charSequence;
            this.f33787b = z;
            this.f33788c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m37181c(char c) {
            return c < 1792 ? f33785f[c] : Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte m37182a() {
            char cCharAt = this.f33786a.charAt(this.f33789d - 1);
            this.f33790e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f33786a, this.f33789d);
                this.f33789d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f33789d--;
            byte bM37181c = m37181c(this.f33790e);
            if (!this.f33787b) {
                return bM37181c;
            }
            char c = this.f33790e;
            return c == '>' ? m37188h() : c == ';' ? m37186f() : bM37181c;
        }

        /* renamed from: b */
        public byte m37183b() {
            char cCharAt = this.f33786a.charAt(this.f33789d);
            this.f33790e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f33786a, this.f33789d);
                this.f33789d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f33789d++;
            byte bM37181c = m37181c(this.f33790e);
            if (!this.f33787b) {
                return bM37181c;
            }
            char c = this.f33790e;
            return c == '<' ? m37189i() : c == '&' ? m37187g() : bM37181c;
        }

        /* renamed from: d */
        public int m37184d() {
            this.f33789d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f33789d < this.f33788c && i == 0) {
                byte bM37183b = m37183b();
                if (bM37183b != 0) {
                    if (bM37183b == 1 || bM37183b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bM37183b != 9) {
                        switch (bM37183b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f33789d > 0) {
                switch (m37182a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        public int m37185e() {
            this.f33789d = this.f33788c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f33789d > 0) {
                    byte bM37182a = m37182a();
                    if (bM37182a != 0) {
                        if (bM37182a == 1 || bM37182a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                                break;
                            }
                        } else if (bM37182a != 9) {
                            switch (bM37182a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: f */
        public final byte m37186f() {
            char cCharAt;
            int i = this.f33789d;
            do {
                int i2 = this.f33789d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33786a;
                int i3 = i2 - 1;
                this.f33789d = i3;
                cCharAt = charSequence.charAt(i3);
                this.f33790e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f33789d = i;
            this.f33790e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m37187g() {
            char cCharAt;
            do {
                int i = this.f33789d;
                if (i >= this.f33788c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f33786a;
                this.f33789d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f33790e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m37188h() {
            char cCharAt;
            int i = this.f33789d;
            while (true) {
                int i2 = this.f33789d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33786a;
                int i3 = i2 - 1;
                this.f33789d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f33790e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f33789d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f33786a;
                            int i5 = i4 - 1;
                            this.f33789d = i5;
                            cCharAt = charSequence2.charAt(i5);
                            this.f33790e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f33789d = i;
            this.f33790e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m37189i() {
            char cCharAt;
            int i = this.f33789d;
            while (true) {
                int i2 = this.f33789d;
                if (i2 >= this.f33788c) {
                    this.f33789d = i;
                    this.f33790e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f33786a;
                this.f33789d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f33790e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f33789d;
                        if (i3 < this.f33788c) {
                            CharSequence charSequence2 = this.f33786a;
                            this.f33789d = i3 + 1;
                            cCharAt = charSequence2.charAt(i3);
                            this.f33790e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        vgh vghVar = wgh.f51958c;
        f33774d = vghVar;
        f33775e = Character.toString((char) 8206);
        f33776f = Character.toString((char) 8207);
        f33777g = new lh1(false, 2, vghVar);
        f33778h = new lh1(true, 2, vghVar);
    }

    public lh1(boolean z, int i, vgh vghVar) {
        this.f33779a = z;
        this.f33780b = i;
        this.f33781c = vghVar;
    }

    /* renamed from: a */
    public static int m37167a(CharSequence charSequence) {
        return new C15074b(charSequence, false).m37184d();
    }

    /* renamed from: b */
    public static int m37168b(CharSequence charSequence) {
        return new C15074b(charSequence, false).m37185e();
    }

    /* renamed from: c */
    public static lh1 m37169c() {
        return new C15073a().m37179a();
    }

    /* renamed from: e */
    public static boolean m37170e(Locale locale) {
        return ejh.m25160a(locale) == 1;
    }

    /* renamed from: d */
    public boolean m37171d() {
        return (this.f33780b & 2) != 0;
    }

    /* renamed from: f */
    public final String m37172f(CharSequence charSequence, vgh vghVar) {
        boolean zMo52766a = vghVar.mo52766a(charSequence, 0, charSequence.length());
        return (this.f33779a || !(zMo52766a || m37168b(charSequence) == 1)) ? this.f33779a ? (!zMo52766a || m37168b(charSequence) == -1) ? f33776f : "" : "" : f33775e;
    }

    /* renamed from: g */
    public final String m37173g(CharSequence charSequence, vgh vghVar) {
        boolean zMo52766a = vghVar.mo52766a(charSequence, 0, charSequence.length());
        return (this.f33779a || !(zMo52766a || m37167a(charSequence) == 1)) ? this.f33779a ? (!zMo52766a || m37167a(charSequence) == -1) ? f33776f : "" : "" : f33775e;
    }

    /* renamed from: h */
    public CharSequence m37174h(CharSequence charSequence) {
        return m37175i(charSequence, this.f33781c, true);
    }

    /* renamed from: i */
    public CharSequence m37175i(CharSequence charSequence, vgh vghVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo52766a = vghVar.mo52766a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m37171d() && z) {
            spannableStringBuilder.append((CharSequence) m37173g(charSequence, zMo52766a ? wgh.f51957b : wgh.f51956a));
        }
        if (zMo52766a != this.f33779a) {
            spannableStringBuilder.append(zMo52766a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m37172f(charSequence, zMo52766a ? wgh.f51957b : wgh.f51956a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m37176j(String str) {
        return m37177k(str, this.f33781c, true);
    }

    /* renamed from: k */
    public String m37177k(String str, vgh vghVar, boolean z) {
        if (str == null) {
            return null;
        }
        return m37175i(str, vghVar, z).toString();
    }
}
