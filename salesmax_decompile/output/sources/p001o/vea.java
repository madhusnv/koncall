package p001o;

import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class vea implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m52661e(wea weaVar, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        throw null;
    }

    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ z38 mo16700b(jl6 jl6Var, Object obj) {
        tq.m50332a(obj);
        return m52662d(jl6Var, null);
    }

    /* renamed from: d */
    public z38 m52662d(jl6 jl6Var, final wea weaVar) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(weaVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36767h().m48016m("/v1/lexicons");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7(weaVar) { // from class: o.uea
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return vea.m52661e(null, (kpb) obj);
            }
        });
        return z38Var;
    }
}
