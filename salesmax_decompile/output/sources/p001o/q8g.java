package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class q8g {

    /* renamed from: a */
    public final String f41483a;

    /* renamed from: b */
    public final int f41484b;

    /* renamed from: c */
    public int f41485c;

    public q8g(String str) {
        sq8.m48649h(str, "source");
        this.f41483a = str;
        this.f41484b = str.length();
    }

    /* renamed from: d */
    public final void m45006d(int i, String str) {
        sq8.m48649h(str, "errCondition");
        int i2 = this.f41485c;
        if (i2 + i <= this.f41484b) {
            this.f41485c = i2 + i;
            return;
        }
        String str2 = "Unexpected end-of-doc while " + str;
        int iMax = Math.max(0, this.f41485c - 3);
        int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
        String strSubstring = this.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str2 + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
    }

    /* renamed from: e */
    public final boolean m45007e(String str) {
        sq8.m48649h(str, "text");
        if (!e9g.m24596J(this.f41483a, str, this.f41485c, false, 4, null)) {
            return false;
        }
        this.f41485c += str.length();
        return true;
    }

    /* renamed from: f */
    public final void m45008f() {
        char cCharAt;
        while (true) {
            int i = this.f41485c;
            if (i >= this.f41484b || (cCharAt = this.f41483a.charAt(i)) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                return;
            } else {
                this.f41485c++;
            }
        }
    }

    /* renamed from: g */
    public final void m45009g() {
        while (true) {
            int i = this.f41485c;
            if (i >= this.f41484b) {
                return;
            }
            char cCharAt = this.f41483a.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                return;
            } else {
                this.f41485c++;
            }
        }
    }

    /* renamed from: h */
    public final boolean m45010h(String str) {
        sq8.m48649h(str, "text");
        return sq8.m48644c(m45017o(Math.min(str.length(), this.f41484b - this.f41485c)), str);
    }

    /* renamed from: i */
    public final char m45011i(String str) {
        sq8.m48649h(str, "errCondition");
        int i = this.f41485c;
        if (i + 1 <= this.f41484b) {
            String str2 = this.f41483a;
            this.f41485c = i + 1;
            return str2.charAt(i);
        }
        String str3 = "Unexpected end-of-doc while " + str;
        int iMax = Math.max(0, this.f41485c - 3);
        int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
        String strSubstring = this.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str3 + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
    }

    /* renamed from: j */
    public final String m45012j(String str, String str2) {
        sq8.m48649h(str, "text");
        sq8.m48649h(str2, "errCondition");
        int iB0 = f9g.b0(this.f41483a, str, this.f41485c, false, 4, null);
        if (iB0 >= 0) {
            int length = iB0 + str.length();
            String strM45016n = m45016n(length);
            this.f41485c = length;
            return strM45016n;
        }
        String str3 = "Unexpected end-of-doc while " + str2;
        int iMax = Math.max(0, this.f41485c - 3);
        int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
        String strSubstring = this.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str3 + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
    }

    /* renamed from: k */
    public final String m45013k(String str, String str2) {
        sq8.m48649h(str, "text");
        sq8.m48649h(str2, "errCondition");
        int iB0 = f9g.b0(this.f41483a, str, this.f41485c, false, 4, null);
        if (iB0 >= 0) {
            String strM45016n = m45016n(iB0);
            this.f41485c = iB0;
            return strM45016n;
        }
        String str3 = "Unexpected end-of-doc while " + str2;
        int iMax = Math.max(0, this.f41485c - 3);
        int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
        String strSubstring = this.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str3 + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
    }

    /* renamed from: l */
    public final String m45014l() {
        char c;
        char cCharAt = this.f41483a.charAt(this.f41485c);
        int i = 214;
        int i2 = 90;
        if ((sq8.m48651j(97, cCharAt) > 0 || sq8.m48651j(cCharAt, 122) > 0) && ((sq8.m48651j(65, cCharAt) > 0 || sq8.m48651j(cCharAt, 90) > 0) && cCharAt != ':' && cCharAt != '_' && ((sq8.m48651j(Opcodes.CHECKCAST, cCharAt) > 0 || sq8.m48651j(cCharAt, 214) > 0) && ((sq8.m48651j(216, cCharAt) > 0 || sq8.m48651j(cCharAt, 246) > 0) && ((sq8.m48651j(248, cCharAt) > 0 || sq8.m48651j(cCharAt, 767) > 0) && ((sq8.m48651j(880, cCharAt) > 0 || sq8.m48651j(cCharAt, 893) > 0) && ((sq8.m48651j(895, cCharAt) > 0 || sq8.m48651j(cCharAt, 8191) > 0) && ((sq8.m48651j(8204, cCharAt) > 0 || sq8.m48651j(cCharAt, 8205) > 0) && ((sq8.m48651j(8304, cCharAt) > 0 || sq8.m48651j(cCharAt, 8591) > 0) && ((sq8.m48651j(11264, cCharAt) > 0 || sq8.m48651j(cCharAt, 12271) > 0) && (sq8.m48651j(12289, cCharAt) > 0 || sq8.m48651j(cCharAt, 55295) > 0))))))))))) {
            String str = "Found '" + cCharAt + "' but expected a valid XML start name character";
            int iMax = Math.max(0, this.f41485c - 3);
            int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
            String strSubstring = this.f41483a.substring(iMax, iMin + 1);
            sq8.m48648g(strSubstring, "substring(...)");
            throw new an5(str + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
        }
        int i3 = this.f41485c + 1;
        while (i3 < this.f41484b) {
            char cCharAt2 = this.f41483a.charAt(i3);
            if ((sq8.m48651j(97, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 122) > 0) && ((sq8.m48651j(65, cCharAt2) > 0 || sq8.m48651j(cCharAt2, i2) > 0) && !((sq8.m48651j(48, cCharAt2) <= 0 && sq8.m48651j(cCharAt2, 57) <= 0) || cCharAt2 == ':' || cCharAt2 == '-' || cCharAt2 == '.' || cCharAt2 == '_' || cCharAt2 == 183 || ((sq8.m48651j(Opcodes.CHECKCAST, cCharAt2) <= 0 && sq8.m48651j(cCharAt2, i) <= 0) || ((sq8.m48651j(216, cCharAt2) <= 0 && sq8.m48651j(cCharAt2, 246) <= 0) || ((sq8.m48651j(248, cCharAt2) <= 0 && sq8.m48651j(cCharAt2, 767) <= 0) || (sq8.m48651j(768, cCharAt2) <= 0 && sq8.m48651j(cCharAt2, 879) <= 0))))))) {
                if (sq8.m48651j(880, cCharAt2) <= 0) {
                    c = 893;
                    if (sq8.m48651j(cCharAt2, 893) <= 0) {
                        continue;
                    }
                } else {
                    c = 893;
                }
                if ((sq8.m48651j(895, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 8191) > 0) && ((sq8.m48651j(8204, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 8205) > 0) && ((sq8.m48651j(8255, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 8256) > 0) && ((sq8.m48651j(8304, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 8591) > 0) && ((sq8.m48651j(11264, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 12271) > 0) && (sq8.m48651j(12289, cCharAt2) > 0 || sq8.m48651j(cCharAt2, 55295) > 0)))))) {
                    break;
                }
            } else {
                c = 893;
            }
            i3++;
            i = 214;
            i2 = 90;
        }
        String strM45016n = m45016n(i3);
        this.f41485c = i3;
        return strM45016n;
    }

    /* renamed from: m */
    public final void m45015m(int i, String str) {
        sq8.m48649h(str, "errCondition");
        int i2 = this.f41485c;
        if ((-i) + i2 <= this.f41484b) {
            this.f41485c = i2 - i;
            return;
        }
        String str2 = "Unexpected end-of-doc while " + str;
        int iMax = Math.max(0, this.f41485c - 3);
        int iMin = Math.min(this.f41484b - 1, this.f41485c + 3);
        String strSubstring = this.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str2 + '\n' + ("At offset " + this.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", this.f41485c - iMax) + '^')));
    }

    /* renamed from: n */
    public final String m45016n(int i) {
        String strSubstring = this.f41483a.substring(this.f41485c, i);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: o */
    public final String m45017o(int i) {
        return m45016n(this.f41485c + i);
    }
}
