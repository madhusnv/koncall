package p001o;

import p001o.l8i;
import p001o.m48;

/* loaded from: classes2.dex */
public final class fr7 implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m27398e(gr7 gr7Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (gr7Var.m29394b() != null) {
            kpbVar.mo20265E("account_id", gr7Var.m29394b());
        }
        if (gr7Var.m29395c() != null) {
            kpbVar.mo20265E("role_name", gr7Var.m29395c());
        }
        return y3i.f54824a;
    }

    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z38 mo16700b(jl6 jl6Var, final gr7 gr7Var) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(gr7Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36767h().m48016m("/federation/credentials");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.er7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return fr7.m27398e(gr7Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        String strM29393a = gr7Var.m29393a();
        boolean z = false;
        if (strM29393a != null) {
            if (strM29393a.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-sso_bearer_token", gr7Var.m29393a());
        }
        return z38Var;
    }
}
