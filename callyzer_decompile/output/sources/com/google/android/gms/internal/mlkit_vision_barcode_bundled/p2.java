package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a */
    public static final z0 f6631a;

    static {
        if (n2.f6618e && n2.f6617d) {
            int i10 = l0.f6593a;
        }
        f6631a = new z0(7);
    }

    /* renamed from: a */
    public static int m3937a(int i10, int i11, byte[] bArr) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return m3940d(b10, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i10];
        byte b12 = bArr[i10 + 1];
        if (b10 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b10);
    }

    /* renamed from: b */
    public static int m3938b(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new o2(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i17 = i15 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i18 = i16 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i15 = i17;
                        } else {
                            i15 = i17;
                        }
                    }
                    throw new o2(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    /* renamed from: c */
    public static int m3939c(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new o2(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    /* renamed from: d */
    public static int m3940d(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }
}
