package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public final class PolynomialRingGF2 {
    private PolynomialRingGF2() {
    }

    public static int add(int i10, int i11) {
        return i10 ^ i11;
    }

    public static int degree(int i10) {
        int i11 = -1;
        while (i10 != 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static int gcd(int i10, int i11) {
        while (true) {
            int i12 = i11;
            int i13 = i10;
            i10 = i12;
            if (i10 == 0) {
                return i13;
            }
            i11 = remainder(i13, i10);
        }
    }

    public static int getIrreduciblePolynomial(int i10) {
        PrintStream printStream;
        String str;
        if (i10 < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else {
            if (i10 <= 31) {
                if (i10 == 0) {
                    return 1;
                }
                int i11 = 1 << (i10 + 1);
                for (int i12 = (1 << i10) + 1; i12 < i11; i12 += 2) {
                    if (isIrreducible(i12)) {
                        return i12;
                    }
                }
                return 0;
            }
            printStream = System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    public static boolean isIrreducible(int i10) {
        if (i10 == 0) {
            return false;
        }
        int iDegree = degree(i10) >>> 1;
        int iModMultiply = 2;
        for (int i11 = 0; i11 < iDegree; i11++) {
            iModMultiply = modMultiply(iModMultiply, iModMultiply, i10);
            if (gcd(iModMultiply ^ 2, i10) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i10, int i11, int i12) {
        int iRemainder = remainder(i10, i12);
        int iRemainder2 = remainder(i11, i12);
        int i13 = 0;
        if (iRemainder2 != 0) {
            int iDegree = 1 << degree(i12);
            while (iRemainder != 0) {
                if (((byte) (iRemainder & 1)) == 1) {
                    i13 ^= iRemainder2;
                }
                iRemainder >>>= 1;
                iRemainder2 <<= 1;
                if (iRemainder2 >= iDegree) {
                    iRemainder2 ^= i12;
                }
            }
        }
        return i13;
    }

    public static long multiply(int i10, int i11) {
        long j6 = 0;
        if (i11 != 0) {
            long j10 = i11 & 4294967295L;
            while (i10 != 0) {
                if (((byte) (i10 & 1)) == 1) {
                    j6 ^= j10;
                }
                i10 >>>= 1;
                j10 <<= 1;
            }
        }
        return j6;
    }

    public static int remainder(int i10, int i11) {
        if (i11 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i10) >= degree(i11)) {
            i10 ^= i11 << (degree(i10) - degree(i11));
        }
        return i10;
    }

    public static int rest(long j6, int i10) {
        if (i10 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j10 = i10 & 4294967295L;
        while ((j6 >>> 32) != 0) {
            j6 ^= j10 << (degree(j6) - degree(j10));
        }
        int iDegree = (int) j6;
        while (degree(iDegree) >= degree(i10)) {
            iDegree ^= i10 << (degree(iDegree) - degree(i10));
        }
        return iDegree;
    }

    public static int degree(long j6) {
        int i10 = 0;
        while (j6 != 0) {
            i10++;
            j6 >>>= 1;
        }
        return i10 - 1;
    }
}
