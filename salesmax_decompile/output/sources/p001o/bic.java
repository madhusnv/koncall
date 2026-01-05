package p001o;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class bic {

    /* renamed from: c */
    public static final byte[] f16395c;

    /* renamed from: a */
    public static final byte[] f16393a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f16394b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    public static final byte[] f16396d = new byte[128];

    /* renamed from: e */
    public static final Charset f16397e = StandardCharsets.ISO_8859_1;

    /* renamed from: o.bic$a */
    public static /* synthetic */ class C12436a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16398a;

        static {
            int[] iArr = new int[ck3.values().length];
            f16398a = iArr;
            try {
                iArr[ck3.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16398a[ck3.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16398a[ck3.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f16395c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f16393a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f16395c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f16396d, (byte) -1);
        while (true) {
            byte[] bArr3 = f16394b;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f16396d[b2] = (byte) i;
            }
            i++;
        }
    }

    /* renamed from: a */
    public static int m19191a(String str, int i, Charset charset) throws fdj {
        int i2;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i3 = i;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && m19201k(cCharAt) && (i2 = i3 + (i4 = i4 + 1)) < length) {
                cCharAt = str.charAt(i2);
            }
            if (i4 >= 13) {
                return i3 - i;
            }
            char cCharAt2 = str.charAt(i3);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new fdj("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i3++;
        }
        return i3 - i;
    }

    /* renamed from: b */
    public static int m19192b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (m19201k(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m19193c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m19201k(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m19204n(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: d */
    public static void m19194d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: e */
    public static String m19195e(String str, ck3 ck3Var, Charset charset) throws fdj {
        nh2 characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f16397e;
        } else if (!f16397e.equals(charset) && (characterSetECIByName = nh2.getCharacterSetECIByName(charset.name())) != null) {
            m19198h(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i = C12436a.f16398a[ck3Var.ordinal()];
        if (i == 1) {
            m19197g(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m19194d(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int iM19197g = 0;
            int i3 = 0;
            while (i2 < length) {
                int iM19192b = m19192b(str, i2);
                if (iM19192b >= 13) {
                    sb.append((char) 902);
                    m19196f(str, i2, iM19192b, sb);
                    i2 += iM19192b;
                    iM19197g = 0;
                    i3 = 2;
                } else {
                    int iM19193c = m19193c(str, i2);
                    if (iM19193c >= 5 || iM19192b == length) {
                        if (i3 != 0) {
                            sb.append((char) 900);
                            iM19197g = 0;
                            i3 = 0;
                        }
                        iM19197g = m19197g(str, i2, iM19193c, sb, iM19197g);
                        i2 += iM19193c;
                    } else {
                        int iM19191a = m19191a(str, i2, charset);
                        if (iM19191a == 0) {
                            iM19191a = 1;
                        }
                        int i4 = iM19191a + i2;
                        byte[] bytes2 = str.substring(i2, i4).getBytes(charset);
                        if (bytes2.length == 1 && i3 == 0) {
                            m19194d(bytes2, 0, 1, 0, sb);
                        } else {
                            m19194d(bytes2, 0, bytes2.length, i3, sb);
                            i3 = 1;
                            iM19197g = 0;
                        }
                        i2 = i4;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            m19196f(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static void m19196f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 BREAK  A[LOOP:0: B:3:0x000f->B:93:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m19197g(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt = charSequence.charAt(i6);
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (m19203m(cCharAt)) {
                            sb2.append((char) f16396d[cCharAt]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (m19202l(cCharAt)) {
                        sb2.append((char) f16395c[cCharAt]);
                    } else if (m19200j(cCharAt)) {
                        sb2.append((char) 28);
                        i4 = 0;
                    } else if (m19199i(cCharAt)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else {
                        int i7 = i6 + 1;
                        if (i7 >= i2 || !m19203m(charSequence.charAt(i7))) {
                            sb2.append((char) 29);
                            sb2.append((char) f16396d[cCharAt]);
                        } else {
                            sb2.append((char) 25);
                            i4 = 3;
                        }
                    }
                } else if (m19199i(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'a'));
                    }
                } else if (m19200j(cCharAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt - 'A'));
                } else if (m19202l(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f16396d[cCharAt]);
                }
                i5++;
                if (i5 < i2) {
                    break;
                }
            } else {
                if (m19200j(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'A'));
                    }
                } else if (m19199i(cCharAt)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (m19202l(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f16396d[cCharAt]);
                }
                i5++;
                if (i5 < i2) {
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb2.charAt(i8));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i4;
    }

    /* renamed from: h */
    public static void m19198h(int i, StringBuilder sb) throws fdj {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else {
            if (i >= 811800) {
                throw new fdj("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        }
    }

    /* renamed from: i */
    public static boolean m19199i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m19200j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m19201k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    public static boolean m19202l(char c) {
        return f16395c[c] != -1;
    }

    /* renamed from: m */
    public static boolean m19203m(char c) {
        return f16396d[c] != -1;
    }

    /* renamed from: n */
    public static boolean m19204n(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
