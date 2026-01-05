package p001o;

/* loaded from: classes2.dex */
public abstract class gri {

    /* renamed from: a */
    public static final long f25743a = f37.m26029b(0.0f, 0.0f);

    /* renamed from: b */
    public static final float f25744b = 3.1415927f;

    /* renamed from: c */
    public static final float f25745c = 6.2831855f;

    /* renamed from: a */
    public static final float m29414a(float f, float f2) {
        float fAtan2 = (float) Math.atan2(f2, f);
        float f3 = f25745c;
        return (fAtan2 + f3) % f3;
    }

    /* renamed from: b */
    public static final long m29415b(float f) {
        double d = f;
        return f37.m26029b((float) Math.cos(d), (float) Math.sin(d));
    }

    /* renamed from: c */
    public static final long m29416c(float f, float f2) {
        float fM29417d = m29417d(f, f2);
        if (fM29417d > 0.0f) {
            return f37.m26029b(f / fM29417d, f2 / fM29417d);
        }
        throw new IllegalArgumentException("Required distance greater than zero".toString());
    }

    /* renamed from: d */
    public static final float m29417d(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: e */
    public static final float m29418e(float f, float f2) {
        return (f * f) + (f2 * f2);
    }

    /* renamed from: f */
    public static final float m29419f(float f, float f2, float f3, j07 j07Var) {
        sq8.m48649h(j07Var, "f");
        while (f2 - f > f3) {
            float f4 = 2;
            float f5 = 3;
            float f6 = ((f4 * f) + f2) / f5;
            float f7 = ((f4 * f2) + f) / f5;
            if (j07Var.mo17017a(f6) < j07Var.mo17017a(f7)) {
                f2 = f7;
            } else {
                f = f6;
            }
        }
        return (f + f2) / 2;
    }

    /* renamed from: g */
    public static final float m29420g() {
        return f25744b;
    }

    /* renamed from: h */
    public static final float m29421h() {
        return f25745c;
    }

    /* renamed from: i */
    public static final float m29422i(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    /* renamed from: j */
    public static final float m29423j(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    /* renamed from: k */
    public static final long m29424k(float f, float f2, long j) {
        return gcd.m28440k(gcd.m28441l(m29415b(f2), f), j);
    }

    /* renamed from: l */
    public static /* synthetic */ long m29425l(float f, float f2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = f25743a;
        }
        return m29424k(f, f2, j);
    }

    /* renamed from: m */
    public static final long m29426m(long j) {
        return f37.m26029b(-gcd.m28437h(j), gcd.m28436g(j));
    }

    /* renamed from: n */
    public static final float m29427n(float f) {
        return f * f;
    }
}
