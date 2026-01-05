package p001o;

/* loaded from: classes3.dex */
public final class x38 implements e2e {

    /* renamed from: a */
    public final Object f53138a;

    /* renamed from: b */
    public final y38 f53139b;

    /* renamed from: c */
    public g48 f53140c;

    /* renamed from: d */
    public final jl6 f53141d;

    public x38(Object obj, y38 y38Var, g48 g48Var, jl6 jl6Var) {
        sq8.m48649h(y38Var, "protocolRequest");
        sq8.m48649h(g48Var, "protocolResponse");
        sq8.m48649h(jl6Var, "executionContext");
        this.f53138a = obj;
        this.f53139b = y38Var;
        this.f53140c = g48Var;
        this.f53141d = jl6Var;
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f53138a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f53141d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x38)) {
            return false;
        }
        x38 x38Var = (x38) obj;
        return sq8.m48644c(this.f53138a, x38Var.f53138a) && sq8.m48644c(this.f53139b, x38Var.f53139b) && sq8.m48644c(this.f53140c, x38Var.f53140c) && sq8.m48644c(this.f53141d, x38Var.f53141d);
    }

    @Override // p001o.c2e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y38 mo20099c() {
        return this.f53139b;
    }

    @Override // p001o.e2e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g48 mo24161d() {
        return this.f53140c;
    }

    /* renamed from: h */
    public void m55612h(g48 g48Var) {
        sq8.m48649h(g48Var, "<set-?>");
        this.f53140c = g48Var;
    }

    public int hashCode() {
        Object obj = this.f53138a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f53139b.hashCode()) * 31) + this.f53140c.hashCode()) * 31) + this.f53141d.hashCode();
    }

    public String toString() {
        return "HttpProtocolResponseInterceptorContext(request=" + this.f53138a + ", protocolRequest=" + this.f53139b + ", protocolResponse=" + this.f53140c + ", executionContext=" + this.f53141d + ')';
    }
}
