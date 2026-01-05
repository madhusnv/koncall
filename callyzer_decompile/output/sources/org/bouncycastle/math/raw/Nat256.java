package org.bouncycastle.math.raw;

import java.math.BigInteger;
import mm.AbstractC4801l;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public abstract class Nat256 {

    /* renamed from: M */
    private static final long f27967M = 4294967295L;

    public static int add(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27967M) + (iArr2[i11] & f27967M);
        iArr3[i12] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27967M) + (iArr2[i11 + 1] & f27967M) + (j6 >>> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27967M) + (iArr2[i11 + 2] & f27967M) + (j10 >>> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27967M) + (iArr2[i11 + 3] & f27967M) + (j11 >>> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27967M) + (iArr2[i11 + 4] & f27967M) + (j12 >>> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27967M) + (iArr2[i11 + 5] & f27967M) + (j13 >>> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27967M) + (iArr2[i11 + 6] & f27967M) + (j14 >>> 32);
        iArr3[i12 + 6] = (int) j15;
        long j16 = (iArr[i10 + 7] & f27967M) + (iArr2[i11 + 7] & f27967M) + (j15 >>> 32);
        iArr3[i12 + 7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27967M) + (iArr2[i11] & f27967M) + (iArr3[i12] & f27967M);
        iArr3[i12] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27967M) + (iArr2[i11 + 1] & f27967M) + (iArr3[r7] & f27967M) + (j6 >>> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27967M) + (iArr2[i11 + 2] & f27967M) + (iArr3[r7] & f27967M) + (j10 >>> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27967M) + (iArr2[i11 + 3] & f27967M) + (iArr3[r7] & f27967M) + (j11 >>> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27967M) + (iArr2[i11 + 4] & f27967M) + (iArr3[r7] & f27967M) + (j12 >>> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27967M) + (iArr2[i11 + 5] & f27967M) + (iArr3[r7] & f27967M) + (j13 >>> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27967M) + (iArr2[i11 + 6] & f27967M) + (iArr3[r7] & f27967M) + (j14 >>> 32);
        iArr3[i12 + 6] = (int) j15;
        long j16 = (iArr[i10 + 7] & f27967M) + (iArr2[i11 + 7] & f27967M) + (iArr3[r15] & f27967M) + (j15 >>> 32);
        iArr3[i12 + 7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j6 = (iArr[i10] & f27967M) + (iArr2[i11] & f27967M) + (i12 & f27967M);
        iArr2[i11] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27967M) + (iArr2[r6] & f27967M) + (j6 >>> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27967M) + (iArr2[r6] & f27967M) + (j10 >>> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27967M) + (iArr2[r6] & f27967M) + (j11 >>> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27967M) + (iArr2[r6] & f27967M) + (j12 >>> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27967M) + (iArr2[r6] & f27967M) + (j13 >>> 32);
        iArr2[i11 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27967M) + (iArr2[r6] & f27967M) + (j14 >>> 32);
        iArr2[i11 + 6] = (int) j15;
        long j16 = (iArr[i10 + 7] & f27967M) + (f27967M & iArr2[r12]) + (j15 >>> 32);
        iArr2[i11 + 7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr[i10] & f27967M) + (iArr2[i11] & f27967M);
        int i12 = (int) j6;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j10 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j6 >>> 32);
        int i13 = (int) j10;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j11 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j10 >>> 32);
        int i14 = (int) j11;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j12 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j11 >>> 32);
        int i15 = (int) j12;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j13 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j12 >>> 32);
        int i16 = (int) j13;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j14 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j13 >>> 32);
        int i17 = (int) j14;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        long j15 = (iArr[r5] & f27967M) + (iArr2[r8] & f27967M) + (j14 >>> 32);
        int i18 = (int) j15;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        long j16 = (iArr[r12] & f27967M) + (f27967M & iArr2[r14]) + (j15 >>> 32);
        int i19 = (int) j16;
        iArr[i10 + 7] = i19;
        iArr2[i11 + 7] = i19;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
        iArr2[i11 + 7] = iArr[i10 + 7];
    }

    public static void copy64(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11] = jArr[i10];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i10 = 7; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i10 = 0; i10 < 8; i10++) {
            iArrCreate[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i10 = 0; i10 < 4; i10++) {
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
            if ((i10 & 255) != i10) {
                return 0;
            }
            i11 = iArr[i10 >>> 5] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 7; i12 >= 0; i12--) {
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
        for (int i10 = 1; i10 < 8; i10++) {
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
        for (int i10 = 1; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27967M;
        long j10 = iArr2[i11 + 1] & f27967M;
        long j11 = iArr2[i11 + 2] & f27967M;
        long j12 = iArr2[i11 + 3] & f27967M;
        long j13 = iArr2[i11 + 4] & f27967M;
        long j14 = iArr2[i11 + 5] & f27967M;
        long j15 = iArr2[i11 + 6] & f27967M;
        long j16 = iArr2[i11 + 7] & f27967M;
        long j17 = iArr[i10] & f27967M;
        long j18 = j17 * j6;
        iArr3[i12] = (int) j18;
        long j19 = (j17 * j10) + (j18 >>> 32);
        iArr3[i12 + 1] = (int) j19;
        long j20 = (j17 * j11) + (j19 >>> 32);
        iArr3[i12 + 2] = (int) j20;
        long j21 = (j17 * j12) + (j20 >>> 32);
        iArr3[i12 + 3] = (int) j21;
        long j22 = (j17 * j13) + (j21 >>> 32);
        iArr3[i12 + 4] = (int) j22;
        long j23 = (j17 * j14) + (j22 >>> 32);
        iArr3[i12 + 5] = (int) j23;
        long j24 = (j17 * j15) + (j23 >>> 32);
        iArr3[i12 + 6] = (int) j24;
        long j25 = (j17 * j16) + (j24 >>> 32);
        iArr3[i12 + 7] = (int) j25;
        iArr3[i12 + 8] = (int) (j25 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 8) {
            int i15 = i14 + 1;
            int i16 = i14;
            long j26 = iArr[i10 + i13] & f27967M;
            long j27 = (j26 * j6) + (iArr3[i15] & f27967M);
            iArr3[i15] = (int) j27;
            long j28 = (j26 * j10) + (iArr3[r3] & f27967M) + (j27 >>> 32);
            iArr3[i16 + 2] = (int) j28;
            long j29 = (j26 * j11) + (iArr3[r24] & f27967M) + (j28 >>> 32);
            iArr3[i16 + 3] = (int) j29;
            long j30 = (j26 * j12) + (iArr3[r24] & f27967M) + (j29 >>> 32);
            iArr3[i16 + 4] = (int) j30;
            long j31 = (j26 * j13) + (iArr3[r24] & f27967M) + (j30 >>> 32);
            iArr3[i16 + 5] = (int) j31;
            long j32 = (j26 * j14) + (iArr3[r24] & f27967M) + (j31 >>> 32);
            iArr3[i16 + 6] = (int) j32;
            long j33 = (j26 * j15) + (iArr3[r24] & f27967M) + (j32 >>> 32);
            iArr3[i16 + 7] = (int) j33;
            long j34 = (j26 * j16) + (iArr3[r24] & f27967M) + (j33 >>> 32);
            iArr3[i16 + 8] = (int) j34;
            iArr3[i16 + 9] = (int) (j34 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = iArr[0] & f27967M;
        long j10 = iArr[1] & f27967M;
        long j11 = iArr[2] & f27967M;
        long j12 = iArr[3] & f27967M;
        long j13 = iArr[4] & f27967M;
        long j14 = iArr[5] & f27967M;
        long j15 = iArr[6] & f27967M;
        long j16 = iArr[7] & f27967M;
        long j17 = iArr2[0] & f27967M;
        long j18 = j17 * j6;
        iArr3[0] = (int) j18;
        long j19 = (j17 * j10) + (j18 >>> 32);
        iArr3[1] = (int) j19;
        long j20 = (j17 * j11) + (j19 >>> 32);
        iArr3[2] = (int) j20;
        long j21 = (j17 * j12) + (j20 >>> 32);
        iArr3[3] = (int) j21;
        long j22 = (j17 * j13) + (j21 >>> 32);
        iArr3[4] = (int) j22;
        long j23 = (j17 * j14) + (j22 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = (j17 * j15) + (j23 >>> 32);
        iArr3[6] = (int) j24;
        long j25 = (j17 * j16) + (j24 >>> 32);
        iArr3[7] = (int) j25;
        iArr3[8] = (int) (j25 >>> 32);
        int i10 = 1;
        for (int i11 = 4; i10 < i11; i11 = 4) {
            long j26 = iArr2[i10] & f27967M;
            long j27 = j13;
            long j28 = (j26 * j6) + (iArr3[i10] & f27967M);
            iArr3[i10] = (int) j28;
            int i12 = i10 + 1;
            long j29 = (j26 * j10) + (iArr3[i12] & f27967M) + (j28 >>> 32);
            iArr3[i12] = (int) j29;
            long j30 = (j26 * j11) + (iArr3[r25] & f27967M) + (j29 >>> 32);
            iArr3[i10 + 2] = (int) j30;
            long j31 = (j26 * j12) + (iArr3[r25] & f27967M) + (j30 >>> 32);
            iArr3[i10 + 3] = (int) j31;
            long j32 = (j26 * j27) + (iArr3[r25] & f27967M) + (j31 >>> 32);
            iArr3[i10 + 4] = (int) j32;
            long j33 = (j26 * j14) + (iArr3[r25] & f27967M) + (j32 >>> 32);
            iArr3[i10 + 5] = (int) j33;
            long j34 = (j26 * j15) + (iArr3[r25] & f27967M) + (j33 >>> 32);
            iArr3[i10 + 6] = (int) j34;
            long j35 = j34 >>> 32;
            long j36 = (j26 * j16) + (iArr3[r14] & f27967M) + j35;
            iArr3[i10 + 7] = (int) j36;
            iArr3[i10 + 8] = (int) (j36 >>> 32);
            i10 = i12;
            j13 = j27;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j6 = i10 & f27967M;
        long j10 = iArr[i11] & f27967M;
        long j11 = (j6 * j10) + (iArr2[i12] & f27967M);
        iArr3[i13] = (int) j11;
        long j12 = iArr[i11 + 1] & f27967M;
        long j13 = (j6 * j12) + j10 + (iArr2[i12 + 1] & f27967M) + (j11 >>> 32);
        iArr3[i13 + 1] = (int) j13;
        long j14 = iArr[i11 + 2] & f27967M;
        long j15 = (j6 * j14) + j12 + (iArr2[i12 + 2] & f27967M) + (j13 >>> 32);
        iArr3[i13 + 2] = (int) j15;
        long j16 = iArr[i11 + 3] & f27967M;
        long j17 = (j6 * j16) + j14 + (iArr2[i12 + 3] & f27967M) + (j15 >>> 32);
        iArr3[i13 + 3] = (int) j17;
        long j18 = iArr[i11 + 4] & f27967M;
        long j19 = (j6 * j18) + j16 + (iArr2[i12 + 4] & f27967M) + (j17 >>> 32);
        iArr3[i13 + 4] = (int) j19;
        long j20 = iArr[i11 + 5] & f27967M;
        long j21 = (j6 * j20) + j18 + (iArr2[i12 + 5] & f27967M) + (j19 >>> 32);
        iArr3[i13 + 5] = (int) j21;
        long j22 = iArr[i11 + 6] & f27967M;
        long j23 = (j6 * j22) + j20 + (iArr2[i12 + 6] & f27967M) + (j21 >>> 32);
        iArr3[i13 + 6] = (int) j23;
        long j24 = iArr[i11 + 7] & f27967M;
        long j25 = (j6 * j24) + j22 + (f27967M & iArr2[i12 + 7]) + (j23 >>> 32);
        iArr3[i13 + 7] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int mul33DWordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27967M;
        long j11 = j6 & f27967M;
        long j12 = (j10 * j11) + (iArr[i11] & f27967M);
        iArr[i11] = (int) j12;
        long j13 = j6 >>> 32;
        long j14 = (j10 * j13) + j11;
        long j15 = j14 + (iArr[r4] & f27967M) + (j12 >>> 32);
        iArr[i11 + 1] = (int) j15;
        long j16 = j13 + (iArr[r4] & f27967M) + (j15 >>> 32);
        iArr[i11 + 2] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[r0] & f27967M);
        iArr[i11 + 3] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
        long j6 = i10 & f27967M;
        long j10 = i11 & f27967M;
        long j11 = (j6 * j10) + (iArr[i12] & f27967M);
        iArr[i12] = (int) j11;
        long j12 = j10 + (iArr[r5] & f27967M) + (j11 >>> 32);
        iArr[i12 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[r0] & f27967M);
        iArr[i12 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27967M;
        long j10 = iArr2[i11 + 1] & f27967M;
        long j11 = iArr2[i11 + 2] & f27967M;
        long j12 = iArr2[i11 + 3] & f27967M;
        long j13 = iArr2[i11 + 4] & f27967M;
        long j14 = iArr2[i11 + 5] & f27967M;
        long j15 = iArr2[i11 + 6] & f27967M;
        long j16 = iArr2[i11 + 7] & f27967M;
        int i13 = i12;
        int i14 = 0;
        long j17 = 0;
        while (i14 < 8) {
            long j18 = j10;
            long j19 = iArr[i10 + i14] & f27967M;
            long j20 = (j19 * j6) + (iArr3[i13] & f27967M);
            iArr3[i13] = (int) j20;
            int i15 = i13 + 1;
            long j21 = (j19 * j18) + (iArr3[i15] & f27967M) + (j20 >>> 32);
            iArr3[i15] = (int) j21;
            int i16 = i14;
            long j22 = (j19 * j11) + (iArr3[r5] & f27967M) + (j21 >>> 32);
            iArr3[i13 + 2] = (int) j22;
            long j23 = (j19 * j12) + (iArr3[r0] & f27967M) + (j22 >>> 32);
            iArr3[i13 + 3] = (int) j23;
            long j24 = (j19 * j13) + (iArr3[r0] & f27967M) + (j23 >>> 32);
            iArr3[i13 + 4] = (int) j24;
            long j25 = (j19 * j14) + (iArr3[r0] & f27967M) + (j24 >>> 32);
            iArr3[i13 + 5] = (int) j25;
            long j26 = (j19 * j15) + (iArr3[r0] & f27967M) + (j25 >>> 32);
            iArr3[i13 + 6] = (int) j26;
            long j27 = (j19 * j16) + (iArr3[r0] & f27967M) + (j26 >>> 32);
            iArr3[i13 + 7] = (int) j27;
            long j28 = (j27 >>> 32) + (iArr3[r16] & f27967M) + j17;
            iArr3[i13 + 8] = (int) j28;
            j17 = j28 >>> 32;
            i14 = i16 + 1;
            j10 = j18;
            i13 = i15;
        }
        return (int) j17;
    }

    public static int mulByWord(int i10, int[] iArr) {
        long j6 = i10 & f27967M;
        long j10 = (iArr[0] & f27967M) * j6;
        iArr[0] = (int) j10;
        long j11 = ((iArr[1] & f27967M) * j6) + (j10 >>> 32);
        iArr[1] = (int) j11;
        long j12 = ((iArr[2] & f27967M) * j6) + (j11 >>> 32);
        iArr[2] = (int) j12;
        long j13 = ((iArr[3] & f27967M) * j6) + (j12 >>> 32);
        iArr[3] = (int) j13;
        long j14 = ((iArr[4] & f27967M) * j6) + (j13 >>> 32);
        iArr[4] = (int) j14;
        long j15 = ((iArr[5] & f27967M) * j6) + (j14 >>> 32);
        iArr[5] = (int) j15;
        long j16 = ((iArr[6] & f27967M) * j6) + (j15 >>> 32);
        iArr[6] = (int) j16;
        long j17 = (j6 * (f27967M & iArr[7])) + (j16 >>> 32);
        iArr[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulByWordAddTo(int i10, int[] iArr, int[] iArr2) {
        long j6 = i10 & f27967M;
        long j10 = ((iArr2[0] & f27967M) * j6) + (iArr[0] & f27967M);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & f27967M) * j6) + (iArr[1] & f27967M) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & f27967M) * j6) + (iArr[2] & f27967M) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & f27967M) * j6) + (iArr[3] & f27967M) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = ((iArr2[4] & f27967M) * j6) + (iArr[4] & f27967M) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = ((iArr2[5] & f27967M) * j6) + (iArr[5] & f27967M) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = ((iArr2[6] & f27967M) * j6) + (iArr[6] & f27967M) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (j6 * (iArr2[7] & f27967M)) + (f27967M & iArr[7]) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j6 = i10 & f27967M;
        long j10 = 0;
        int i12 = 0;
        do {
            long j11 = ((iArr[i12] & f27967M) * j6) + j10;
            iArr2[i11 + i12] = (int) j11;
            j10 = j11 >>> 32;
            i12++;
        } while (i12 < 8);
        return (int) j10;
    }

    public static int mulWordAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j6 = i10 & f27967M;
        long j10 = ((iArr[i11] & f27967M) * j6) + (iArr2[i12] & f27967M);
        iArr2[i12] = (int) j10;
        long j11 = ((iArr[i11 + 1] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j10 >>> 32);
        iArr2[i12 + 1] = (int) j11;
        long j12 = ((iArr[i11 + 2] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j11 >>> 32);
        iArr2[i12 + 2] = (int) j12;
        long j13 = ((iArr[i11 + 3] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j12 >>> 32);
        iArr2[i12 + 3] = (int) j13;
        long j14 = ((iArr[i11 + 4] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j13 >>> 32);
        iArr2[i12 + 4] = (int) j14;
        long j15 = ((iArr[i11 + 5] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j14 >>> 32);
        iArr2[i12 + 5] = (int) j15;
        long j16 = ((iArr[i11 + 6] & f27967M) * j6) + (iArr2[r8] & f27967M) + (j15 >>> 32);
        iArr2[i12 + 6] = (int) j16;
        long j17 = (j6 * (iArr[i11 + 7] & f27967M)) + (iArr2[r15] & f27967M) + (j16 >>> 32);
        iArr2[i12 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27967M;
        long j11 = ((j6 & f27967M) * j10) + (iArr[i11] & f27967M);
        iArr[i11] = (int) j11;
        long j12 = j10 * (j6 >>> 32);
        long j13 = j12 + (iArr[r9] & f27967M) + (j11 >>> 32);
        iArr[i11 + 1] = (int) j13;
        long j14 = j13 >>> 32;
        long j15 = j14 + (iArr[r0] & f27967M);
        iArr[i11 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = iArr[i10] & f27967M;
        int i12 = 0;
        int i13 = 16;
        int i14 = 7;
        while (true) {
            int i15 = i14 - 1;
            long j10 = iArr[i10 + i14] & f27967M;
            long j11 = j10 * j10;
            iArr2[(i13 - 1) + i11] = (i12 << 31) | ((int) (j11 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j11 >>> 1);
            i12 = (int) j11;
            if (i15 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i12 << 31) & f27967M);
                iArr2[i11] = (int) j12;
                int i16 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[i10 + 1] & f27967M;
                long j15 = iArr2[r8] & f27967M;
                long j16 = (j14 * j6) + j13;
                int i17 = (int) j16;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                long j17 = j15 + (j16 >>> 32);
                long j18 = iArr[i10 + 2] & f27967M;
                long j19 = iArr2[r9] & f27967M;
                long j20 = iArr2[r24] & f27967M;
                long j21 = (j18 * j6) + j17;
                int i18 = (int) j21;
                iArr2[i11 + 2] = (i18 << 1) | (i17 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j18, j14, j21 >>> 32, j19);
                long j22 = j20 + (jM9729c >>> 32);
                long j23 = jM9729c & f27967M;
                long j24 = iArr[i10 + 3] & f27967M;
                long j25 = (iArr2[r6] & f27967M) + (j22 >>> 32);
                long j26 = j22 & f27967M;
                long j27 = (iArr2[r2] & f27967M) + (j25 >>> 32);
                long j28 = j25 & f27967M;
                long j29 = (j24 * j6) + j23;
                int i19 = (int) j29;
                iArr2[i11 + 3] = (i18 >>> 31) | (i19 << 1);
                long jM9729c2 = AbstractC4801l.m9729c(j24, j14, j29 >>> 32, j26);
                long jM9729c3 = AbstractC4801l.m9729c(j24, j18, jM9729c2 >>> 32, j28);
                long j30 = jM9729c2 & f27967M;
                long j31 = j27 + (jM9729c3 >>> 32);
                long j32 = jM9729c3 & f27967M;
                long j33 = iArr[i10 + 4] & f27967M;
                long j34 = (iArr2[r4] & f27967M) + (j31 >>> 32);
                long j35 = j31 & f27967M;
                long j36 = (iArr2[r5] & f27967M) + (j34 >>> 32);
                long j37 = j34 & f27967M;
                long j38 = (j33 * j6) + j30;
                int i20 = (int) j38;
                iArr2[i11 + 4] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jM9729c4 = AbstractC4801l.m9729c(j33, j14, j38 >>> 32, j32);
                long jM9729c5 = AbstractC4801l.m9729c(j33, j18, jM9729c4 >>> 32, j35);
                long j39 = jM9729c4 & f27967M;
                long jM9729c6 = AbstractC4801l.m9729c(j33, j24, jM9729c5 >>> 32, j37);
                long j40 = jM9729c5 & f27967M;
                long j41 = j36 + (jM9729c6 >>> 32);
                long j42 = jM9729c6 & f27967M;
                long j43 = iArr[i10 + 5] & f27967M;
                long j44 = (iArr2[r10] & f27967M) + (j41 >>> 32);
                long j45 = j41 & f27967M;
                long j46 = (iArr2[r6] & f27967M) + (j44 >>> 32);
                long j47 = j44 & f27967M;
                long j48 = (j43 * j6) + j39;
                int i22 = (int) j48;
                iArr2[i11 + 5] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j43, j14, j48 >>> 32, j40);
                long jM9729c8 = AbstractC4801l.m9729c(j43, j18, jM9729c7 >>> 32, j42);
                long j49 = jM9729c7 & f27967M;
                long jM9729c9 = AbstractC4801l.m9729c(j43, j24, jM9729c8 >>> 32, j45);
                long j50 = jM9729c8 & f27967M;
                long jM9729c10 = AbstractC4801l.m9729c(j43, j33, jM9729c9 >>> 32, j47);
                long j51 = jM9729c9 & f27967M;
                long j52 = j46 + (jM9729c10 >>> 32);
                long j53 = jM9729c10 & f27967M;
                long j54 = iArr[i10 + 6] & f27967M;
                long j55 = (iArr2[r9] & f27967M) + (j52 >>> 32);
                long j56 = j52 & f27967M;
                long j57 = (iArr2[r11] & f27967M) + (j55 >>> 32);
                long j58 = j55 & f27967M;
                long j59 = (j54 * j6) + j49;
                int i24 = (int) j59;
                iArr2[i11 + 6] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long jM9729c11 = AbstractC4801l.m9729c(j54, j14, j59 >>> 32, j50);
                long jM9729c12 = AbstractC4801l.m9729c(j54, j18, jM9729c11 >>> 32, j51);
                long j60 = jM9729c11 & f27967M;
                long jM9729c13 = AbstractC4801l.m9729c(j54, j24, jM9729c12 >>> 32, j53);
                long j61 = jM9729c12 & f27967M;
                long jM9729c14 = AbstractC4801l.m9729c(j54, j33, jM9729c13 >>> 32, j56);
                long j62 = jM9729c13 & f27967M;
                long jM9729c15 = AbstractC4801l.m9729c(j54, j43, jM9729c14 >>> 32, j58);
                long j63 = jM9729c14 & f27967M;
                long j64 = j57 + (jM9729c15 >>> 32);
                long j65 = jM9729c15 & f27967M;
                long j66 = iArr[i10 + 7] & f27967M;
                long j67 = (iArr2[r3] & f27967M) + (j64 >>> 32);
                long j68 = j64 & f27967M;
                long j69 = (iArr2[r2] & f27967M) + (j67 >>> 32);
                long j70 = j67 & f27967M;
                long j71 = (j66 * j6) + j60;
                int i26 = (int) j71;
                iArr2[i11 + 7] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long jM9729c16 = AbstractC4801l.m9729c(j66, j14, j71 >>> 32, j61);
                long jM9729c17 = AbstractC4801l.m9729c(j66, j18, jM9729c16 >>> 32, j62);
                long jM9729c18 = AbstractC4801l.m9729c(j66, j24, jM9729c17 >>> 32, j63);
                long jM9729c19 = AbstractC4801l.m9729c(j66, j33, jM9729c18 >>> 32, j65);
                long jM9729c20 = AbstractC4801l.m9729c(j66, j43, jM9729c19 >>> 32, j68);
                long jM9729c21 = AbstractC4801l.m9729c(j66, j54, jM9729c20 >>> 32, j70);
                long j72 = j69 + (jM9729c21 >>> 32);
                int i28 = (int) jM9729c16;
                iArr2[i11 + 8] = (i28 << 1) | i27;
                int i29 = (int) jM9729c17;
                iArr2[i11 + 9] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) jM9729c18;
                iArr2[i11 + 10] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) jM9729c19;
                iArr2[i11 + 11] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) jM9729c20;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) jM9729c21;
                iArr2[i11 + 13] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j72;
                iArr2[i11 + 14] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i11 + 15;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j72 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27967M) - (iArr2[i11] & f27967M);
        iArr3[i12] = (int) j6;
        long j10 = ((iArr[i10 + 1] & f27967M) - (iArr2[i11 + 1] & f27967M)) + (j6 >> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = ((iArr[i10 + 2] & f27967M) - (iArr2[i11 + 2] & f27967M)) + (j10 >> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = ((iArr[i10 + 3] & f27967M) - (iArr2[i11 + 3] & f27967M)) + (j11 >> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = ((iArr[i10 + 4] & f27967M) - (iArr2[i11 + 4] & f27967M)) + (j12 >> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = ((iArr[i10 + 5] & f27967M) - (iArr2[i11 + 5] & f27967M)) + (j13 >> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = ((iArr[i10 + 6] & f27967M) - (iArr2[i11 + 6] & f27967M)) + (j14 >> 32);
        iArr3[i12 + 6] = (int) j15;
        long j16 = ((iArr[i10 + 7] & f27967M) - (iArr2[i11 + 7] & f27967M)) + (j15 >> 32);
        iArr3[i12 + 7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = ((iArr3[0] & f27967M) - (iArr[0] & f27967M)) - (iArr2[0] & f27967M);
        iArr3[0] = (int) j6;
        long j10 = (((iArr3[1] & f27967M) - (iArr[1] & f27967M)) - (iArr2[1] & f27967M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = (((iArr3[2] & f27967M) - (iArr[2] & f27967M)) - (iArr2[2] & f27967M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = (((iArr3[3] & f27967M) - (iArr[3] & f27967M)) - (iArr2[3] & f27967M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = (((iArr3[4] & f27967M) - (iArr[4] & f27967M)) - (iArr2[4] & f27967M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = (((iArr3[5] & f27967M) - (iArr[5] & f27967M)) - (iArr2[5] & f27967M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        long j15 = (((iArr3[6] & f27967M) - (iArr[6] & f27967M)) - (iArr2[6] & f27967M)) + (j14 >> 32);
        iArr3[6] = (int) j15;
        long j16 = (((iArr3[7] & f27967M) - (iArr[7] & f27967M)) - (iArr2[7] & f27967M)) + (j15 >> 32);
        iArr3[7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr2[i11] & f27967M) - (iArr[i10] & f27967M);
        iArr2[i11] = (int) j6;
        long j10 = ((iArr2[r5] & f27967M) - (iArr[i10 + 1] & f27967M)) + (j6 >> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = ((iArr2[r5] & f27967M) - (iArr[i10 + 2] & f27967M)) + (j10 >> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = ((iArr2[r5] & f27967M) - (iArr[i10 + 3] & f27967M)) + (j11 >> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = ((iArr2[r5] & f27967M) - (iArr[i10 + 4] & f27967M)) + (j12 >> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = ((iArr2[r5] & f27967M) - (iArr[i10 + 5] & f27967M)) + (j13 >> 32);
        iArr2[i11 + 5] = (int) j14;
        long j15 = ((iArr2[r5] & f27967M) - (iArr[i10 + 6] & f27967M)) + (j14 >> 32);
        iArr2[i11 + 6] = (int) j15;
        long j16 = ((iArr2[r13] & f27967M) - (iArr[i10 + 7] & f27967M)) + (j15 >> 32);
        iArr2[i11 + 7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (7 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 4; i10++) {
            long j6 = jArr[i10];
            if (j6 != 0) {
                Pack.longToBigEndian(j6, bArr, (3 - i10) << 3);
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
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27967M) + (iArr2[0] & f27967M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27967M) + (iArr2[1] & f27967M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27967M) + (iArr2[2] & f27967M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27967M) + (iArr2[3] & f27967M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27967M) + (iArr2[4] & f27967M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27967M) + (iArr2[5] & f27967M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (iArr[6] & f27967M) + (iArr2[6] & f27967M) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        long j16 = (iArr[7] & f27967M) + (iArr2[7] & f27967M) + (j15 >>> 32);
        iArr3[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27967M) + (iArr2[0] & f27967M) + (iArr3[0] & f27967M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27967M) + (iArr2[1] & f27967M) + (iArr3[1] & f27967M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27967M) + (iArr2[2] & f27967M) + (iArr3[2] & f27967M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27967M) + (iArr2[3] & f27967M) + (iArr3[3] & f27967M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27967M) + (iArr2[4] & f27967M) + (iArr3[4] & f27967M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27967M) + (iArr2[5] & f27967M) + (iArr3[5] & f27967M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (iArr[6] & f27967M) + (iArr2[6] & f27967M) + (iArr3[6] & f27967M) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        long j16 = (iArr[7] & f27967M) + (iArr2[7] & f27967M) + (iArr3[7] & f27967M) + (j15 >>> 32);
        iArr3[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j6 = (iArr[0] & f27967M) + (iArr2[0] & f27967M);
        iArr2[0] = (int) j6;
        long j10 = (iArr[1] & f27967M) + (iArr2[1] & f27967M) + (j6 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = (iArr[2] & f27967M) + (iArr2[2] & f27967M) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = (iArr[3] & f27967M) + (iArr2[3] & f27967M) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & f27967M) + (iArr2[4] & f27967M) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & f27967M) + (iArr2[5] & f27967M) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        long j15 = (iArr[6] & f27967M) + (iArr2[6] & f27967M) + (j14 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (iArr[7] & f27967M) + (f27967M & iArr2[7]) + (j15 >>> 32);
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
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
        long j6 = iArr2[0] & f27967M;
        long j10 = iArr2[1] & f27967M;
        long j11 = iArr2[2] & f27967M;
        long j12 = iArr2[3] & f27967M;
        long j13 = iArr2[4] & f27967M;
        long j14 = iArr2[5] & f27967M;
        long j15 = iArr2[6] & f27967M;
        long j16 = iArr2[7] & f27967M;
        long j17 = iArr[0] & f27967M;
        long j18 = j17 * j6;
        iArr3[0] = (int) j18;
        long j19 = (j17 * j10) + (j18 >>> 32);
        iArr3[1] = (int) j19;
        long j20 = (j17 * j11) + (j19 >>> 32);
        iArr3[2] = (int) j20;
        long j21 = (j17 * j12) + (j20 >>> 32);
        iArr3[3] = (int) j21;
        long j22 = (j17 * j13) + (j21 >>> 32);
        iArr3[4] = (int) j22;
        long j23 = (j17 * j14) + (j22 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = (j17 * j15) + (j23 >>> 32);
        iArr3[6] = (int) j24;
        long j25 = (j17 * j16) + (j24 >>> 32);
        iArr3[7] = (int) j25;
        int i10 = (int) (j25 >>> 32);
        iArr3[8] = i10;
        int i11 = 1;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            long j26 = iArr[i11] & f27967M;
            long j27 = j13;
            long j28 = (j26 * j6) + (iArr3[i11] & f27967M);
            iArr3[i11] = (int) j28;
            int i13 = i11 + 1;
            long j29 = (j26 * j10) + (iArr3[i13] & f27967M) + (j28 >>> 32);
            iArr3[i13] = (int) j29;
            long j30 = (j26 * j11) + (iArr3[r25] & f27967M) + (j29 >>> 32);
            iArr3[i11 + 2] = (int) j30;
            long j31 = (j26 * j12) + (iArr3[r25] & f27967M) + (j30 >>> 32);
            iArr3[i11 + 3] = (int) j31;
            long j32 = (j26 * j27) + (iArr3[r25] & f27967M) + (j31 >>> 32);
            iArr3[i11 + 4] = (int) j32;
            long j33 = (j26 * j14) + (iArr3[r25] & f27967M) + (j32 >>> 32);
            iArr3[i11 + 5] = (int) j33;
            long j34 = (j26 * j15) + (iArr3[r25] & f27967M) + (j33 >>> 32);
            iArr3[i11 + 6] = (int) j34;
            long j35 = j34 >>> 32;
            long j36 = (j26 * j16) + (iArr3[r14] & f27967M) + j35;
            iArr3[i11 + 7] = (int) j36;
            iArr3[i11 + 8] = (int) (j36 >>> 32);
            i11 = i13;
            j13 = j27;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = iArr2[0] & f27967M;
        long j10 = iArr2[1] & f27967M;
        long j11 = iArr2[2] & f27967M;
        long j12 = iArr2[3] & f27967M;
        long j13 = iArr2[4] & f27967M;
        long j14 = iArr2[5] & f27967M;
        long j15 = iArr2[6] & f27967M;
        long j16 = iArr2[7] & f27967M;
        long j17 = 0;
        int i10 = 0;
        while (i10 < 8) {
            long j18 = iArr[i10] & f27967M;
            long j19 = (j18 * j6) + (iArr3[i10] & f27967M);
            int i11 = i10;
            iArr3[i11] = (int) j19;
            int i12 = i11 + 1;
            long j20 = (j18 * j10) + (iArr3[i12] & f27967M) + (j19 >>> 32);
            iArr3[i12] = (int) j20;
            long j21 = (j18 * j11) + (iArr3[r4] & f27967M) + (j20 >>> 32);
            iArr3[i11 + 2] = (int) j21;
            long j22 = (j18 * j12) + (iArr3[r4] & f27967M) + (j21 >>> 32);
            iArr3[i11 + 3] = (int) j22;
            long j23 = (j18 * j13) + (iArr3[r4] & f27967M) + (j22 >>> 32);
            iArr3[i11 + 4] = (int) j23;
            long j24 = (j18 * j14) + (iArr3[r4] & f27967M) + (j23 >>> 32);
            iArr3[i11 + 5] = (int) j24;
            long j25 = (j18 * j15) + (iArr3[r4] & f27967M) + (j24 >>> 32);
            iArr3[i11 + 6] = (int) j25;
            long j26 = (j18 * j16) + (iArr3[r4] & f27967M) + (j25 >>> 32);
            iArr3[i11 + 7] = (int) j26;
            long j27 = (j26 >>> 32) + (iArr3[r4] & f27967M) + j17;
            iArr3[i11 + 8] = (int) j27;
            j17 = j27 >>> 32;
            i10 = i12;
        }
        return (int) j17;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j6 = iArr[0] & f27967M;
        int i10 = 16;
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i12 - 1;
            long j10 = iArr[i12] & f27967M;
            long j11 = j10 * j10;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j11 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j11 >>> 1);
            i11 = (int) j11;
            if (i13 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i11 << 31) & f27967M);
                iArr2[0] = (int) j12;
                int i14 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[1] & f27967M;
                long j15 = iArr2[2] & f27967M;
                long j16 = (j14 * j6) + j13;
                int i15 = (int) j16;
                iArr2[1] = i14 | (i15 << 1);
                long j17 = iArr[2] & f27967M;
                long j18 = iArr2[3] & f27967M;
                long j19 = iArr2[4] & f27967M;
                long j20 = (j17 * j6) + j15 + (j16 >>> 32);
                int i16 = (int) j20;
                iArr2[2] = (i16 << 1) | (i15 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j17, j14, j20 >>> 32, j18);
                long j21 = j19 + (jM9729c >>> 32);
                long j22 = jM9729c & f27967M;
                long j23 = iArr[3] & f27967M;
                long j24 = (iArr2[5] & f27967M) + (j21 >>> 32);
                long j25 = j21 & f27967M;
                long j26 = (iArr2[6] & f27967M) + (j24 >>> 32);
                long j27 = j24 & f27967M;
                long j28 = (j23 * j6) + j22;
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long jM9729c2 = AbstractC4801l.m9729c(j23, j14, j28 >>> 32, j25);
                long jM9729c3 = AbstractC4801l.m9729c(j23, j17, jM9729c2 >>> 32, j27);
                long j29 = jM9729c2 & f27967M;
                long j30 = j26 + (jM9729c3 >>> 32);
                long j31 = jM9729c3 & f27967M;
                long j32 = iArr[4] & f27967M;
                long j33 = (iArr2[7] & f27967M) + (j30 >>> 32);
                long j34 = j30 & f27967M;
                long j35 = (iArr2[8] & f27967M) + (j33 >>> 32);
                long j36 = j33 & f27967M;
                long j37 = (j32 * j6) + j29;
                int i19 = (int) j37;
                iArr2[4] = i18 | (i19 << 1);
                long jM9729c4 = AbstractC4801l.m9729c(j32, j14, j37 >>> 32, j31);
                long jM9729c5 = AbstractC4801l.m9729c(j32, j17, jM9729c4 >>> 32, j34);
                long j38 = jM9729c4 & f27967M;
                long jM9729c6 = AbstractC4801l.m9729c(j32, j23, jM9729c5 >>> 32, j36);
                long j39 = jM9729c5 & f27967M;
                long j40 = j35 + (jM9729c6 >>> 32);
                long j41 = jM9729c6 & f27967M;
                long j42 = iArr[5] & f27967M;
                long j43 = (iArr2[9] & f27967M) + (j40 >>> 32);
                long j44 = j40 & f27967M;
                long j45 = (iArr2[10] & f27967M) + (j43 >>> 32);
                long j46 = j43 & f27967M;
                long j47 = (j42 * j6) + j38;
                int i20 = (int) j47;
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j42, j14, j47 >>> 32, j39);
                long jM9729c8 = AbstractC4801l.m9729c(j42, j17, jM9729c7 >>> 32, j41);
                long j48 = jM9729c7 & f27967M;
                long jM9729c9 = AbstractC4801l.m9729c(j42, j23, jM9729c8 >>> 32, j44);
                long j49 = jM9729c8 & f27967M;
                long jM9729c10 = AbstractC4801l.m9729c(j42, j32, jM9729c9 >>> 32, j46);
                long j50 = jM9729c9 & f27967M;
                long j51 = j45 + (jM9729c10 >>> 32);
                long j52 = jM9729c10 & f27967M;
                long j53 = iArr[6] & f27967M;
                long j54 = (iArr2[11] & f27967M) + (j51 >>> 32);
                long j55 = j51 & f27967M;
                long j56 = (iArr2[12] & f27967M) + (j54 >>> 32);
                long j57 = j54 & f27967M;
                long j58 = (j53 * j6) + j48;
                int i22 = (int) j58;
                iArr2[6] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM9729c11 = AbstractC4801l.m9729c(j53, j14, j58 >>> 32, j49);
                long jM9729c12 = AbstractC4801l.m9729c(j53, j17, jM9729c11 >>> 32, j50);
                long j59 = jM9729c11 & f27967M;
                long jM9729c13 = AbstractC4801l.m9729c(j53, j23, jM9729c12 >>> 32, j52);
                long j60 = jM9729c12 & f27967M;
                long jM9729c14 = AbstractC4801l.m9729c(j53, j32, jM9729c13 >>> 32, j55);
                long j61 = jM9729c13 & f27967M;
                long jM9729c15 = AbstractC4801l.m9729c(j53, j42, jM9729c14 >>> 32, j57);
                long j62 = jM9729c14 & f27967M;
                long j63 = j56 + (jM9729c15 >>> 32);
                long j64 = jM9729c15 & f27967M;
                long j65 = iArr[7] & f27967M;
                long j66 = (iArr2[13] & f27967M) + (j63 >>> 32);
                long j67 = j63 & f27967M;
                long j68 = (iArr2[14] & f27967M) + (j66 >>> 32);
                long j69 = j66 & f27967M;
                long j70 = (j65 * j6) + j59;
                int i24 = (int) j70;
                iArr2[7] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long jM9729c16 = AbstractC4801l.m9729c(j65, j14, j70 >>> 32, j60);
                long jM9729c17 = AbstractC4801l.m9729c(j65, j17, jM9729c16 >>> 32, j61);
                long jM9729c18 = AbstractC4801l.m9729c(j65, j23, jM9729c17 >>> 32, j62);
                long jM9729c19 = AbstractC4801l.m9729c(j65, j32, jM9729c18 >>> 32, j64);
                long jM9729c20 = AbstractC4801l.m9729c(j65, j42, jM9729c19 >>> 32, j67);
                long jM9729c21 = AbstractC4801l.m9729c(j65, j53, jM9729c20 >>> 32, j69);
                long j71 = j68 + (jM9729c21 >>> 32);
                int i26 = (int) jM9729c16;
                iArr2[8] = (i26 << 1) | i25;
                int i27 = (int) jM9729c17;
                iArr2[9] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) jM9729c18;
                iArr2[10] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) jM9729c19;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) jM9729c20;
                iArr2[12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) jM9729c21;
                iArr2[13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j71;
                iArr2[14] = i36 | (i37 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j71 >>> 32))) << 1) | (i37 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27967M) - (iArr2[0] & f27967M);
        iArr3[0] = (int) j6;
        long j10 = ((iArr[1] & f27967M) - (iArr2[1] & f27967M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = ((iArr[2] & f27967M) - (iArr2[2] & f27967M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = ((iArr[3] & f27967M) - (iArr2[3] & f27967M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = ((iArr[4] & f27967M) - (iArr2[4] & f27967M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = ((iArr[5] & f27967M) - (iArr2[5] & f27967M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        long j15 = ((iArr[6] & f27967M) - (iArr2[6] & f27967M)) + (j14 >> 32);
        iArr3[6] = (int) j15;
        long j16 = ((iArr[7] & f27967M) - (iArr2[7] & f27967M)) + (j15 >> 32);
        iArr3[7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j6 = ((iArr2[i11] & f27967M) - (iArr[i10] & f27967M)) + (i12 & f27967M);
        iArr2[i11] = (int) j6;
        long j10 = j6 >> 32;
        long j11 = ((iArr2[r4] & f27967M) - (iArr[i10 + 1] & f27967M)) + j10;
        iArr2[i11 + 1] = (int) j11;
        long j12 = ((iArr2[r4] & f27967M) - (iArr[i10 + 2] & f27967M)) + (j11 >> 32);
        iArr2[i11 + 2] = (int) j12;
        long j13 = ((iArr2[r4] & f27967M) - (iArr[i10 + 3] & f27967M)) + (j12 >> 32);
        iArr2[i11 + 3] = (int) j13;
        long j14 = ((iArr2[r4] & f27967M) - (iArr[i10 + 4] & f27967M)) + (j13 >> 32);
        iArr2[i11 + 4] = (int) j14;
        long j15 = ((iArr2[r4] & f27967M) - (iArr[i10 + 5] & f27967M)) + (j14 >> 32);
        iArr2[i11 + 5] = (int) j15;
        long j16 = ((iArr2[r4] & f27967M) - (iArr[i10 + 6] & f27967M)) + (j15 >> 32);
        iArr2[i11 + 6] = (int) j16;
        long j17 = ((iArr2[r12] & f27967M) - (iArr[i10 + 7] & f27967M)) + (j16 >> 32);
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i10) {
        long j6 = (iArr[0] & f27967M) + (iArr2[0] & f27967M) + (i10 & f27967M);
        iArr2[0] = (int) j6;
        long j10 = (iArr[1] & f27967M) + (iArr2[1] & f27967M) + (j6 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = (iArr[2] & f27967M) + (iArr2[2] & f27967M) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = (iArr[3] & f27967M) + (iArr2[3] & f27967M) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & f27967M) + (iArr2[4] & f27967M) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & f27967M) + (iArr2[5] & f27967M) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        long j15 = (iArr[6] & f27967M) + (iArr2[6] & f27967M) + (j14 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (iArr[7] & f27967M) + (f27967M & iArr2[7]) + (j15 >>> 32);
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j6 = (iArr2[0] & f27967M) - (iArr[0] & f27967M);
        iArr2[0] = (int) j6;
        long j10 = ((iArr2[1] & f27967M) - (iArr[1] & f27967M)) + (j6 >> 32);
        iArr2[1] = (int) j10;
        long j11 = ((iArr2[2] & f27967M) - (iArr[2] & f27967M)) + (j10 >> 32);
        iArr2[2] = (int) j11;
        long j12 = ((iArr2[3] & f27967M) - (iArr[3] & f27967M)) + (j11 >> 32);
        iArr2[3] = (int) j12;
        long j13 = ((iArr2[4] & f27967M) - (iArr[4] & f27967M)) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = ((iArr2[5] & f27967M) - (iArr[5] & f27967M)) + (j13 >> 32);
        iArr2[5] = (int) j14;
        long j15 = ((iArr2[6] & f27967M) - (iArr[6] & f27967M)) + (j14 >> 32);
        iArr2[6] = (int) j15;
        long j16 = ((iArr2[7] & f27967M) - (f27967M & iArr[7])) + (j15 >> 32);
        iArr2[7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i10) {
        long j6 = ((iArr2[0] & f27967M) - (iArr[0] & f27967M)) + (i10 & f27967M);
        iArr2[0] = (int) j6;
        long j10 = ((iArr2[1] & f27967M) - (iArr[1] & f27967M)) + (j6 >> 32);
        iArr2[1] = (int) j10;
        long j11 = ((iArr2[2] & f27967M) - (iArr[2] & f27967M)) + (j10 >> 32);
        iArr2[2] = (int) j11;
        long j12 = ((iArr2[3] & f27967M) - (iArr[3] & f27967M)) + (j11 >> 32);
        iArr2[3] = (int) j12;
        long j13 = ((iArr2[4] & f27967M) - (iArr[4] & f27967M)) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = ((iArr2[5] & f27967M) - (iArr[5] & f27967M)) + (j13 >> 32);
        iArr2[5] = (int) j14;
        long j15 = ((iArr2[6] & f27967M) - (iArr[6] & f27967M)) + (j14 >> 32);
        iArr2[6] = (int) j15;
        long j16 = ((iArr2[7] & f27967M) - (f27967M & iArr[7])) + (j15 >> 32);
        iArr2[7] = (int) j16;
        return (int) (j16 >> 32);
    }
}
