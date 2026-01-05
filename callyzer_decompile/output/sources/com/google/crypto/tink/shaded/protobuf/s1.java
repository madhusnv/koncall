package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 extends t0 {

    /* renamed from: a */
    public final /* synthetic */ int f7102a;

    public /* synthetic */ s1(int i10) {
        this.f7102a = i10;
    }

    /* renamed from: z */
    public static int m4393z(long j6, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            t0 t0Var = u1.f7121a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return u1.m4454c(i10, r1.m4383f(j6, bArr));
        }
        if (i11 == 2) {
            return u1.m4455d(i10, r1.m4383f(j6, bArr), r1.m4383f(j6 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    @Override // com.google.crypto.tink.shaded.protobuf.t0
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo4394n(int r11, int r12, byte[] r13) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s1.mo4394n(int, int, byte[]):java.lang.String");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    /* renamed from: s */
    public final int mo4395s(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j6;
        char c2;
        long j10;
        long j11;
        char c10;
        int i14;
        char cCharAt2;
        switch (this.f7102a) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new t1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new t1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i10;
                long j13 = i11 + j12;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j6 = 1;
                    c2 = 128;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        r1.m4387j(bArr, j12, (byte) cCharAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 == length2) {
                    return (int) j12;
                }
                while (i22 < length2) {
                    char cCharAt5 = str.charAt(i22);
                    if (cCharAt5 < c2 && j12 < j13) {
                        r1.m4387j(bArr, j12, (byte) cCharAt5);
                        c10 = c2;
                        j10 = j6;
                        j11 = j12 + j6;
                    } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                        j10 = j6;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                            long j14 = j12;
                            if (j14 > j13 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                    throw new t1(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j14);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = str.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    r1.m4387j(bArr, j14, (byte) ((codePoint2 >>> 18) | 240));
                                    c10 = 128;
                                    r1.m4387j(bArr, j14 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    r1.m4387j(bArr, j14 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    r1.m4387j(bArr, j14 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j11 = j14 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new t1(i22 - 1, length2);
                        }
                        r1.m4387j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j15 = j12;
                        r1.m4387j(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j11 = j15 + 3;
                        r1.m4387j(bArr, j15 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c10 = 128;
                    } else {
                        j10 = j6;
                        r1.m4387j(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                        r1.m4387j(bArr, j12 + j10, (byte) ((cCharAt5 & '?') | c2));
                        j11 = j12 + 2;
                        c10 = c2;
                    }
                    i22++;
                    c2 = c10;
                    j12 = j11;
                    j6 = j10;
                }
                return (int) j12;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    /* renamed from: w */
    public final int mo4396w(int i10, int i11, byte[] bArr) {
        int i12;
        long j6;
        int i13 = i10;
        switch (this.f7102a) {
            case 0:
                break;
            default:
                if ((i13 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i11)));
                }
                long j10 = i13;
                int i14 = (int) (i11 - j10);
                long j11 = 1;
                if (i14 < 16) {
                    i12 = 0;
                } else {
                    long j12 = j10;
                    i12 = 0;
                    while (true) {
                        if (i12 < i14) {
                            long j13 = j12 + 1;
                            if (r1.m4383f(j12, bArr) >= 0) {
                                i12++;
                                j12 = j13;
                            }
                        } else {
                            i12 = i14;
                        }
                    }
                }
                int i15 = i14 - i12;
                long j14 = j10 + i12;
                while (true) {
                    byte bM4383f = 0;
                    while (true) {
                        if (i15 > 0) {
                            long j15 = j14 + j11;
                            bM4383f = r1.m4383f(j14, bArr);
                            if (bM4383f >= 0) {
                                i15--;
                                j14 = j15;
                            } else {
                                j14 = j15;
                            }
                        }
                    }
                    if (i15 == 0) {
                        return 0;
                    }
                    int i16 = i15 - 1;
                    if (bM4383f < -32) {
                        if (i16 == 0) {
                            return bM4383f;
                        }
                        i15 -= 2;
                        if (bM4383f >= -62) {
                            long j16 = j14 + j11;
                            if (r1.m4383f(j14, bArr) <= -65) {
                                j6 = j11;
                                j14 = j16;
                                j11 = j6;
                            }
                        }
                    } else if (bM4383f >= -16) {
                        j6 = j11;
                        if (i16 < 3) {
                            return m4393z(j14, bArr, bM4383f, i16);
                        }
                        i15 -= 4;
                        long j17 = j14 + j6;
                        byte bM4383f2 = r1.m4383f(j14, bArr);
                        if (bM4383f2 <= -65) {
                            if ((((bM4383f2 + 112) + (bM4383f << 28)) >> 30) == 0) {
                                long j18 = 2 + j14;
                                if (r1.m4383f(j17, bArr) <= -65) {
                                    j14 += 3;
                                    if (r1.m4383f(j18, bArr) <= -65) {
                                        j11 = j6;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i16 < 2) {
                            return m4393z(j14, bArr, bM4383f, i16);
                        }
                        i15 -= 3;
                        j6 = j11;
                        long j19 = j14 + j6;
                        byte bM4383f3 = r1.m4383f(j14, bArr);
                        if (bM4383f3 <= -65 && ((bM4383f != -32 || bM4383f3 >= -96) && (bM4383f != -19 || bM4383f3 < -96))) {
                            j14 += 2;
                            if (r1.m4383f(j19, bArr) <= -65) {
                                j11 = j6;
                            }
                        }
                    }
                }
                return -1;
        }
        while (i13 < i11 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i11) {
            while (i13 < i11) {
                int i17 = i13 + 1;
                byte b10 = bArr[i13];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i17 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i13 += 2;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i17 >= i11 - 1) {
                            return u1.m4452a(i17, i11, bArr);
                        }
                        int i18 = i13 + 2;
                        byte b11 = bArr[i17];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i13 += 3;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i17 >= i11 - 2) {
                        return u1.m4452a(i17, i11, bArr);
                    }
                    int i19 = i13 + 2;
                    byte b12 = bArr[i17];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i20 = i13 + 3;
                            if (bArr[i19] <= -65) {
                                i13 += 4;
                                if (bArr[i20] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i17;
            }
        }
        return 0;
    }
}
