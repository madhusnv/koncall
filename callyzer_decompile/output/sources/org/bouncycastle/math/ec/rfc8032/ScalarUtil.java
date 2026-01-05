package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
abstract class ScalarUtil {

    /* renamed from: M */
    private static final long f27959M = 4294967295L;

    public static void addShifted_NP(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c2 = ' ';
        long j6 = f27959M;
        long j10 = 0;
        if (i13 == 0) {
            long j11 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                int i15 = i14 - i12;
                long j12 = j10 + (iArr[i14] & f27959M) + (iArr3[i15] & f27959M);
                long j13 = j11 + (iArr3[i14] & f27959M) + (iArr2[i15] & f27959M);
                iArr3[i14] = (int) j13;
                j11 = j13 >>> 32;
                long j14 = j12 + (iArr3[i15] & f27959M);
                iArr[i14] = (int) j14;
                j10 = j14 >>> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j15 = 0;
        while (i16 <= i10) {
            int i20 = i16 - i12;
            int i21 = iArr3[i20];
            char c10 = c2;
            int i22 = -i13;
            long j16 = j6;
            int i23 = iArr2[i20];
            long j17 = j15 + (iArr3[i16] & j16) + (((i23 << i13) | (i18 >>> i22)) & j16);
            iArr3[i16] = (int) j17;
            j15 = j17 >>> c10;
            int i24 = iArr3[i20];
            long j18 = j10 + (iArr[i16] & j16) + (((i21 << i13) | (i17 >>> i22)) & j16) + (((i19 >>> i22) | (i24 << i13)) & j16);
            iArr[i16] = (int) j18;
            j10 = j18 >>> c10;
            i16++;
            c2 = c10;
            i18 = i23;
            i19 = i24;
            i17 = i21;
            j6 = j16;
        }
    }

    public static void addShifted_UV(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c2 = ' ';
        long j6 = f27959M;
        long j10 = 0;
        if (i13 == 0) {
            long j11 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                long j12 = j10 + (iArr[i14] & f27959M);
                long j13 = j11 + (iArr2[i14] & f27959M);
                int i15 = i14 - i12;
                long j14 = j12 + (iArr3[i15] & f27959M);
                long j15 = j13 + (iArr4[i15] & f27959M);
                iArr[i14] = (int) j14;
                j10 = j14 >>> 32;
                iArr2[i14] = (int) j15;
                j11 = j15 >>> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        long j16 = 0;
        while (i16 <= i10) {
            int i19 = i16 - i12;
            int i20 = iArr3[i19];
            int i21 = iArr4[i19];
            char c10 = c2;
            long j17 = j6;
            long j18 = j10 + (iArr[i16] & j17);
            long j19 = j18 + (((i17 >>> (-i13)) | (i20 << i13)) & j17);
            long j20 = j16 + (iArr2[i16] & j17) + (((i18 >>> r3) | (i21 << i13)) & j17);
            iArr[i16] = (int) j19;
            j10 = j19 >>> c10;
            iArr2[i16] = (int) j20;
            j16 = j20 >>> c10;
            i16++;
            c2 = c10;
            i18 = i21;
            i17 = i20;
            j6 = j17;
        }
    }

    public static int getBitLength(int i10, int[] iArr) {
        int i11 = iArr[i10] >> 31;
        while (i10 > 0 && iArr[i10] == i11) {
            i10--;
        }
        return ((i10 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i10] ^ i11);
    }

    public static int getBitLengthPositive(int i10, int[] iArr) {
        while (i10 > 0 && iArr[i10] == 0) {
            i10--;
        }
        return ((i10 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i10]);
    }

    public static boolean lessThan(int i10, int[] iArr, int[] iArr2) {
        do {
            int i11 = iArr[i10] - Integer.MIN_VALUE;
            int i12 = iArr2[i10] - Integer.MIN_VALUE;
            if (i11 < i12) {
                return true;
            }
            if (i11 > i12) {
                return false;
            }
            i10--;
        } while (i10 >= 0);
        return false;
    }

    public static void subShifted_NP(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c2 = ' ';
        long j6 = f27959M;
        long j10 = 0;
        if (i13 == 0) {
            long j11 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                int i15 = i14 - i12;
                long j12 = (j10 + (iArr[i14] & f27959M)) - (iArr3[i15] & f27959M);
                long j13 = (j11 + (iArr3[i14] & f27959M)) - (iArr2[i15] & f27959M);
                iArr3[i14] = (int) j13;
                j11 = j13 >> 32;
                long j14 = j12 - (iArr3[i15] & f27959M);
                iArr[i14] = (int) j14;
                j10 = j14 >> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j15 = 0;
        while (i16 <= i10) {
            int i20 = i16 - i12;
            int i21 = iArr3[i20];
            char c10 = c2;
            int i22 = -i13;
            long j16 = j6;
            int i23 = iArr2[i20];
            long j17 = (j15 + (iArr3[i16] & j16)) - (((i23 << i13) | (i18 >>> i22)) & j16);
            iArr3[i16] = (int) j17;
            j15 = j17 >> c10;
            int i24 = iArr3[i20];
            long j18 = ((j10 + (iArr[i16] & j16)) - (((i21 << i13) | (i17 >>> i22)) & j16)) - (((i19 >>> i22) | (i24 << i13)) & j16);
            iArr[i16] = (int) j18;
            j10 = j18 >> c10;
            i16++;
            c2 = c10;
            i18 = i23;
            i19 = i24;
            i17 = i21;
            j6 = j16;
        }
    }

    public static void subShifted_UV(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c2 = ' ';
        long j6 = f27959M;
        long j10 = 0;
        if (i13 == 0) {
            long j11 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                long j12 = j10 + (iArr[i14] & f27959M);
                long j13 = j11 + (iArr2[i14] & f27959M);
                int i15 = i14 - i12;
                long j14 = j12 - (iArr3[i15] & f27959M);
                long j15 = j13 - (iArr4[i15] & f27959M);
                iArr[i14] = (int) j14;
                j10 = j14 >> 32;
                iArr2[i14] = (int) j15;
                j11 = j15 >> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        long j16 = 0;
        while (i16 <= i10) {
            int i19 = i16 - i12;
            int i20 = iArr3[i19];
            int i21 = iArr4[i19];
            char c10 = c2;
            long j17 = j6;
            long j18 = j10 + (iArr[i16] & j17);
            long j19 = j18 - (((i17 >>> (-i13)) | (i20 << i13)) & j17);
            long j20 = (j16 + (iArr2[i16] & j17)) - (((i18 >>> r3) | (i21 << i13)) & j17);
            iArr[i16] = (int) j19;
            j10 = j19 >> c10;
            iArr2[i16] = (int) j20;
            j16 = j20 >> c10;
            i16++;
            c2 = c10;
            i18 = i21;
            i17 = i20;
            j6 = j17;
        }
    }
}
