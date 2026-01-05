package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class tla {

    /* renamed from: o.tla$a */
    public static final class C17150a {

        /* renamed from: a */
        public static final byte[] f47370a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f47370a = bArr;
        }

        /* renamed from: a */
        public static int m50163a(char c) {
            if (c < 128) {
                return f47370a[c];
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static int m50159a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m50160b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static long m50161c(long... jArr) {
        dgd.m23051d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    /* renamed from: d */
    public static Long m50162d(String str, int i) {
        if (((String) dgd.m23062o(str)).isEmpty()) {
            return null;
        }
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i);
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int iM50163a = C17150a.m50163a(str.charAt(i2));
        if (iM50163a < 0 || iM50163a >= i) {
            return null;
        }
        long j = -iM50163a;
        long j2 = i;
        long j3 = Long.MIN_VALUE / j2;
        while (i3 < str.length()) {
            int i4 = i3 + 1;
            int iM50163a2 = C17150a.m50163a(str.charAt(i3));
            if (iM50163a2 < 0 || iM50163a2 >= i || j < j3) {
                return null;
            }
            long j4 = j * j2;
            long j5 = iM50163a2;
            if (j4 < j5 - Long.MIN_VALUE) {
                return null;
            }
            j = j4 - j5;
            i3 = i4;
        }
        if (i2 != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
