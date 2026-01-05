package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;

/* loaded from: classes3.dex */
public class SecT113Field {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(113, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        Nat128.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 113; i10 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j6 = jArr[0];
        long j10 = ((jArr[1] << 7) ^ (j6 >>> 57)) & M57;
        long j11 = j6 & M57;
        long j12 = jArr2[0];
        long j13 = ((j12 >>> 57) ^ (jArr2[1] << 7)) & M57;
        long j14 = j12 & M57;
        long[] jArr4 = new long[6];
        implMulw(jArr3, j11, j14, jArr4, 0);
        implMulw(jArr3, j10, j13, jArr4, 2);
        implMulw(jArr3, j11 ^ j10, j14 ^ j13, jArr4, 4);
        long j15 = jArr4[1] ^ jArr4[2];
        long j16 = jArr4[0];
        long j17 = jArr4[3];
        long j18 = (jArr4[4] ^ j16) ^ j15;
        long j19 = j15 ^ (jArr4[5] ^ j17);
        jArr3[0] = j16 ^ (j18 << 57);
        jArr3[1] = (j18 >>> 7) ^ (j19 << 50);
        jArr3[2] = (j19 >>> 14) ^ (j17 << 43);
        jArr3[3] = j17 >>> 21;
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
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat128.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat128.create64();
        long[] jArrCreate642 = Nat128.create64();
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
        squareN(jArrCreate642, 28, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 56, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArr2);
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
        long j13 = j11 ^ ((j12 >>> 40) ^ (j12 >>> 49));
        long j14 = j6 ^ ((j13 << 15) ^ (j13 << 24));
        long j15 = (j10 ^ ((j12 << 15) ^ (j12 << 24))) ^ ((j13 >>> 40) ^ (j13 >>> 49));
        long j16 = j15 >>> 49;
        jArr2[0] = (j14 ^ j16) ^ (j16 << 9);
        jArr2[1] = M49 & j15;
    }

    public static void reduce15(long[] jArr, int i10) {
        int i11 = i10 + 1;
        long j6 = jArr[i11];
        long j10 = j6 >>> 49;
        jArr[i10] = (j10 ^ (j10 << 9)) ^ jArr[i10];
        jArr[i11] = j6 & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j6 = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
        long j10 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        jArr2[0] = ((j10 << 57) ^ j6) ^ (j10 << 5);
        jArr2[1] = (j10 >>> 59) ^ (j10 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
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
