package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class gg2 {
    /* renamed from: b */
    public static final byte[] m28569b(jl6 jl6Var, hg2 hg2Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("PreviousPassword"));
        h7f h7fVar3 = new h7f(c12163j, new na9("ProposedPassword"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM30404a = hg2Var.m30404a();
        if (strM30404a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM30404a);
        }
        String strM30405b = hg2Var.m30405b();
        if (strM30405b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM30405b);
        }
        String strM30406c = hg2Var.m30406c();
        if (strM30406c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM30406c);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
