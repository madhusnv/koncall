package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class vc7 {
    /* renamed from: b */
    public static final byte[] m52515b(jl6 jl6Var, wc7 wc7Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("DeviceKey"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM54203a = wc7Var.m54203a();
        if (strM54203a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM54203a);
        }
        String strM54204b = wc7Var.m54204b();
        if (strM54204b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM54204b);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
