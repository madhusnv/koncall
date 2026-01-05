package org.bouncycastle.math.raw;

import java.math.BigInteger;
import mm.AbstractC4801l;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public abstract class Nat224 {

    /* renamed from: M */
    private static final long f27966M = 4294967295L;

    public static int add(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27966M) + (iArr2[i11] & f27966M);
        iArr3[i12] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27966M) + (iArr2[i11 + 1] & f27966M) + (j6 >>> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27966M) + (iArr2[i11 + 2] & f27966M) + (j10 >>> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27966M) + (iArr2[i11 + 3] & f27966M) + (j11 >>> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27966M) + (iArr2[i11 + 4] & f27966M) + (j12 >>> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27966M) + (iArr2[i11 + 5] & f27966M) + (j13 >>> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27966M) + (iArr2[i11 + 6] & f27966M) + (j14 >>> 32);
        iArr3[i12 + 6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27966M) + (iArr2[i11] & f27966M) + (iArr3[i12] & f27966M);
        iArr3[i12] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27966M) + (iArr2[i11 + 1] & f27966M) + (iArr3[r7] & f27966M) + (j6 >>> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27966M) + (iArr2[i11 + 2] & f27966M) + (iArr3[r7] & f27966M) + (j10 >>> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27966M) + (iArr2[i11 + 3] & f27966M) + (iArr3[r7] & f27966M) + (j11 >>> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27966M) + (iArr2[i11 + 4] & f27966M) + (iArr3[r7] & f27966M) + (j12 >>> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27966M) + (iArr2[i11 + 5] & f27966M) + (iArr3[r7] & f27966M) + (j13 >>> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27966M) + (iArr2[i11 + 6] & f27966M) + (iArr3[r15] & f27966M) + (j14 >>> 32);
        iArr3[i12 + 6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j6 = (iArr[i10] & f27966M) + (iArr2[i11] & f27966M) + (i12 & f27966M);
        iArr2[i11] = (int) j6;
        long j10 = (iArr[i10 + 1] & f27966M) + (iArr2[r6] & f27966M) + (j6 >>> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = (iArr[i10 + 2] & f27966M) + (iArr2[r6] & f27966M) + (j10 >>> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = (iArr[i10 + 3] & f27966M) + (iArr2[r6] & f27966M) + (j11 >>> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = (iArr[i10 + 4] & f27966M) + (iArr2[r6] & f27966M) + (j12 >>> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = (iArr[i10 + 5] & f27966M) + (iArr2[r6] & f27966M) + (j13 >>> 32);
        iArr2[i11 + 5] = (int) j14;
        long j15 = (iArr[i10 + 6] & f27966M) + (f27966M & iArr2[r12]) + (j14 >>> 32);
        iArr2[i11 + 6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr[i10] & f27966M) + (iArr2[i11] & f27966M);
        int i12 = (int) j6;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j10 = (iArr[r5] & f27966M) + (iArr2[r8] & f27966M) + (j6 >>> 32);
        int i13 = (int) j10;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j11 = (iArr[r5] & f27966M) + (iArr2[r8] & f27966M) + (j10 >>> 32);
        int i14 = (int) j11;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j12 = (iArr[r5] & f27966M) + (iArr2[r8] & f27966M) + (j11 >>> 32);
        int i15 = (int) j12;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j13 = (iArr[r5] & f27966M) + (iArr2[r8] & f27966M) + (j12 >>> 32);
        int i16 = (int) j13;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j14 = (iArr[r5] & f27966M) + (iArr2[r8] & f27966M) + (j13 >>> 32);
        int i17 = (int) j14;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        long j15 = (iArr[r12] & f27966M) + (f27966M & iArr2[r14]) + (j14 >>> 32);
        int i18 = (int) j15;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
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
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i10 = 0; i10 < 7; i10++) {
            iArrCreate[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 7) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 6; i12 >= 0; i12--) {
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
        for (int i10 = 1; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27966M;
        long j10 = iArr2[i11 + 1] & f27966M;
        long j11 = iArr2[i11 + 2] & f27966M;
        long j12 = iArr2[i11 + 3] & f27966M;
        long j13 = iArr2[i11 + 4] & f27966M;
        long j14 = iArr2[i11 + 5] & f27966M;
        long j15 = iArr2[i11 + 6] & f27966M;
        long j16 = iArr[i10] & f27966M;
        long j17 = j16 * j6;
        iArr3[i12] = (int) j17;
        long j18 = (j16 * j10) + (j17 >>> 32);
        iArr3[i12 + 1] = (int) j18;
        long j19 = (j16 * j11) + (j18 >>> 32);
        iArr3[i12 + 2] = (int) j19;
        long j20 = (j16 * j12) + (j19 >>> 32);
        iArr3[i12 + 3] = (int) j20;
        long j21 = (j16 * j13) + (j20 >>> 32);
        iArr3[i12 + 4] = (int) j21;
        long j22 = (j16 * j14) + (j21 >>> 32);
        iArr3[i12 + 5] = (int) j22;
        long j23 = (j16 * j15) + (j22 >>> 32);
        iArr3[i12 + 6] = (int) j23;
        iArr3[i12 + 7] = (int) (j23 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 7) {
            int i15 = i14 + 1;
            int i16 = i14;
            long j24 = iArr[i10 + i13] & f27966M;
            long j25 = (j24 * j6) + (iArr3[i15] & f27966M);
            iArr3[i15] = (int) j25;
            long j26 = (j24 * j10) + (iArr3[r3] & f27966M) + (j25 >>> 32);
            iArr3[i16 + 2] = (int) j26;
            long j27 = (j24 * j11) + (iArr3[r22] & f27966M) + (j26 >>> 32);
            iArr3[i16 + 3] = (int) j27;
            long j28 = (j24 * j12) + (iArr3[r22] & f27966M) + (j27 >>> 32);
            iArr3[i16 + 4] = (int) j28;
            long j29 = (j24 * j13) + (iArr3[r22] & f27966M) + (j28 >>> 32);
            iArr3[i16 + 5] = (int) j29;
            long j30 = (j24 * j14) + (iArr3[r22] & f27966M) + (j29 >>> 32);
            iArr3[i16 + 6] = (int) j30;
            long j31 = (j24 * j15) + (iArr3[r22] & f27966M) + (j30 >>> 32);
            iArr3[i16 + 7] = (int) j31;
            iArr3[i16 + 8] = (int) (j31 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j6 = i10 & f27966M;
        long j10 = iArr[i11] & f27966M;
        long j11 = (j6 * j10) + (iArr2[i12] & f27966M);
        iArr3[i13] = (int) j11;
        long j12 = iArr[i11 + 1] & f27966M;
        long j13 = (j6 * j12) + j10 + (iArr2[i12 + 1] & f27966M) + (j11 >>> 32);
        iArr3[i13 + 1] = (int) j13;
        long j14 = iArr[i11 + 2] & f27966M;
        long j15 = (j6 * j14) + j12 + (iArr2[i12 + 2] & f27966M) + (j13 >>> 32);
        iArr3[i13 + 2] = (int) j15;
        long j16 = iArr[i11 + 3] & f27966M;
        long j17 = (j6 * j16) + j14 + (iArr2[i12 + 3] & f27966M) + (j15 >>> 32);
        iArr3[i13 + 3] = (int) j17;
        long j18 = iArr[i11 + 4] & f27966M;
        long j19 = (j6 * j18) + j16 + (iArr2[i12 + 4] & f27966M) + (j17 >>> 32);
        iArr3[i13 + 4] = (int) j19;
        long j20 = iArr[i11 + 5] & f27966M;
        long j21 = (j6 * j20) + j18 + (iArr2[i12 + 5] & f27966M) + (j19 >>> 32);
        iArr3[i13 + 5] = (int) j21;
        long j22 = iArr[i11 + 6] & f27966M;
        long j23 = (j6 * j22) + j20 + (f27966M & iArr2[i12 + 6]) + (j21 >>> 32);
        iArr3[i13 + 6] = (int) j23;
        return (j23 >>> 32) + j22;
    }

    public static int mul33DWordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27966M;
        long j11 = j6 & f27966M;
        long j12 = (j10 * j11) + (iArr[i11] & f27966M);
        iArr[i11] = (int) j12;
        long j13 = j6 >>> 32;
        long j14 = (j10 * j13) + j11;
        long j15 = j14 + (iArr[r4] & f27966M) + (j12 >>> 32);
        iArr[i11 + 1] = (int) j15;
        long j16 = j13 + (iArr[r4] & f27966M) + (j15 >>> 32);
        iArr[i11 + 2] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[r0] & f27966M);
        iArr[i11 + 3] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
        long j6 = i10 & f27966M;
        long j10 = i11 & f27966M;
        long j11 = (j6 * j10) + (iArr[i12] & f27966M);
        iArr[i12] = (int) j11;
        long j12 = j10 + (iArr[r5] & f27966M) + (j11 >>> 32);
        iArr[i12 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[r0] & f27966M);
        iArr[i12 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = iArr2[i11] & f27966M;
        long j10 = iArr2[i11 + 1] & f27966M;
        long j11 = iArr2[i11 + 2] & f27966M;
        long j12 = iArr2[i11 + 3] & f27966M;
        long j13 = iArr2[i11 + 4] & f27966M;
        long j14 = iArr2[i11 + 5] & f27966M;
        long j15 = iArr2[i11 + 6] & f27966M;
        int i13 = 0;
        int i14 = i12;
        long j16 = 0;
        while (i13 < 7) {
            int i15 = i13;
            long j17 = iArr[i10 + i13] & f27966M;
            long j18 = (j17 * j6) + (iArr3[i14] & f27966M);
            long j19 = j10;
            iArr3[i14] = (int) j18;
            int i16 = i14 + 1;
            long j20 = (j17 * j19) + (iArr3[i16] & f27966M) + (j18 >>> 32);
            iArr3[i16] = (int) j20;
            long j21 = (j17 * j11) + (iArr3[r4] & f27966M) + (j20 >>> 32);
            iArr3[i14 + 2] = (int) j21;
            long j22 = (j17 * j12) + (iArr3[r4] & f27966M) + (j21 >>> 32);
            iArr3[i14 + 3] = (int) j22;
            long j23 = (j17 * j13) + (iArr3[r4] & f27966M) + (j22 >>> 32);
            iArr3[i14 + 4] = (int) j23;
            long j24 = (j17 * j14) + (iArr3[r4] & f27966M) + (j23 >>> 32);
            iArr3[i14 + 5] = (int) j24;
            long j25 = (j17 * j15) + (iArr3[r4] & f27966M) + (j24 >>> 32);
            iArr3[i14 + 6] = (int) j25;
            long j26 = (j25 >>> 32) + (iArr3[r16] & f27966M) + j16;
            iArr3[i14 + 7] = (int) j26;
            j16 = j26 >>> 32;
            i13 = i15 + 1;
            i14 = i16;
            j10 = j19;
        }
        return (int) j16;
    }

    public static int mulByWord(int i10, int[] iArr) {
        long j6 = i10 & f27966M;
        long j10 = (iArr[0] & f27966M) * j6;
        iArr[0] = (int) j10;
        long j11 = ((iArr[1] & f27966M) * j6) + (j10 >>> 32);
        iArr[1] = (int) j11;
        long j12 = ((iArr[2] & f27966M) * j6) + (j11 >>> 32);
        iArr[2] = (int) j12;
        long j13 = ((iArr[3] & f27966M) * j6) + (j12 >>> 32);
        iArr[3] = (int) j13;
        long j14 = ((iArr[4] & f27966M) * j6) + (j13 >>> 32);
        iArr[4] = (int) j14;
        long j15 = ((iArr[5] & f27966M) * j6) + (j14 >>> 32);
        iArr[5] = (int) j15;
        long j16 = (j6 * (f27966M & iArr[6])) + (j15 >>> 32);
        iArr[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulByWordAddTo(int i10, int[] iArr, int[] iArr2) {
        long j6 = i10 & f27966M;
        long j10 = ((iArr2[0] & f27966M) * j6) + (iArr[0] & f27966M);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & f27966M) * j6) + (iArr[1] & f27966M) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & f27966M) * j6) + (iArr[2] & f27966M) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & f27966M) * j6) + (iArr[3] & f27966M) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = ((iArr2[4] & f27966M) * j6) + (iArr[4] & f27966M) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = ((iArr2[5] & f27966M) * j6) + (iArr[5] & f27966M) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (j6 * (iArr2[6] & f27966M)) + (f27966M & iArr[6]) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j6 = i10 & f27966M;
        long j10 = 0;
        int i12 = 0;
        do {
            long j11 = ((iArr[i12] & f27966M) * j6) + j10;
            iArr2[i11 + i12] = (int) j11;
            j10 = j11 >>> 32;
            i12++;
        } while (i12 < 7);
        return (int) j10;
    }

    public static int mulWordAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j6 = i10 & f27966M;
        long j10 = ((iArr[i11] & f27966M) * j6) + (iArr2[i12] & f27966M);
        iArr2[i12] = (int) j10;
        long j11 = ((iArr[i11 + 1] & f27966M) * j6) + (iArr2[r8] & f27966M) + (j10 >>> 32);
        iArr2[i12 + 1] = (int) j11;
        long j12 = ((iArr[i11 + 2] & f27966M) * j6) + (iArr2[r8] & f27966M) + (j11 >>> 32);
        iArr2[i12 + 2] = (int) j12;
        long j13 = ((iArr[i11 + 3] & f27966M) * j6) + (iArr2[r8] & f27966M) + (j12 >>> 32);
        iArr2[i12 + 3] = (int) j13;
        long j14 = ((iArr[i11 + 4] & f27966M) * j6) + (iArr2[r8] & f27966M) + (j13 >>> 32);
        iArr2[i12 + 4] = (int) j14;
        long j15 = ((iArr[i11 + 5] & f27966M) * j6) + (iArr2[r8] & f27966M) + (j14 >>> 32);
        iArr2[i12 + 5] = (int) j15;
        long j16 = (j6 * (iArr[i11 + 6] & f27966M)) + (iArr2[r15] & f27966M) + (j15 >>> 32);
        iArr2[i12 + 6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j6, int[] iArr, int i11) {
        long j10 = i10 & f27966M;
        long j11 = ((j6 & f27966M) * j10) + (iArr[i11] & f27966M);
        iArr[i11] = (int) j11;
        long j12 = j10 * (j6 >>> 32);
        long j13 = j12 + (iArr[r9] & f27966M) + (j11 >>> 32);
        iArr[i11 + 1] = (int) j13;
        long j14 = j13 >>> 32;
        long j15 = j14 + (iArr[r0] & f27966M);
        iArr[i11 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = iArr[i10] & f27966M;
        int i12 = 0;
        int i13 = 14;
        int i14 = 6;
        while (true) {
            int i15 = i14 - 1;
            long j10 = iArr[i10 + i14] & f27966M;
            long j11 = j10 * j10;
            iArr2[(i13 - 1) + i11] = (i12 << 31) | ((int) (j11 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j11 >>> 1);
            i12 = (int) j11;
            if (i15 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i12 << 31) & f27966M);
                iArr2[i11] = (int) j12;
                int i16 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[i10 + 1] & f27966M;
                long j15 = iArr2[r8] & f27966M;
                long j16 = (j14 * j6) + j13;
                int i17 = (int) j16;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                long j17 = j15 + (j16 >>> 32);
                long j18 = iArr[i10 + 2] & f27966M;
                long j19 = iArr2[r9] & f27966M;
                long j20 = iArr2[r24] & f27966M;
                long j21 = (j18 * j6) + j17;
                int i18 = (int) j21;
                iArr2[i11 + 2] = (i18 << 1) | (i17 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j18, j14, j21 >>> 32, j19);
                long j22 = j20 + (jM9729c >>> 32);
                long j23 = jM9729c & f27966M;
                long j24 = iArr[i10 + 3] & f27966M;
                long j25 = (iArr2[r6] & f27966M) + (j22 >>> 32);
                long j26 = j22 & f27966M;
                long j27 = (iArr2[r2] & f27966M) + (j25 >>> 32);
                long j28 = j25 & f27966M;
                long j29 = (j24 * j6) + j23;
                int i19 = (int) j29;
                iArr2[i11 + 3] = (i18 >>> 31) | (i19 << 1);
                long jM9729c2 = AbstractC4801l.m9729c(j24, j14, j29 >>> 32, j26);
                long jM9729c3 = AbstractC4801l.m9729c(j24, j18, jM9729c2 >>> 32, j28);
                long j30 = jM9729c2 & f27966M;
                long j31 = j27 + (jM9729c3 >>> 32);
                long j32 = jM9729c3 & f27966M;
                long j33 = iArr[i10 + 4] & f27966M;
                long j34 = (iArr2[r4] & f27966M) + (j31 >>> 32);
                long j35 = j31 & f27966M;
                long j36 = (iArr2[r5] & f27966M) + (j34 >>> 32);
                long j37 = j34 & f27966M;
                long j38 = (j33 * j6) + j30;
                int i20 = (int) j38;
                iArr2[i11 + 4] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jM9729c4 = AbstractC4801l.m9729c(j33, j14, j38 >>> 32, j32);
                long jM9729c5 = AbstractC4801l.m9729c(j33, j18, jM9729c4 >>> 32, j35);
                long j39 = jM9729c4 & f27966M;
                long jM9729c6 = AbstractC4801l.m9729c(j33, j24, jM9729c5 >>> 32, j37);
                long j40 = jM9729c5 & f27966M;
                long j41 = j36 + (jM9729c6 >>> 32);
                long j42 = jM9729c6 & f27966M;
                long j43 = iArr[i10 + 5] & f27966M;
                long j44 = (iArr2[r10] & f27966M) + (j41 >>> 32);
                long j45 = j41 & f27966M;
                long j46 = (iArr2[r6] & f27966M) + (j44 >>> 32);
                long j47 = j44 & f27966M;
                long j48 = (j43 * j6) + j39;
                int i22 = (int) j48;
                iArr2[i11 + 5] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j43, j14, j48 >>> 32, j40);
                long jM9729c8 = AbstractC4801l.m9729c(j43, j18, jM9729c7 >>> 32, j42);
                long j49 = jM9729c7 & f27966M;
                long jM9729c9 = AbstractC4801l.m9729c(j43, j24, jM9729c8 >>> 32, j45);
                long j50 = jM9729c8 & f27966M;
                long jM9729c10 = AbstractC4801l.m9729c(j43, j33, jM9729c9 >>> 32, j47);
                long j51 = jM9729c9 & f27966M;
                long j52 = j46 + (jM9729c10 >>> 32);
                long j53 = jM9729c10 & f27966M;
                long j54 = iArr[i10 + 6] & f27966M;
                long j55 = (iArr2[r9] & f27966M) + (j52 >>> 32);
                long j56 = j52 & f27966M;
                long j57 = (iArr2[r11] & f27966M) + (j55 >>> 32);
                long j58 = j55 & f27966M;
                long j59 = (j54 * j6) + j49;
                int i24 = (int) j59;
                iArr2[i11 + 6] = (i24 << 1) | i23;
                long jM9729c11 = AbstractC4801l.m9729c(j54, j14, j59 >>> 32, j50);
                long jM9729c12 = AbstractC4801l.m9729c(j54, j18, jM9729c11 >>> 32, j51);
                long jM9729c13 = AbstractC4801l.m9729c(j54, j24, jM9729c12 >>> 32, j53);
                long jM9729c14 = AbstractC4801l.m9729c(j54, j33, jM9729c13 >>> 32, j56);
                long jM9729c15 = AbstractC4801l.m9729c(j54, j43, jM9729c14 >>> 32, j58);
                long j60 = j57 + (jM9729c15 >>> 32);
                int i25 = (int) jM9729c11;
                iArr2[i11 + 7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) jM9729c12;
                iArr2[i11 + 8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) jM9729c13;
                iArr2[i11 + 9] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) jM9729c14;
                iArr2[i11 + 10] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) jM9729c15;
                iArr2[i11 + 11] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j60;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = i11 + 13;
                iArr2[i37] = i36 | ((iArr2[i37] + ((int) (j60 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j6 = (iArr[i10] & f27966M) - (iArr2[i11] & f27966M);
        iArr3[i12] = (int) j6;
        long j10 = ((iArr[i10 + 1] & f27966M) - (iArr2[i11 + 1] & f27966M)) + (j6 >> 32);
        iArr3[i12 + 1] = (int) j10;
        long j11 = ((iArr[i10 + 2] & f27966M) - (iArr2[i11 + 2] & f27966M)) + (j10 >> 32);
        iArr3[i12 + 2] = (int) j11;
        long j12 = ((iArr[i10 + 3] & f27966M) - (iArr2[i11 + 3] & f27966M)) + (j11 >> 32);
        iArr3[i12 + 3] = (int) j12;
        long j13 = ((iArr[i10 + 4] & f27966M) - (iArr2[i11 + 4] & f27966M)) + (j12 >> 32);
        iArr3[i12 + 4] = (int) j13;
        long j14 = ((iArr[i10 + 5] & f27966M) - (iArr2[i11 + 5] & f27966M)) + (j13 >> 32);
        iArr3[i12 + 5] = (int) j14;
        long j15 = ((iArr[i10 + 6] & f27966M) - (iArr2[i11 + 6] & f27966M)) + (j14 >> 32);
        iArr3[i12 + 6] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = ((iArr3[0] & f27966M) - (iArr[0] & f27966M)) - (iArr2[0] & f27966M);
        iArr3[0] = (int) j6;
        long j10 = (((iArr3[1] & f27966M) - (iArr[1] & f27966M)) - (iArr2[1] & f27966M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = (((iArr3[2] & f27966M) - (iArr[2] & f27966M)) - (iArr2[2] & f27966M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = (((iArr3[3] & f27966M) - (iArr[3] & f27966M)) - (iArr2[3] & f27966M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = (((iArr3[4] & f27966M) - (iArr[4] & f27966M)) - (iArr2[4] & f27966M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = (((iArr3[5] & f27966M) - (iArr[5] & f27966M)) - (iArr2[5] & f27966M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        long j15 = (((iArr3[6] & f27966M) - (iArr[6] & f27966M)) - (iArr2[6] & f27966M)) + (j14 >> 32);
        iArr3[6] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j6 = (iArr2[i11] & f27966M) - (iArr[i10] & f27966M);
        iArr2[i11] = (int) j6;
        long j10 = ((iArr2[r5] & f27966M) - (iArr[i10 + 1] & f27966M)) + (j6 >> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = ((iArr2[r5] & f27966M) - (iArr[i10 + 2] & f27966M)) + (j10 >> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = ((iArr2[r5] & f27966M) - (iArr[i10 + 3] & f27966M)) + (j11 >> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = ((iArr2[r5] & f27966M) - (iArr[i10 + 4] & f27966M)) + (j12 >> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = ((iArr2[r5] & f27966M) - (iArr[i10 + 5] & f27966M)) + (j13 >> 32);
        iArr2[i11 + 5] = (int) j14;
        long j15 = ((iArr2[r13] & f27966M) - (iArr[i10 + 6] & f27966M)) + (j14 >> 32);
        iArr2[i11 + 6] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (6 - i10) << 2);
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
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27966M) + (iArr2[0] & f27966M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27966M) + (iArr2[1] & f27966M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27966M) + (iArr2[2] & f27966M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27966M) + (iArr2[3] & f27966M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27966M) + (iArr2[4] & f27966M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27966M) + (iArr2[5] & f27966M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (iArr[6] & f27966M) + (iArr2[6] & f27966M) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27966M) + (iArr2[0] & f27966M) + (iArr3[0] & f27966M);
        iArr3[0] = (int) j6;
        long j10 = (iArr[1] & f27966M) + (iArr2[1] & f27966M) + (iArr3[1] & f27966M) + (j6 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (iArr[2] & f27966M) + (iArr2[2] & f27966M) + (iArr3[2] & f27966M) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (iArr[3] & f27966M) + (iArr2[3] & f27966M) + (iArr3[3] & f27966M) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (iArr[4] & f27966M) + (iArr2[4] & f27966M) + (iArr3[4] & f27966M) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (iArr[5] & f27966M) + (iArr2[5] & f27966M) + (iArr3[5] & f27966M) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (iArr[6] & f27966M) + (iArr2[6] & f27966M) + (iArr3[6] & f27966M) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j6 = (iArr[0] & f27966M) + (iArr2[0] & f27966M);
        iArr2[0] = (int) j6;
        long j10 = (iArr[1] & f27966M) + (iArr2[1] & f27966M) + (j6 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = (iArr[2] & f27966M) + (iArr2[2] & f27966M) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = (iArr[3] & f27966M) + (iArr2[3] & f27966M) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & f27966M) + (iArr2[4] & f27966M) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & f27966M) + (iArr2[5] & f27966M) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        long j15 = (iArr[6] & f27966M) + (f27966M & iArr2[6]) + (j14 >>> 32);
        iArr2[6] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
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
        long j6 = iArr2[0] & f27966M;
        long j10 = iArr2[1] & f27966M;
        long j11 = iArr2[2] & f27966M;
        long j12 = iArr2[3] & f27966M;
        long j13 = iArr2[4] & f27966M;
        long j14 = iArr2[5] & f27966M;
        long j15 = iArr2[6] & f27966M;
        long j16 = iArr[0] & f27966M;
        long j17 = j16 * j6;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j10) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j11) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = (j16 * j12) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        long j21 = (j16 * j13) + (j20 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j16 * j14) + (j21 >>> 32);
        iArr3[5] = (int) j22;
        long j23 = (j16 * j15) + (j22 >>> 32);
        iArr3[6] = (int) j23;
        iArr3[7] = (int) (j23 >>> 32);
        int i10 = 1;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            long j24 = iArr[i10] & f27966M;
            long j25 = (j24 * j6) + (iArr3[i10] & f27966M);
            iArr3[i10] = (int) j25;
            int i12 = i10 + 1;
            long j26 = j13;
            long j27 = (j24 * j10) + (iArr3[i12] & f27966M) + (j25 >>> 32);
            iArr3[i12] = (int) j27;
            long j28 = (j24 * j11) + (iArr3[r7] & f27966M) + (j27 >>> 32);
            iArr3[i10 + 2] = (int) j28;
            long j29 = (j24 * j12) + (iArr3[r7] & f27966M) + (j28 >>> 32);
            iArr3[i10 + 3] = (int) j29;
            long j30 = (j24 * j26) + (iArr3[r7] & f27966M) + (j29 >>> 32);
            iArr3[i10 + 4] = (int) j30;
            long j31 = (j24 * j14) + (iArr3[r7] & f27966M) + (j30 >>> 32);
            iArr3[i10 + 5] = (int) j31;
            long j32 = (j24 * j15) + (iArr3[r7] & f27966M) + (j31 >>> 32);
            iArr3[i10 + 6] = (int) j32;
            iArr3[i10 + 7] = (int) (j32 >>> 32);
            i10 = i12;
            j13 = j26;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = iArr2[0] & f27966M;
        long j10 = iArr2[1] & f27966M;
        long j11 = iArr2[2] & f27966M;
        long j12 = iArr2[3] & f27966M;
        long j13 = iArr2[4] & f27966M;
        long j14 = iArr2[5] & f27966M;
        long j15 = iArr2[6] & f27966M;
        long j16 = 0;
        int i10 = 0;
        while (i10 < 7) {
            long j17 = j15;
            long j18 = iArr[i10] & f27966M;
            long j19 = (iArr3[i10] & f27966M) + (j18 * j6);
            iArr3[i10] = (int) j19;
            int i11 = i10 + 1;
            long j20 = (j18 * j10) + (iArr3[i11] & f27966M) + (j19 >>> 32);
            iArr3[i11] = (int) j20;
            long j21 = (j18 * j11) + (iArr3[r15] & f27966M) + (j20 >>> 32);
            int i12 = i10;
            iArr3[i10 + 2] = (int) j21;
            long j22 = (j18 * j12) + (iArr3[r2] & f27966M) + (j21 >>> 32);
            iArr3[i12 + 3] = (int) j22;
            long j23 = (j18 * j13) + (iArr3[r2] & f27966M) + (j22 >>> 32);
            iArr3[i12 + 4] = (int) j23;
            long j24 = (j18 * j14) + (iArr3[r2] & f27966M) + (j23 >>> 32);
            iArr3[i12 + 5] = (int) j24;
            long j25 = (j18 * j17) + (iArr3[r2] & f27966M) + (j24 >>> 32);
            iArr3[i12 + 6] = (int) j25;
            long j26 = (j25 >>> 32) + (iArr3[r2] & f27966M) + j16;
            iArr3[i12 + 7] = (int) j26;
            j16 = j26 >>> 32;
            i10 = i11;
            j15 = j17;
        }
        return (int) j16;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j6 = iArr[0] & f27966M;
        int i10 = 14;
        int i11 = 0;
        int i12 = 6;
        while (true) {
            int i13 = i12 - 1;
            long j10 = iArr[i12] & f27966M;
            long j11 = j10 * j10;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j11 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j11 >>> 1);
            i11 = (int) j11;
            if (i13 <= 0) {
                long j12 = j6 * j6;
                long j13 = (j12 >>> 33) | ((i11 << 31) & f27966M);
                iArr2[0] = (int) j12;
                int i14 = ((int) (j12 >>> 32)) & 1;
                long j14 = iArr[1] & f27966M;
                long j15 = iArr2[2] & f27966M;
                long j16 = (j14 * j6) + j13;
                int i15 = (int) j16;
                iArr2[1] = i14 | (i15 << 1);
                long j17 = iArr[2] & f27966M;
                long j18 = iArr2[3] & f27966M;
                long j19 = iArr2[4] & f27966M;
                long j20 = (j17 * j6) + j15 + (j16 >>> 32);
                int i16 = (int) j20;
                iArr2[2] = (i16 << 1) | (i15 >>> 31);
                long jM9729c = AbstractC4801l.m9729c(j17, j14, j20 >>> 32, j18);
                long j21 = j19 + (jM9729c >>> 32);
                long j22 = jM9729c & f27966M;
                long j23 = iArr[3] & f27966M;
                long j24 = (iArr2[5] & f27966M) + (j21 >>> 32);
                long j25 = j21 & f27966M;
                long j26 = (iArr2[6] & f27966M) + (j24 >>> 32);
                long j27 = j24 & f27966M;
                long j28 = (j23 * j6) + j22;
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long jM9729c2 = AbstractC4801l.m9729c(j23, j14, j28 >>> 32, j25);
                long jM9729c3 = AbstractC4801l.m9729c(j23, j17, jM9729c2 >>> 32, j27);
                long j29 = jM9729c2 & f27966M;
                long j30 = j26 + (jM9729c3 >>> 32);
                long j31 = jM9729c3 & f27966M;
                long j32 = iArr[4] & f27966M;
                long j33 = (iArr2[7] & f27966M) + (j30 >>> 32);
                long j34 = j30 & f27966M;
                long j35 = (iArr2[8] & f27966M) + (j33 >>> 32);
                long j36 = j33 & f27966M;
                long j37 = (j32 * j6) + j29;
                int i19 = (int) j37;
                iArr2[4] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                long jM9729c4 = AbstractC4801l.m9729c(j32, j14, j37 >>> 32, j31);
                long jM9729c5 = AbstractC4801l.m9729c(j32, j17, jM9729c4 >>> 32, j34);
                long j38 = jM9729c4 & f27966M;
                long jM9729c6 = AbstractC4801l.m9729c(j32, j23, jM9729c5 >>> 32, j36);
                long j39 = jM9729c5 & f27966M;
                long j40 = j35 + (jM9729c6 >>> 32);
                long j41 = jM9729c6 & f27966M;
                long j42 = iArr[5] & f27966M;
                long j43 = (iArr2[9] & f27966M) + (j40 >>> 32);
                long j44 = j40 & f27966M;
                long j45 = (iArr2[10] & f27966M) + (j43 >>> 32);
                long j46 = j43 & f27966M;
                long j47 = (j42 * j6) + j38;
                int i21 = (int) j47;
                iArr2[5] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long jM9729c7 = AbstractC4801l.m9729c(j42, j14, j47 >>> 32, j39);
                long jM9729c8 = AbstractC4801l.m9729c(j42, j17, jM9729c7 >>> 32, j41);
                long j48 = jM9729c7 & f27966M;
                long jM9729c9 = AbstractC4801l.m9729c(j42, j23, jM9729c8 >>> 32, j44);
                long j49 = jM9729c8 & f27966M;
                long jM9729c10 = AbstractC4801l.m9729c(j42, j32, jM9729c9 >>> 32, j46);
                long j50 = jM9729c9 & f27966M;
                long j51 = j45 + (jM9729c10 >>> 32);
                long j52 = jM9729c10 & f27966M;
                long j53 = iArr[6] & f27966M;
                long j54 = (iArr2[11] & f27966M) + (j51 >>> 32);
                long j55 = j51 & f27966M;
                long j56 = (iArr2[12] & f27966M) + (j54 >>> 32);
                long j57 = j54 & f27966M;
                long j58 = (j53 * j6) + j48;
                int i23 = (int) j58;
                iArr2[6] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                long jM9729c11 = AbstractC4801l.m9729c(j53, j14, j58 >>> 32, j49);
                long jM9729c12 = AbstractC4801l.m9729c(j53, j17, jM9729c11 >>> 32, j50);
                long jM9729c13 = AbstractC4801l.m9729c(j53, j23, jM9729c12 >>> 32, j52);
                long jM9729c14 = AbstractC4801l.m9729c(j53, j32, jM9729c13 >>> 32, j55);
                long jM9729c15 = AbstractC4801l.m9729c(j53, j42, jM9729c14 >>> 32, j57);
                long j59 = j56 + (jM9729c15 >>> 32);
                int i25 = (int) jM9729c11;
                iArr2[7] = (i25 << 1) | i24;
                int i26 = (int) jM9729c12;
                iArr2[8] = (i25 >>> 31) | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) jM9729c13;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) jM9729c14;
                iArr2[10] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) jM9729c15;
                iArr2[11] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j59;
                iArr2[12] = i33 | (i34 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j59 >>> 32))) << 1) | (i34 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j6 = (iArr[0] & f27966M) - (iArr2[0] & f27966M);
        iArr3[0] = (int) j6;
        long j10 = ((iArr[1] & f27966M) - (iArr2[1] & f27966M)) + (j6 >> 32);
        iArr3[1] = (int) j10;
        long j11 = ((iArr[2] & f27966M) - (iArr2[2] & f27966M)) + (j10 >> 32);
        iArr3[2] = (int) j11;
        long j12 = ((iArr[3] & f27966M) - (iArr2[3] & f27966M)) + (j11 >> 32);
        iArr3[3] = (int) j12;
        long j13 = ((iArr[4] & f27966M) - (iArr2[4] & f27966M)) + (j12 >> 32);
        iArr3[4] = (int) j13;
        long j14 = ((iArr[5] & f27966M) - (iArr2[5] & f27966M)) + (j13 >> 32);
        iArr3[5] = (int) j14;
        long j15 = ((iArr[6] & f27966M) - (iArr2[6] & f27966M)) + (j14 >> 32);
        iArr3[6] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j6 = (iArr2[0] & f27966M) - (iArr[0] & f27966M);
        iArr2[0] = (int) j6;
        long j10 = ((iArr2[1] & f27966M) - (iArr[1] & f27966M)) + (j6 >> 32);
        iArr2[1] = (int) j10;
        long j11 = ((iArr2[2] & f27966M) - (iArr[2] & f27966M)) + (j10 >> 32);
        iArr2[2] = (int) j11;
        long j12 = ((iArr2[3] & f27966M) - (iArr[3] & f27966M)) + (j11 >> 32);
        iArr2[3] = (int) j12;
        long j13 = ((iArr2[4] & f27966M) - (iArr[4] & f27966M)) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = ((iArr2[5] & f27966M) - (iArr[5] & f27966M)) + (j13 >> 32);
        iArr2[5] = (int) j14;
        long j15 = ((iArr2[6] & f27966M) - (f27966M & iArr[6])) + (j14 >> 32);
        iArr2[6] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i10) {
        long j6 = (iArr[0] & f27966M) + (iArr2[0] & f27966M) + (i10 & f27966M);
        iArr2[0] = (int) j6;
        long j10 = (iArr[1] & f27966M) + (iArr2[1] & f27966M) + (j6 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = (iArr[2] & f27966M) + (iArr2[2] & f27966M) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = (iArr[3] & f27966M) + (iArr2[3] & f27966M) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & f27966M) + (iArr2[4] & f27966M) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & f27966M) + (iArr2[5] & f27966M) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        long j15 = (iArr[6] & f27966M) + (f27966M & iArr2[6]) + (j14 >>> 32);
        iArr2[6] = (int) j15;
        return (int) (j15 >>> 32);
    }
}
