package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
public class SecT239Field {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(239, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 239; i10 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        jArr[0] = j6 ^ (j10 << 60);
        jArr[1] = (j10 >>> 4) ^ (j11 << 56);
        jArr[2] = (j11 >>> 8) ^ (j12 << 52);
        jArr[3] = (j12 >>> 12) ^ (j13 << 48);
        jArr[4] = (j13 >>> 16) ^ (j14 << 44);
        jArr[5] = (j14 >>> 20) ^ (j15 << 40);
        jArr[6] = (j15 >>> 24) ^ (j16 << 36);
        jArr[7] = j16 >>> 28;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        jArr2[0] = j6 & M60;
        jArr2[1] = ((j6 >>> 60) ^ (j10 << 4)) & M60;
        jArr2[2] = ((j10 >>> 56) ^ (j11 << 8)) & M60;
        jArr2[3] = (j11 >>> 52) ^ (j12 << 12);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i10 = 5; i10 > 0; i10--) {
            jArr3[i10] = jArr3[i10] ^ jArr3[i10 - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j6 = jArr4[0] ^ jArr4[2];
        long j10 = jArr4[1] ^ jArr4[3];
        long j11 = jArr5[0] ^ jArr5[2];
        long j12 = jArr5[3] ^ jArr5[1];
        implMulwAcc(jArr6, j6 ^ j10, j11 ^ j12, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j6, j11, jArr7, 0);
        implMulwAcc(jArr6, j10, j12, jArr7, 1);
        long j13 = jArr7[0];
        long j14 = jArr7[1];
        long j15 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j13;
        jArr3[3] = (j13 ^ j14) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j14 ^ j15);
        jArr3[5] = jArr3[5] ^ j15;
        implCompactExt(jArr3);
    }

    public static void implMulwAcc(long[] jArr, long j6, long j10, long[] jArr2, int i10) {
        jArr[1] = j10;
        long j11 = j10 << 1;
        jArr[2] = j11;
        long j12 = j11 ^ j10;
        jArr[3] = j12;
        long j13 = j10 << 2;
        jArr[4] = j13;
        jArr[5] = j13 ^ j10;
        long j14 = j12 << 1;
        jArr[6] = j14;
        jArr[7] = j14 ^ j10;
        int i11 = (int) j6;
        long j15 = (jArr[(i11 >>> 3) & 7] << 3) ^ jArr[i11 & 7];
        long j16 = 0;
        int i12 = 54;
        do {
            int i13 = (int) (j6 >>> i12);
            long j17 = jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3);
            j15 ^= j17 << i12;
            j16 ^= j17 >>> (-i12);
            i12 -= 6;
        } while (i12 > 0);
        jArr2[i10] = jArr2[i10] ^ (M60 & j15);
        int i14 = i10 + 1;
        jArr2[i14] = ((((((j6 & 585610922974906400L) & ((j10 << 4) >> 63)) >>> 5) ^ j16) << 4) ^ (j15 >>> 60)) ^ jArr2[i14];
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate642 = Nat256.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 29, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 59, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 119, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = j15 ^ (j16 >>> 17);
        long j18 = (j14 ^ (j16 << 47)) ^ (j17 >>> 17);
        long j19 = ((j13 ^ (j16 >>> 47)) ^ (j17 << 47)) ^ (j18 >>> 17);
        long j20 = j6 ^ (j19 << 17);
        long j21 = (j10 ^ (j18 << 17)) ^ (j19 >>> 47);
        long j22 = ((j11 ^ (j17 << 17)) ^ (j18 >>> 47)) ^ (j19 << 47);
        long j23 = (((j12 ^ (j16 << 17)) ^ (j17 >>> 47)) ^ (j18 << 47)) ^ (j19 >>> 17);
        long j24 = j23 >>> 47;
        jArr2[0] = j20 ^ j24;
        jArr2[1] = j21;
        jArr2[2] = (j24 << 30) ^ j22;
        jArr2[3] = M47 & j23;
    }

    public static void reduce17(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j6 = jArr[i11];
        long j10 = j6 >>> 47;
        jArr[i10] = jArr[i10] ^ j10;
        int i12 = i10 + 2;
        jArr[i12] = (j10 << 30) ^ jArr[i12];
        jArr[i11] = j6 & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j10 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        int i10 = 2;
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j11 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        long j12 = (jUnshuffle4 & (-4294967296L)) | (jUnshuffle3 >>> 32);
        long j13 = j12 >>> 49;
        long j14 = (j10 >>> 49) | (j12 << 15);
        long j15 = j12 ^ (j10 << 15);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {39, 120};
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            int i13 = i12 >>> 6;
            int i14 = i12 & 63;
            jArrCreateExt64[i13] = jArrCreateExt64[i13] ^ (j10 << i14);
            int i15 = i13 + 1;
            int[] iArr2 = iArr;
            int i16 = -i14;
            jArrCreateExt64[i15] = jArrCreateExt64[i15] ^ ((j15 << i14) | (j10 >>> i16));
            int i17 = i13 + 2;
            jArrCreateExt64[i17] = jArrCreateExt64[i17] ^ ((j14 << i14) | (j15 >>> i16));
            int i18 = i13 + 3;
            jArrCreateExt64[i18] = jArrCreateExt64[i18] ^ ((j13 << i14) | (j14 >>> i16));
            int i19 = i13 + 4;
            jArrCreateExt64[i19] = jArrCreateExt64[i19] ^ (j13 >>> i16);
            i11++;
            i10 = 2;
            iArr = iArr2;
        }
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j6;
        jArr2[1] = jArr2[1] ^ j11;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
