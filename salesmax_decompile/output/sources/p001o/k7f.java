package p001o;

/* loaded from: classes3.dex */
public final class k7f {

    /* renamed from: a */
    public final ob9 f31593a;

    /* renamed from: b */
    public final ob9 f31594b;

    /* renamed from: c */
    public final z7f f31595c;

    /* renamed from: d */
    public l48 f31596d;

    /* renamed from: e */
    public m48 f31597e;

    /* renamed from: f */
    public l28 f31598f;

    /* renamed from: g */
    public m28 f31599g;

    /* renamed from: h */
    public final u7f f31600h;

    /* renamed from: i */
    public final jl6 f31601i;

    /* renamed from: j */
    public String f31602j;

    /* renamed from: k */
    public String f31603k;

    /* renamed from: l */
    public String f31604l;

    public k7f(ob9 ob9Var, ob9 ob9Var2) {
        sq8.m48649h(ob9Var, "inputType");
        sq8.m48649h(ob9Var2, "outputType");
        this.f31593a = ob9Var;
        this.f31594b = ob9Var2;
        this.f31595c = new z7f();
        this.f31600h = new u7f();
        this.f31601i = new jl6();
    }

    /* renamed from: a */
    public final j7f m35115a() {
        m48 m48Var = this.f31597e;
        if (m48Var == null) {
            throw new IllegalArgumentException("SdkHttpOperation.serializeWith must not be null".toString());
        }
        m28 m28Var = this.f31599g;
        if (m28Var == null) {
            throw new IllegalArgumentException("SdkHttpOperation.deserializeWith must not be null".toString());
        }
        if (this.f31602j == null) {
            throw new IllegalArgumentException("operationName is a required HTTP execution attribute".toString());
        }
        if (this.f31603k == null) {
            throw new IllegalArgumentException("serviceName is a required HTTP execution attribute".toString());
        }
        jl6 jl6Var = this.f31601i;
        e7f e7fVar = e7f.f21127a;
        kx0 kx0VarM24497d = e7fVar.m24497d();
        String str = this.f31602j;
        sq8.m48646e(str);
        jl6Var.mo34002p(kx0VarM24497d, str);
        jl6 jl6Var2 = this.f31601i;
        kx0 kx0VarM24498e = e7fVar.m24498e();
        String str2 = this.f31603k;
        sq8.m48646e(str2);
        jl6Var2.mo34002p(kx0VarM24498e, str2);
        String str3 = this.f31604l;
        if (str3 != null) {
            this.f31601i.mo34002p(s38.f44646a.m47568d(), str3);
        }
        return new j7f(this.f31600h, this.f31601i, m48Var, m28Var, new dec(this.f31593a, this.f31594b), this.f31595c);
    }

    /* renamed from: b */
    public final jl6 m35116b() {
        return this.f31601i;
    }

    /* renamed from: c */
    public final u7f m35117c() {
        return this.f31600h;
    }

    /* renamed from: d */
    public final z7f m35118d() {
        return this.f31595c;
    }

    /* renamed from: e */
    public final void m35119e(m28 m28Var) {
        this.f31599g = m28Var;
    }

    /* renamed from: f */
    public final void m35120f(l28 l28Var) {
        this.f31598f = l28Var;
        this.f31599g = l28Var != null ? k48.m34967a(l28Var) : null;
    }

    /* renamed from: g */
    public final void m35121g(String str) {
        this.f31602j = str;
    }

    /* renamed from: h */
    public final void m35122h(m48 m48Var) {
        this.f31597e = m48Var;
    }

    /* renamed from: i */
    public final void m35123i(l48 l48Var) {
        this.f31596d = l48Var;
        this.f31597e = l48Var != null ? k48.m34968b(l48Var) : null;
    }

    /* renamed from: j */
    public final void m35124j(String str) {
        this.f31603k = str;
    }
}
