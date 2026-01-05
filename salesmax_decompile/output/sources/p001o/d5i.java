package p001o;

/* loaded from: classes3.dex */
public abstract class d5i {
    /* renamed from: a */
    public static int m22334a(long j, long j2) {
        return tla.m50159a(m22336c(j), m22336c(j2));
    }

    /* renamed from: b */
    public static long m22335b(long j, long j2) {
        if (j2 < 0) {
            return m22334a(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (m22334a(j - (j3 * j2), j2) < 0 ? 0 : 1);
    }

    /* renamed from: c */
    public static long m22336c(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* renamed from: d */
    public static String m22337d(long j) {
        return m22338e(j, 10);
    }

    /* renamed from: e */
    public static String m22338e(long j, int i) {
        dgd.m23054g(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jM22335b = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m22335b(j, i);
            long j2 = i;
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (j - (jM22335b * j2)), i);
            while (jM22335b > 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (jM22335b % j2), i);
                jM22335b /= j2;
            }
            i2 = i4;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
