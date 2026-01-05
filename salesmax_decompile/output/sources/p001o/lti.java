package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class lti {
    /* renamed from: b */
    public static final byte[] m37888b(jl6 jl6Var, mti mtiVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("AttributeName"));
        h7f h7fVar3 = new h7f(c12163j, new na9("Code"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM39680a = mtiVar.m39680a();
        if (strM39680a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM39680a);
        }
        String strM39681b = mtiVar.m39681b();
        if (strM39681b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM39681b);
        }
        String strM39682c = mtiVar.m39682c();
        if (strM39682c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM39682c);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
