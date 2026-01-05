package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public abstract class g5c {

    /* renamed from: a */
    public static int f24593a = 1000000;

    /* renamed from: b */
    public static int f24594b = 1000000000;

    /* renamed from: c */
    public static long f24595c = 1000000000;

    /* renamed from: d */
    public static long f24596d = -2147483648L;

    /* renamed from: e */
    public static long f24597e = 2147483647L;

    /* renamed from: f */
    public static final String f24598f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g */
    public static final String f24599g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h */
    public static final int[] f24600h = new int[1000];

    /* renamed from: i */
    public static final String[] f24601i;

    /* renamed from: j */
    public static final String[] f24602j;

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    f24600h[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
        f24601i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        f24602j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    /* renamed from: a */
    public static int m28049a(int i, byte[] bArr, int i2) {
        int i3 = f24600h[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    /* renamed from: b */
    public static int m28050b(int i, char[] cArr, int i2) {
        int i3 = f24600h[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & Opcodes.LAND);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & Opcodes.LAND);
        return i6;
    }

    /* renamed from: c */
    public static int m28051c(int i, byte[] bArr, int i2) {
        int i3 = f24600h[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    /* renamed from: d */
    public static int m28052d(int i, char[] cArr, int i2) {
        int i3 = f24600h[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & Opcodes.LAND);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & Opcodes.LAND);
        return i4;
    }

    /* renamed from: e */
    public static int m28053e(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = f24600h;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    /* renamed from: f */
    public static int m28054f(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = f24600h;
        int i6 = iArr[i5];
        int i7 = i2 + 1;
        cArr[i2] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & Opcodes.LAND);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & Opcodes.LAND);
        int i10 = iArr[i3 - (i5 * 1000)];
        int i11 = i9 + 1;
        cArr[i9] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & Opcodes.LAND);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & Opcodes.LAND);
        int i14 = iArr[i4];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & Opcodes.LAND);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & Opcodes.LAND);
        return i17;
    }

    /* renamed from: g */
    public static int m28055g(byte[] bArr, int i) {
        int length = f24598f.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f24598f.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: h */
    public static int m28056h(char[] cArr, int i) {
        String str = f24598f;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: i */
    public static int m28057i(byte[] bArr, int i) {
        int length = f24599g.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f24599g.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static int m28058j(char[] cArr, int i) {
        String str = f24599g;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: k */
    public static int m28059k(int i, byte[] bArr, int i2) {
        if (i < f24593a) {
            if (i < 1000) {
                return m28051c(i, bArr, i2);
            }
            int i3 = i / 1000;
            return m28061m(bArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i - (i4 * 1000);
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int iM28051c = m28051c(i6, bArr, i2);
        int[] iArr = f24600h;
        int i8 = iArr[i7];
        int i9 = iM28051c + 1;
        bArr[iM28051c] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        int i12 = iArr[i5];
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i12;
        return i15;
    }

    /* renamed from: l */
    public static int m28060l(int i, char[] cArr, int i2) {
        if (i < f24593a) {
            if (i < 1000) {
                return m28052d(i, cArr, i2);
            }
            int i3 = i / 1000;
            return m28062n(cArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i - (i4 * 1000);
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int iM28052d = m28052d(i6, cArr, i2);
        int[] iArr = f24600h;
        int i8 = iArr[i7];
        int i9 = iM28052d + 1;
        cArr[iM28052d] = (char) (i8 >> 16);
        int i10 = i9 + 1;
        cArr[i9] = (char) ((i8 >> 8) & Opcodes.LAND);
        int i11 = i10 + 1;
        cArr[i10] = (char) (i8 & Opcodes.LAND);
        int i12 = iArr[i5];
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 >> 16);
        int i14 = i13 + 1;
        cArr[i13] = (char) ((i12 >> 8) & Opcodes.LAND);
        int i15 = i14 + 1;
        cArr[i14] = (char) (i12 & Opcodes.LAND);
        return i15;
    }

    /* renamed from: m */
    public static int m28061m(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = f24600h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i] = (byte) (i4 >> 16);
                i++;
            }
            bArr[i] = (byte) (i4 >> 8);
            i++;
        }
        int i5 = i + 1;
        bArr[i] = (byte) i4;
        int i6 = iArr[i3];
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 >> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i6 >> 8);
        int i9 = i8 + 1;
        bArr[i8] = (byte) i6;
        return i9;
    }

    /* renamed from: n */
    public static int m28062n(char[] cArr, int i, int i2, int i3) {
        int[] iArr = f24600h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i] = (char) (i4 >> 16);
                i++;
            }
            cArr[i] = (char) ((i4 >> 8) & Opcodes.LAND);
            i++;
        }
        int i5 = i + 1;
        cArr[i] = (char) (i4 & Opcodes.LAND);
        int i6 = iArr[i3];
        int i7 = i5 + 1;
        cArr[i5] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & Opcodes.LAND);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & Opcodes.LAND);
        return i9;
    }

    /* renamed from: o */
    public static boolean m28063o(double d) {
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    /* renamed from: p */
    public static boolean m28064p(float f) {
        return Float.isNaN(f) || Float.isInfinite(f);
    }

    /* renamed from: q */
    public static int m28065q(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m28055g(bArr, i2);
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < f24593a) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return m28049a(i - (i4 * 1000), bArr, m28051c(i4, bArr, i2));
            }
            if (i >= 10) {
                return m28051c(i, bArr, i2);
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i5;
        }
        int i6 = f24594b;
        if (i < i6) {
            int i7 = i / 1000;
            int i8 = i7 / 1000;
            return m28049a(i - (i7 * 1000), bArr, m28049a(i7 - (i8 * 1000), bArr, m28051c(i8, bArr, i2)));
        }
        int i9 = i - i6;
        if (i9 >= i6) {
            i9 -= i6;
            i3 = i2 + 1;
            bArr[i2] = 50;
        } else {
            i3 = i2 + 1;
            bArr[i2] = 49;
        }
        return m28053e(i9, bArr, i3);
    }

    /* renamed from: r */
    public static int m28066r(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m28056h(cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < f24593a) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return m28050b(i - (i4 * 1000), cArr, m28052d(i4, cArr, i2));
            }
            if (i >= 10) {
                return m28052d(i, cArr, i2);
            }
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
        int i5 = f24594b;
        if (i < i5) {
            int i6 = i / 1000;
            int i7 = i6 / 1000;
            return m28050b(i - (i6 * 1000), cArr, m28050b(i6 - (i7 * 1000), cArr, m28052d(i7, cArr, i2)));
        }
        int i8 = i - i5;
        if (i8 >= i5) {
            i8 -= i5;
            i3 = i2 + 1;
            cArr[i2] = '2';
        } else {
            i3 = i2 + 1;
            cArr[i2] = '1';
        }
        return m28054f(i8, cArr, i3);
    }

    /* renamed from: s */
    public static int m28067s(long j, byte[] bArr, int i) {
        int iM28053e;
        if (j < 0) {
            if (j > f24596d) {
                return m28065q((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m28057i(bArr, i);
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= f24597e) {
            return m28065q((int) j, bArr, i);
        }
        long j2 = f24595c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            iM28053e = m28059k((int) j3, bArr, i);
        } else {
            long j5 = j3 / j2;
            int iM28051c = m28051c((int) j5, bArr, i);
            iM28053e = m28053e((int) (j3 - (j2 * j5)), bArr, iM28051c);
        }
        return m28053e((int) j4, bArr, iM28053e);
    }

    /* renamed from: t */
    public static int m28068t(long j, char[] cArr, int i) {
        int iM28054f;
        if (j < 0) {
            if (j > f24596d) {
                return m28066r((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m28058j(cArr, i);
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= f24597e) {
            return m28066r((int) j, cArr, i);
        }
        long j2 = f24595c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            iM28054f = m28060l((int) j3, cArr, i);
        } else {
            long j5 = j3 / j2;
            int iM28052d = m28052d((int) j5, cArr, i);
            iM28054f = m28054f((int) (j3 - (j2 * j5)), cArr, iM28052d);
        }
        return m28054f((int) j4, cArr, iM28054f);
    }
}
