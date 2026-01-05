package p001o;

import p001o.m18;
import p001o.m48;

/* loaded from: classes2.dex */
public final class fr0 implements m48.InterfaceC15219a {
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public z38 mo16700b(jl6 jl6Var, kr0 kr0Var) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(kr0Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.POST);
        z38Var.m58671h().m36767h().m48016m("/");
        z38Var.m58672i(m18.Companion.m38178a(gr0.m29333b(jl6Var, kr0Var)));
        if (!(z38Var.m58667d() instanceof m18.C15196d)) {
            z38Var.m58668e().m59811s("Content-Type", "application/x-www-form-urlencoded");
        }
        return z38Var;
    }
}
