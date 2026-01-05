package p001o;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class py7 {
    /* renamed from: a */
    public static int m44285a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (m44290f(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m44286b(String str, ngg nggVar, ft5 ft5Var, ft5 ft5Var2) {
        int iM33345e = 0;
        f76[] f76VarArr = {new m1(), new cr1(), new bhh(), new jdj(), new f36(), new za1()};
        j76 j76Var = new j76(str);
        j76Var.m33354n(nggVar);
        j76Var.m33352l(ft5Var, ft5Var2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            j76Var.m33358r((char) 236);
            j76Var.m33353m(2);
            j76Var.f29915d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            j76Var.m33358r((char) 237);
            j76Var.m33353m(2);
            j76Var.f29915d += 7;
        }
        while (j76Var.m33349i()) {
            f76VarArr[iM33345e].mo21605a(j76Var);
            if (j76Var.m33345e() >= 0) {
                iM33345e = j76Var.m33345e();
                j76Var.m33350j();
            }
        }
        int iM33341a = j76Var.m33341a();
        j76Var.m33356p();
        int iM39007a = j76Var.m33347g().m39007a();
        if (iM33341a < iM39007a && iM33345e != 0 && iM33345e != 5 && iM33345e != 4) {
            j76Var.m33358r((char) 254);
        }
        StringBuilder sbM33342b = j76Var.m33342b();
        if (sbM33342b.length() < iM39007a) {
            sbM33342b.append((char) 129);
        }
        while (sbM33342b.length() < iM39007a) {
            sbM33342b.append(m44299o((char) 129, sbM33342b.length() + 1));
        }
        return j76Var.m33342b().toString();
    }

    /* renamed from: c */
    public static int m44287c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m44288d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: e */
    public static void m44289e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f */
    public static boolean m44290f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    public static boolean m44291g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    public static boolean m44292h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m44293i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    public static boolean m44294j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m44295k(char c) {
        if (m44297m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m44296l(char c) {
        return false;
    }

    /* renamed from: m */
    public static boolean m44297m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* renamed from: n */
    public static int m44298n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        int i3 = 6;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int iM44287c = m44287c(fArr, iArr, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int iM44288d = m44288d(bArr);
                if (iArr[0] == iM44287c) {
                    return 0;
                }
                if (iM44288d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iM44288d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iM44288d != 1 || bArr[2] <= 0) {
                    return (iM44288d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (m44290f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m44291g(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (m44292h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m44291g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m44294j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m44291g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m44295k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m44291g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m44293i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m44291g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m44296l(cCharAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                m44287c(fArr, iArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int iM44288d2 = m44288d(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[c];
                if (i6 < i7 && i6 < iArr2[1] && i6 < iArr2[2] && i6 < iArr2[3] && i6 < iArr2[4]) {
                    return 0;
                }
                if (i7 < i6) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (iM44288d2 == 1 && b4 > 0) {
                    return 4;
                }
                if (iM44288d2 == 1 && b2 > 0) {
                    return 2;
                }
                if (iM44288d2 == 1 && b3 > 0) {
                    return 3;
                }
                int i8 = iArr2[1];
                if (i8 + 1 < i6 && i8 + 1 < i7 && i8 + 1 < iArr2[4] && i8 + 1 < iArr2[2]) {
                    int i9 = iArr2[3];
                    if (i8 < i9) {
                        return 1;
                    }
                    if (i8 == i9) {
                        for (int i10 = i + i4 + 1; i10 < charSequence.length(); i10++) {
                            char cCharAt2 = charSequence.charAt(i10);
                            if (m44297m(cCharAt2)) {
                                return 3;
                            }
                            if (!m44295k(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i3 = 6;
        }
    }

    /* renamed from: o */
    public static char m44299o(char c, int i) {
        int i2 = c + ((i * Opcodes.FCMPL) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
