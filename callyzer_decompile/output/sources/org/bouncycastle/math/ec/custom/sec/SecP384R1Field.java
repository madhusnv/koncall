package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SecP384R1Field {

    /* renamed from: M */
    private static final long f27920M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;

    /* renamed from: P */
    static final int[] f27921P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, f27921P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f27921P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j6 = (iArr[0] & f27920M) + 1;
        iArr[0] = (int) j6;
        long j10 = ((iArr[1] & f27920M) - 1) + (j6 >> 32);
        iArr[1] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[2] & f27920M);
            iArr[2] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = (iArr[3] & f27920M) + 1 + j11;
        iArr[3] = (int) j13;
        long j14 = (f27920M & iArr[4]) + 1 + (j13 >> 32);
        iArr[4] = (int) j14;
        if ((j14 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(KyberEngine.KyberPolyBytes, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = f27921P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, f27921P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f27921P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 12; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, f27921P, iArr, iArr2);
        } else {
            int[] iArr3 = f27921P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, f27921P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j6 = iArr[16] & f27920M;
        long j10 = iArr[17] & f27920M;
        long j11 = iArr[18] & f27920M;
        long j12 = iArr[19] & f27920M;
        long j13 = iArr[20] & f27920M;
        long j14 = iArr[21] & f27920M;
        long j15 = iArr[22] & f27920M;
        long j16 = iArr[23] & f27920M;
        long j17 = ((iArr[12] & f27920M) + j13) - 1;
        long j18 = (iArr[13] & f27920M) + j15;
        long j19 = (iArr[14] & f27920M) + j15 + j16;
        long j20 = (iArr[15] & f27920M) + j16;
        long j21 = j10 + j14;
        long j22 = j14 - j16;
        long j23 = j15 - j16;
        long j24 = j17 + j22;
        long j25 = (iArr[0] & f27920M) + j24;
        iArr2[0] = (int) j25;
        long j26 = (((iArr[1] & f27920M) + j16) - j17) + j18 + (j25 >> 32);
        iArr2[1] = (int) j26;
        long j27 = (((iArr[2] & f27920M) - j14) - j18) + j19 + (j26 >> 32);
        iArr2[2] = (int) j27;
        long j28 = ((iArr[3] & f27920M) - j19) + j20 + j24 + (j27 >> 32);
        iArr2[3] = (int) j28;
        long j29 = (((((iArr[4] & f27920M) + j6) + j14) + j18) - j20) + j24 + (j28 >> 32);
        iArr2[4] = (int) j29;
        long j30 = ((iArr[5] & f27920M) - j6) + j18 + j19 + j21 + (j29 >> 32);
        iArr2[5] = (int) j30;
        long j31 = (((iArr[6] & f27920M) + j11) - j10) + j19 + j20 + (j30 >> 32);
        iArr2[6] = (int) j31;
        long j32 = ((((iArr[7] & f27920M) + j6) + j12) - j11) + j20 + (j31 >> 32);
        iArr2[7] = (int) j32;
        long j33 = (((((iArr[8] & f27920M) + j6) + j10) + j13) - j12) + (j32 >> 32);
        iArr2[8] = (int) j33;
        long j34 = (((iArr[9] & f27920M) + j11) - j13) + j21 + (j33 >> 32);
        iArr2[9] = (int) j34;
        long j35 = ((((iArr[10] & f27920M) + j11) + j12) - j22) + j23 + (j34 >> 32);
        iArr2[10] = (int) j35;
        long j36 = ((((iArr[11] & f27920M) + j12) + j13) - j23) + (j35 >> 32);
        iArr2[11] = (int) j36;
        reduce32((int) ((j36 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j6;
        if (i10 != 0) {
            long j10 = i10 & f27920M;
            long j11 = (iArr[0] & f27920M) + j10;
            iArr[0] = (int) j11;
            long j12 = ((iArr[1] & f27920M) - j10) + (j11 >> 32);
            iArr[1] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[2] & f27920M);
                iArr[2] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = (iArr[3] & f27920M) + j10 + j13;
            iArr[3] = (int) j15;
            long j16 = (f27920M & iArr[4]) + j10 + (j15 >> 32);
            iArr[4] = (int) j16;
            j6 = j16 >> 32;
        } else {
            j6 = 0;
        }
        if ((j6 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, f27921P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArrCreate);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j6 = (iArr[0] & f27920M) - 1;
        iArr[0] = (int) j6;
        long j10 = (iArr[1] & f27920M) + 1 + (j6 >> 32);
        iArr[1] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[2] & f27920M);
            iArr[2] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = ((iArr[3] & f27920M) - 1) + j11;
        iArr[3] = (int) j13;
        long j14 = ((f27920M & iArr[4]) - 1) + (j13 >> 32);
        iArr[4] = (int) j14;
        if ((j14 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f27921P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
