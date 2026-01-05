package p001o;

import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class kfa implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m35621e(lfa lfaVar, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        throw null;
    }

    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ z38 mo16700b(jl6 jl6Var, Object obj) {
        tq.m50332a(obj);
        return m35622d(jl6Var, null);
    }

    /* renamed from: d */
    public z38 m35622d(jl6 jl6Var, final lfa lfaVar) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(lfaVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36767h().m48016m("/v1/synthesisTasks");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7(lfaVar) { // from class: o.jfa
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return kfa.m35621e(null, (kpb) obj);
            }
        });
        return z38Var;
    }
}
