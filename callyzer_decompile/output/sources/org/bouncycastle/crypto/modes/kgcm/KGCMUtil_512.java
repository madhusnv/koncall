package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes3.dex */
public class KGCMUtil_512 {
    public static final int SIZE = 8;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | (((((((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i10 = 0;
        long j6 = jArr2[0];
        boolean z6 = true;
        long j10 = jArr2[1];
        char c2 = 2;
        long j11 = jArr2[2];
        char c10 = 3;
        long j12 = jArr2[3];
        long j13 = jArr2[4];
        long j14 = jArr2[5];
        long j15 = jArr2[6];
        long j16 = jArr2[7];
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        while (true) {
            boolean z10 = z6;
            if (i10 >= 8) {
                char c11 = c2;
                jArr3[0] = j17 ^ (((j18 ^ (j18 << c11)) ^ (j18 << 5)) ^ (j18 << 8));
                jArr3[z10 ? 1 : 0] = j19 ^ (((j18 >>> 62) ^ (j18 >>> 59)) ^ (j18 >>> 56));
                jArr3[c11] = j20;
                jArr3[c10] = j21;
                jArr3[4] = j22;
                jArr3[5] = j23;
                jArr3[6] = j24;
                jArr3[7] = j25;
                return;
            }
            long j26 = jArr[i10];
            long j27 = jArr[i10 + 1];
            long j28 = j11;
            long j29 = j10;
            long j30 = j15;
            j15 = j14;
            j14 = j13;
            j13 = j12;
            long j31 = j28;
            char c12 = c2;
            int i11 = 0;
            while (i11 < 64) {
                char c13 = c10;
                long j32 = j31;
                long j33 = -(j26 & 1);
                j26 >>>= z10 ? 1L : 0L;
                j17 ^= j6 & j33;
                long j34 = j29;
                long j35 = -(j27 & 1);
                j27 >>>= z10 ? 1L : 0L;
                j19 = (j19 ^ (j29 & j33)) ^ (j6 & j35);
                j20 = (j20 ^ (j32 & j33)) ^ (j34 & j35);
                j21 = (j21 ^ (j13 & j33)) ^ (j32 & j35);
                j22 = (j22 ^ (j14 & j33)) ^ (j13 & j35);
                j23 = (j23 ^ (j15 & j33)) ^ (j14 & j35);
                j24 = (j24 ^ (j30 & j33)) ^ (j15 & j35);
                j25 = (j25 ^ (j16 & j33)) ^ (j30 & j35);
                j18 ^= j16 & j35;
                long j36 = j16 >> 63;
                j16 = (j16 << (z10 ? 1L : 0L)) | (j30 >>> 63);
                j30 = (j30 << (z10 ? 1L : 0L)) | (j15 >>> 63);
                j15 = (j15 << (z10 ? 1L : 0L)) | (j14 >>> 63);
                j14 = (j14 << (z10 ? 1L : 0L)) | (j13 >>> 63);
                j13 = (j13 << (z10 ? 1L : 0L)) | (j32 >>> 63);
                long j37 = (j32 << (z10 ? 1L : 0L)) | (j34 >>> 63);
                long j38 = (j34 << (z10 ? 1L : 0L)) | (j6 >>> 63);
                j6 = (j6 << (z10 ? 1L : 0L)) ^ (j36 & 293);
                i11++;
                c10 = c13;
                j31 = j37;
                j29 = j38;
            }
            long j39 = ((j6 ^ (j16 >>> 62)) ^ (j16 >>> 59)) ^ (j16 >>> 56);
            long j40 = ((j16 ^ (j16 << c12)) ^ (j16 << 5)) ^ (j16 << 8);
            i10 += 2;
            j16 = j30;
            c10 = c10;
            z6 = z10 ? 1 : 0;
            j12 = j31;
            j10 = j39;
            j6 = j40;
            c2 = c12;
            j11 = j29;
        }
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        jArr2[0] = (j6 << 1) ^ ((j16 >> 63) & 293);
        jArr2[1] = (j10 << 1) | (j6 >>> 63);
        jArr2[2] = (j11 << 1) | (j10 >>> 63);
        jArr2[3] = (j12 << 1) | (j11 >>> 63);
        jArr2[4] = (j13 << 1) | (j12 >>> 63);
        jArr2[5] = (j14 << 1) | (j13 >>> 63);
        jArr2[6] = (j15 << 1) | (j14 >>> 63);
        jArr2[7] = (j16 << 1) | (j15 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = j16 >>> 56;
        jArr2[0] = ((((j6 << 8) ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 8);
        jArr2[1] = (j10 << 8) | (j6 >>> 56);
        jArr2[2] = (j11 << 8) | (j10 >>> 56);
        jArr2[3] = (j12 << 8) | (j11 >>> 56);
        jArr2[4] = (j13 << 8) | (j12 >>> 56);
        jArr2[5] = (j14 << 8) | (j13 >>> 56);
        jArr2[6] = (j15 << 8) | (j14 >>> 56);
        jArr2[7] = (j16 << 8) | (j15 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i10 = 16;
        long[] jArr3 = new long[16];
        for (int i11 = 0; i11 < 8; i11++) {
            Interleave.expand64To128(jArr[i11], jArr3, i11 << 1);
        }
        while (true) {
            int i12 = i10 - 1;
            if (i12 < 8) {
                copy(jArr3, jArr2);
                return;
            }
            long j6 = jArr3[i12];
            int i13 = i10 - 9;
            jArr3[i13] = jArr3[i13] ^ ((((j6 << 2) ^ j6) ^ (j6 << 5)) ^ (j6 << 8));
            int i14 = i10 - 8;
            jArr3[i14] = ((j6 >>> 56) ^ ((j6 >>> 62) ^ (j6 >>> 59))) ^ jArr3[i14];
            i10 = i12;
        }
    }

    /* renamed from: x */
    public static void m11225x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }
}
