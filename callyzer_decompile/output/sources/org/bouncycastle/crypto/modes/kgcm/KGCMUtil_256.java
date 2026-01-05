package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes3.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        boolean z6;
        char c2;
        long j6;
        int i10 = 0;
        long j10 = jArr[0];
        boolean z10 = true;
        long j11 = jArr[1];
        char c10 = 2;
        long j12 = jArr[2];
        char c11 = 3;
        long j13 = jArr[3];
        long j14 = jArr2[0];
        long j15 = jArr2[1];
        long j16 = jArr2[2];
        long j17 = jArr2[3];
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        while (true) {
            z6 = z10;
            c2 = c10;
            j6 = j12;
            if (i10 >= 64) {
                break;
            }
            long j23 = -(j10 & 1);
            j10 >>>= z6 ? 1L : 0L;
            j18 ^= j14 & j23;
            char c12 = c11;
            long j24 = -(j11 & 1);
            j11 >>>= z6 ? 1L : 0L;
            j19 = (j19 ^ (j15 & j23)) ^ (j14 & j24);
            j20 = (j20 ^ (j16 & j23)) ^ (j15 & j24);
            j21 = (j21 ^ (j17 & j23)) ^ (j16 & j24);
            j22 ^= j17 & j24;
            long j25 = j17 >> 63;
            j17 = (j17 << (z6 ? 1L : 0L)) | (j16 >>> 63);
            j16 = (j16 << (z6 ? 1L : 0L)) | (j15 >>> 63);
            j15 = (j14 >>> 63) | (j15 << (z6 ? 1L : 0L));
            j14 = (j14 << (z6 ? 1L : 0L)) ^ (j25 & 1061);
            i10++;
            c11 = c12;
            z10 = z6 ? 1 : 0;
            c10 = c2;
            j12 = j6;
            j13 = j13;
        }
        char c13 = c11;
        long j26 = j13;
        char c14 = '>';
        long j27 = (((j17 >>> 62) ^ j14) ^ (j17 >>> 59)) ^ (j17 >>> 54);
        long j28 = ((j17 ^ (j17 << c2)) ^ (j17 << 5)) ^ (j17 << 10);
        int i11 = 0;
        while (i11 < 64) {
            long j29 = -(j6 & 1);
            j6 >>>= z6 ? 1L : 0L;
            j18 ^= j28 & j29;
            char c15 = c14;
            long j30 = j27;
            long j31 = -(j26 & 1);
            j26 >>>= z6 ? 1L : 0L;
            long j32 = (j19 ^ (j27 & j29)) ^ (j28 & j31);
            j20 = (j20 ^ (j15 & j29)) ^ (j30 & j31);
            j21 = (j21 ^ (j16 & j29)) ^ (j15 & j31);
            j22 ^= j16 & j31;
            long j33 = j16 >> 63;
            j16 = (j16 << (z6 ? 1L : 0L)) | (j15 >>> 63);
            j15 = (j30 >>> 63) | (j15 << (z6 ? 1L : 0L));
            long j34 = (j30 << (z6 ? 1L : 0L)) | (j28 >>> 63);
            j28 = (j28 << (z6 ? 1L : 0L)) ^ (j33 & 1061);
            i11++;
            c14 = c15;
            j27 = j34;
            j19 = j32;
        }
        jArr3[0] = j18 ^ (((j22 ^ (j22 << c2)) ^ (j22 << 5)) ^ (j22 << 10));
        jArr3[z6 ? 1 : 0] = j19 ^ (((j22 >>> c14) ^ (j22 >>> 59)) ^ (j22 >>> 54));
        jArr3[c2] = j20;
        jArr3[c13] = j21;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        jArr2[0] = ((j12 >> 63) & 1061) ^ (j6 << 1);
        jArr2[1] = (j6 >>> 63) | (j10 << 1);
        jArr2[2] = (j11 << 1) | (j10 >>> 63);
        jArr2[3] = (j12 << 1) | (j11 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = j12 >>> 56;
        jArr2[0] = ((((j6 << 8) ^ j13) ^ (j13 << 2)) ^ (j13 << 5)) ^ (j13 << 10);
        jArr2[1] = (j6 >>> 56) | (j10 << 8);
        jArr2[2] = (j11 << 8) | (j10 >>> 56);
        jArr2[3] = (j12 << 8) | (j11 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i10 = 8;
        long[] jArr3 = new long[8];
        for (int i11 = 0; i11 < 4; i11++) {
            Interleave.expand64To128(jArr[i11], jArr3, i11 << 1);
        }
        while (true) {
            int i12 = i10 - 1;
            if (i12 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j6 = jArr3[i12];
            int i13 = i10 - 5;
            jArr3[i13] = jArr3[i13] ^ ((((j6 << 2) ^ j6) ^ (j6 << 5)) ^ (j6 << 10));
            int i14 = i10 - 4;
            jArr3[i14] = ((j6 >>> 54) ^ ((j6 >>> 62) ^ (j6 >>> 59))) ^ jArr3[i14];
            i10 = i12;
        }
    }

    /* renamed from: x */
    public static void m11224x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
