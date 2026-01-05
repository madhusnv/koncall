package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SecP192R1Field {

    /* renamed from: M */
    private static final long f27897M = 4294967295L;
    private static final int P5 = -1;
    private static final int PExt11 = -1;

    /* renamed from: P */
    static final int[] f27898P = {-1, -1, -2, -1, -1, -1};
    private static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, f27898P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f27898P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j6 = (iArr[0] & f27897M) + 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27897M);
            iArr[1] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = (f27897M & iArr[2]) + 1 + j10;
        iArr[2] = (int) j12;
        if ((j12 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[5] == -1) {
            int[] iArr = f27898P;
            if (Nat192.gte(iArrFromBigInteger, iArr)) {
                Nat192.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, f27898P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f27898P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat192.sub(f27898P, iArr, iArr2);
        } else {
            int[] iArr3 = f27898P;
            Nat192.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (Nat.lessThan(6, iArr, f27898P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j6 = iArr[6] & f27897M;
        long j10 = iArr[7] & f27897M;
        long j11 = iArr[8] & f27897M;
        long j12 = iArr[9] & f27897M;
        long j13 = (iArr[10] & f27897M) + j6;
        long j14 = (iArr[11] & f27897M) + j10;
        long j15 = (iArr[0] & f27897M) + j13;
        int i10 = (int) j15;
        long j16 = (iArr[1] & f27897M) + j14 + (j15 >> 32);
        int i11 = (int) j16;
        iArr2[1] = i11;
        long j17 = j13 + j11;
        long j18 = j14 + j12;
        long j19 = (iArr[2] & f27897M) + j17 + (j16 >> 32);
        long j20 = j19 & f27897M;
        long j21 = (iArr[3] & f27897M) + j18 + (j19 >> 32);
        iArr2[3] = (int) j21;
        long j22 = (iArr[4] & f27897M) + (j17 - j6) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (iArr[5] & f27897M) + (j18 - j10) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = j23 >> 32;
        long j25 = j20 + j24;
        long j26 = j24 + (i10 & f27897M);
        iArr2[0] = (int) j26;
        long j27 = j26 >> 32;
        if (j27 != 0) {
            long j28 = j27 + (i11 & f27897M);
            iArr2[1] = (int) j28;
            j25 += j28 >> 32;
        }
        iArr2[2] = (int) j25;
        if (((j25 >> 32) == 0 || Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Nat192.gte(iArr2, f27898P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j6;
        if (i10 != 0) {
            long j10 = i10 & f27897M;
            long j11 = (iArr[0] & f27897M) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[1] & f27897M);
                iArr[1] = (int) j13;
                j12 = j13 >> 32;
            }
            long j14 = (f27897M & iArr[2]) + j10 + j12;
            iArr[2] = (int) j14;
            j6 = j14 >> 32;
        } else {
            j6 = 0;
        }
        if ((j6 == 0 || Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && Nat192.gte(iArr, f27898P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat192.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j6 = (iArr[0] & f27897M) - 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27897M);
            iArr[1] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = ((f27897M & iArr[2]) - 1) + j10;
        iArr[2] = (int) j12;
        if ((j12 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f27898P))) {
            addPInvTo(iArr2);
        }
    }
}
