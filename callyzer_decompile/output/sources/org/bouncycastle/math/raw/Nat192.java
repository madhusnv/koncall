package org.bouncycastle.math.raw;

import java.math.BigInteger;
import mm.AbstractC4801l;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public abstract class Nat192 {

    /* renamed from: M */
    private static final long f27965M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27965M) + (iArr2[0] & f27965M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27965M) + (iArr2[1] & f27965M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27965M) + (iArr2[2] & f27965M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27965M) + (iArr2[3] & f27965M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27965M) + (iArr2[4] & f27965M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27965M) + (iArr2[5] & f27965M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27965M) + (iArr2[0] & f27965M) + (iArr3[0] & f27965M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27965M) + (iArr2[1] & f27965M) + (iArr3[1] & f27965M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27965M) + (iArr2[2] & f27965M) + (iArr3[2] & f27965M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27965M) + (iArr2[3] & f27965M) + (iArr3[3] & f27965M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27965M) + (iArr2[4] & f27965M) + (iArr3[4] & f27965M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27965M) + (iArr2[5] & f27965M) + (iArr3[5] & f27965M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j6 = (iArr[i10] & f27965M) + (iArr2[i11] & f27965M) + (i12 & f27965M);
        iArr2[i11] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27965M) + (iArr2[r6] & f27965M) + (j6 >>> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27965M) + (iArr2[r6] & f27965M) + (j10 >>> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27965M) + (iArr2[r6] & f27965M) + (j11 >>> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27965M) + (iArr2[r6] & f27965M) + (j12 >>> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27965M) + (f27965M & iArr2[r12]) + (j13 >>> 32);
        iArr2[i11 + 5] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr[i10] & f27965M) + (iArr2[i11] & f27965M);
        int i12 = (int) j6;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j10 = (iArr[r5] & f27965M) + (iArr2[r8] & f27965M) + (j6 >>> 32);
        int i13 = (int) j10;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j11 = (iArr[r5] & f27965M) + (iArr2[r8] & f27965M) + (j10 >>> 32);
        int i14 = (int) j11;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j12 = (iArr[r5] & f27965M) + (iArr2[r8] & f27965M) + (j11 >>> 32);
        int i15 = (int) j12;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j13 = (iArr[r5] & f27965M) + (iArr2[r8] & f27965M) + (j12 >>> 32);
        int i16 = (int) j13;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j14 = (iArr[r12] & f27965M) + (f27965M & iArr2[r14]) + (j13 >>> 32);
        int i17 = (int) j14;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
    }

    public static void copy64(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11] = jArr[i10];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean zGte = gte(iArr, i10, iArr2, i11);
        if (zGte) {
            sub(iArr, i10, iArr2, i11, iArr3, i12);
            return zGte;
        }
        sub(iArr2, i11, iArr, i10, iArr3, i12);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i10 = 2; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i10 = 0; i10 < 6; i10++) {
            iArrCreate[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i10 = 0; i10 < 3; i10++) {
            jArrCreate64[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 6) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 5; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27965M;
        long j10 = iArr2[i11 + 1] & f27965M;
        long j11 = iArr2[i11 + 2] & f27965M;
        long j12 = iArr2[i11 + 3] & f27965M;
        long j13 = iArr2[i11 + 4] & f27965M;
        long j14 = iArr2[i11 + 5] & f27965M;
        long j15 = iArr[i10] & f27965M;
        long j16 = j15 * j6;
        iArr3[i12] = (int) j16;
        long j17 = (j15 * j10) + (j16 >>> 32);
        iArr3[i12 + 1] = (int) j17;
        long j18 = (j15 * j11) + (j17 >>> 32);
        iArr3[i12 + 2] = (int) j18;
        long j19 = (j15 * j12) + (j18 >>> 32);
        iArr3[i12 + 3] = (int) j19;
        long j20 = (j15 * j13) + (j19 >>> 32);
        iArr3[i12 + 4] = (int) j20;
        long j21 = (j15 * j14) + (j20 >>> 32);
        iArr3[i12 + 5] = (int) j21;
        iArr3[i12 + 6] = (int) (j21 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 6) {
            int i15 = i14 + 1;
            long j22 = iArr[i10 + i13] & f27965M;
            int i16 = i14;
            long j23 = (j22 * j6) + (iArr3[i15] & f27965M);
            iArr3[i15] = (int) j23;
            long j24 = (j22 * j10) + (iArr3[r3] & f27965M) + (j23 >>> 32);
            iArr3[i16 + 2] = (int) j24;
            long j25 = (j22 * j11) + (iArr3[r21] & f27965M) + (j24 >>> 32);
            iArr3[i16 + 3] = (int) j25;
            long j26 = (j22 * j12) + (iArr3[r21] & f27965M) + (j25 >>> 32);
            iArr3[i16 + 4] = (int) j26;
            long j27 = (j22 * j13) + (iArr3[r21] & f27965M) + (j26 >>> 32);
            iArr3[i16 + 5] = (int) j27;
            long j28 = j27 >>> 32;
            long j29 = (j22 * j14) + (iArr3[r2] & f27965M) + j28;
            iArr3[i16 + 6] = (int) j29;
            iArr3[i16 + 7] = (int) (j29 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j6 = i10 & f27965M;
        long j10 = iArr[i11] & f27965M;
        long j11 = (j6 * j10) + (iArr2[i12] & f27965M);
        iArr3[i13] = (int) j11;
        long j12 = iArr[i11 + 1] & f27965M;
        long j13 = (j6 * j12) + j10 + (iArr2[i12 + 1] & f27965M) + (j11 >>> 32);
        iArr3[i13 + 1] = (int) j13;
        long j14 = iArr[i11 + 2] & f27965M;
        long j15 = (j6 * j14) + j12 + (iArr2[i12 + 2] & f27965M) + (j13 >>> 32);
        iArr3[i13 + 2] = (int) j15;
        long j16 = iArr[i11 + 3] & f27965M;
        long j17 = (j6 * j16) + j14 + (iArr2[i12 + 3] & f27965M) + (j15 >>> 32);
        iArr3[i13 + 3] = (int) j17;
        long j18 = iArr[i11 + 4] & f27965M;
        long j19 = (j6 * j18) + j16 + (iArr2[i12 + 4] & f27965M) + (j17 >>> 32);
        iArr3[i13 + 4] = (int) j19;
        long j20 = iArr[i11 + 5] & f27965M;
        long j21 = (j6 * j20) + j18 + (f27965M & iArr2[i12 + 5]) + (j19 >>> 32);
        iArr3[i13 + 5] = (int) j21;
        return (j21 >>> 32) + j20;
    }

    public static int mul33DWordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27965M;
        long j11 = j6 & f27965M;
        long j12 = (j10 * j11) + (iArr[i11] & f27965M);
        iArr[i11] = (int) j12;
        long j13 = j6 >>> 32;
        long j14 = (j10 * j13) + j11;
        long j15 = j14 + (iArr[r4] & f27965M) + (j12 >>> 32);
        iArr[i11 + 1] = (int) j15;
        long j16 = j13 + (iArr[r4] & f27965M) + (j15 >>> 32);
        iArr[i11 + 2] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[r0] & f27965M);
        iArr[i11 + 3] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
        long j6 = i10 & f27965M;
        long j10 = i11 & f27965M;
        long j11 = (j6 * j10) + (iArr[i12] & f27965M);
        iArr[i12] = (int) j11;
        long j12 = j10 + (iArr[r5] & f27965M) + (j11 >>> 32);
        iArr[i12 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[r0] & f27965M);
        iArr[i12 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27965M;
        long j10 = iArr2[i11 + 1] & f27965M;
        long j11 = iArr2[i11 + 2] & f27965M;
        long j12 = iArr2[i11 + 3] & f27965M;
        long j13 = iArr2[i11 + 4] & f27965M;
        long j14 = iArr2[i11 + 5] & f27965M;
        long j15 = 0;
        int i13 = 0;
        int i14 = i12;
        while (i13 < 6) {
            long j16 = iArr[i10 + i13] & f27965M;
            long j17 = (j16 * j6) + (iArr3[i14] & f27965M);
            long j18 = j10;
            iArr3[i14] = (int) j17;
            int i15 = i14 + 1;
            long j19 = (j16 * j18) + (iArr3[i15] & f27965M) + (j17 >>> 32);
            iArr3[i15] = (int) j19;
            long j20 = (j16 * j11) + (iArr3[r4] & f27965M) + (j19 >>> 32);
            iArr3[i14 + 2] = (int) j20;
            long j21 = (j16 * j12) + (iArr3[r4] & f27965M) + (j20 >>> 32);
            iArr3[i14 + 3] = (int) j21;
            long j22 = (j16 * j13) + (iArr3[r4] & f27965M) + (j21 >>> 32);
            iArr3[i14 + 4] = (int) j22;
            long j23 = (j16 * j14) + (iArr3[r4] & f27965M) + (j22 >>> 32);
            iArr3[i14 + 5] = (int) j23;
            long j24 = (j23 >>> 32) + (iArr3[r14] & f27965M) + j15;
            iArr3[i14 + 6] = (int) j24;
            j15 = j24 >>> 32;
            i13++;
            i14 = i15;
            j10 = j18;
        }
        return (int) j15;
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j6 = i10 & f27965M;
        long j10 = 0;
        int i12 = 0;
        do {
            long j11 = ((iArr[i12] & f27965M) * j6) + j10;
            iArr2[i11 + i12] = (int) j11;
            j10 = j11 >>> 32;
            i12++;
        } while (i12 < 6);
        return (int) j10;
    }

    public static int mulWordAddExt(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j6 = i10 & f27965M;
        long j10 = ((iArr[i11] & f27965M) * j6) + (iArr2[i12] & f27965M);
        iArr2[i12] = (int) j10;
        long j11 = ((iArr[i11 + 1] & f27965M) * j6) + (iArr2[r8] & f27965M) + (j10 >>> 32);
        iArr2[i12 + 1] = (int) j11;
        long j12 = ((iArr[i11 + 2] & f27965M) * j6) + (iArr2[r8] & f27965M) + (j11 >>> 32);
        iArr2[i12 + 2] = (int) j12;
        long j13 = ((iArr[i11 + 3] & f27965M) * j6) + (iArr2[r8] & f27965M) + (j12 >>> 32);
        iArr2[i12 + 3] = (int) j13;
        long j14 = ((iArr[i11 + 4] & f27965M) * j6) + (iArr2[r8] & f27965M) + (j13 >>> 32);
        iArr2[i12 + 4] = (int) j14;
        long j15 = (j6 * (iArr[i11 + 5] & f27965M)) + (iArr2[r15] & f27965M) + (j14 >>> 32);
        iArr2[i12 + 5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27965M;
        long j11 = ((j6 & f27965M) * j10) + (iArr[i11] & f27965M);
        iArr[i11] = (int) j11;
        long j12 = j10 * (j6 >>> 32);
        long j13 = j12 + (iArr[r9] & f27965M) + (j11 >>> 32);
        iArr[i11 + 1] = (int) j13;
        long j14 = j13 >>> 32;
        long j15 = j14 + (iArr[r0] & f27965M);
        iArr[i11 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = iArr[i10] & f27965M;
        int i12 = 0;
        int i13 = 12;
        int i14 = 5;
        while (true) {
            int i15 = i14 - 1;
            long j10 = iArr[i10 + i14] & f27965M;
            long j11 = j10 * j10;
            iArr2[(i13 - 1) + i11] = (i12 << 31) | ((int) (j11 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j11 >>> 1);
            i12 = (int) j11;
            if (i15 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i12 << 31) & f27965M);
                iArr2[i11] = (int) j12;
                int i16 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[i10 + 1] & f27965M;
                long j15 = iArr2[r8] & f27965M;
                long j16 = (j14 * j6) + j13;
                int i17 = (int) j16;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                long j17 = j15 + (j16 >>> 32);
                long j18 = iArr[i10 + 2] & f27965M;
                long j19 = iArr2[r9] & f27965M;
                long j20 = iArr2[r24] & f27965M;
                long j21 = (j18 * j6) + j17;
                int i18 = (int) j21;
                iArr2[i11 + 2] = (i18 << 1) | (i17 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j18, j14, j21 >>> 32, j19);
                long j22 = j20 + (jM9729c >>> 32);
                long j23 = jM9729c & f27965M;
                long j24 = iArr[i10 + 3] & f27965M;
                long j25 = (iArr2[r6] & f27965M) + (j22 >>> 32);
                long j26 = j22 & f27965M;
                long j27 = (iArr2[r2] & f27965M) + (j25 >>> 32);
                long j28 = j25 & f27965M;
                long j29 = (j24 * j6) + j23;
                int i19 = (int) j29;
                iArr2[i11 + 3] = (i18 >>> 31) | (i19 << 1);
                long jM9729c2 = AbstractC4801l.m9729c(j24, j14, j29 >>> 32, j26);
                long jM9729c3 = AbstractC4801l.m9729c(j24, j18, jM9729c2 >>> 32, j28);
                long j30 = jM9729c2 & f27965M;
                long j31 = j27 + (jM9729c3 >>> 32);
                long j32 = jM9729c3 & f27965M;
                long j33 = iArr[i10 + 4] & f27965M;
                long j34 = (iArr2[r4] & f27965M) + (j31 >>> 32);
                long j35 = j31 & f27965M;
                long j36 = (iArr2[r5] & f27965M) + (j34 >>> 32);
                long j37 = j34 & f27965M;
                long j38 = (j33 * j6) + j30;
                int i20 = (int) j38;
                iArr2[i11 + 4] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jM9729c4 = AbstractC4801l.m9729c(j33, j14, j38 >>> 32, j32);
                long jM9729c5 = AbstractC4801l.m9729c(j33, j18, jM9729c4 >>> 32, j35);
                long j39 = jM9729c4 & f27965M;
                long jM9729c6 = AbstractC4801l.m9729c(j33, j24, jM9729c5 >>> 32, j37);
                long j40 = jM9729c5 & f27965M;
                long j41 = j36 + (jM9729c6 >>> 32);
                long j42 = jM9729c6 & f27965M;
                long j43 = iArr[i10 + 5] & f27965M;
                long j44 = (iArr2[r8] & f27965M) + (j41 >>> 32);
                long j45 = j41 & f27965M;
                long j46 = (iArr2[r0] & f27965M) + (j44 >>> 32);
                long j47 = j44 & f27965M;
                long j48 = (j43 * j6) + j39;
                int i22 = (int) j48;
                iArr2[i11 + 5] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j43, j14, j48 >>> 32, j40);
                long jM9729c8 = AbstractC4801l.m9729c(j43, j18, jM9729c7 >>> 32, j42);
                long jM9729c9 = AbstractC4801l.m9729c(j43, j24, jM9729c8 >>> 32, j45);
                long jM9729c10 = AbstractC4801l.m9729c(j43, j33, jM9729c9 >>> 32, j47);
                long j49 = j46 + (jM9729c10 >>> 32);
                int i24 = (int) jM9729c7;
                iArr2[i11 + 6] = i23 | (i24 << 1);
                int i25 = (int) jM9729c8;
                iArr2[i11 + 7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) jM9729c9;
                iArr2[i11 + 8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) jM9729c10;
                iArr2[i11 + 9] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j49;
                iArr2[i11 + 10] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = i11 + 11;
                iArr2[i33] = ((iArr2[i33] + ((int) (j49 >>> 32))) << 1) | i32;
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27965M) - (iArr2[i11] & f27965M);
        iArr3[i12] = (int) j6;
        long j10 = ((iArr[i10 + 1] & f27965M) - (iArr2[i11 + 1] & f27965M)) + (j6 >> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = ((iArr[i10 + 2] & f27965M) - (iArr2[i11 + 2] & f27965M)) + (j10 >> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = ((iArr[i10 + 3] & f27965M) - (iArr2[i11 + 3] & f27965M)) + (j11 >> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = ((iArr[i10 + 4] & f27965M) - (iArr2[i11 + 4] & f27965M)) + (j12 >> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = ((iArr[i10 + 5] & f27965M) - (iArr2[i11 + 5] & f27965M)) + (j13 >> 32);
        iArr3[i12 + 5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = ((iArr3[0] & f27965M) - (iArr[0] & f27965M)) - (iArr2[0] & f27965M);
        iArr3[0] = (int) j6;
        long j10 = (((iArr3[1] & f27965M) - (iArr[1] & f27965M)) - (iArr2[1] & f27965M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = (((iArr3[2] & f27965M) - (iArr[2] & f27965M)) - (iArr2[2] & f27965M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = (((iArr3[3] & f27965M) - (iArr[3] & f27965M)) - (iArr2[3] & f27965M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = (((iArr3[4] & f27965M) - (iArr[4] & f27965M)) - (iArr2[4] & f27965M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = (((iArr3[5] & f27965M) - (iArr[5] & f27965M)) - (iArr2[5] & f27965M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr2[i11] & f27965M) - (iArr[i10] & f27965M);
        iArr2[i11] = (int) j6;
        long j10 = ((iArr2[r5] & f27965M) - (iArr[i10 + 1] & f27965M)) + (j6 >> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = ((iArr2[r5] & f27965M) - (iArr[i10 + 2] & f27965M)) + (j10 >> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = ((iArr2[r5] & f27965M) - (iArr[i10 + 3] & f27965M)) + (j11 >> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = ((iArr2[r5] & f27965M) - (iArr[i10 + 4] & f27965M)) + (j12 >> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = ((iArr2[r13] & f27965M) - (iArr[i10 + 5] & f27965M)) + (j13 >> 32);
        iArr2[i11 + 5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (5 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 3; i10++) {
            long j6 = jArr[i10];
            if (j6 != 0) {
                Pack.longToBigEndian(j6, bArr, (2 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j6 = (iArr[0] & f27965M) + (iArr2[0] & f27965M);
        iArr2[0] = (int) j6;
        long j10 = (iArr[1] & f27965M) + (iArr2[1] & f27965M) + (j6 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = (iArr[2] & f27965M) + (iArr2[2] & f27965M) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = (iArr[3] & f27965M) + (iArr2[3] & f27965M) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & f27965M) + (iArr2[4] & f27965M) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & f27965M) + (f27965M & iArr2[5]) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = iArr2[0] & f27965M;
        long j10 = iArr2[1] & f27965M;
        long j11 = iArr2[2] & f27965M;
        long j12 = iArr2[3] & f27965M;
        long j13 = iArr2[4] & f27965M;
        long j14 = iArr2[5] & f27965M;
        int i10 = 1;
        long j15 = iArr[0] & f27965M;
        long j16 = j15 * j6;
        iArr3[0] = (int) j16;
        long j17 = (j15 * j10) + (j16 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = (j15 * j11) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j15 * j12) + (j18 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = (j15 * j13) + (j19 >>> 32);
        iArr3[4] = (int) j20;
        long j21 = (j15 * j14) + (j20 >>> 32);
        iArr3[5] = (int) j21;
        int i11 = 6;
        iArr3[6] = (int) (j21 >>> 32);
        while (true) {
            int i12 = i10;
            if (i12 >= i11) {
                return;
            }
            long j22 = iArr[i12] & f27965M;
            long j23 = (j22 * j6) + (iArr3[i12] & f27965M);
            iArr3[i12] = (int) j23;
            i10 = i12 + 1;
            long j24 = j13;
            long j25 = (j22 * j10) + (iArr3[i10] & f27965M) + (j23 >>> 32);
            iArr3[i10] = (int) j25;
            long j26 = (j22 * j11) + (iArr3[r5] & f27965M) + (j25 >>> 32);
            iArr3[i12 + 2] = (int) j26;
            long j27 = (j22 * j12) + (iArr3[r5] & f27965M) + (j26 >>> 32);
            iArr3[i12 + 3] = (int) j27;
            long j28 = (j22 * j24) + (iArr3[r5] & f27965M) + (j27 >>> 32);
            iArr3[i12 + 4] = (int) j28;
            long j29 = (j22 * j14) + (iArr3[r5] & f27965M) + (j28 >>> 32);
            iArr3[i12 + 5] = (int) j29;
            iArr3[i12 + 6] = (int) (j29 >>> 32);
            j13 = j24;
            i11 = 6;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j6 = iArr2[0] & f27965M;
        long j10 = iArr2[1] & f27965M;
        long j11 = iArr2[2] & f27965M;
        long j12 = iArr2[3] & f27965M;
        long j13 = iArr2[4] & f27965M;
        long j14 = iArr2[5] & f27965M;
        long j15 = 0;
        while (i10 < 6) {
            long j16 = j6;
            int i11 = i10;
            long j17 = iArr[i10] & f27965M;
            long j18 = (iArr3[i11] & f27965M) + (j17 * j16);
            iArr3[i11] = (int) j18;
            int i12 = i11 + 1;
            long j19 = (j17 * j10) + (iArr3[i12] & f27965M) + (j18 >>> 32);
            iArr3[i12] = (int) j19;
            long j20 = (j17 * j11) + (iArr3[r15] & f27965M) + (j19 >>> 32);
            iArr3[i11 + 2] = (int) j20;
            long j21 = (j17 * j12) + (iArr3[r2] & f27965M) + (j20 >>> 32);
            iArr3[i11 + 3] = (int) j21;
            long j22 = (j17 * j13) + (iArr3[r2] & f27965M) + (j21 >>> 32);
            iArr3[i11 + 4] = (int) j22;
            long j23 = (j17 * j14) + (iArr3[r2] & f27965M) + (j22 >>> 32);
            iArr3[i11 + 5] = (int) j23;
            long j24 = (j23 >>> 32) + (iArr3[r2] & f27965M) + j15;
            iArr3[i11 + 6] = (int) j24;
            j15 = j24 >>> 32;
            i10 = i12;
            j6 = j16;
        }
        return (int) j15;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j6 = iArr[0] & f27965M;
        int i10 = 12;
        int i11 = 0;
        int i12 = 5;
        while (true) {
            int i13 = i12 - 1;
            long j10 = iArr[i12] & f27965M;
            long j11 = j10 * j10;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j11 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j11 >>> 1);
            i11 = (int) j11;
            if (i13 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i11 << 31) & f27965M);
                iArr2[0] = (int) j12;
                int i14 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[1] & f27965M;
                long j15 = iArr2[2] & f27965M;
                long j16 = (j14 * j6) + j13;
                int i15 = (int) j16;
                iArr2[1] = i14 | (i15 << 1);
                long j17 = iArr[2] & f27965M;
                long j18 = iArr2[3] & f27965M;
                long j19 = iArr2[4] & f27965M;
                long j20 = (j17 * j6) + j15 + (j16 >>> 32);
                int i16 = (int) j20;
                iArr2[2] = (i16 << 1) | (i15 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j17, j14, j20 >>> 32, j18);
                long j21 = j19 + (jM9729c >>> 32);
                long j22 = jM9729c & f27965M;
                long j23 = iArr[3] & f27965M;
                long j24 = (iArr2[5] & f27965M) + (j21 >>> 32);
                long j25 = j21 & f27965M;
                long j26 = (iArr2[6] & f27965M) + (j24 >>> 32);
                long j27 = j24 & f27965M;
                long j28 = (j23 * j6) + j22;
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long jM9729c2 = AbstractC4801l.m9729c(j23, j14, j28 >>> 32, j25);
                long jM9729c3 = AbstractC4801l.m9729c(j23, j17, jM9729c2 >>> 32, j27);
                long j29 = jM9729c2 & f27965M;
                long j30 = j26 + (jM9729c3 >>> 32);
                long j31 = jM9729c3 & f27965M;
                long j32 = iArr[4] & f27965M;
                long j33 = (iArr2[7] & f27965M) + (j30 >>> 32);
                long j34 = j30 & f27965M;
                long j35 = (iArr2[8] & f27965M) + (j33 >>> 32);
                long j36 = j33 & f27965M;
                long j37 = (j32 * j6) + j29;
                int i19 = (int) j37;
                iArr2[4] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                long jM9729c4 = AbstractC4801l.m9729c(j32, j14, j37 >>> 32, j31);
                long jM9729c5 = AbstractC4801l.m9729c(j32, j17, jM9729c4 >>> 32, j34);
                long j38 = jM9729c4 & f27965M;
                long jM9729c6 = AbstractC4801l.m9729c(j32, j23, jM9729c5 >>> 32, j36);
                long j39 = jM9729c5 & f27965M;
                long j40 = j35 + (jM9729c6 >>> 32);
                long j41 = jM9729c6 & f27965M;
                long j42 = iArr[5] & f27965M;
                long j43 = (iArr2[9] & f27965M) + (j40 >>> 32);
                long j44 = j40 & f27965M;
                long j45 = (iArr2[10] & f27965M) + (j43 >>> 32);
                long j46 = j43 & f27965M;
                long j47 = (j42 * j6) + j38;
                int i21 = (int) j47;
                iArr2[5] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j42, j14, j47 >>> 32, j39);
                long jM9729c8 = AbstractC4801l.m9729c(j42, j17, jM9729c7 >>> 32, j41);
                long jM9729c9 = AbstractC4801l.m9729c(j42, j23, jM9729c8 >>> 32, j44);
                long jM9729c10 = AbstractC4801l.m9729c(j42, j32, jM9729c9 >>> 32, j46);
                long j48 = j45 + (jM9729c10 >>> 32);
                int i23 = (int) jM9729c7;
                iArr2[6] = (i23 << 1) | i22;
                int i24 = (int) jM9729c8;
                iArr2[7] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jM9729c9;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) jM9729c10;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j48;
                iArr2[10] = i29 | (i30 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j48 >>> 32))) << 1) | (i30 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27965M) - (iArr2[0] & f27965M);
        iArr3[0] = (int) j6;
        long j10 = ((iArr[1] & f27965M) - (iArr2[1] & f27965M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = ((iArr[2] & f27965M) - (iArr2[2] & f27965M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = ((iArr[3] & f27965M) - (iArr2[3] & f27965M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = ((iArr[4] & f27965M) - (iArr2[4] & f27965M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = ((iArr[5] & f27965M) - (iArr2[5] & f27965M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j6 = (iArr2[0] & f27965M) - (iArr[0] & f27965M);
        iArr2[0] = (int) j6;
        long j10 = ((iArr2[1] & f27965M) - (iArr[1] & f27965M)) + (j6 >> 32);
        iArr2[1] = (int) j10;
        long j11 = ((iArr2[2] & f27965M) - (iArr[2] & f27965M)) + (j10 >> 32);
        iArr2[2] = (int) j11;
        long j12 = ((iArr2[3] & f27965M) - (iArr[3] & f27965M)) + (j11 >> 32);
        iArr2[3] = (int) j12;
        long j13 = ((iArr2[4] & f27965M) - (iArr[4] & f27965M)) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = ((iArr2[5] & f27965M) - (f27965M & iArr[5])) + (j13 >> 32);
        iArr2[5] = (int) j14;
        return (int) (j14 >> 32);
    }
}
