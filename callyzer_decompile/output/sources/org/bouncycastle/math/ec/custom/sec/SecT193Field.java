package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
public class SecT193Field {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

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
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ M01;
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
        return Nat.fromBigInteger64(193, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 193; i10 += 2) {
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
        jArr[0] = j6 ^ (j10 << 49);
        jArr[1] = (j10 >>> 15) ^ (j11 << 34);
        jArr[2] = (j11 >>> 30) ^ (j12 << 19);
        jArr[3] = ((j12 >>> 45) ^ (j13 << 4)) ^ (j14 << 53);
        jArr[4] = ((j13 >>> 60) ^ (j15 << 38)) ^ (j14 >>> 11);
        jArr[5] = (j15 >>> 26) ^ (j16 << 23);
        jArr[6] = j16 >>> 41;
        jArr[7] = 0;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        jArr2[0] = j6 & M49;
        jArr2[1] = ((j6 >>> 49) ^ (j10 << 15)) & M49;
        jArr2[2] = ((j10 >>> 34) ^ (j11 << 30)) & M49;
        jArr2[3] = (j11 >>> 19) ^ (j12 << 45);
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
        long j11 = j10 << M01;
        jArr[2] = j11;
        long j12 = j11 ^ j10;
        jArr[3] = j12;
        long j13 = j10 << 2;
        jArr[4] = j13;
        jArr[5] = j13 ^ j10;
        long j14 = j12 << M01;
        jArr[6] = j14;
        jArr[7] = j14 ^ j10;
        int i11 = (int) j6;
        long j15 = (jArr[(i11 >>> 3) & 7] << 3) ^ jArr[i11 & 7];
        long j16 = 0;
        int i12 = 36;
        do {
            int i13 = (int) (j6 >>> i12);
            long j17 = (((jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6)) ^ (jArr[(i13 >>> 9) & 7] << 9)) ^ (jArr[(i13 >>> 12) & 7] << 12);
            j15 ^= j17 << i12;
            j16 ^= j17 >>> (-i12);
            i12 -= 15;
        } while (i12 > 0);
        jArr2[i10] = jArr2[i10] ^ (M49 & j15);
        int i14 = i10 + 1;
        jArr2[i14] = jArr2[i14] ^ ((j15 >>> 49) ^ (j16 << 15));
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & M01;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate642 = Nat256.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 6, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 12, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArr2);
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
        long j16 = j12 ^ ((j15 >>> M01) ^ (j15 << 14));
        long j17 = j13 ^ (j15 >>> 50);
        long j18 = (j11 ^ (j15 << 63)) ^ ((j14 >>> M01) ^ (j14 << 14));
        long j19 = j16 ^ (j14 >>> 50);
        long j20 = j6 ^ (j17 << 63);
        long j21 = (j10 ^ (j14 << 63)) ^ ((j17 >>> M01) ^ (j17 << 14));
        long j22 = j18 ^ (j17 >>> 50);
        long j23 = j19 >>> M01;
        jArr2[0] = (j20 ^ j23) ^ (j23 << 15);
        jArr2[1] = (j19 >>> 50) ^ j21;
        jArr2[2] = j22;
        jArr2[3] = M01 & j19;
    }

    public static void reduce63(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j6 = jArr[i11];
        long j10 = j6 >>> M01;
        jArr[i10] = (j10 ^ (j10 << 15)) ^ jArr[i10];
        int i12 = i10 + 1;
        jArr[i12] = jArr[i12] ^ (j6 >>> 50);
        jArr[i11] = j6 & M01;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j10 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long j11 = (jUnshuffle3 & 4294967295L) ^ (jArr[3] << 32);
        long j12 = jUnshuffle3 >>> 32;
        jArr2[0] = j6 ^ (j10 << 8);
        jArr2[1] = ((j11 ^ (j12 << 8)) ^ (j10 >>> 56)) ^ (j10 << 33);
        jArr2[2] = (j10 >>> 31) ^ (j12 << 33);
        jArr2[3] = jUnshuffle3 >>> 63;
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
        return ((int) jArr[0]) & 1;
    }
}
