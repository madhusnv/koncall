package og;

import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import ox.AbstractC5771b;
import ox.C5770a;
import ox.EnumC5772c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class bb {
    /* renamed from: a */
    public static final long m10545a(String str) {
        EnumC5772c enumC5772c;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i10 = C5770a.f28335d;
        char cCharAt2 = str.charAt(0);
        int i11 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z6 = i11 > 0 && AbstractC5178p.m10113X(str, '-');
        if (length <= i11) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i11) != 'P') {
            throw new IllegalArgumentException();
        }
        int i12 = i11 + 1;
        if (i12 == length) {
            throw new IllegalArgumentException();
        }
        EnumC5772c enumC5772c2 = null;
        long jM11299j = 0;
        boolean z10 = false;
        while (i12 < length) {
            if (str.charAt(i12) != 'T') {
                int i13 = i12;
                while (i13 < str.length() && (('0' <= (cCharAt = str.charAt(i13)) && cCharAt < ':') || AbstractC5178p.m10117y("+-.", cCharAt))) {
                    i13++;
                }
                String strSubstring = str.substring(i12, i13);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i12;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i14 = length2 + 1;
                if (z10) {
                    if (cCharAt3 == 'H') {
                        enumC5772c = EnumC5772c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        enumC5772c = EnumC5772c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        enumC5772c = EnumC5772c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    enumC5772c = EnumC5772c.DAYS;
                }
                if (enumC5772c2 != null && enumC5772c2.compareTo(enumC5772c) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iM10098I = AbstractC5178p.m10098I(strSubstring, '.', 0, 6);
                if (enumC5772c != EnumC5772c.SECONDS || iM10098I <= 0) {
                    jM11299j = C5770a.m11299j(jM11299j, m10552h(m10549e(strSubstring), enumC5772c));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iM10098I);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    long jM11299j2 = C5770a.m11299j(jM11299j, m10552h(m10549e(strSubstring2), enumC5772c));
                    String strSubstring3 = strSubstring.substring(iM10098I);
                    AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                    jM11299j = C5770a.m11299j(jM11299j2, m10550f(Double.parseDouble(strSubstring3), enumC5772c));
                }
                enumC5772c2 = enumC5772c;
                i12 = i14;
            } else {
                if (z10 || (i12 = i12 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z10 = true;
            }
        }
        return z6 ? C5770a.m11304o(jM11299j) : jM11299j;
    }

    /* renamed from: b */
    public static final long m10546b(long j6) {
        long j10 = (j6 << 1) + 1;
        int i10 = C5770a.f28335d;
        int i11 = AbstractC5771b.f28337a;
        return j10;
    }

    /* renamed from: c */
    public static final long m10547c(long j6) {
        return (-4611686018426L > j6 || j6 >= 4611686018427L) ? m10546b(pg.w9.m11913d(j6, -4611686018427387903L, 4611686018427387903L)) : m10548d(j6 * 1000000);
    }

    /* renamed from: d */
    public static final long m10548d(long j6) {
        long j10 = j6 << 1;
        int i10 = C5770a.f28335d;
        int i11 = AbstractC5771b.f28337a;
        return j10;
    }

    /* renamed from: e */
    public static final long m10549e(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !AbstractC5178p.m10117y("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!AbstractC5185w.m10138t(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC5178p.m10090A(1, str));
    }

    /* renamed from: f */
    public static final long m10550f(double d2, EnumC5772c unit) {
        AbstractC4154l.m8923f(unit, "unit");
        double dM10573a = cb.m10573a(d2, unit, EnumC5772c.NANOSECONDS);
        if (Double.isNaN(dM10573a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM6748l = AbstractC2747a.m6748l(dM10573a);
        return (-4611686018426999999L > jM6748l || jM6748l >= 4611686018427000000L) ? m10547c(AbstractC2747a.m6748l(cb.m10573a(d2, unit, EnumC5772c.MILLISECONDS))) : m10548d(jM6748l);
    }

    /* renamed from: g */
    public static final long m10551g(int i10, EnumC5772c unit) {
        AbstractC4154l.m8923f(unit, "unit");
        return unit.compareTo(EnumC5772c.SECONDS) <= 0 ? m10548d(cb.m10575c(i10, unit, EnumC5772c.NANOSECONDS)) : m10552h(i10, unit);
    }

    /* renamed from: h */
    public static final long m10552h(long j6, EnumC5772c unit) {
        AbstractC4154l.m8923f(unit, "unit");
        EnumC5772c enumC5772c = EnumC5772c.NANOSECONDS;
        long jM10575c = cb.m10575c(4611686018426999999L, enumC5772c, unit);
        return ((-jM10575c) > j6 || j6 > jM10575c) ? m10546b(pg.w9.m11913d(cb.m10574b(j6, unit, EnumC5772c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m10548d(cb.m10575c(j6, unit, enumC5772c));
    }

    /* renamed from: i */
    public static int m10553i(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }
}
