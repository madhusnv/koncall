package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class lea {
    /* renamed from: b */
    public static final byte[] m37037b(jl6 jl6Var, mea meaVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(aff.C12159f.f14618a, new na9("Limit"));
        h7f h7fVar3 = new h7f(c12163j, new na9("PaginationToken"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM38822a = meaVar.m38822a();
        if (strM38822a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM38822a);
        }
        Integer numM38823b = meaVar.m38823b();
        if (numM38823b != null) {
            l9gVarMo41871h.mo26546q(h7fVar2, numM38823b.intValue());
        }
        String strM38824c = meaVar.m38824c();
        if (strM38824c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM38824c);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
