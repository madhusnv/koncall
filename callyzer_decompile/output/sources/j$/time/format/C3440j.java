package j$.time.format;

import j$.time.C3401c;
import j$.time.temporal.ChronoField;
import java.util.Objects;
import org.bouncycastle.iana.AEADAlgorithm;

/* renamed from: j$.time.format.j */
/* loaded from: classes2.dex */
public final class C3440j implements InterfaceC3435e {

    /* renamed from: d */
    public static final String[] f18165d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e */
    public static final C3440j f18166e = new C3440j("+HH:MM:ss", "Z");

    /* renamed from: f */
    public static final C3440j f18167f = new C3440j("+HH:MM:ss", "0");

    /* renamed from: a */
    public final String f18168a;

    /* renamed from: b */
    public final int f18169b;

    /* renamed from: c */
    public final int f18170c;

    public C3440j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i10 = 0;
        while (true) {
            String[] strArr = f18165d;
            if (i10 < strArr.length) {
                if (strArr[i10].equals(str)) {
                    this.f18169b = i10;
                    this.f18170c = i10 % 11;
                    this.f18168a = str2;
                    return;
                }
                i10++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        Long lM7991a = c3453w.m7991a(ChronoField.OFFSET_SECONDS);
        boolean z6 = false;
        if (lM7991a == null) {
            return false;
        }
        int intExact = Math.toIntExact(lM7991a.longValue());
        String str = this.f18168a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : "+");
        if (this.f18169b < 11 || iAbs >= 10) {
            m7971a(false, iAbs, sb2);
        } else {
            sb2.append((char) (iAbs + 48));
        }
        int i10 = this.f18170c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
            m7971a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z6 = true;
                }
                m7971a(z6, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    /* renamed from: a */
    public static void m7971a(boolean z6, int i10, StringBuilder sb2) {
        sb2.append(z6 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        CharSequence charSequence2;
        int i11;
        int i12;
        int i13;
        int i14;
        int length = charSequence.length();
        int length2 = this.f18168a.length();
        if (length2 == 0) {
            if (i10 == length) {
                return c3451u.m7989f(ChronoField.OFFSET_SECONDS, 0L, i10, i10);
            }
            charSequence2 = charSequence;
        } else {
            if (i10 == length) {
                return ~i10;
            }
            charSequence2 = charSequence;
            if (c3451u.m7990g(charSequence2, i10, this.f18168a, 0, length2)) {
                return c3451u.m7989f(ChronoField.OFFSET_SECONDS, 0L, i10, i10 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            int i15 = cCharAt == '-' ? -1 : 1;
            int i16 = this.f18170c;
            boolean z6 = i16 > 0 && i16 % 2 == 0;
            int i17 = this.f18169b;
            boolean z10 = i17 < 11;
            int[] iArr = new int[4];
            iArr[0] = i10 + 1;
            if (!c3451u.f18204c) {
                if (z10) {
                    if (z6 || (i17 == 0 && length > (i14 = i10 + 3) && charSequence2.charAt(i14) == ':')) {
                        i17 = 10;
                        z6 = true;
                    } else {
                        i17 = 9;
                    }
                } else if (z6 || (i17 == 11 && length > (i13 = i10 + 3) && (charSequence2.charAt(i10 + 2) == ':' || charSequence2.charAt(i13) == ':'))) {
                    i17 = 21;
                    z6 = true;
                } else {
                    i17 = 20;
                }
            }
            switch (i17) {
                case 0:
                case 11:
                    m7973c(charSequence2, z10, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    m7973c(charSequence2, z10, iArr);
                    m7974d(charSequence2, z6, false, iArr);
                    break;
                case 3:
                case 4:
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    m7973c(charSequence2, z10, iArr);
                    m7974d(charSequence2, z6, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    m7973c(charSequence2, z10, iArr);
                    m7974d(charSequence2, z6, true, iArr);
                    m7972b(charSequence2, z6, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    m7973c(charSequence2, z10, iArr);
                    m7974d(charSequence2, z6, true, iArr);
                    if (!m7972b(charSequence2, z6, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    m7973c(charSequence2, z10, iArr);
                    if (m7972b(charSequence2, z6, 2, iArr)) {
                        m7972b(charSequence2, z6, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    m7975e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    m7975e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    m7975e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    m7975e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    m7975e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i18 = iArr[0];
            if (i18 > 0) {
                int i19 = iArr[1];
                if (i19 > 23 || (i11 = iArr[2]) > 59 || (i12 = iArr[3]) > 59) {
                    throw new C3401c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c3451u.m7989f(ChronoField.OFFSET_SECONDS, ((i11 * 60) + (i19 * 3600) + i12) * i15, i10, i18);
            }
        }
        return length2 == 0 ? c3451u.m7989f(ChronoField.OFFSET_SECONDS, 0L, i10, i10) : ~i10;
    }

    /* renamed from: c */
    public static void m7973c(CharSequence charSequence, boolean z6, int[] iArr) {
        if (z6) {
            if (m7972b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        m7975e(charSequence, 1, 2, iArr);
    }

    /* renamed from: d */
    public static void m7974d(CharSequence charSequence, boolean z6, boolean z10, int[] iArr) {
        if (m7972b(charSequence, z6, 2, iArr) || !z10) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m7972b(java.lang.CharSequence r5, boolean r6, int r7, int[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            r2 = 1
            if (r1 >= 0) goto L7
            return r2
        L7:
            if (r6 == 0) goto L1d
            if (r7 == r2) goto L1d
            int r6 = r1 + 1
            int r3 = r5.length()
            if (r6 > r3) goto L4e
            char r1 = r5.charAt(r1)
            r3 = 58
            if (r1 == r3) goto L1c
            goto L4e
        L1c:
            r1 = r6
        L1d:
            int r6 = r1 + 2
            int r3 = r5.length()
            if (r6 <= r3) goto L26
            goto L4e
        L26:
            int r3 = r1 + 1
            char r1 = r5.charAt(r1)
            char r5 = r5.charAt(r3)
            r3 = 48
            if (r1 < r3) goto L4e
            r4 = 57
            if (r1 > r4) goto L4e
            if (r5 < r3) goto L4e
            if (r5 <= r4) goto L3d
            goto L4e
        L3d:
            int r1 = r1 - r3
            int r1 = r1 * 10
            int r5 = r5 - r3
            int r5 = r5 + r1
            if (r5 < 0) goto L4e
            r1 = 59
            if (r5 <= r1) goto L49
            goto L4e
        L49:
            r8[r7] = r5
            r8[r0] = r6
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C3440j.m7972b(java.lang.CharSequence, boolean, int, int[]):boolean");
    }

    /* renamed from: e */
    public static void m7975e(CharSequence charSequence, int i10, int i11, int[] iArr) {
        int i12;
        char cCharAt;
        int i13 = iArr[0];
        char[] cArr = new char[i11];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i13)) >= '0' && cCharAt <= '9') {
            cArr[i14] = cCharAt;
            i15++;
            i14++;
            i13 = i12;
        }
        if (i15 < i10) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i15) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i13;
    }

    public final String toString() {
        String strReplace = this.f18168a.replace("'", "''");
        return "Offset(" + f18165d[this.f18169b] + ",'" + strReplace + "')";
    }
}
