package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* loaded from: classes3.dex */
public class SecT409Field {
    private static final long M25 = 33554431;
    private static final long M59 = 576460752303423487L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 13; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(409, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        Nat448.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 409; i10 += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
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
        long j17 = jArr[8];
        long j18 = jArr[9];
        long j19 = jArr[10];
        long j20 = jArr[11];
        long j21 = jArr[12];
        long j22 = jArr[13];
        jArr[0] = j6 ^ (j10 << 59);
        jArr[1] = (j10 >>> 5) ^ (j11 << 54);
        jArr[2] = (j11 >>> 10) ^ (j12 << 49);
        jArr[3] = (j12 >>> 15) ^ (j13 << 44);
        jArr[4] = (j13 >>> 20) ^ (j14 << 39);
        jArr[5] = (j14 >>> 25) ^ (j15 << 34);
        jArr[6] = (j15 >>> 30) ^ (j16 << 29);
        jArr[7] = (j16 >>> 35) ^ (j17 << 24);
        jArr[8] = (j17 >>> 40) ^ (j18 << 19);
        jArr[9] = (j18 >>> 45) ^ (j19 << 14);
        jArr[10] = (j19 >>> 50) ^ (j20 << 9);
        jArr[11] = ((j20 >>> 55) ^ (j21 << 4)) ^ (j22 << 63);
        jArr[12] = j22 >>> 1;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        jArr2[0] = j6 & M59;
        jArr2[1] = ((j6 >>> 59) ^ (j10 << 5)) & M59;
        jArr2[2] = ((j10 >>> 54) ^ (j11 << 10)) & M59;
        jArr2[3] = ((j11 >>> 49) ^ (j12 << 15)) & M59;
        jArr2[4] = ((j12 >>> 44) ^ (j13 << 20)) & M59;
        jArr2[5] = ((j13 >>> 39) ^ (j14 << 25)) & M59;
        jArr2[6] = (j14 >>> 34) ^ (j15 << 30);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i10 = 0; i10 < 7; i10++) {
            implMulwAcc(jArr6, jArr4[i10], jArr5[i10], jArr3, i10 << 1);
        }
        long j6 = jArr3[0];
        long j10 = jArr3[1];
        long j11 = jArr3[2] ^ j6;
        long j12 = j11 ^ j10;
        jArr3[1] = j12;
        long j13 = j10 ^ jArr3[3];
        long j14 = j11 ^ jArr3[4];
        long j15 = j14 ^ j13;
        jArr3[2] = j15;
        long j16 = j13 ^ jArr3[5];
        long j17 = j14 ^ jArr3[6];
        long j18 = j17 ^ j16;
        jArr3[3] = j18;
        long j19 = j16 ^ jArr3[7];
        long j20 = j17 ^ jArr3[8];
        long j21 = j20 ^ j19;
        jArr3[4] = j21;
        long j22 = j19 ^ jArr3[9];
        long j23 = j20 ^ jArr3[10];
        long j24 = j23 ^ j22;
        jArr3[5] = j24;
        long j25 = j22 ^ jArr3[11];
        long j26 = j23 ^ jArr3[12];
        long j27 = j26 ^ j25;
        jArr3[6] = j27;
        long j28 = (j25 ^ jArr3[13]) ^ j26;
        jArr3[7] = j6 ^ j28;
        jArr3[8] = j12 ^ j28;
        jArr3[9] = j15 ^ j28;
        jArr3[10] = j18 ^ j28;
        jArr3[11] = j21 ^ j28;
        jArr3[12] = j24 ^ j28;
        jArr3[13] = j27 ^ j28;
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        implMulwAcc(jArr6, jArr4[5] ^ jArr4[6], jArr5[6] ^ jArr5[5], jArr3, 11);
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
        Interleave.expand64To128(jArr, 0, 6, jArr2, 0);
        jArr2[12] = Interleave.expand32to64((int) jArr[6]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat448.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat448.create64();
        long[] jArrCreate642 = Nat448.create64();
        long[] jArrCreate643 = Nat448.create64();
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
        multiply(jArrCreate64, jArrCreate642, jArrCreate643);
        squareN(jArrCreate643, 24, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, BERTags.PRIVATE, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
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
        long j17 = jArr[12];
        long j18 = j14 ^ (j17 << 39);
        long j19 = j15 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j16 ^ (j17 >>> 2);
        long j21 = jArr[11];
        long j22 = j13 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[10];
        long j26 = j12 ^ (j25 << 39);
        long j27 = j22 ^ ((j25 >>> 25) ^ (j25 << 62));
        long j28 = j23 ^ (j25 >>> 2);
        long j29 = jArr[9];
        long j30 = j11 ^ (j29 << 39);
        long j31 = j26 ^ ((j29 >>> 25) ^ (j29 << 62));
        long j32 = j27 ^ (j29 >>> 2);
        long j33 = jArr[8];
        long j34 = j6 ^ (j20 << 39);
        long j35 = (j10 ^ (j33 << 39)) ^ ((j20 >>> 25) ^ (j20 << 62));
        long j36 = (j30 ^ ((j33 >>> 25) ^ (j33 << 62))) ^ (j20 >>> 2);
        long j37 = j24 >>> 25;
        jArr2[0] = j34 ^ j37;
        jArr2[1] = (j37 << 23) ^ j35;
        jArr2[2] = j36;
        jArr2[3] = j31 ^ (j33 >>> 2);
        jArr2[4] = j32;
        jArr2[5] = j28;
        jArr2[6] = j24 & M25;
    }

    public static void reduce39(long[] jArr, int i10) {
        int i11 = i10 + 6;
        long j6 = jArr[i11];
        long j10 = j6 >>> 25;
        jArr[i10] = jArr[i10] ^ j10;
        int i12 = i10 + 1;
        jArr[i12] = (j10 << 23) ^ jArr[i12];
        jArr[i11] = j6 & M25;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j10 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j11 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        long j12 = (jUnshuffle3 >>> 32) | (jUnshuffle4 & (-4294967296L));
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long jUnshuffle6 = Interleave.unshuffle(jArr[5]);
        long j13 = (jUnshuffle5 >>> 32) | (jUnshuffle6 & (-4294967296L));
        long jUnshuffle7 = Interleave.unshuffle(jArr[6]);
        long j14 = jUnshuffle7 >>> 32;
        jArr2[0] = j6 ^ (j10 << 44);
        jArr2[1] = (j11 ^ (j12 << 44)) ^ (j10 >>> 20);
        jArr2[2] = (((jUnshuffle5 & 4294967295L) | (jUnshuffle6 << 32)) ^ (j13 << 44)) ^ (j12 >>> 20);
        jArr2[3] = (((j14 << 44) ^ (jUnshuffle7 & 4294967295L)) ^ (j13 >>> 20)) ^ (j10 << 13);
        jArr2[4] = (j10 >>> 51) ^ ((jUnshuffle7 >>> 52) ^ (j12 << 13));
        jArr2[5] = (j13 << 13) ^ (j12 >>> 51);
        jArr2[6] = (j14 << 13) ^ (j13 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
