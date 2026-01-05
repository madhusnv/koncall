package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* loaded from: classes3.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(163, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        Nat192.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 163; i10 += 2) {
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
        jArr[0] = j6 ^ (j10 << 55);
        jArr[1] = (j10 >>> 9) ^ (j11 << 46);
        jArr[2] = (j11 >>> 18) ^ (j12 << 37);
        jArr[3] = (j12 >>> 27) ^ (j13 << 28);
        jArr[4] = (j13 >>> 36) ^ (j14 << 19);
        jArr[5] = j14 >>> 45;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = (j10 >>> 46) ^ (jArr[2] << 18);
        long j12 = ((j10 << 9) ^ (j6 >>> 55)) & M55;
        long j13 = j6 & M55;
        long j14 = jArr2[0];
        long j15 = jArr2[1];
        long j16 = (j15 >>> 46) ^ (jArr2[2] << 18);
        long j17 = ((j14 >>> 55) ^ (j15 << 9)) & M55;
        long j18 = j14 & M55;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j13, j18, jArr4, 0);
        implMulw(jArr3, j11, j16, jArr4, 2);
        long j19 = (j13 ^ j12) ^ j11;
        long j20 = (j18 ^ j17) ^ j16;
        implMulw(jArr3, j19, j20, jArr4, 4);
        long j21 = (j12 << 1) ^ (j11 << 2);
        long j22 = (j17 << 1) ^ (j16 << 2);
        implMulw(jArr3, j13 ^ j21, j18 ^ j22, jArr4, 6);
        implMulw(jArr3, j19 ^ j21, j20 ^ j22, jArr4, 8);
        long j23 = jArr4[6];
        long j24 = jArr4[8] ^ j23;
        long j25 = jArr4[7];
        long j26 = jArr4[9] ^ j25;
        long j27 = (j24 << 1) ^ j23;
        long j28 = (j24 ^ (j26 << 1)) ^ j25;
        long j29 = jArr4[0];
        long j30 = jArr4[1];
        long j31 = (j30 ^ j29) ^ jArr4[4];
        long j32 = j30 ^ jArr4[5];
        long j33 = jArr4[2];
        long j34 = ((j27 ^ j29) ^ (j33 << 4)) ^ (j33 << 1);
        long j35 = jArr4[3];
        long j36 = (((j31 ^ j28) ^ (j35 << 4)) ^ (j35 << 1)) ^ (j34 >>> 55);
        long j37 = j34 & M55;
        long j38 = (j32 ^ j26) ^ (j36 >>> 55);
        long j39 = (j37 >>> 1) ^ ((j36 & 1) << 54);
        long j40 = ((j36 & M55) >>> 1) ^ ((j38 & 1) << 54);
        long j41 = j39 ^ (j39 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = (j45 ^ (j45 << 32)) & M55;
        long j47 = j40 ^ (j46 >>> 54);
        long j48 = j47 ^ (j47 << 1);
        long j49 = j48 ^ (j48 << 2);
        long j50 = j49 ^ (j49 << 4);
        long j51 = j50 ^ (j50 << 8);
        long j52 = j51 ^ (j51 << 16);
        long j53 = M55 & (j52 ^ (j52 << 32));
        long j54 = (j38 >>> 1) ^ (j53 >>> 54);
        long j55 = j54 ^ (j54 << 1);
        long j56 = j55 ^ (j55 << 2);
        long j57 = j56 ^ (j56 << 4);
        long j58 = j57 ^ (j57 << 8);
        long j59 = j58 ^ (j58 << 16);
        long j60 = j59 ^ (j59 << 32);
        jArr3[0] = j29;
        jArr3[1] = (j31 ^ j46) ^ j33;
        jArr3[2] = ((j32 ^ j53) ^ j46) ^ j35;
        jArr3[3] = j60 ^ j53;
        jArr3[4] = jArr4[2] ^ j60;
        jArr3[5] = jArr4[3];
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
        long j15 = jArr[((int) j6) & 3];
        long j16 = 0;
        int i11 = 47;
        do {
            int i12 = (int) (j6 >>> i11);
            long j17 = (jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6);
            j15 ^= j17 << i11;
            j16 ^= j17 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr2[i10] = M55 & j15;
        jArr2[i10 + 1] = (j15 >>> 55) ^ (j16 << 9);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 81, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = j12 ^ ((((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)) ^ (j14 >>> 28));
        long j16 = (j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36))) ^ ((j13 >>> 28) ^ (((j13 >>> 35) ^ (j13 >>> 32)) ^ (j13 >>> 29)));
        long j17 = j6 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36));
        long j18 = (j10 ^ ((((j13 << 29) ^ (j13 << 32)) ^ (j13 << 35)) ^ (j13 << 36))) ^ ((j15 >>> 28) ^ (((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)));
        long j19 = j16 >>> 35;
        jArr2[0] = (((j17 ^ j19) ^ (j19 << 3)) ^ (j19 << 6)) ^ (j19 << 7);
        jArr2[1] = j18;
        jArr2[2] = M35 & j16;
    }

    public static void reduce29(long[] jArr, int i10) {
        int i11 = i10 + 2;
        long j6 = jArr[i11];
        long j10 = j6 >>> 35;
        jArr[i10] = ((j10 << 7) ^ (((j10 << 3) ^ j10) ^ (j10 << 6))) ^ jArr[i10];
        jArr[i11] = j6 & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j6;
        jArr2[1] = jArr2[1] ^ (jUnshuffle3 & 4294967295L);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
