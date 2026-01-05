package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class wfa {
    /* renamed from: b */
    public static final byte[] m54330b(jl6 jl6Var, xfa xfaVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(aff.C12159f.f14618a, new na9("MaxResults"));
        h7f h7fVar3 = new h7f(c12163j, new na9("NextToken"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM56211a = xfaVar.m56211a();
        if (strM56211a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM56211a);
        }
        Integer numM56212b = xfaVar.m56212b();
        if (numM56212b != null) {
            l9gVarMo41871h.mo26546q(h7fVar2, numM56212b.intValue());
        }
        String strM56213c = xfaVar.m56213c();
        if (strM56213c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM56213c);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
