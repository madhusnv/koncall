package og;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import qw.C6370t;
import qw.C6372v;
import qw.C6375y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class fa {
    /* renamed from: a */
    public static int m10642a(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte m10643b(java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r0)
            r0 = 10
            qw.t r0 = m10644c(r0, r4)
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.f30770a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 <= 0) goto L1d
            goto L24
        L1d:
            byte r0 = (byte) r0
            qw.r r2 = new qw.r
            r2.<init>(r0)
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L2a
            byte r4 = r2.f30768a
            return r4
        L2a:
            nx.AbstractC5185w.m10132n(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: og.fa.m10643b(java.lang.String):byte");
    }

    /* renamed from: c */
    public static final C6370t m10644c(int i10, String str) {
        int i11;
        AbstractC4154l.m8923f(str, "<this>");
        d2.m10599b(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4154l.m8924g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int i13 = 119304647;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            int i14 = i12 ^ Integer.MIN_VALUE;
            if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 != 119304647) {
                    return null;
                }
                i13 = (int) (((-1) & 4294967295L) / (4294967295L & i10));
                if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i15 = i12 * i10;
            int i16 = iDigit + i15;
            if (Integer.compare(i16 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = i16;
        }
        return new C6370t(i12);
    }

    /* renamed from: d */
    public static final C6372v m10645d(String str) {
        int i10;
        long j6;
        AbstractC4154l.m8923f(str, "<this>");
        int i11 = 10;
        d2.m10599b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (AbstractC4154l.m8924g(cCharAt, 48) >= 0) {
            i10 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i10 = 1;
        }
        long j10 = 10;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), i11);
            if (iDigit < 0) {
                return null;
            }
            int i13 = length;
            long j13 = j11 ^ Long.MIN_VALUE;
            int i14 = i10;
            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) <= 0) {
                j6 = j10;
            } else {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                if (j10 >= 0) {
                    long j14 = (Long.MAX_VALUE / j10) << i12;
                    j6 = j10;
                    j12 = j14 + ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE) ? i12 : 0);
                } else if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                    j6 = j10;
                    j12 = 0;
                } else {
                    j12 = 1;
                    j6 = j10;
                }
                if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j15 = j11 * j6;
            long j16 = (iDigit & 4294967295L) + j15;
            if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i10 = i14 + 1;
            j11 = j16;
            length = i13;
            j10 = j6;
            i11 = 10;
            i12 = 1;
        }
        return new C6372v(j11);
    }

    /* renamed from: e */
    public static final C6375y m10646e(int i10, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        C6370t c6370tM10644c = m10644c(i10, str);
        if (c6370tM10644c == null) {
            return null;
        }
        int i11 = c6370tM10644c.f30770a;
        if (Integer.compare(Integer.MIN_VALUE ^ i11, -2147418113) > 0) {
            return null;
        }
        return new C6375y((short) i11);
    }
}
