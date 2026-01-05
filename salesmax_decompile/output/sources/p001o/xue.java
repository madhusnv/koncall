package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class xue {

    /* renamed from: a */
    public final long f54304a;

    /* renamed from: b */
    public final long f54305b;

    /* renamed from: c */
    public final long f54306c;

    /* renamed from: d */
    public final m74 f54307d;

    /* renamed from: e */
    public final long f54308e;

    /* renamed from: f */
    public final long f54309f;

    /* renamed from: g */
    public final float f54310g;

    /* renamed from: h */
    public final float f54311h;

    /* renamed from: i */
    public final float f54312i;

    /* renamed from: j */
    public final float f54313j;

    /* renamed from: k */
    public final float f54314k;

    /* renamed from: l */
    public long f54315l;

    public /* synthetic */ xue(long j, long j2, long j3, m74 m74Var, id5 id5Var) {
        this(j, j2, j3, m74Var);
    }

    /* renamed from: a */
    public final float m56840a(float f) {
        if (f > m56844e()) {
            return this.f54311h;
        }
        float f2 = this.f54314k;
        if (f > f2) {
            return (this.f54311h * (f - f2)) / (m56844e() - this.f54314k);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final yc4 m56841b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long jM28434e = gcd.m28434e(gcd.m28439j(j2, j));
        long jM28440k = gcd.m28440k(j, gcd.m28441l(gcd.m28441l(jM28434e, f), 1 + f2));
        long jM26034g = j3;
        long jM28438i = gcd.m28438i(jM26034g, gcd.m28431b(gcd.m28440k(j3, j4), 2.0f), f2);
        long jM28440k2 = gcd.m28440k(j5, gcd.m28441l(gri.m29416c(gcd.m28436g(jM28438i) - gcd.m28436g(j5), gcd.m28437h(jM28438i) - gcd.m28437h(j5)), f3));
        f37 f37VarM56846g = m56846g(j2, jM28434e, jM28440k2, gri.m29426m(gcd.m28439j(jM28440k2, j5)));
        if (f37VarM56846g != null) {
            jM26034g = f37VarM56846g.m26034g();
        }
        return new yc4(jM28440k, gcd.m28431b(gcd.m28440k(jM28440k, gcd.m28441l(jM26034g, 2.0f)), 3.0f), jM26034g, jM28440k2, null);
    }

    /* renamed from: c */
    public final long m56842c() {
        return this.f54315l;
    }

    /* renamed from: d */
    public final List m56843d(float f, float f2) {
        float fMin = Math.min(f, f2);
        float f3 = this.f54314k;
        if (f3 < 1.0E-4f || fMin < 1.0E-4f || this.f54310g < 1.0E-4f) {
            long j = this.f54305b;
            this.f54315l = j;
            return bh3.m18963e(yc4.f55209b.m57509b(gcd.m28436g(j), gcd.m28437h(this.f54305b), gcd.m28436g(this.f54305b), gcd.m28437h(this.f54305b)));
        }
        float fMin2 = Math.min(fMin, f3);
        float fM56840a = m56840a(f);
        float fM56840a2 = m56840a(f2);
        float f4 = (this.f54310g * fMin2) / this.f54314k;
        this.f54315l = gcd.m28440k(this.f54305b, gcd.m28441l(gcd.m28434e(gcd.m28431b(gcd.m28440k(this.f54308e, this.f54309f), 2.0f)), (float) Math.sqrt(gri.m29427n(f4) + gri.m29427n(fMin2))));
        long jM28440k = gcd.m28440k(this.f54305b, gcd.m28441l(this.f54308e, fMin2));
        long jM28440k2 = gcd.m28440k(this.f54305b, gcd.m28441l(this.f54309f, fMin2));
        yc4 yc4VarM56841b = m56841b(fMin2, fM56840a, this.f54305b, this.f54304a, jM28440k, jM28440k2, this.f54315l, f4);
        yc4 yc4VarM57503l = m56841b(fMin2, fM56840a2, this.f54305b, this.f54306c, jM28440k2, jM28440k, this.f54315l, f4).m57503l();
        return ch3.m21249n(yc4VarM56841b, yc4.f55209b.m57508a(gcd.m28436g(this.f54315l), gcd.m28437h(this.f54315l), yc4VarM56841b.m57495d(), yc4VarM56841b.m57496e(), yc4VarM57503l.m57493b(), yc4VarM57503l.m57494c()), yc4VarM57503l);
    }

    /* renamed from: e */
    public final float m56844e() {
        return (1 + this.f54311h) * this.f54314k;
    }

    /* renamed from: f */
    public final float m56845f() {
        return this.f54314k;
    }

    /* renamed from: g */
    public final f37 m56846g(long j, long j2, long j3, long j4) {
        long jM29426m = gri.m29426m(j4);
        float fM28433d = gcd.m28433d(j2, jM29426m);
        if (Math.abs(fM28433d) < 1.0E-4f) {
            return null;
        }
        float fM28433d2 = gcd.m28433d(gcd.m28439j(j3, j), jM29426m);
        if (Math.abs(fM28433d) < Math.abs(fM28433d2) * 1.0E-4f) {
            return null;
        }
        return f37.m26028a(gcd.m28440k(j, gcd.m28441l(j2, fM28433d2 / fM28433d)));
    }

    public xue(long j, long j2, long j3, m74 m74Var) {
        this.f54304a = j;
        this.f54305b = j2;
        this.f54306c = j3;
        this.f54307d = m74Var;
        long jM28434e = gcd.m28434e(gcd.m28439j(j, j2));
        this.f54308e = jM28434e;
        long jM28434e2 = gcd.m28434e(gcd.m28439j(j3, j2));
        this.f54309f = jM28434e2;
        float fM38473a = m74Var != null ? m74Var.m38473a() : 0.0f;
        this.f54310g = fM38473a;
        this.f54311h = m74Var != null ? m74Var.m38474b() : 0.0f;
        float fM28433d = gcd.m28433d(jM28434e, jM28434e2);
        this.f54312i = fM28433d;
        float f = 1;
        float fSqrt = (float) Math.sqrt(f - gri.m29427n(fM28433d));
        this.f54313j = fSqrt;
        this.f54314k = ((double) fSqrt) > 0.001d ? (fM38473a * (fM28433d + f)) / fSqrt : 0.0f;
        this.f54315l = f37.m26029b(0.0f, 0.0f);
    }
}
