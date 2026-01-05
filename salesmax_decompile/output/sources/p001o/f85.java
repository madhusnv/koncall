package p001o;

/* loaded from: classes3.dex */
public final class f85 implements jw7 {

    /* renamed from: a */
    public final jw7 f22943a;

    /* renamed from: b */
    public final ueb f22944b;

    public f85(jw7 jw7Var, ueb uebVar) {
        sq8.m48649h(jw7Var, "handler");
        sq8.m48649h(uebVar, "with");
        this.f22943a = jw7Var;
        this.f22944b = uebVar;
    }

    @Override // p001o.jw7
    /* renamed from: a */
    public Object mo21441a(Object obj, n64 n64Var) {
        return this.f22944b.mo36732b(obj, this.f22943a, n64Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f85)) {
            return false;
        }
        f85 f85Var = (f85) obj;
        return sq8.m48644c(this.f22943a, f85Var.f22943a) && sq8.m48644c(this.f22944b, f85Var.f22944b);
    }

    public int hashCode() {
        return (this.f22943a.hashCode() * 31) + this.f22944b.hashCode();
    }

    public String toString() {
        return "DecoratedHandler(handler=" + this.f22943a + ", with=" + this.f22944b + ')';
    }
}
