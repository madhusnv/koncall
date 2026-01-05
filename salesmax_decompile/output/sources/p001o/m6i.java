package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class m6i {
    /* renamed from: b */
    public static final byte[] m38424b(jl6 jl6Var, n6i n6iVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("DeviceKey"));
        h7f h7fVar3 = new h7f(aff.C12157d.f14616a, new na9("DeviceRememberedStatus"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM40163a = n6iVar.m40163a();
        if (strM40163a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM40163a);
        }
        String strM40164b = n6iVar.m40164b();
        if (strM40164b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM40164b);
        }
        gr5 gr5VarM40165c = n6iVar.m40165c();
        if (gr5VarM40165c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, gr5VarM40165c.mo29343a());
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
