package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SecP224R1Field {

    /* renamed from: M */
    private static final long f27906M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;

    /* renamed from: P */
    static final int[] f27907P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, f27907P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f27907P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j6 = (iArr[0] & f27906M) - 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27906M);
            iArr[1] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[2] & f27906M);
            iArr[2] = (int) j12;
            j10 = j12 >> 32;
        }
        long j13 = (f27906M & iArr[3]) + 1 + j10;
        iArr[3] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = f27907P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, f27907P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f27907P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat224.sub(f27907P, iArr, iArr2);
        } else {
            int[] iArr3 = f27907P;
            Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (Nat.lessThan(7, iArr, f27907P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j6 = iArr[10] & f27906M;
        long j10 = iArr[11] & f27906M;
        long j11 = iArr[12] & f27906M;
        long j12 = iArr[13] & f27906M;
        long j13 = ((iArr[7] & f27906M) + j10) - 1;
        long j14 = (iArr[8] & f27906M) + j11;
        long j15 = (iArr[9] & f27906M) + j12;
        long j16 = (iArr[0] & f27906M) - j13;
        long j17 = j16 & f27906M;
        long j18 = ((iArr[1] & f27906M) - j14) + (j16 >> 32);
        int i10 = (int) j18;
        iArr2[1] = i10;
        long j19 = ((iArr[2] & f27906M) - j15) + (j18 >> 32);
        int i11 = (int) j19;
        iArr2[2] = i11;
        long j20 = (((iArr[3] & f27906M) + j13) - j6) + (j19 >> 32);
        long j21 = j20 & f27906M;
        long j22 = (((iArr[4] & f27906M) + j14) - j10) + (j20 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((iArr[5] & f27906M) + j15) - j11) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((iArr[6] & f27906M) + j6) - j12) + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = (j24 >> 32) + 1;
        long j26 = j21 + j25;
        long j27 = j17 - j25;
        iArr2[0] = (int) j27;
        long j28 = j27 >> 32;
        if (j28 != 0) {
            long j29 = j28 + (i10 & f27906M);
            iArr2[1] = (int) j29;
            long j30 = (j29 >> 32) + (i11 & f27906M);
            iArr2[2] = (int) j30;
            j26 += j30 >> 32;
        }
        iArr2[3] = (int) j26;
        if (((j26 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, f27907P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j6;
        if (i10 != 0) {
            long j10 = i10 & f27906M;
            long j11 = (iArr[0] & f27906M) - j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[1] & f27906M);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (iArr[2] & f27906M);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = (f27906M & iArr[3]) + j10 + j12;
            iArr[3] = (int) j15;
            j6 = j15 >> 32;
        } else {
            j6 = 0;
        }
        if ((j6 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, f27907P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat224.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j6 = (iArr[0] & f27906M) + 1;
        iArr[0] = (int) j6;
        long j10 = j6 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[1] & f27906M);
            iArr[1] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[2] & f27906M);
            iArr[2] = (int) j12;
            j10 = j12 >> 32;
        }
        long j13 = ((f27906M & iArr[3]) - 1) + j10;
        iArr[3] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f27907P))) {
            addPInvTo(iArr2);
        }
    }
}
