package p001o;

/* loaded from: classes3.dex */
public final class e48 implements y38 {

    /* renamed from: a */
    public final z38 f20952a;

    /* renamed from: b */
    public final boolean f20953b;

    /* renamed from: c */
    public final o38 f20954c;

    /* renamed from: d */
    public final gi9 f20955d;

    /* renamed from: e */
    public final gi9 f20956e;

    /* renamed from: f */
    public final m18 f20957f;

    /* renamed from: g */
    public final gi9 f20958g;

    public e48(z38 z38Var, boolean z) {
        sq8.m48649h(z38Var, "builder");
        this.f20952a = z38Var;
        this.f20953b = z;
        this.f20954c = z38Var.m58669f();
        this.f20955d = si9.m48360a(new uk7() { // from class: o.b48
            @Override // p001o.uk7
            public final Object invoke() {
                return e48.m24294h(this.f15532a);
            }
        });
        this.f20956e = si9.m48360a(new uk7() { // from class: o.c48
            @Override // p001o.uk7
            public final Object invoke() {
                return e48.m24292f(this.f17267a);
            }
        });
        this.f20957f = z38Var.m58667d();
        this.f20958g = si9.m48360a(new uk7() { // from class: o.d48
            @Override // p001o.uk7
            public final Object invoke() {
                return e48.m24293g(this.f19086a);
            }
        });
    }

    /* renamed from: f */
    public static final ux7 m24292f(e48 e48Var) {
        return e48Var.f20952a.m58668e().m56937t();
    }

    /* renamed from: g */
    public static final ek5 m24293g(e48 e48Var) {
        return e48Var.f20952a.m58670g().m26959t();
    }

    /* renamed from: h */
    public static final l8i m24294h(e48 e48Var) {
        return e48Var.f20952a.m58671h().m36761b();
    }

    /* renamed from: d */
    public final boolean m24295d() {
        return this.f20953b;
    }

    /* renamed from: e */
    public final z38 m24296e() {
        return this.f20952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e48)) {
            return false;
        }
        e48 e48Var = (e48) obj;
        return sq8.m48644c(this.f20952a, e48Var.f20952a) && this.f20953b == e48Var.f20953b;
    }

    @Override // p001o.y38
    public m18 getBody() {
        return this.f20957f;
    }

    @Override // p001o.y38
    public ux7 getHeaders() {
        return (ux7) this.f20956e.getValue();
    }

    @Override // p001o.y38
    public o38 getMethod() {
        return this.f20954c;
    }

    @Override // p001o.y38
    public l8i getUrl() {
        return (l8i) this.f20955d.getValue();
    }

    public int hashCode() {
        return (this.f20952a.hashCode() * 31) + Boolean.hashCode(this.f20953b);
    }

    public String toString() {
        return "HttpRequestBuilderView(builder=" + this.f20952a + ", allowToBuilder=" + this.f20953b + ')';
    }
}
