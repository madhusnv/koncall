package p001o;

/* loaded from: classes3.dex */
public final class m38 implements ere {

    /* renamed from: a */
    public final Object f34695a;

    /* renamed from: b */
    public Object f34696b;

    /* renamed from: c */
    public final o18 f34697c;

    /* renamed from: d */
    public final jl6 f34698d;

    /* renamed from: e */
    public final y38 f34699e;

    /* renamed from: f */
    public final g48 f34700f;

    public m38(Object obj, Object obj2, o18 o18Var, jl6 jl6Var) {
        sq8.m48649h(o18Var, "call");
        sq8.m48649h(jl6Var, "executionContext");
        this.f34695a = obj;
        this.f34696b = obj2;
        this.f34697c = o18Var;
        this.f34698d = jl6Var;
        this.f34699e = o18Var.m41345d();
        this.f34700f = o18Var.m41347f();
    }

    @Override // p001o.eme
    /* renamed from: a */
    public Object mo25340a() {
        return this.f34695a;
    }

    @Override // p001o.eme
    /* renamed from: b */
    public jl6 mo25341b() {
        return this.f34698d;
    }

    @Override // p001o.ere
    /* renamed from: e */
    public Object mo25521e() {
        return this.f34696b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m38)) {
            return false;
        }
        m38 m38Var = (m38) obj;
        return sq8.m48644c(this.f34695a, m38Var.f34695a) && vre.m53353d(this.f34696b, m38Var.f34696b) && sq8.m48644c(this.f34697c, m38Var.f34697c) && sq8.m48644c(this.f34698d, m38Var.f34698d);
    }

    @Override // p001o.c2e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y38 mo20099c() {
        return this.f34699e;
    }

    @Override // p001o.e2e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g48 mo24161d() {
        return this.f34700f;
    }

    public int hashCode() {
        Object obj = this.f34695a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + vre.m53355f(this.f34696b)) * 31) + this.f34697c.hashCode()) * 31) + this.f34698d.hashCode();
    }

    public String toString() {
        return "HttpInputOutputInterceptorContext(request=" + this.f34695a + ", response=" + ((Object) vre.m53358i(this.f34696b)) + ", call=" + this.f34697c + ", executionContext=" + this.f34698d + ')';
    }
}
