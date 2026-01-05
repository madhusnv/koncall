package og;

import ox.C5770a;
import ox.EnumC5772c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class db {
    /* renamed from: a */
    public static final long m10605a(long j6) {
        if (j6 < 0) {
            int i10 = C5770a.f28335d;
            return C5770a.f28334c;
        }
        int i11 = C5770a.f28335d;
        return C5770a.f28333b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m10606b(long r18, long r20, ox.EnumC5772c r22) {
        /*
            r0 = r18
            r2 = r20
            r4 = r22
            java.lang.String r5 = "unit"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r5)
            long r5 = ox.C5770a.m11302m(r20, r22)
            r7 = 1
            long r9 = r0 - r7
            long r9 = r9 | r7
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 0
            if (r9 != 0) goto L35
            boolean r2 = ox.C5770a.m11297h(r2)
            if (r2 == 0) goto L34
            long r2 = r0 ^ r5
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 < 0) goto L2c
            goto L34
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinities of different signs"
            r0.<init>(r1)
            throw r0
        L34:
            return r0
        L35:
            long r9 = r5 - r7
            long r9 = r9 | r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto La9
            int r5 = (int) r2
            r6 = 1
            r5 = r5 & r6
            r9 = 2
            if (r5 != 0) goto L4d
            long r5 = r2 >> r6
            long r9 = (long) r9
            long r5 = r5 / r9
            long r5 = og.bb.m10548d(r5)
        L4a:
            r16 = r7
            goto L8b
        L4d:
            boolean r5 = ox.C5770a.m11297h(r2)
            if (r5 == 0) goto L5c
            int r5 = java.lang.Integer.signum(r9)
            long r5 = ox.C5770a.m11300k(r5, r2)
            goto L4a
        L5c:
            long r5 = r2 >> r6
            long r9 = (long) r9
            long r13 = r5 / r9
            r15 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 > 0) goto L85
            r15 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 >= 0) goto L85
            long r15 = r13 * r9
            long r5 = r5 - r15
            r15 = 1000000(0xf4240, float:1.401298E-39)
            r16 = r7
            long r7 = (long) r15
            long r5 = r5 * r7
            long r5 = r5 / r9
            long r13 = r13 * r7
            long r13 = r13 + r5
            long r5 = og.bb.m10548d(r13)
            goto L8b
        L85:
            r16 = r7
            long r5 = og.bb.m10546b(r13)
        L8b:
            long r7 = ox.C5770a.m11302m(r5, r4)
            long r9 = r7 - r16
            long r9 = r9 | r16
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L98
            return r7
        L98:
            long r0 = m10606b(r0, r5, r4)
            long r5 = ox.C5770a.m11304o(r5)
            long r2 = ox.C5770a.m11299j(r2, r5)
            long r0 = m10606b(r0, r2, r4)
            return r0
        La9:
            long r2 = r0 + r5
            long r7 = r0 ^ r2
            long r4 = r5 ^ r2
            long r4 = r4 & r7
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto Lbc
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto Lbb
            r0 = -9223372036854775808
            return r0
        Lbb:
            return r11
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.db.m10606b(long, long, ox.c):long");
    }

    /* renamed from: c */
    public static final long m10607c(long j6, long j10, EnumC5772c enumC5772c) {
        long j11 = j6 - j10;
        if (((j11 ^ j6) & (~(j11 ^ j10))) >= 0) {
            return bb.m10552h(j11, enumC5772c);
        }
        EnumC5772c enumC5772c2 = EnumC5772c.MILLISECONDS;
        if (enumC5772c.compareTo(enumC5772c2) >= 0) {
            return C5770a.m11304o(m10605a(j11));
        }
        long jM10574b = cb.m10574b(1L, enumC5772c2, enumC5772c);
        long j12 = (j6 / jM10574b) - (j10 / jM10574b);
        long j13 = (j6 % jM10574b) - (j10 % jM10574b);
        int i10 = C5770a.f28335d;
        return C5770a.m11299j(bb.m10552h(j12, enumC5772c2), bb.m10552h(j13, enumC5772c));
    }

    /* renamed from: d */
    public static boolean m10608d(byte b10) {
        return b10 > -65;
    }
}
