package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;

/* loaded from: classes3.dex */
public class SecT283Field {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(283, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        Nat320.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 283; i10 += 2) {
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
        jArr[0] = j6 ^ (j10 << 57);
        jArr[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr[2] = (j11 >>> 14) ^ (j12 << 43);
        jArr[3] = (j12 >>> 21) ^ (j13 << 36);
        jArr[4] = (j13 >>> 28) ^ (j14 << 29);
        jArr[5] = (j14 >>> 35) ^ (j15 << 22);
        jArr[6] = (j15 >>> 42) ^ (j16 << 15);
        jArr[7] = (j16 >>> 49) ^ (j17 << 8);
        jArr[8] = (j17 >>> 56) ^ (j18 << 1);
        jArr[9] = j18 >>> 63;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        jArr2[0] = j6 & M57;
        jArr2[1] = ((j6 >>> 57) ^ (j10 << 7)) & M57;
        jArr2[2] = ((j10 >>> 50) ^ (j11 << 14)) & M57;
        jArr2[3] = ((j11 >>> 43) ^ (j12 << 21)) & M57;
        jArr2[4] = (j12 >>> 36) ^ (j13 << 28);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j6 = jArr4[0];
        long j10 = j6 ^ jArr4[1];
        long j11 = jArr5[0];
        long j12 = j11 ^ jArr5[1];
        long j13 = jArr4[2];
        long j14 = j6 ^ j13;
        long j15 = jArr5[2];
        long j16 = j11 ^ j15;
        long j17 = jArr4[4];
        long j18 = j13 ^ j17;
        long j19 = jArr5[4];
        long j20 = j15 ^ j19;
        long j21 = jArr4[3];
        long j22 = j21 ^ j17;
        long j23 = jArr5[3];
        long j24 = j23 ^ j19;
        implMulw(jArr3, j14 ^ j21, j16 ^ j23, jArr6, 18);
        implMulw(jArr3, j18 ^ jArr4[1], j20 ^ jArr5[1], jArr6, 20);
        long j25 = j10 ^ j22;
        long j26 = j12 ^ j24;
        long j27 = j25 ^ jArr4[2];
        long j28 = jArr5[2] ^ j26;
        implMulw(jArr3, j25, j26, jArr6, 22);
        implMulw(jArr3, j27, j28, jArr6, 24);
        implMulw(jArr3, j10, j12, jArr6, 10);
        implMulw(jArr3, j14, j16, jArr6, 12);
        implMulw(jArr3, j18, j20, jArr6, 14);
        implMulw(jArr3, j22, j24, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j29 = jArr6[0];
        long j30 = jArr6[1] ^ j29;
        long j31 = jArr6[2] ^ j30;
        long j32 = jArr6[10] ^ j31;
        jArr3[1] = j32;
        long j33 = jArr6[3] ^ jArr6[4];
        long j34 = j31 ^ (j33 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j34;
        long j35 = j30 ^ j33;
        long j36 = jArr6[5] ^ jArr6[6];
        long j37 = jArr6[8];
        long j38 = (j35 ^ j36) ^ j37;
        long j39 = jArr6[13] ^ jArr6[14];
        long j40 = jArr6[18];
        long j41 = jArr6[22];
        long j42 = jArr6[24];
        jArr3[3] = (j38 ^ j39) ^ ((j40 ^ j41) ^ j42);
        long j43 = jArr6[7] ^ j37;
        long j44 = jArr6[9];
        long j45 = j43 ^ j44;
        long j46 = j45 ^ jArr6[17];
        jArr3[8] = j46;
        long j47 = (j45 ^ j36) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j47;
        long j48 = j47 ^ j32;
        long j49 = jArr6[19] ^ jArr6[20];
        long j50 = jArr6[25];
        long j51 = j50 ^ j42;
        long j52 = jArr6[23];
        long j53 = j49 ^ j51;
        jArr3[4] = (j53 ^ (j40 ^ j52)) ^ j48;
        long j54 = jArr6[21];
        jArr3[5] = ((j34 ^ j46) ^ j53) ^ (j54 ^ j41);
        jArr3[6] = (((((j38 ^ j29) ^ j44) ^ j39) ^ j54) ^ j52) ^ j50;
        implCompactExt(jArr3);
    }

    public static void implMulw(long[] jArr, long j6, long j10, long[] jArr2, int i10) {
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
        long j15 = jArr[((int) j6) & 7];
        long j16 = 0;
        int i11 = 48;
        do {
            int i12 = (int) (j6 >>> i11);
            long j17 = (jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6);
            j15 ^= j17 << i11;
            j16 ^= j17 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr2[i10] = M57 & j15;
        jArr2[i10 + 1] = (((((j6 & 72198606942111744L) & ((j10 << 7) >> 63)) >>> 8) ^ j16) << 7) ^ (j15 >>> 57);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
        jArr2[8] = Interleave.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat320.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat320.create64();
        long[] jArrCreate642 = Nat320.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 17, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 35, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 70, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 141, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
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
        long j17 = jArr[8];
        long j18 = j13 ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        long j19 = j6 ^ ((((j14 << 37) ^ (j14 << 42)) ^ (j14 << 44)) ^ (j14 << 49));
        long j20 = (j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49))) ^ ((((j14 >>> 27) ^ (j14 >>> 22)) ^ (j14 >>> 20)) ^ (j14 >>> 15));
        long j21 = j18 >>> 27;
        jArr2[0] = (((j19 ^ j21) ^ (j21 << 5)) ^ (j21 << 7)) ^ (j21 << 12);
        jArr2[1] = j20;
        jArr2[2] = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        jArr2[3] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[4] = M27 & j18;
    }

    public static void reduce37(long[] jArr, int i10) {
        int i11 = i10 + 4;
        long j6 = jArr[i11];
        long j10 = j6 >>> 27;
        jArr[i10] = ((j10 << 12) ^ (((j10 << 5) ^ j10) ^ (j10 << 7))) ^ jArr[i10];
        jArr[i11] = j6 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat320.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j10 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        jArrCreate64[1] = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        jArrCreate64[2] = jUnshuffle5 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j6;
        jArr2[1] = jArr2[1] ^ j10;
        jArr2[2] = jArr2[2] ^ (4294967295L & jUnshuffle5);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
