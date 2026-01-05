package p001o;

/* loaded from: classes3.dex */
public final class l18 implements ere {

    /* renamed from: a */
    public final Object f32987a;

    /* renamed from: b */
    public Object f32988b;

    /* renamed from: c */
    public final y38 f32989c;

    /* renamed from: d */
    public final g48 f32990d;

    /* renamed from: e */
    public final jl6 f32991e;

    public l18(Object obj, Object obj2, y38 y38Var, g48 g48Var, jl6 jl6Var) {
        sq8.m48649h(y38Var, "protocolRequest");
        sq8.m48649h(jl6Var, "executionContext");
        this.f32987a = obj;
        this.f32988b = obj2;
        this.f32989c = y38Var;
        this.f32990d = g48Var;
        this.f32991e = jl6Var;
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f32987a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f32991e;
    }

    @Override // p001o.ere
    /* renamed from: e */
    public Object mo25521e() {
        return this.f32988b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l18)) {
            return false;
        }
        l18 l18Var = (l18) obj;
        return sq8.m48644c(this.f32987a, l18Var.f32987a) && vre.m53353d(this.f32988b, l18Var.f32988b) && sq8.m48644c(this.f32989c, l18Var.f32989c) && sq8.m48644c(this.f32990d, l18Var.f32990d) && sq8.m48644c(this.f32991e, l18Var.f32991e);
    }

    @Override // p001o.c2e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y38 mo20099c() {
        return this.f32989c;
    }

    @Override // p001o.e2e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g48 mo24161d() {
        return this.f32990d;
    }

    /* renamed from: h */
    public void m36447h(Object obj) {
        this.f32988b = obj;
    }

    public int hashCode() {
        Object obj = this.f32987a;
        int iHashCode = (((((obj == null ? 0 : obj.hashCode()) * 31) + vre.m53355f(this.f32988b)) * 31) + this.f32989c.hashCode()) * 31;
        g48 g48Var = this.f32990d;
        return ((iHashCode + (g48Var != null ? g48Var.hashCode() : 0)) * 31) + this.f32991e.hashCode();
    }

    public String toString() {
        return "HttpAttemptInterceptorContext(request=" + this.f32987a + ", response=" + ((Object) vre.m53358i(this.f32988b)) + ", protocolRequest=" + this.f32989c + ", protocolResponse=" + this.f32990d + ", executionContext=" + this.f32991e + ')';
    }
}
