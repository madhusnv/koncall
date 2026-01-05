package p001o;

/* loaded from: classes2.dex */
public final class hqb {

    /* renamed from: a */
    public final fqb f27369a;

    /* renamed from: b */
    public final uk7 f27370b;

    public hqb(fqb fqbVar, uk7 uk7Var) {
        sq8.m48649h(fqbVar, "vector");
        sq8.m48649h(uk7Var, "onVectorMutated");
        this.f27369a = fqbVar;
        this.f27370b = uk7Var;
    }

    /* renamed from: a */
    public final void m30995a(int i, Object obj) {
        this.f27369a.m27343b(i, obj);
        this.f27370b.invoke();
    }

    /* renamed from: b */
    public final void m30996b() {
        this.f27369a.m27349i();
        this.f27370b.invoke();
    }

    /* renamed from: c */
    public final Object m30997c(int i) {
        return this.f27369a.m27353n()[i];
    }

    /* renamed from: d */
    public final int m30998d() {
        return this.f27369a.m27354o();
    }

    /* renamed from: e */
    public final fqb m30999e() {
        return this.f27369a;
    }

    /* renamed from: f */
    public final Object m31000f(int i) {
        Object objM27361v = this.f27369a.m27361v(i);
        this.f27370b.invoke();
        return objM27361v;
    }
}
