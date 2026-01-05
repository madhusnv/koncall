package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zte extends ei3 {

    /* renamed from: t */
    public static final C18705a f57684t = new C18705a(null);

    /* renamed from: u */
    public static final gx5 f57685u = new gx5() { // from class: o.ste
        @Override // p001o.gx5
        /* renamed from: a */
        public final double mo28788a(double d) {
            return zte.m59907t(d);
        }
    };

    /* renamed from: e */
    public final m8j f57686e;

    /* renamed from: f */
    public final float f57687f;

    /* renamed from: g */
    public final float f57688g;

    /* renamed from: h */
    public final nuh f57689h;

    /* renamed from: i */
    public final float[] f57690i;

    /* renamed from: j */
    public final float[] f57691j;

    /* renamed from: k */
    public final float[] f57692k;

    /* renamed from: l */
    public final gx5 f57693l;

    /* renamed from: m */
    public final xk7 f57694m;

    /* renamed from: n */
    public final gx5 f57695n;

    /* renamed from: o */
    public final gx5 f57696o;

    /* renamed from: p */
    public final xk7 f57697p;

    /* renamed from: q */
    public final gx5 f57698q;

    /* renamed from: r */
    public final boolean f57699r;

    /* renamed from: s */
    public final boolean f57700s;

    /* renamed from: o.zte$a */
    public static final class C18705a {
        public C18705a() {
        }

        public /* synthetic */ C18705a(id5 id5Var) {
            this();
        }

        /* renamed from: e */
        public final float m59925e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        /* renamed from: f */
        public final boolean m59926f(double d, gx5 gx5Var, gx5 gx5Var2) {
            return Math.abs(gx5Var.mo28788a(d) - gx5Var2.mo28788a(d)) <= 0.001d;
        }

        /* renamed from: g */
        public final float[] m59927g(float[] fArr, m8j m8jVar) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float fM38577a = m8jVar.m38577a();
            float fM38578b = m8jVar.m38578b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - fM38577a) / fM38578b;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (fM38577a / fM38578b) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        /* renamed from: h */
        public final boolean m59928h(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            return m59929i(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f && m59929i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && m59929i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && m59929i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && m59929i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && m59929i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        /* renamed from: i */
        public final float m59929i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: j */
        public final boolean m59930j(float[] fArr, m8j m8jVar, gx5 gx5Var, gx5 gx5Var2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ii3 ii3Var = ii3.f28698a;
            if (!fi3.m26719g(fArr, ii3Var.m32168i()) || !fi3.m26718f(m8jVar, ec8.f21384a.m24774e())) {
                return false;
            }
            if (!(f == 0.0f)) {
                return false;
            }
            if (!(f2 == 1.0f)) {
                return false;
            }
            zte zteVarM32167h = ii3Var.m32167h();
            for (double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE; d <= 1.0d; d += 0.00392156862745098d) {
                if (!m59926f(d, gx5Var, zteVarM32167h.m59918H()) || !m59926f(d, gx5Var2, zteVarM32167h.m59915E())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public final boolean m59931k(float[] fArr, float f, float f2) {
            float fM59925e = m59925e(fArr);
            ii3 ii3Var = ii3.f28698a;
            return (fM59925e / m59925e(ii3Var.m32165f()) > 0.9f && m59928h(fArr, ii3Var.m32168i())) || (f < 0.0f && f2 > 1.0f);
        }

        /* renamed from: l */
        public final float[] m59932l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                fp0.m27262k(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    /* renamed from: o.zte$b */
    public static final class C18706b extends kf9 implements xk7 {
        public C18706b() {
            super(1);
        }

        /* renamed from: a */
        public final Double m59933a(double d) {
            return Double.valueOf(zte.this.m59915E().mo28788a(bce.m18606i(d, zte.this.f57687f, zte.this.f57688g)));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m59933a(((Number) obj).doubleValue());
        }
    }

    /* renamed from: o.zte$c */
    public static final class C18707c extends kf9 implements xk7 {
        public C18707c() {
            super(1);
        }

        /* renamed from: a */
        public final Double m59934a(double d) {
            return Double.valueOf(bce.m18606i(zte.this.m59918H().mo28788a(d), zte.this.f57687f, zte.this.f57688g));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m59934a(((Number) obj).doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zte(String str, float[] fArr, m8j m8jVar, float[] fArr2, gx5 gx5Var, gx5 gx5Var2, float f, float f2, nuh nuhVar, int i) {
        super(str, th3.f47123a.m49878b(), i, null);
        sq8.m48649h(str, "name");
        sq8.m48649h(fArr, "primaries");
        sq8.m48649h(m8jVar, "whitePoint");
        sq8.m48649h(gx5Var, "oetf");
        sq8.m48649h(gx5Var2, "eotf");
        this.f57686e = m8jVar;
        this.f57687f = f;
        this.f57688g = f2;
        this.f57689h = nuhVar;
        this.f57693l = gx5Var;
        this.f57694m = new C18707c();
        this.f57695n = new gx5() { // from class: o.qte
            @Override // p001o.gx5
            /* renamed from: a */
            public final double mo28788a(double d) {
                return zte.m59897K(this.f42396a, d);
            }
        };
        this.f57696o = gx5Var2;
        this.f57697p = new C18706b();
        this.f57698q = new gx5() { // from class: o.rte
            @Override // p001o.gx5
            /* renamed from: a */
            public final double mo28788a(double d) {
                return zte.m59896C(this.f44062a, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        C18705a c18705a = f57684t;
        float[] fArrM59932l = c18705a.m59932l(fArr);
        this.f57690i = fArrM59932l;
        if (fArr2 == null) {
            this.f57691j = c18705a.m59927g(fArrM59932l, m8jVar);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f57691j = fArr2;
        }
        this.f57692k = fi3.m26722j(this.f57691j);
        this.f57699r = c18705a.m59931k(fArrM59932l, f, f2);
        this.f57700s = c18705a.m59930j(fArrM59932l, m8jVar, gx5Var, gx5Var2, f, f2, i);
    }

    /* renamed from: C */
    public static final double m59896C(zte zteVar, double d) {
        sq8.m48649h(zteVar, "this$0");
        return zteVar.f57696o.mo28788a(bce.m18606i(d, zteVar.f57687f, zteVar.f57688g));
    }

    /* renamed from: K */
    public static final double m59897K(zte zteVar, double d) {
        sq8.m48649h(zteVar, "this$0");
        return bce.m18606i(zteVar.f57693l.mo28788a(d), zteVar.f57687f, zteVar.f57688g);
    }

    /* renamed from: t */
    public static final double m59907t(double d) {
        return d;
    }

    /* renamed from: u */
    public static final double m59908u(double d, double d2) {
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* renamed from: v */
    public static final double m59909v(double d, double d2) {
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* renamed from: w */
    public static final double m59910w(nuh nuhVar, double d) {
        sq8.m48649h(nuhVar, "$function");
        return fi3.m26729q(d, nuhVar.m41167a(), nuhVar.m41168b(), nuhVar.m41169c(), nuhVar.m41170d(), nuhVar.m41173g());
    }

    /* renamed from: x */
    public static final double m59911x(nuh nuhVar, double d) {
        sq8.m48649h(nuhVar, "$function");
        return fi3.m26730r(d, nuhVar.m41167a(), nuhVar.m41168b(), nuhVar.m41169c(), nuhVar.m41170d(), nuhVar.m41171e(), nuhVar.m41172f(), nuhVar.m41173g());
    }

    /* renamed from: y */
    public static final double m59912y(nuh nuhVar, double d) {
        sq8.m48649h(nuhVar, "$function");
        return fi3.m26731s(d, nuhVar.m41167a(), nuhVar.m41168b(), nuhVar.m41169c(), nuhVar.m41170d(), nuhVar.m41173g());
    }

    /* renamed from: z */
    public static final double m59913z(nuh nuhVar, double d) {
        sq8.m48649h(nuhVar, "$function");
        return fi3.m26732t(d, nuhVar.m41167a(), nuhVar.m41168b(), nuhVar.m41169c(), nuhVar.m41170d(), nuhVar.m41171e(), nuhVar.m41172f(), nuhVar.m41173g());
    }

    /* renamed from: D */
    public final gx5 m59914D() {
        return this.f57698q;
    }

    /* renamed from: E */
    public final gx5 m59915E() {
        return this.f57696o;
    }

    /* renamed from: F */
    public final float[] m59916F() {
        return this.f57692k;
    }

    /* renamed from: G */
    public final gx5 m59917G() {
        return this.f57695n;
    }

    /* renamed from: H */
    public final gx5 m59918H() {
        return this.f57693l;
    }

    /* renamed from: I */
    public final float[] m59919I() {
        return this.f57691j;
    }

    /* renamed from: J */
    public final m8j m59920J() {
        return this.f57686e;
    }

    @Override // p001o.ei3
    /* renamed from: c */
    public float mo17011c(int i) {
        return this.f57688g;
    }

    @Override // p001o.ei3
    /* renamed from: d */
    public float mo17012d(int i) {
        return this.f57687f;
    }

    @Override // p001o.ei3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zte.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        zte zteVar = (zte) obj;
        if (Float.compare(zteVar.f57687f, this.f57687f) != 0 || Float.compare(zteVar.f57688g, this.f57688g) != 0 || !sq8.m48644c(this.f57686e, zteVar.f57686e) || !Arrays.equals(this.f57690i, zteVar.f57690i)) {
            return false;
        }
        nuh nuhVar = this.f57689h;
        if (nuhVar != null) {
            return sq8.m48644c(nuhVar, zteVar.f57689h);
        }
        if (zteVar.f57689h == null) {
            return true;
        }
        if (sq8.m48644c(this.f57693l, zteVar.f57693l)) {
            return sq8.m48644c(this.f57696o, zteVar.f57696o);
        }
        return false;
    }

    @Override // p001o.ei3
    /* renamed from: g */
    public boolean mo25096g() {
        return this.f57700s;
    }

    @Override // p001o.ei3
    /* renamed from: h */
    public long mo17013h(float f, float f2, float f3) {
        float fMo28788a = (float) this.f57698q.mo28788a(f);
        float fMo28788a2 = (float) this.f57698q.mo28788a(f2);
        float fMo28788a3 = (float) this.f57698q.mo28788a(f3);
        float fM26726n = fi3.m26726n(this.f57691j, fMo28788a, fMo28788a2, fMo28788a3);
        float fM26727o = fi3.m26727o(this.f57691j, fMo28788a, fMo28788a2, fMo28788a3);
        return (Float.floatToIntBits(fM26726n) << 32) | (Float.floatToIntBits(fM26727o) & 4294967295L);
    }

    @Override // p001o.ei3
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f57686e.hashCode()) * 31) + Arrays.hashCode(this.f57690i)) * 31;
        float f = this.f57687f;
        int iFloatToIntBits = (iHashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f57688g;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f2 == 0.0f) ? Float.floatToIntBits(f2) : 0)) * 31;
        nuh nuhVar = this.f57689h;
        int iHashCode2 = iFloatToIntBits2 + (nuhVar != null ? nuhVar.hashCode() : 0);
        return this.f57689h == null ? (((iHashCode2 * 31) + this.f57693l.hashCode()) * 31) + this.f57696o.hashCode() : iHashCode2;
    }

    @Override // p001o.ei3
    /* renamed from: i */
    public float mo17014i(float f, float f2, float f3) {
        return fi3.m26728p(this.f57691j, (float) this.f57698q.mo28788a(f), (float) this.f57698q.mo28788a(f2), (float) this.f57698q.mo28788a(f3));
    }

    @Override // p001o.ei3
    /* renamed from: j */
    public long mo17015j(float f, float f2, float f3, float f4, ei3 ei3Var) {
        sq8.m48649h(ei3Var, "colorSpace");
        return rh3.m46766a((float) this.f57695n.mo28788a(fi3.m26726n(this.f57692k, f, f2, f3)), (float) this.f57695n.mo28788a(fi3.m26727o(this.f57692k, f, f2, f3)), (float) this.f57695n.mo28788a(fi3.m26728p(this.f57692k, f, f2, f3)), f4, ei3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zte(String str, float[] fArr, m8j m8jVar, final nuh nuhVar, int i) {
        gx5 gx5Var;
        gx5 gx5Var2;
        sq8.m48649h(str, "name");
        sq8.m48649h(fArr, "primaries");
        sq8.m48649h(m8jVar, "whitePoint");
        sq8.m48649h(nuhVar, "function");
        if (nuhVar.m41171e() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (nuhVar.m41172f() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                gx5Var = new gx5() { // from class: o.tte
                    @Override // p001o.gx5
                    /* renamed from: a */
                    public final double mo28788a(double d) {
                        return zte.m59910w(nuhVar, d);
                    }
                };
            }
        } else {
            gx5Var = new gx5() { // from class: o.ute
                @Override // p001o.gx5
                /* renamed from: a */
                public final double mo28788a(double d) {
                    return zte.m59911x(nuhVar, d);
                }
            };
        }
        gx5 gx5Var3 = gx5Var;
        if (nuhVar.m41171e() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (nuhVar.m41172f() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                gx5Var2 = new gx5() { // from class: o.vte
                    @Override // p001o.gx5
                    /* renamed from: a */
                    public final double mo28788a(double d) {
                        return zte.m59912y(nuhVar, d);
                    }
                };
            }
        } else {
            gx5Var2 = new gx5() { // from class: o.wte
                @Override // p001o.gx5
                /* renamed from: a */
                public final double mo28788a(double d) {
                    return zte.m59913z(nuhVar, d);
                }
            };
        }
        this(str, fArr, m8jVar, null, gx5Var3, gx5Var2, 0.0f, 1.0f, nuhVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zte(String str, float[] fArr, m8j m8jVar, final double d, float f, float f2, int i) {
        gx5 gx5Var;
        gx5 gx5Var2;
        sq8.m48649h(str, "name");
        sq8.m48649h(fArr, "primaries");
        sq8.m48649h(m8jVar, "whitePoint");
        if (d == 1.0d) {
            gx5Var = f57685u;
        } else {
            gx5Var = new gx5() { // from class: o.xte
                @Override // p001o.gx5
                /* renamed from: a */
                public final double mo28788a(double d2) {
                    return zte.m59908u(d, d2);
                }
            };
        }
        gx5 gx5Var3 = gx5Var;
        if (d == 1.0d) {
            gx5Var2 = f57685u;
        } else {
            gx5Var2 = new gx5() { // from class: o.yte
                @Override // p001o.gx5
                /* renamed from: a */
                public final double mo28788a(double d2) {
                    return zte.m59909v(d, d2);
                }
            };
        }
        this(str, fArr, m8jVar, null, gx5Var3, gx5Var2, f, f2, new nuh(d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zte(zte zteVar, float[] fArr, m8j m8jVar) {
        this(zteVar.m25095f(), zteVar.f57690i, m8jVar, fArr, zteVar.f57693l, zteVar.f57696o, zteVar.f57687f, zteVar.f57688g, zteVar.f57689h, -1);
        sq8.m48649h(zteVar, "colorSpace");
        sq8.m48649h(fArr, "transform");
        sq8.m48649h(m8jVar, "whitePoint");
    }
}
