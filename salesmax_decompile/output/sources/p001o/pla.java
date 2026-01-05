package p001o;

import p001o.k16;

/* loaded from: classes6.dex */
public abstract class pla {
    /* renamed from: a */
    public static final long m43837a(long j, long j2, long j3) {
        if (!k16.m34866L(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: b */
    public static final long m43838b(long j) {
        return j < 0 ? k16.f31358b.m34899b() : k16.f31358b.m34898a();
    }

    /* renamed from: c */
    public static final long m43839c(long j, o16 o16Var, long j2) {
        sq8.m48649h(o16Var, "unit");
        long jM34875U = k16.m34875U(j2, o16Var);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m43837a(j, j2, jM34875U);
        }
        if ((1 | (jM34875U - 1)) == Long.MAX_VALUE) {
            return m43840d(j, o16Var, j2);
        }
        long j3 = j + jM34875U;
        return ((j ^ j3) & (jM34875U ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* renamed from: d */
    public static final long m43840d(long j, o16 o16Var, long j2) {
        long jM34887r = k16.m34887r(j2, 2);
        long jM34875U = k16.m34875U(jM34887r, o16Var);
        return ((1 | (jM34875U - 1)) > Long.MAX_VALUE ? 1 : ((1 | (jM34875U - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? jM34875U : m43839c(m43839c(j, o16Var, jM34887r), o16Var, k16.m34869O(j2, jM34887r));
    }

    /* renamed from: e */
    public static final long m43841e(long j, long j2, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        return ((1 | (j2 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j2 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? k16.m34877W(m43838b(j2)) : m43842f(j, j2, o16Var);
    }

    /* renamed from: f */
    public static final long m43842f(long j, long j2, o16 o16Var) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return m16.m38176t(j3, o16Var);
        }
        o16 o16Var2 = o16.MILLISECONDS;
        if (o16Var.compareTo(o16Var2) >= 0) {
            return k16.m34877W(m43838b(j3));
        }
        long jM42864b = p16.m42864b(1L, o16Var2, o16Var);
        long j4 = (j / jM42864b) - (j2 / jM42864b);
        long j5 = (j % jM42864b) - (j2 % jM42864b);
        k16.C14700a c14700a = k16.f31358b;
        return k16.m34870P(m16.m38176t(j4, o16Var2), m16.m38176t(j5, o16Var));
    }

    /* renamed from: g */
    public static final long m43843g(long j, long j2, o16 o16Var) {
        sq8.m48649h(o16Var, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return j == j2 ? k16.f31358b.m34900c() : k16.m34877W(m43838b(j2));
        }
        return (1 | (j - 1)) == Long.MAX_VALUE ? m43838b(j) : m43842f(j, j2, o16Var);
    }
}
