package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class j7f {

    /* renamed from: h */
    public static final C14471a f29929h = new C14471a(null);

    /* renamed from: a */
    public final u7f f29930a;

    /* renamed from: b */
    public final jl6 f29931b;

    /* renamed from: c */
    public final m48 f29932c;

    /* renamed from: d */
    public final m28 f29933d;

    /* renamed from: e */
    public final dec f29934e;

    /* renamed from: f */
    public final z7f f29935f;

    /* renamed from: g */
    public final List f29936g;

    /* renamed from: o.j7f$a */
    public static final class C14471a {
        public C14471a() {
        }

        public /* synthetic */ C14471a(id5 id5Var) {
            this();
        }
    }

    public j7f(u7f u7fVar, jl6 jl6Var, m48 m48Var, m28 m28Var, dec decVar, z7f z7fVar) {
        sq8.m48649h(u7fVar, "execution");
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(m48Var, "serializer");
        sq8.m48649h(m28Var, "deserializer");
        sq8.m48649h(decVar, "typeInfo");
        sq8.m48649h(z7fVar, "telemetry");
        this.f29930a = u7fVar;
        this.f29931b = jl6Var;
        this.f29932c = m48Var;
        this.f29933d = m28Var;
        this.f29934e = decVar;
        this.f29935f = z7fVar;
        jl6Var.mo34002p(s38.f44646a.m47573i(), pri.f40455d.m44098b().toString());
        this.f29936g = new ArrayList();
    }

    /* renamed from: a */
    public final jl6 m33381a() {
        return this.f29931b;
    }

    /* renamed from: b */
    public final m28 m33382b() {
        return this.f29933d;
    }

    /* renamed from: c */
    public final u7f m33383c() {
        return this.f29930a;
    }

    /* renamed from: d */
    public final List m33384d() {
        return this.f29936g;
    }

    /* renamed from: e */
    public final m48 m33385e() {
        return this.f29932c;
    }

    /* renamed from: f */
    public final z7f m33386f() {
        return this.f29935f;
    }

    /* renamed from: g */
    public final dec m33387g() {
        return this.f29934e;
    }

    /* renamed from: h */
    public final void m33388h(klb klbVar) {
        sq8.m48649h(klbVar, "middleware");
        klbVar.mo21637a(this);
    }

    /* renamed from: i */
    public final void m33389i(kqb kqbVar) {
        sq8.m48649h(kqbVar, "middleware");
        kqbVar.mo36053a(this);
    }
}
