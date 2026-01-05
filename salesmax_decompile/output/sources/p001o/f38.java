package p001o;

/* loaded from: classes3.dex */
public final class f38 implements ere {

    /* renamed from: a */
    public final Object f22617a;

    /* renamed from: b */
    public Object f22618b;

    /* renamed from: c */
    public final y38 f22619c;

    /* renamed from: d */
    public final g48 f22620d;

    /* renamed from: e */
    public final jl6 f22621e;

    public f38(Object obj, Object obj2, y38 y38Var, g48 g48Var, jl6 jl6Var) {
        sq8.m48649h(jl6Var, "executionContext");
        this.f22617a = obj;
        this.f22618b = obj2;
        this.f22619c = y38Var;
        this.f22620d = g48Var;
        this.f22621e = jl6Var;
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f22617a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f22621e;
    }

    @Override // p001o.ere
    /* renamed from: e */
    public Object mo25521e() {
        return this.f22618b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f38)) {
            return false;
        }
        f38 f38Var = (f38) obj;
        return sq8.m48644c(this.f22617a, f38Var.f22617a) && vre.m53353d(this.f22618b, f38Var.f22618b) && sq8.m48644c(this.f22619c, f38Var.f22619c) && sq8.m48644c(this.f22620d, f38Var.f22620d) && sq8.m48644c(this.f22621e, f38Var.f22621e);
    }

    @Override // p001o.c2e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y38 mo20099c() {
        return this.f22619c;
    }

    @Override // p001o.e2e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g48 mo24161d() {
        return this.f22620d;
    }

    /* renamed from: h */
    public void m26037h(Object obj) {
        this.f22618b = obj;
    }

    public int hashCode() {
        Object obj = this.f22617a;
        int iHashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + vre.m53355f(this.f22618b)) * 31;
        y38 y38Var = this.f22619c;
        int iHashCode2 = (iHashCode + (y38Var == null ? 0 : y38Var.hashCode())) * 31;
        g48 g48Var = this.f22620d;
        return ((iHashCode2 + (g48Var != null ? g48Var.hashCode() : 0)) * 31) + this.f22621e.hashCode();
    }

    public String toString() {
        return "HttpFinalInterceptorContext(request=" + this.f22617a + ", response=" + ((Object) vre.m53358i(this.f22618b)) + ", protocolRequest=" + this.f22619c + ", protocolResponse=" + this.f22620d + ", executionContext=" + this.f22621e + ')';
    }
}
