package p001o;

/* loaded from: classes3.dex */
public final class l38 implements eme {

    /* renamed from: a */
    public Object f33226a;

    /* renamed from: b */
    public final jl6 f33227b;

    public l38(Object obj, jl6 jl6Var) {
        sq8.m48649h(jl6Var, "executionContext");
        this.f33226a = obj;
        this.f33227b = jl6Var;
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f33226a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f33227b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l38)) {
            return false;
        }
        l38 l38Var = (l38) obj;
        return sq8.m48644c(this.f33226a, l38Var.f33226a) && sq8.m48644c(this.f33227b, l38Var.f33227b);
    }

    /* renamed from: f */
    public void m36529f(Object obj) {
        this.f33226a = obj;
    }

    public int hashCode() {
        Object obj = this.f33226a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f33227b.hashCode();
    }

    public String toString() {
        return "HttpInputInterceptorContext(request=" + this.f33226a + ", executionContext=" + this.f33227b + ')';
    }
}
