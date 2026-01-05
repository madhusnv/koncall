package p001o;

import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class om5 implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m42424e(pm5 pm5Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        throw null;
    }

    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ z38 mo16700b(jl6 jl6Var, Object obj) {
        tq.m50332a(obj);
        return m42425d(jl6Var, null);
    }

    /* renamed from: d */
    public z38 m42425d(jl6 jl6Var, final pm5 pm5Var) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(pm5Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36767h().m48016m("/v1/voices");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7(pm5Var) { // from class: o.nm5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return om5.m42424e(null, (kpb) obj);
            }
        });
        return z38Var;
    }
}
