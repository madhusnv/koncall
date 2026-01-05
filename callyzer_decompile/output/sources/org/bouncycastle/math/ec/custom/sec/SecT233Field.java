package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
public class SecT233Field {
    private static final long M41 = 2199023255551L;
    private static final long M59 = 576460752303423487L;

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
        return Nat.fromBigInteger64(233, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 233; i10 += 2) {
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
        jArr[0] = j6 ^ (j10 << 59);
        jArr[1] = (j10 >>> 5) ^ (j11 << 54);
        jArr[2] = (j11 >>> 10) ^ (j12 << 49);
        jArr[3] = (j12 >>> 15) ^ (j13 << 44);
        jArr[4] = (j13 >>> 20) ^ (j14 << 39);
        jArr[5] = (j14 >>> 25) ^ (j15 << 34);
        jArr[6] = (j15 >>> 30) ^ (j16 << 29);
        jArr[7] = j16 >>> 35;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        jArr2[0] = j6 & M59;
        jArr2[1] = ((j6 >>> 59) ^ (j10 << 5)) & M59;
        jArr2[2] = ((j10 >>> 54) ^ (j11 << 10)) & M59;
        jArr2[3] = (j11 >>> 49) ^ (j12 << 15);
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
        jArr2[i10] = jArr2[i10] ^ (M59 & j15);
        int i14 = i10 + 1;
        jArr2[i14] = jArr2[i14] ^ ((j15 >>> 59) ^ (j16 << 5));
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
        squareN(jArrCreate64, 58, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 116, jArrCreate64);
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
        long j17 = j14 ^ (j16 >>> 31);
        long j18 = (j13 ^ ((j16 >>> 41) ^ (j16 << 33))) ^ (j15 >>> 31);
        long j19 = ((j12 ^ (j16 << 23)) ^ ((j15 >>> 41) ^ (j15 << 33))) ^ (j17 >>> 31);
        long j20 = j6 ^ (j18 << 23);
        long j21 = (j10 ^ (j17 << 23)) ^ ((j18 >>> 41) ^ (j18 << 33));
        long j22 = ((j11 ^ (j15 << 23)) ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j18 >>> 31);
        long j23 = j19 >>> 41;
        jArr2[0] = j20 ^ j23;
        jArr2[1] = (j23 << 10) ^ j21;
        jArr2[2] = j22;
        jArr2[3] = M41 & j19;
    }

    public static void reduce23(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j6 = jArr[i11];
        long j10 = j6 >>> 41;
        jArr[i10] = jArr[i10] ^ j10;
        int i12 = i10 + 1;
        jArr[i12] = (j10 << 10) ^ jArr[i12];
        jArr[i11] = j6 & M41;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        boolean z6 = true;
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j10 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j11 = (4294967295L & jUnshuffle3) | (jUnshuffle4 << 32);
        long j12 = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long j13 = j12 >>> 27;
        long j14 = j12 ^ ((j10 >>> 27) | (j12 << 37));
        long j15 = j10 ^ (j10 << 37);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {32, 117, 191};
        int i10 = 0;
        while (i10 < 3) {
            int i11 = iArr[i10];
            int i12 = i11 >>> 6;
            int i13 = i11 & 63;
            jArrCreateExt64[i12] = jArrCreateExt64[i12] ^ (j15 << i13);
            int i14 = i12 + 1;
            boolean z10 = z6;
            int i15 = -i13;
            jArrCreateExt64[i14] = jArrCreateExt64[i14] ^ ((j14 << i13) | (j15 >>> i15));
            int i16 = i12 + 2;
            jArrCreateExt64[i16] = jArrCreateExt64[i16] ^ ((j13 << i13) | (j14 >>> i15));
            int i17 = i12 + 3;
            jArrCreateExt64[i17] = jArrCreateExt64[i17] ^ (j13 >>> i15);
            i10++;
            z6 = z10;
        }
        boolean z11 = z6;
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j6;
        jArr2[z11 ? 1 : 0] = jArr2[z11 ? 1 : 0] ^ j11;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
