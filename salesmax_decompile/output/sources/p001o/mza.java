package p001o;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public abstract class mza {
    /* renamed from: a */
    public static void m39911a(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
    }

    /* renamed from: b */
    public static void m39912b(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
    }

    /* renamed from: c */
    public static void m39913c(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    /* renamed from: d */
    public static long m39914d(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* renamed from: e */
    public static int m39915e(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be > 0");
    }

    /* renamed from: f */
    public static void m39916f(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
