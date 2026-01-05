package p001o;

/* loaded from: classes3.dex */
public final class web implements ueb {

    /* renamed from: a */
    public final ql7 f51854a;

    public web(ql7 ql7Var) {
        sq8.m48649h(ql7Var, "fn");
        this.f51854a = ql7Var;
    }

    @Override // p001o.ueb
    /* renamed from: b */
    public Object mo36732b(Object obj, jw7 jw7Var, n64 n64Var) {
        return this.f51854a.invoke(obj, jw7Var, n64Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof web) && sq8.m48644c(this.f51854a, ((web) obj).f51854a);
    }

    public int hashCode() {
        return this.f51854a.hashCode();
    }

    public String toString() {
        return "MiddlewareLambda(fn=" + this.f51854a + ')';
    }
}
