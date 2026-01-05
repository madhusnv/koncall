package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nte {
    /* renamed from: b */
    public static final byte[] m41147b(jl6 jl6Var, ote oteVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar2 = new h7f(c12163j, new na9("ClientSecret"));
        h7f h7fVar3 = new h7f(c12163j, new na9("Token"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM42663a = oteVar.m42663a();
        if (strM42663a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM42663a);
        }
        String strM42664b = oteVar.m42664b();
        if (strM42664b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM42664b);
        }
        String strM42665c = oteVar.m42665c();
        if (strM42665c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM42665c);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
