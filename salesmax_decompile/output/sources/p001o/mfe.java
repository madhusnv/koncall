package p001o;

/* loaded from: classes2.dex */
public final class mfe {

    /* renamed from: e */
    public static final C15309a f35356e = new C15309a(null);

    /* renamed from: f */
    public static final mfe f35357f = new mfe(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f35358a;

    /* renamed from: b */
    public final float f35359b;

    /* renamed from: c */
    public final float f35360c;

    /* renamed from: d */
    public final float f35361d;

    /* renamed from: o.mfe$a */
    public static final class C15309a {
        public C15309a() {
        }

        public /* synthetic */ C15309a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mfe m38953a() {
            return mfe.f35357f;
        }
    }

    public mfe(float f, float f2, float f3, float f4) {
        this.f35358a = f;
        this.f35359b = f2;
        this.f35360c = f3;
        this.f35361d = f4;
    }

    /* renamed from: b */
    public final boolean m38941b(long j) {
        return s9c.m48052k(j) >= this.f35358a && s9c.m48052k(j) < this.f35360c && s9c.m48053l(j) >= this.f35359b && s9c.m48053l(j) < this.f35361d;
    }

    /* renamed from: c */
    public final float m38942c() {
        return this.f35361d;
    }

    /* renamed from: d */
    public final long m38943d() {
        return v9c.m52474a(this.f35358a + (m38949j() / 2.0f), this.f35359b + (m38944e() / 2.0f));
    }

    /* renamed from: e */
    public final float m38944e() {
        return this.f35361d - this.f35359b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfe)) {
            return false;
        }
        mfe mfeVar = (mfe) obj;
        return Float.compare(this.f35358a, mfeVar.f35358a) == 0 && Float.compare(this.f35359b, mfeVar.f35359b) == 0 && Float.compare(this.f35360c, mfeVar.f35360c) == 0 && Float.compare(this.f35361d, mfeVar.f35361d) == 0;
    }

    /* renamed from: f */
    public final float m38945f() {
        return this.f35358a;
    }

    /* renamed from: g */
    public final float m38946g() {
        return this.f35360c;
    }

    /* renamed from: h */
    public final long m38947h() {
        return jvf.m34585a(m38949j(), m38944e());
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f35358a) * 31) + Float.hashCode(this.f35359b)) * 31) + Float.hashCode(this.f35360c)) * 31) + Float.hashCode(this.f35361d);
    }

    /* renamed from: i */
    public final float m38948i() {
        return this.f35359b;
    }

    /* renamed from: j */
    public final float m38949j() {
        return this.f35360c - this.f35358a;
    }

    /* renamed from: k */
    public final mfe m38950k(mfe mfeVar) {
        sq8.m48649h(mfeVar, "other");
        return new mfe(Math.max(this.f35358a, mfeVar.f35358a), Math.max(this.f35359b, mfeVar.f35359b), Math.min(this.f35360c, mfeVar.f35360c), Math.min(this.f35361d, mfeVar.f35361d));
    }

    /* renamed from: l */
    public final mfe m38951l(float f, float f2) {
        return new mfe(this.f35358a + f, this.f35359b + f2, this.f35360c + f, this.f35361d + f2);
    }

    /* renamed from: m */
    public final mfe m38952m(long j) {
        return new mfe(this.f35358a + s9c.m48052k(j), this.f35359b + s9c.m48053l(j), this.f35360c + s9c.m48052k(j), this.f35361d + s9c.m48053l(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + mo7.m39455a(this.f35358a, 1) + ", " + mo7.m39455a(this.f35359b, 1) + ", " + mo7.m39455a(this.f35360c, 1) + ", " + mo7.m39455a(this.f35361d, 1) + ')';
    }
}
