package fm;

import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fm.d */
/* loaded from: classes.dex */
public final class C2325d {

    /* renamed from: a */
    public String f10548a;

    /* renamed from: b */
    public int f10549b;

    /* renamed from: c */
    public int f10550c;

    /* renamed from: d */
    public int f10551d;

    /* renamed from: e */
    public String f10552e;

    /* renamed from: f */
    public boolean f10553f;

    /* renamed from: a */
    public static boolean m6014a(char c2) {
        if (c2 == '\"' || c2 == ',' || c2 == '/' || c2 == '(' || c2 == ')') {
            return false;
        }
        switch (c2) {
            case ':':
            case ';':
            case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
            case '=':
            case '>':
            case '?':
            case '@':
                return false;
            default:
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        return false;
                    default:
                        return (Character.isISOControl(c2) || Character.isWhitespace(c2)) ? false : true;
                }
        }
    }

    /* renamed from: b */
    public static String m6015b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 5 ? i10 != 47 ? i10 != 59 ? i10 != 61 ? "really unknown" : "'='" : "';'" : "'/'" : "EOI" : "string" : "start" : "unknown";
    }

    /* renamed from: c */
    public final int m6016c() {
        int i10;
        String str = this.f10548a;
        int i11 = this.f10549b;
        int i12 = this.f10550c;
        if (i11 < i12) {
            while (true) {
                int i13 = this.f10549b;
                if (i13 >= i12 || !Character.isWhitespace(str.charAt(i13))) {
                    break;
                }
                this.f10549b++;
            }
            int i14 = this.f10549b;
            if (i14 < i12) {
                char cCharAt = str.charAt(i14);
                int i15 = 0;
                if (this.f10553f) {
                    if (cCharAt == ';' || cCharAt == '=') {
                        this.f10551d = cCharAt;
                        this.f10552e = Character.valueOf(cCharAt).toString();
                        this.f10549b++;
                    } else {
                        int i16 = this.f10549b;
                        boolean z6 = false;
                        while (true) {
                            i10 = this.f10549b;
                            if (i10 >= i12 || z6) {
                                break;
                            }
                            if (str.charAt(i10) != ';') {
                                this.f10549b++;
                            } else {
                                z6 = true;
                            }
                        }
                        this.f10551d = 2;
                        String strSubstring = str.substring(i16, i10);
                        int length = strSubstring.length();
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.ensureCapacity(length);
                        while (i15 < length) {
                            char cCharAt2 = strSubstring.charAt(i15);
                            if (cCharAt2 != '\\') {
                                stringBuffer.append(cCharAt2);
                            } else if (i15 < length - 1) {
                                i15++;
                                stringBuffer.append(strSubstring.charAt(i15));
                            } else {
                                stringBuffer.append(cCharAt2);
                            }
                            i15++;
                        }
                        this.f10552e = stringBuffer.toString();
                    }
                } else if (m6014a(cCharAt)) {
                    int i17 = this.f10549b;
                    while (true) {
                        int i18 = this.f10549b;
                        if (i18 >= i12 || !m6014a(str.charAt(i18))) {
                            break;
                        }
                        this.f10549b++;
                    }
                    this.f10551d = 2;
                    this.f10552e = str.substring(i17, this.f10549b);
                } else if (cCharAt == '/' || cCharAt == ';' || cCharAt == '=') {
                    this.f10551d = cCharAt;
                    this.f10552e = Character.valueOf(cCharAt).toString();
                    this.f10549b++;
                } else {
                    this.f10551d = 0;
                    this.f10552e = Character.valueOf(cCharAt).toString();
                    this.f10549b++;
                }
            } else {
                this.f10551d = 5;
                this.f10552e = null;
            }
        } else {
            this.f10551d = 5;
            this.f10552e = null;
        }
        return this.f10551d;
    }
}
