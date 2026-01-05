package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class yc4 {

    /* renamed from: b */
    public static final C18376a f55209b = new C18376a(null);

    /* renamed from: a */
    public final float[] f55210a;

    /* renamed from: o.yc4$a */
    public static final class C18376a {
        public C18376a() {
        }

        public /* synthetic */ C18376a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yc4 m57508a(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = f3 - f;
            float f8 = f4 - f2;
            long jM29416c = gri.m29416c(f7, f8);
            float f9 = f5 - f;
            float f10 = f6 - f2;
            long jM29416c2 = gri.m29416c(f9, f10);
            long jM29426m = gri.m29426m(jM29416c);
            long jM29426m2 = gri.m29426m(jM29416c2);
            boolean z = gcd.m28432c(jM29426m, f9, f10) >= 0.0f;
            float fM28433d = gcd.m28433d(jM29416c, jM29416c2);
            if (fM28433d > 0.999f) {
                return m57509b(f3, f4, f5, f6);
            }
            float fM29417d = ((((gri.m29417d(f7, f8) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * r9)) - ((float) Math.sqrt(r5 - (fM28433d * fM28433d))))) / (1 - fM28433d)) * (z ? 1.0f : -1.0f);
            return ad4.m16894a(f3, f4, (gcd.m28436g(jM29426m) * fM29417d) + f3, (gcd.m28437h(jM29426m) * fM29417d) + f4, f5 - (gcd.m28436g(jM29426m2) * fM29417d), f6 - (gcd.m28437h(jM29426m2) * fM29417d), f5, f6);
        }

        /* renamed from: b */
        public final yc4 m57509b(float f, float f2, float f3, float f4) {
            return ad4.m16894a(f, f2, gri.m29422i(f, f3, 0.33333334f), gri.m29422i(f2, f4, 0.33333334f), gri.m29422i(f, f3, 0.6666667f), gri.m29422i(f2, f4, 0.6666667f), f3, f4);
        }
    }

    public /* synthetic */ yc4(long j, long j2, long j3, long j4, id5 id5Var) {
        this(j, j2, j3, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0237 A[PHI: r9 r20
      0x0237: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v2 float), (r9v2 float) binds: [B:81:0x01e2, B:101:0x0220, B:65:0x01b2, B:72:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r20v5 float) = (r20v1 float), (r20v2 float), (r20v1 float), (r20v1 float) binds: [B:81:0x01e2, B:101:0x0220, B:65:0x01b2, B:72:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9 A[PHI: r3 r7
      0x01d9: PHI (r3v19 float) = (r3v13 float), (r3v26 float) binds: [B:107:0x0234, B:78:0x01d7] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r7v17 float) = (r7v13 float), (r7v19 float) binds: [B:107:0x0234, B:78:0x01d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57492a(float[] fArr, boolean z) {
        float f;
        float fM57498g;
        float fM28437h;
        float f2;
        sq8.m48649h(fArr, "bounds");
        if (m57507p()) {
            fArr[0] = m57493b();
            fArr[1] = m57494c();
            fArr[2] = m57493b();
            fArr[3] = m57494c();
            return;
        }
        float fMin = Math.min(m57493b(), m57495d());
        float fMin2 = Math.min(m57494c(), m57496e());
        float fMax = Math.max(m57493b(), m57495d());
        float fMax2 = Math.max(m57494c(), m57496e());
        if (z) {
            fArr[0] = Math.min(fMin, Math.min(m57497f(), m57499h()));
            fArr[1] = Math.min(fMin2, Math.min(m57498g(), m57500i()));
            fArr[2] = Math.max(fMax, Math.max(m57497f(), m57499h()));
            fArr[3] = Math.max(fMax2, Math.max(m57498g(), m57500i()));
            return;
        }
        float f3 = 3;
        float fM57497f = (((-m57493b()) + (m57497f() * f3)) - (m57499h() * f3)) + m57495d();
        float f4 = 2;
        float f5 = 4;
        float fM57493b = ((m57493b() * f4) - (m57497f() * f5)) + (m57499h() * f4);
        float fM57497f2 = (-m57493b()) + m57497f();
        if (!m57506o(fM57497f)) {
            float f6 = (fM57493b * fM57493b) - ((f5 * fM57497f) * fM57497f2);
            if (f6 >= 0.0f) {
                float f7 = -fM57493b;
                double d = f6;
                f = fMin2;
                float f8 = fM57497f * f4;
                float fSqrt = (((float) Math.sqrt(d)) + f7) / f8;
                if (0.0f <= fSqrt && fSqrt <= 1.0f) {
                    float fM28436g = gcd.m28436g(m57502k(fSqrt));
                    if (fM28436g < fMin) {
                        fMin = fM28436g;
                    }
                    if (fM28436g > fMax) {
                        fMax = fM28436g;
                    }
                }
                float fSqrt2 = (f7 - ((float) Math.sqrt(d))) / f8;
                if (0.0f <= fSqrt2 && fSqrt2 <= 1.0f) {
                    float fM28436g2 = gcd.m28436g(m57502k(fSqrt2));
                    if (fM28436g2 < fMin) {
                        fMin = fM28436g2;
                    }
                    if (fM28436g2 > fMax) {
                        fMax = fM28436g2;
                    }
                }
            }
            fM57498g = (((-m57494c()) + (m57498g() * f3)) - (f3 * m57500i())) + m57496e();
            float fM57494c = ((m57494c() * f4) - (m57498g() * f5)) + (m57500i() * f4);
            float fM57498g2 = (-m57494c()) + m57498g();
            if (m57506o(fM57498g)) {
                float f9 = (fM57494c * fM57494c) - ((f5 * fM57498g) * fM57498g2);
                if (f9 >= 0.0f) {
                    float f10 = -fM57494c;
                    double d2 = f9;
                    float f11 = f4 * fM57498g;
                    float fSqrt3 = (((float) Math.sqrt(d2)) + f10) / f11;
                    if (0.0f <= fSqrt3 && fSqrt3 <= 1.0f) {
                        float fM28437h2 = gcd.m28437h(m57502k(fSqrt3));
                        if (fM28437h2 < f) {
                            f = fM28437h2;
                        }
                        if (fM28437h2 > fMax2) {
                            fMax2 = fM28437h2;
                        }
                    }
                    float fSqrt4 = (f10 - ((float) Math.sqrt(d2))) / f11;
                    if (0.0f <= fSqrt4 && fSqrt4 <= 1.0f) {
                        fM28437h = gcd.m28437h(m57502k(fSqrt4));
                        f2 = fM28437h < f ? fM28437h : f;
                        if (fM28437h > fMax2) {
                        }
                    }
                }
            } else {
                if (!(fM57494c == 0.0f)) {
                    float f12 = (f4 * fM57498g2) / ((-2) * fM57494c);
                    if (0.0f <= f12 && f12 <= 1.0f) {
                        fM28437h = gcd.m28437h(m57502k(f12));
                        f2 = fM28437h < f ? fM28437h : f;
                        if (fM28437h > fMax2) {
                            fMax2 = fM28437h;
                        }
                    } else {
                        f2 = f;
                    }
                }
            }
            fArr[0] = fMin;
            fArr[1] = f2;
            fArr[2] = fMax;
            fArr[3] = fMax2;
        }
        if (!(fM57493b == 0.0f)) {
            float f13 = (fM57497f2 * f4) / ((-2) * fM57493b);
            if (0.0f <= f13 && f13 <= 1.0f) {
                float fM28436g3 = gcd.m28436g(m57502k(f13));
                if (fM28436g3 < fMin) {
                    fMin = fM28436g3;
                }
                if (fM28436g3 > fMax) {
                    fMax = fM28436g3;
                }
            }
        }
        f = fMin2;
        fM57498g = (((-m57494c()) + (m57498g() * f3)) - (f3 * m57500i())) + m57496e();
        float fM57494c2 = ((m57494c() * f4) - (m57498g() * f5)) + (m57500i() * f4);
        float fM57498g22 = (-m57494c()) + m57498g();
        if (m57506o(fM57498g)) {
        }
        fArr[0] = fMin;
        fArr[1] = f2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
    }

    /* renamed from: b */
    public final float m57493b() {
        return this.f55210a[0];
    }

    /* renamed from: c */
    public final float m57494c() {
        return this.f55210a[1];
    }

    /* renamed from: d */
    public final float m57495d() {
        return this.f55210a[6];
    }

    /* renamed from: e */
    public final float m57496e() {
        return this.f55210a[7];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yc4) {
            return Arrays.equals(this.f55210a, ((yc4) obj).f55210a);
        }
        return false;
    }

    /* renamed from: f */
    public final float m57497f() {
        return this.f55210a[2];
    }

    /* renamed from: g */
    public final float m57498g() {
        return this.f55210a[3];
    }

    /* renamed from: h */
    public final float m57499h() {
        return this.f55210a[4];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f55210a);
    }

    /* renamed from: i */
    public final float m57500i() {
        return this.f55210a[5];
    }

    /* renamed from: j */
    public final float[] m57501j() {
        return this.f55210a;
    }

    /* renamed from: k */
    public final long m57502k(float f) {
        float f2 = 1 - f;
        float f3 = f2 * f2 * f2;
        float f4 = 3 * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = f * f * f;
        return f37.m26029b((m57493b() * f3) + (m57497f() * f5) + (m57499h() * f6) + (m57495d() * f7), (m57494c() * f3) + (m57498g() * f5) + (m57500i() * f6) + (m57496e() * f7));
    }

    /* renamed from: l */
    public final yc4 m57503l() {
        return ad4.m16894a(m57495d(), m57496e(), m57499h(), m57500i(), m57497f(), m57498g(), m57493b(), m57494c());
    }

    /* renamed from: m */
    public final hwc m57504m(float f) {
        float f2 = 1 - f;
        long jM57502k = m57502k(f);
        float f3 = f2 * f2;
        float f4 = 2 * f2 * f;
        float f5 = f * f;
        return vyh.m53620a(ad4.m16894a(m57493b(), m57494c(), (m57493b() * f2) + (m57497f() * f), (m57494c() * f2) + (m57498g() * f), (m57493b() * f3) + (m57497f() * f4) + (m57499h() * f5), (m57494c() * f3) + (m57498g() * f4) + (m57500i() * f5), gcd.m28436g(jM57502k), gcd.m28437h(jM57502k)), ad4.m16894a(gcd.m28436g(jM57502k), gcd.m28437h(jM57502k), (m57497f() * f3) + (m57499h() * f4) + (m57495d() * f5), (m57498g() * f3) + (m57500i() * f4) + (m57496e() * f5), (m57499h() * f2) + (m57495d() * f), (m57500i() * f2) + (m57496e() * f), m57495d(), m57496e()));
    }

    /* renamed from: n */
    public final yc4 m57505n(jcd jcdVar) {
        sq8.m48649h(jcdVar, "f");
        xob xobVar = new xob();
        fp0.m27262k(this.f55210a, xobVar.m57501j(), 0, 0, 0, 14, null);
        xobVar.m56534q(jcdVar);
        return xobVar;
    }

    /* renamed from: o */
    public final boolean m57506o(float f) {
        return Math.abs(f) < 1.0E-4f;
    }

    /* renamed from: p */
    public final boolean m57507p() {
        return Math.abs(m57493b() - m57495d()) < 1.0E-4f && Math.abs(m57494c() - m57496e()) < 1.0E-4f;
    }

    public String toString() {
        return "anchor0: (" + m57493b() + ", " + m57494c() + ") control0: (" + m57497f() + ", " + m57498g() + "), control1: (" + m57499h() + ", " + m57500i() + "), anchor1: (" + m57495d() + ", " + m57496e() + ')';
    }

    public yc4(float[] fArr) {
        sq8.m48649h(fArr, "points");
        this.f55210a = fArr;
        if (!(fArr.length == 8)) {
            throw new IllegalArgumentException("Points array size should be 8".toString());
        }
    }

    public /* synthetic */ yc4(float[] fArr, int i, id5 id5Var) {
        this((i & 1) != 0 ? new float[8] : fArr);
    }

    public yc4(long j, long j2, long j3, long j4) {
        this(new float[]{gcd.m28436g(j), gcd.m28437h(j), gcd.m28436g(j2), gcd.m28437h(j2), gcd.m28436g(j3), gcd.m28437h(j3), gcd.m28436g(j4), gcd.m28437h(j4)});
    }
}
