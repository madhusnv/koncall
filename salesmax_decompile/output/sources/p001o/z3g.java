package p001o;

import p001o.m18;
import p001o.m48;

/* loaded from: classes3.dex */
public final class z3g implements m48.InterfaceC15219a {
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ z38 mo16700b(jl6 jl6Var, Object obj) {
        tq.m50332a(obj);
        return m58675c(jl6Var, null);
    }

    /* renamed from: c */
    public z38 m58675c(jl6 jl6Var, b4g b4gVar) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(b4gVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.POST);
        z38Var.m58671h().m36767h().m48016m("/v1/synthesisTasks");
        z38Var.m58672i(m18.Companion.m38178a(a4g.m16414b(jl6Var, b4gVar)));
        if (!(z38Var.m58667d() instanceof m18.C15196d)) {
            z38Var.m58668e().m59811s("Content-Type", "application/json");
        }
        return z38Var;
    }
}
