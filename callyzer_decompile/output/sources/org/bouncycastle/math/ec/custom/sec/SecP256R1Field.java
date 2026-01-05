package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SecP256R1Field {

    /* renamed from: M */
    private static final long f27915M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15s1 = Integer.MAX_VALUE;

    /* renamed from: P */
    static final int[] f27916P = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, f27916P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= PExt15s1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f27916P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j6 = (iArr[0] & f27915M) + 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27915M);
            iArr[1] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[2] & f27915M);
            iArr[2] = (int) j12;
            j10 = j12 >> 32;
        }
        long j13 = ((iArr[3] & f27915M) - 1) + j10;
        iArr[3] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            long j15 = j14 + (iArr[4] & f27915M);
            iArr[4] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[5] & f27915M);
            iArr[5] = (int) j16;
            j14 = j16 >> 32;
        }
        long j17 = ((iArr[6] & f27915M) - 1) + j14;
        iArr[6] = (int) j17;
        iArr[7] = (int) ((f27915M & iArr[7]) + 1 + (j17 >> 32));
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = f27916P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, f27916P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f27916P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= PExt15s1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(f27916P, iArr, iArr2);
        } else {
            int[] iArr3 = f27916P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, f27916P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j6 = iArr[8] & f27915M;
        long j10 = iArr[9] & f27915M;
        long j11 = iArr[10] & f27915M;
        long j12 = iArr[11] & f27915M;
        long j13 = iArr[12] & f27915M;
        long j14 = iArr[13] & f27915M;
        long j15 = iArr[14] & f27915M;
        long j16 = iArr[15] & f27915M;
        long j17 = j6 - 6;
        long j18 = j17 + j10;
        long j19 = j10 + j11;
        long j20 = (j11 + j12) - j16;
        long j21 = j12 + j13;
        long j22 = j13 + j14;
        long j23 = j14 + j15;
        long j24 = j15 + j16;
        long j25 = j23 - j18;
        long j26 = ((iArr[0] & f27915M) - j21) - j25;
        iArr2[0] = (int) j26;
        long j27 = ((((iArr[1] & f27915M) + j19) - j22) - j24) + (j26 >> 32);
        iArr2[1] = (int) j27;
        long j28 = (((iArr[2] & f27915M) + j20) - j23) + (j27 >> 32);
        iArr2[2] = (int) j28;
        long j29 = ((((iArr[3] & f27915M) + (j21 << 1)) + j25) - j24) + (j28 >> 32);
        iArr2[3] = (int) j29;
        long j30 = ((((iArr[4] & f27915M) + (j22 << 1)) + j15) - j19) + (j29 >> 32);
        iArr2[4] = (int) j30;
        long j31 = (((iArr[5] & f27915M) + (j23 << 1)) - j20) + (j30 >> 32);
        iArr2[5] = (int) j31;
        long j32 = (iArr[6] & f27915M) + (j24 << 1) + j25 + (j31 >> 32);
        iArr2[6] = (int) j32;
        long j33 = (((((iArr[7] & f27915M) + (j16 << 1)) + j17) - j20) - j22) + (j32 >> 32);
        iArr2[7] = (int) j33;
        reduce32((int) ((j33 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j6;
        if (i10 != 0) {
            long j10 = i10 & f27915M;
            long j11 = (iArr[0] & f27915M) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[1] & f27915M);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (iArr[2] & f27915M);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = ((iArr[3] & f27915M) - j10) + j12;
            iArr[3] = (int) j15;
            long j16 = j15 >> 32;
            if (j16 != 0) {
                long j17 = j16 + (iArr[4] & f27915M);
                iArr[4] = (int) j17;
                long j18 = (j17 >> 32) + (iArr[5] & f27915M);
                iArr[5] = (int) j18;
                j16 = j18 >> 32;
            }
            long j19 = ((iArr[6] & f27915M) - j10) + j16;
            iArr[6] = (int) j19;
            long j20 = (f27915M & iArr[7]) + j10 + (j19 >> 32);
            iArr[7] = (int) j20;
            j6 = j20 >> 32;
        } else {
            j6 = 0;
        }
        if (j6 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, f27916P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j6 = (iArr[0] & f27915M) - 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27915M);
            iArr[1] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[2] & f27915M);
            iArr[2] = (int) j12;
            j10 = j12 >> 32;
        }
        long j13 = (iArr[3] & f27915M) + 1 + j10;
        iArr[3] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            long j15 = j14 + (iArr[4] & f27915M);
            iArr[4] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[5] & f27915M);
            iArr[5] = (int) j16;
            j14 = j16 >> 32;
        }
        long j17 = (iArr[6] & f27915M) + 1 + j14;
        iArr[6] = (int) j17;
        iArr[7] = (int) (((f27915M & iArr[7]) - 1) + (j17 >> 32));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f27916P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat256.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArr3);
            }
        }
    }
}
