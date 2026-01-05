package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class tl5 {
    /* renamed from: b */
    public static final byte[] m50157b(jl6 jl6Var, ul5 ul5Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("CredentialId"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM51700a = ul5Var.m51700a();
        if (strM51700a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM51700a);
        }
        String strM51701b = ul5Var.m51701b();
        if (strM51701b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM51701b);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
