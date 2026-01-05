package org.bouncycastle.math.raw;

import java.util.Random;
import mm.AbstractC4801l;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i10, int[] iArr, int[] iArr2) {
        int i11 = i10 - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13] + iArr2[i13] + i12;
            iArr[i13] = M30 & i14;
            i12 = i14 >> 30;
        }
        int i15 = iArr[i11] + iArr2[i11] + i12;
        iArr[i11] = i15;
        return i15 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = ((iArr[i14] ^ i11) - i11) + i13;
            iArr[i14] = M30 & i15;
            i13 = i15 >> 30;
        }
        iArr[i12] = ((iArr[i12] ^ i11) - i11) + i13;
    }

    private static void cnormalize30(int i10, int i11, int[] iArr, int[] iArr2) {
        int i12 = i10 - 1;
        int i13 = iArr[i12] >> 31;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = (((iArr[i15] + (iArr2[i15] & i13)) ^ i11) - i11) + i14;
            iArr[i15] = i16 & M30;
            i14 = i16 >> 30;
        }
        int i17 = (((iArr[i12] + (i13 & iArr2[i12])) ^ i11) - i11) + i14;
        iArr[i12] = i17;
        int i18 = i17 >> 31;
        int i19 = 0;
        for (int i20 = 0; i20 < i12; i20++) {
            int i21 = iArr[i20] + (iArr2[i20] & i18) + i19;
            iArr[i20] = i21 & M30;
            i19 = i21 >> 30;
        }
        iArr[i12] = iArr[i12] + (i18 & iArr2[i12]) + i19;
    }

    private static void decode30(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = 0;
        long j6 = 0;
        while (i10 > 0) {
            while (i13 < Math.min(32, i10)) {
                j6 |= iArr[i11] << i13;
                i13 += 30;
                i11++;
            }
            iArr2[i12] = (int) j6;
            j6 >>>= 32;
            i13 -= 32;
            i10 -= 32;
            i12++;
        }
    }

    private static int divsteps30(int i10, int i11, int i12, int[] iArr) {
        int i13 = 1073741824;
        int i14 = 1073741824;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 30; i17++) {
            int i18 = i10 >> 31;
            int i19 = -(i12 & 1);
            int i20 = i12 - ((i11 ^ i18) & i19);
            int i21 = i16 - ((i13 ^ i18) & i19);
            int i22 = i14 - ((i15 ^ i18) & i19);
            int i23 = (~i18) & i19;
            i10 = (i10 ^ i23) - (i23 - 1);
            i11 += i20 & i23;
            i13 += i21 & i23;
            i15 += i23 & i22;
            i12 = i20 >> 1;
            i16 = i21 >> 1;
            i14 = i22 >> 1;
        }
        iArr[0] = i13;
        iArr[1] = i15;
        iArr[2] = i16;
        iArr[3] = i14;
        return i10;
    }

    private static int divsteps30Var(int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14 = 30;
        int i15 = 1;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i14) | i12);
            int i19 = i12 >> iNumberOfTrailingZeros;
            i15 <<= iNumberOfTrailingZeros;
            i17 <<= iNumberOfTrailingZeros;
            i10 -= iNumberOfTrailingZeros;
            i14 -= iNumberOfTrailingZeros;
            if (i14 <= 0) {
                iArr[0] = i15;
                iArr[1] = i17;
                iArr[2] = i18;
                iArr[3] = i16;
                return i10;
            }
            if (i10 < 0) {
                i10 = -i10;
                int i20 = -i11;
                int i21 = -i15;
                int i22 = -i17;
                int i23 = i10 + 1;
                if (i23 > i14) {
                    i23 = i14;
                }
                i13 = ((-1) >>> (32 - i23)) & 63 & (((i19 * i19) - 2) * i19 * i20);
                i19 = i20;
                i11 = i19;
                int i24 = i18;
                i18 = i21;
                i15 = i24;
                int i25 = i16;
                i16 = i22;
                i17 = i25;
            } else {
                int i26 = i10 + 1;
                if (i26 > i14) {
                    i26 = i14;
                }
                i13 = ((-1) >>> (32 - i26)) & 15 & ((-((((i11 + 1) & 4) << 1) + i11)) * i19);
            }
            i12 = i19 + (i11 * i13);
            i18 += i15 * i13;
            i16 += i13 * i17;
        }
    }

    private static void encode30(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = 0;
        long j6 = 0;
        while (i10 > 0) {
            if (i13 < Math.min(30, i10)) {
                j6 |= (iArr[i11] & M32L) << i13;
                i13 += 32;
                i11++;
            }
            iArr2[i12] = ((int) j6) & M30;
            j6 >>>= 30;
            i13 -= 30;
            i10 -= 30;
            i12++;
        }
    }

    private static int getMaximumDivsteps(int i10) {
        return ((i10 * 49) + (i10 < 46 ? 80 : 47)) / 17;
    }

    public static int inverse32(int i10) {
        int i11 = (2 - (i10 * i10)) * i10;
        int i12 = (2 - (i10 * i11)) * i11;
        int i13 = (2 - (i10 * i12)) * i12;
        return (2 - (i10 * i13)) * i13;
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i10 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i10];
        int[] iArr6 = new int[i10];
        int[] iArr7 = new int[i10];
        int[] iArr8 = new int[i10];
        int[] iArr9 = new int[i10];
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(iNumberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i10);
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int iDivsteps30 = 0;
        for (int i11 = 0; i11 < maximumDivsteps; i11 += 30) {
            iDivsteps30 = divsteps30(iDivsteps30, iArr7[0], iArr8[0], iArr4);
            updateDE30(i10, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i10, iArr7, iArr8, iArr4);
        }
        int i12 = iArr7[i10 - 1] >> 31;
        cnegate30(i10, i12, iArr7);
        cnormalize30(i10, i12, iArr5, iArr9);
        decode30(iNumberOfLeadingZeros, iArr5, 0, iArr3, 0);
        return Nat.equalTo(i10, iArr7, 1) & Nat.equalToZero(i10, iArr8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v1 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        boolean z6 = true;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i10 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i10];
        int[] iArr6 = new int[i10];
        int[] iArr7 = new int[i10];
        int[] iArr8 = new int[i10];
        int[] iArr9 = new int[i10];
        ?? r11 = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(iNumberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i10);
        int i11 = i10 - 1;
        int iNumberOfLeadingZeros2 = (-1) - (Integers.numberOfLeadingZeros(iArr8[i11] | 1) - (((i10 * 30) + 2) - iNumberOfLeadingZeros));
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int i12 = i10;
        int i13 = 0;
        while (!Nat.isZero(i12, iArr8)) {
            if (i13 >= maximumDivsteps) {
                return r11;
            }
            i13 += 30;
            boolean z10 = z6;
            ?? r17 = r11;
            int iDivsteps30Var = divsteps30Var(iNumberOfLeadingZeros2, iArr7[r11], iArr8[r17], iArr4);
            int i14 = iInverse32;
            updateDE30(i10, iArr5, iArr6, iArr4, i14, iArr9);
            updateFG30(i12, iArr7, iArr8, iArr4);
            int i15 = i12 - 1;
            int i16 = iArr7[i15];
            int i17 = iArr8[i15];
            int i18 = i12 - 2;
            if (((i18 >> 31) | (i16 ^ (i16 >> 31)) | (i17 ^ (i17 >> 31))) == 0) {
                iArr7[i18] = iArr7[i18] | (i16 << 30);
                iArr8[i18] = (i17 << 30) | iArr8[i18];
                i12--;
            }
            iInverse32 = i14;
            r11 = r17;
            iNumberOfLeadingZeros2 = iDivsteps30Var;
            z6 = z10;
        }
        boolean z11 = z6;
        boolean z12 = r11;
        int i19 = iArr7[i12 - 1] >> 31;
        int iNegate30 = iArr5[i11] >> 31;
        if (iNegate30 < 0) {
            iNegate30 = add30(i10, iArr5, iArr9);
        }
        if (i19 < 0) {
            iNegate30 = negate30(i10, iArr5);
            negate30(i12, iArr7);
        }
        if (!Nat.isOne(i12, iArr7)) {
            return z12;
        }
        if (iNegate30 < 0) {
            add30(i10, iArr5, iArr9);
        }
        decode30(iNumberOfLeadingZeros, iArr5, z12 ? 1 : 0, iArr3, z12 ? 1 : 0);
        return z11;
    }

    private static int negate30(int i10, int[] iArr) {
        int i11 = i10 - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i12 - iArr[i13];
            iArr[i13] = M30 & i14;
            i12 = i14 >> 30;
        }
        int i15 = i12 - iArr[i11];
        iArr[i11] = i15;
        return i15 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i10 = length - 1;
        int i11 = iArr[i10];
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        do {
            for (int i17 = 0; i17 != length; i17++) {
                iArrCreate[i17] = random.nextInt();
            }
            iArrCreate[i10] = iArrCreate[i10] & i16;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    private static void updateDE30(int i10, int[] iArr, int[] iArr2, int[] iArr3, int i11, int[] iArr4) {
        int i12 = i10;
        int i13 = iArr3[0];
        int i14 = iArr3[1];
        int i15 = iArr3[2];
        int i16 = iArr3[3];
        int i17 = i12 - 1;
        int i18 = iArr[i17] >> 31;
        int i19 = iArr2[i17] >> 31;
        int i20 = (i13 & i18) + (i14 & i19);
        int i21 = (i18 & i15) + (i19 & i16);
        int i22 = iArr4[0];
        long j6 = i13;
        long j10 = iArr[0];
        long j11 = i14;
        long j12 = iArr2[0];
        long j13 = (j11 * j12) + (j6 * j10);
        long j14 = i15;
        long j15 = i16;
        long j16 = (j15 * j12) + (j10 * j14);
        int i23 = i20 - (((((int) j13) * i11) + i20) & M30);
        long j17 = i22;
        long j18 = i23;
        long j19 = (j17 * j18) + j13;
        long j20 = i21 - (((((int) j16) * i11) + i21) & M30);
        char c2 = 30;
        long j21 = j19 >> 30;
        long j22 = ((j17 * j20) + j16) >> 30;
        int i24 = 1;
        while (i24 < i12) {
            int i25 = iArr4[i24];
            char c10 = c2;
            long j23 = j20;
            long j24 = iArr[i24];
            long j25 = j6 * j24;
            long j26 = iArr2[i24];
            long j27 = i25;
            long j28 = j18;
            long jM9729c = AbstractC4801l.m9729c(j27, j28, (j11 * j26) + j25, j21);
            long jM9729c2 = AbstractC4801l.m9729c(j27, j23, (j26 * j15) + (j14 * j24), j22);
            int i26 = i24 - 1;
            iArr[i26] = ((int) jM9729c) & M30;
            j21 = jM9729c >> c10;
            iArr2[i26] = ((int) jM9729c2) & M30;
            j22 = jM9729c2 >> c10;
            i24++;
            i12 = i10;
            c2 = c10;
            j18 = j28;
            j20 = j23;
        }
        iArr[i17] = (int) j21;
        iArr2[i17] = (int) j22;
    }

    private static void updateFG30(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = iArr3[0];
        int i12 = 1;
        int i13 = iArr3[1];
        int i14 = iArr3[2];
        int i15 = iArr3[3];
        long j6 = i11;
        long j10 = iArr[0];
        long j11 = i13;
        long j12 = iArr2[0];
        long j13 = (j11 * j12) + (j6 * j10);
        long j14 = i14;
        long j15 = i15;
        long j16 = ((j12 * j15) + (j10 * j14)) >> 30;
        int i16 = 1;
        long j17 = j13 >> 30;
        while (i16 < i10) {
            long j18 = iArr[i16];
            int i17 = i12;
            long j19 = j14;
            long j20 = iArr2[i16];
            long jM9729c = AbstractC4801l.m9729c(j11, j20, j6 * j18, j17);
            long j21 = j15;
            long jM9729c2 = AbstractC4801l.m9729c(j21, j20, j19 * j18, j16);
            int i18 = i16 - 1;
            iArr[i18] = ((int) jM9729c) & M30;
            j17 = jM9729c >> 30;
            iArr2[i18] = ((int) jM9729c2) & M30;
            j16 = jM9729c2 >> 30;
            i16++;
            i12 = i17;
            j15 = j21;
            j14 = j19;
        }
        int i19 = i10 - i12;
        iArr[i19] = (int) j17;
        iArr2[i19] = (int) j16;
    }
}
