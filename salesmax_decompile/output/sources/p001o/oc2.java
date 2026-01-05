package p001o;

/* loaded from: classes2.dex */
public final class oc2 implements zl5 {

    /* renamed from: a */
    public final C15759a f38106a = new C15759a(null, null, null, 0, 15, null);

    /* renamed from: b */
    public final xx5 f38107b = new C15760b();

    /* renamed from: o.oc2$a */
    public static final class C15759a {

        /* renamed from: a */
        public zl5 f38108a;

        /* renamed from: b */
        public qh9 f38109b;

        /* renamed from: c */
        public mc2 f38110c;

        /* renamed from: d */
        public long f38111d;

        public /* synthetic */ C15759a(zl5 zl5Var, qh9 qh9Var, mc2 mc2Var, long j, id5 id5Var) {
            this(zl5Var, qh9Var, mc2Var, j);
        }

        /* renamed from: a */
        public final zl5 m41952a() {
            return this.f38108a;
        }

        /* renamed from: b */
        public final qh9 m41953b() {
            return this.f38109b;
        }

        /* renamed from: c */
        public final mc2 m41954c() {
            return this.f38110c;
        }

        /* renamed from: d */
        public final long m41955d() {
            return this.f38111d;
        }

        /* renamed from: e */
        public final zl5 m41956e() {
            return this.f38108a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15759a)) {
                return false;
            }
            C15759a c15759a = (C15759a) obj;
            return sq8.m48644c(this.f38108a, c15759a.f38108a) && this.f38109b == c15759a.f38109b && sq8.m48644c(this.f38110c, c15759a.f38110c) && evf.m25655d(this.f38111d, c15759a.f38111d);
        }

        /* renamed from: f */
        public final void m41957f(mc2 mc2Var) {
            sq8.m48649h(mc2Var, "<set-?>");
            this.f38110c = mc2Var;
        }

        /* renamed from: g */
        public final void m41958g(zl5 zl5Var) {
            sq8.m48649h(zl5Var, "<set-?>");
            this.f38108a = zl5Var;
        }

        /* renamed from: h */
        public final void m41959h(qh9 qh9Var) {
            sq8.m48649h(qh9Var, "<set-?>");
            this.f38109b = qh9Var;
        }

        public int hashCode() {
            return (((((this.f38108a.hashCode() * 31) + this.f38109b.hashCode()) * 31) + this.f38110c.hashCode()) * 31) + evf.m25658g(this.f38111d);
        }

        /* renamed from: i */
        public final void m41960i(long j) {
            this.f38111d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.f38108a + ", layoutDirection=" + this.f38109b + ", canvas=" + this.f38110c + ", size=" + ((Object) evf.m25659h(this.f38111d)) + ')';
        }

        public C15759a(zl5 zl5Var, qh9 qh9Var, mc2 mc2Var, long j) {
            sq8.m48649h(zl5Var, "density");
            sq8.m48649h(qh9Var, "layoutDirection");
            sq8.m48649h(mc2Var, "canvas");
            this.f38108a = zl5Var;
            this.f38109b = qh9Var;
            this.f38110c = mc2Var;
            this.f38111d = j;
        }

        public /* synthetic */ C15759a(zl5 zl5Var, qh9 qh9Var, mc2 mc2Var, long j, int i, id5 id5Var) {
            this((i & 1) != 0 ? pc2.f39791a : zl5Var, (i & 2) != 0 ? qh9.Ltr : qh9Var, (i & 4) != 0 ? new c66() : mc2Var, (i & 8) != 0 ? evf.f22225a.m25661b() : j, null);
        }
    }

    /* renamed from: o.oc2$b */
    public static final class C15760b implements xx5 {

        /* renamed from: a */
        public final cy5 f38112a = pc2.m43328c(this);

        public C15760b() {
        }
    }

    /* renamed from: a */
    public final C15759a m41951a() {
        return this.f38106a;
    }

    @Override // p001o.zl5
    public float getDensity() {
        return this.f38106a.m41956e().getDensity();
    }

    @Override // p001o.zl5
    /* renamed from: x */
    public float mo17436x() {
        return this.f38106a.m41956e().mo17436x();
    }
}
