package j$.time.format;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.format.h */
/* loaded from: classes2.dex */
public final class C3438h implements InterfaceC3435e {

    /* renamed from: a */
    public final /* synthetic */ int f18157a;

    /* renamed from: b */
    public final Object f18158b;

    public /* synthetic */ C3438h(Object obj, int i10) {
        this.f18157a = i10;
        this.f18158b = obj;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        switch (this.f18157a) {
            case 0:
                Long lM7991a = c3453w.m7991a(ChronoField.OFFSET_SECONDS);
                if (lM7991a != null) {
                    sb2.append("GMT");
                    int intExact = Math.toIntExact(lM7991a.longValue());
                    if (intExact != 0) {
                        int iAbs = Math.abs((intExact / 3600) % 100);
                        int iAbs2 = Math.abs((intExact / 60) % 60);
                        int iAbs3 = Math.abs(intExact % 60);
                        sb2.append(intExact < 0 ? "-" : "+");
                        if (((TextStyle) this.f18158b) == TextStyle.FULL) {
                            m7967a(sb2, iAbs);
                            sb2.append(':');
                            m7967a(sb2, iAbs2);
                            if (iAbs3 != 0) {
                                sb2.append(':');
                                m7967a(sb2, iAbs3);
                                break;
                            }
                        } else {
                            if (iAbs >= 10) {
                                sb2.append((char) ((iAbs / 10) + 48));
                            }
                            sb2.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb2.append(':');
                                m7967a(sb2, iAbs2);
                                if (iAbs3 != 0) {
                                    sb2.append(':');
                                    m7967a(sb2, iAbs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb2.append((String) this.f18158b);
                break;
        }
        return true;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        int i11;
        int iM7968b;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f18157a) {
            case 0:
                int length = charSequence.length();
                if (c3451u.m7990g(charSequence, i10, "GMT", 0, 3)) {
                    int i16 = i10 + 3;
                    if (i16 == length) {
                        return c3451u.m7989f(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                    }
                    char cCharAt = charSequence.charAt(i16);
                    if (cCharAt == '+') {
                        i11 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return c3451u.m7989f(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                        }
                        i11 = -1;
                    }
                    int i17 = i10 + 4;
                    int i18 = 0;
                    if (((TextStyle) this.f18158b) == TextStyle.FULL) {
                        int i19 = i10 + 5;
                        int iM7968b2 = m7968b(charSequence, i17);
                        int i20 = i10 + 6;
                        int iM7968b3 = m7968b(charSequence, i19);
                        if (iM7968b2 >= 0 && iM7968b3 >= 0) {
                            int i21 = i10 + 7;
                            if (charSequence.charAt(i20) == ':') {
                                iM7968b = (iM7968b2 * 10) + iM7968b3;
                                int iM7968b4 = m7968b(charSequence, i21);
                                i15 = i10 + 9;
                                int iM7968b5 = m7968b(charSequence, i10 + 8);
                                if (iM7968b4 >= 0 && iM7968b5 >= 0) {
                                    i14 = (iM7968b4 * 10) + iM7968b5;
                                    int i22 = i10 + 11;
                                    if (i22 < length && charSequence.charAt(i15) == ':') {
                                        int iM7968b6 = m7968b(charSequence, i10 + 10);
                                        int iM7968b7 = m7968b(charSequence, i22);
                                        if (iM7968b6 >= 0 && iM7968b7 >= 0) {
                                            i18 = (iM7968b6 * 10) + iM7968b7;
                                            i15 = i10 + 12;
                                        }
                                    }
                                    i12 = i18;
                                    i13 = i15;
                                }
                            }
                        }
                    } else {
                        int i23 = i10 + 5;
                        iM7968b = m7968b(charSequence, i17);
                        if (iM7968b >= 0) {
                            if (i23 < length) {
                                int iM7968b8 = m7968b(charSequence, i23);
                                if (iM7968b8 >= 0) {
                                    iM7968b = (iM7968b * 10) + iM7968b8;
                                    i23 = i10 + 6;
                                }
                                int i24 = i23 + 2;
                                if (i24 < length && charSequence.charAt(i23) == ':' && i24 < length && charSequence.charAt(i23) == ':') {
                                    int iM7968b9 = m7968b(charSequence, i23 + 1);
                                    int iM7968b10 = m7968b(charSequence, i24);
                                    if (iM7968b9 >= 0 && iM7968b10 >= 0) {
                                        i14 = (iM7968b9 * 10) + iM7968b10;
                                        int i25 = i23 + 3;
                                        int i26 = i23 + 5;
                                        if (i26 < length && charSequence.charAt(i25) == ':') {
                                            int iM7968b11 = m7968b(charSequence, i23 + 4);
                                            int iM7968b12 = m7968b(charSequence, i26);
                                            if (iM7968b11 >= 0 && iM7968b12 >= 0) {
                                                i18 = (iM7968b11 * 10) + iM7968b12;
                                                i15 = i23 + 6;
                                                i12 = i18;
                                                i13 = i15;
                                            }
                                        }
                                        i13 = i25;
                                        i12 = 0;
                                    }
                                }
                            }
                            i12 = 0;
                            i13 = i23;
                            return c3451u.m7989f(ChronoField.OFFSET_SECONDS, ((i18 * 60) + (iM7968b * 3600) + i12) * i11, i10, i13);
                        }
                    }
                    i18 = i14;
                    return c3451u.m7989f(ChronoField.OFFSET_SECONDS, ((i18 * 60) + (iM7968b * 3600) + i12) * i11, i10, i13);
                }
                return ~i10;
            default:
                String str = (String) this.f18158b;
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !c3451u.m7990g(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        switch (this.f18157a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f18158b) + ")";
            default:
                return "'" + ((String) this.f18158b).replace("'", "''") + "'";
        }
    }

    /* renamed from: a */
    public static void m7967a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    /* renamed from: b */
    public static int m7968b(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
