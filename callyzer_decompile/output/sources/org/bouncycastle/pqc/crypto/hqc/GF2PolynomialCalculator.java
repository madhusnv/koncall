package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: classes3.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    public GF2PolynomialCalculator(int i10, int i11, long j6) {
        this.VEC_N_SIZE_64 = i10;
        this.PARAM_N = i11;
        this.RED_MASK = j6;
    }

    public static void addLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = jArr2[i10] ^ jArr3[i10];
        }
    }

    private void base_mul(long[] jArr, int i10, long j6, long j10) {
        int i11;
        long[] jArr2;
        int i12 = 16;
        int i13 = 0;
        long j11 = j10 & 1152921504606846975L;
        boolean z6 = true;
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j14 ^ j11;
        long j16 = j13 << 1;
        long j17 = j16 ^ j11;
        long j18 = j11 << 3;
        long j19 = j15 << 1;
        long j20 = j13 << 2;
        long j21 = j17 << 1;
        long[] jArr3 = {0, j11, j12, j13, j14, j15, j16, j17, j18, j18 ^ j11, j19, j19 ^ j11, j20, j20 ^ j11, j21, j11 ^ j21};
        long j22 = 15;
        long j23 = j6 & 15;
        int i14 = 0;
        long j24 = 0;
        while (true) {
            i11 = i13;
            if (i14 >= 16) {
                break;
            }
            long j25 = j23 - i14;
            j24 ^= jArr3[i14] & (-(1 - ((j25 | (-j25)) >>> 63)));
            i14++;
            i13 = i11;
            j22 = j22;
        }
        long j26 = j22;
        byte b10 = 4;
        long j27 = 0;
        while (b10 < 64) {
            long j28 = (j6 >> b10) & j26;
            int i15 = i11;
            long j29 = 0;
            while (true) {
                jArr2 = jArr3;
                if (i15 < i12) {
                    long j30 = j28 - i15;
                    j29 ^= jArr2[i15] & (-(1 - ((j30 | (-j30)) >>> 63)));
                    i15++;
                    jArr3 = jArr2;
                    z6 = z6;
                    i12 = 16;
                }
            }
            j24 ^= j29 << b10;
            j27 ^= j29 >>> (64 - b10);
            b10 = (byte) (b10 + 4);
            jArr3 = jArr2;
            i12 = 16;
        }
        boolean z10 = z6;
        long[] jArr4 = new long[4];
        jArr4[i11] = -((j10 >> 60) & 1);
        jArr4[z10 ? 1 : 0] = -((j10 >> 61) & 1);
        jArr4[2] = -((j10 >> 62) & 1);
        jArr4[3] = -((j10 >> 63) & 1);
        long j31 = jArr4[i11];
        long j32 = jArr4[z10 ? 1 : 0];
        long j33 = jArr4[2];
        long j34 = jArr4[3];
        long j35 = (((j27 ^ (j31 & (j6 >>> 4))) ^ ((j6 >>> 3) & j32)) ^ ((j6 >>> 2) & j33)) ^ ((j6 >>> (z10 ? 1L : 0L)) & j34);
        jArr[i10] = (((((j6 << 60) & j31) ^ j24) ^ ((j6 << 61) & j32)) ^ ((j6 << 62) & j33)) ^ ((j6 << 63) & j34);
        jArr[i10 + 1] = j35;
    }

    private void karatsuba(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, int i13, long[] jArr4, int i14) {
        if (i13 == 1) {
            base_mul(jArr, i10, jArr2[i11], jArr3[i12]);
            return;
        }
        int i15 = i13 / 2;
        int i16 = (i13 + 1) / 2;
        int i17 = i14 + i16;
        int i18 = i17 + i16;
        int i19 = (i16 * 2) + i10;
        int i20 = (i16 * 4) + i14;
        karatsuba(jArr, i10, jArr2, i11, jArr3, i12, i16, jArr4, i20);
        karatsuba(jArr, i19, jArr2, i11 + i16, jArr3, i12 + i16, i15, jArr4, i20);
        karatsuba_add1(jArr4, i14, jArr4, i17, jArr2, i11, jArr3, i12, i16, i15);
        karatsuba(jArr4, i18, jArr4, i14, jArr4, i17, i16, jArr4, i20);
        karatsuba_add2(jArr, i10, jArr4, i18, jArr, i19, i16, i15);
    }

    private void karatsuba_add1(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 + i14;
            jArr[i16 + i10] = jArr3[i16 + i12] ^ jArr3[i17 + i12];
            jArr2[i16 + i11] = jArr4[i16 + i13] ^ jArr4[i17 + i13];
        }
        if (i15 < i14) {
            jArr[i10 + i15] = jArr3[i12 + i15];
            jArr2[i15 + i11] = jArr4[i15 + i13];
        }
    }

    private void karatsuba_add2(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, int i13, int i14) {
        int i15;
        int i16 = 0;
        while (true) {
            i15 = i13 * 2;
            if (i16 >= i15) {
                break;
            }
            int i17 = i16 + i11;
            jArr2[i17] = jArr2[i17] ^ jArr[i16 + i10];
            i16++;
        }
        for (int i18 = 0; i18 < i14 * 2; i18++) {
            int i19 = i18 + i11;
            jArr2[i19] = jArr2[i19] ^ jArr3[i18 + i12];
        }
        for (int i20 = 0; i20 < i15; i20++) {
            int i21 = i20 + i13 + i10;
            jArr[i21] = jArr[i21] ^ jArr2[i20 + i11];
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i10 = 0;
        while (true) {
            int i11 = this.VEC_N_SIZE_64;
            if (i10 >= i11) {
                int i12 = i11 - 1;
                jArr[i12] = jArr[i12] & this.RED_MASK;
                return;
            }
            long j6 = jArr2[(i10 + i11) - 1];
            int i13 = this.PARAM_N;
            jArr[i10] = (jArr2[i10] ^ (j6 >>> (i13 & 63))) ^ (jArr2[i11 + i10] << ((int) (64 - (i13 & 63))));
            i10++;
        }
    }

    public void multLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        int i10 = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[(i10 << 1) + 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i10, new long[i10 << 3], 0);
        reduce(jArr, jArr4);
    }
}
