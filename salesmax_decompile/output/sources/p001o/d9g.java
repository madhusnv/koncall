package p001o;

/* loaded from: classes6.dex */
public abstract class d9g extends c9g {
    /* renamed from: k */
    public static final Void m22637k(String str) {
        sq8.m48649h(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* renamed from: l */
    public static final Integer m22638l(String str) {
        sq8.m48649h(str, "<this>");
        return m22639m(str, 10);
    }

    /* renamed from: m */
    public static final Integer m22639m(String str, int i) {
        boolean z;
        int i2;
        int i3;
        sq8.m48649h(str, "<this>");
        ph2.m43651a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (sq8.m48651j(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iM43652b = ph2.m43652b(str.charAt(i2), i);
            if (iM43652b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iM43652b) {
                return null;
            }
            i4 = i3 - iM43652b;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    /* renamed from: n */
    public static final Long m22640n(String str) {
        sq8.m48649h(str, "<this>");
        return m22641o(str, 10);
    }

    /* renamed from: o */
    public static final Long m22641o(String str, int i) {
        boolean z;
        sq8.m48649h(str, "<this>");
        ph2.m43651a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (sq8.m48651j(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iM43652b = ph2.m43652b(str.charAt(i2), i);
            if (iM43652b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = iM43652b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
