package p001o;

/* loaded from: classes3.dex */
public final class w38 implements c2e {

    /* renamed from: a */
    public final Object f51377a;

    /* renamed from: b */
    public y38 f51378b;

    /* renamed from: c */
    public final jl6 f51379c;

    public w38(Object obj, y38 y38Var, jl6 jl6Var) {
        sq8.m48649h(y38Var, "protocolRequest");
        sq8.m48649h(jl6Var, "executionContext");
        this.f51377a = obj;
        this.f51378b = y38Var;
        this.f51379c = jl6Var;
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f51377a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f51379c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w38)) {
            return false;
        }
        w38 w38Var = (w38) obj;
        return sq8.m48644c(this.f51377a, w38Var.f51377a) && sq8.m48644c(this.f51378b, w38Var.f51378b) && sq8.m48644c(this.f51379c, w38Var.f51379c);
    }

    @Override // p001o.c2e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y38 mo20099c() {
        return this.f51378b;
    }

    /* renamed from: g */
    public void m53850g(y38 y38Var) {
        sq8.m48649h(y38Var, "<set-?>");
        this.f51378b = y38Var;
    }

    public int hashCode() {
        Object obj = this.f51377a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.f51378b.hashCode()) * 31) + this.f51379c.hashCode();
    }

    public String toString() {
        return "HttpProtocolRequestInterceptorContext(request=" + this.f51377a + ", protocolRequest=" + this.f51378b + ", executionContext=" + this.f51379c + ')';
    }
}
