package p001o;

/* loaded from: classes2.dex */
public abstract class gcd {
    /* renamed from: a */
    public static final boolean m28430a(long j, long j2) {
        return (m28436g(j) * m28437h(j2)) - (m28437h(j) * m28436g(j2)) > 0.0f;
    }

    /* renamed from: b */
    public static final long m28431b(long j, float f) {
        return f37.m26029b(m28436g(j) / f, m28437h(j) / f);
    }

    /* renamed from: c */
    public static final float m28432c(long j, float f, float f2) {
        return (m28436g(j) * f) + (m28437h(j) * f2);
    }

    /* renamed from: d */
    public static final float m28433d(long j, long j2) {
        return (m28436g(j) * m28436g(j2)) + (m28437h(j) * m28437h(j2));
    }

    /* renamed from: e */
    public static final long m28434e(long j) {
        float fM28435f = m28435f(j);
        if (fM28435f > 0.0f) {
            return m28431b(j, fM28435f);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector".toString());
    }

    /* renamed from: f */
    public static final float m28435f(long j) {
        return (float) Math.sqrt((m28436g(j) * m28436g(j)) + (m28437h(j) * m28437h(j)));
    }

    /* renamed from: g */
    public static final float m28436g(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: h */
    public static final float m28437h(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: i */
    public static final long m28438i(long j, long j2, float f) {
        return f37.m26029b(gri.m29422i(m28436g(j), m28436g(j2), f), gri.m29422i(m28437h(j), m28437h(j2), f));
    }

    /* renamed from: j */
    public static final long m28439j(long j, long j2) {
        return f37.m26029b(m28436g(j) - m28436g(j2), m28437h(j) - m28437h(j2));
    }

    /* renamed from: k */
    public static final long m28440k(long j, long j2) {
        return f37.m26029b(m28436g(j) + m28436g(j2), m28437h(j) + m28437h(j2));
    }

    /* renamed from: l */
    public static final long m28441l(long j, float f) {
        return f37.m26029b(m28436g(j) * f, m28437h(j) * f);
    }

    /* renamed from: m */
    public static final long m28442m(long j, jcd jcdVar) {
        sq8.m48649h(jcdVar, "f");
        long jMo33533a = jcdVar.mo33533a(m28436g(j), m28437h(j));
        return f37.m26029b(Float.intBitsToFloat((int) (jMo33533a >> 32)), Float.intBitsToFloat((int) (jMo33533a & 4294967295L)));
    }
}
