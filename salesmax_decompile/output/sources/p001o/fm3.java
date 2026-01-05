package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fm3 {
    /* renamed from: b */
    public static final byte[] m27035b(jl6 jl6Var, gm3 gm3Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(aff.C12156c.f14615a, new na9("Credential"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM29026a = gm3Var.m29026a();
        if (strM29026a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM29026a);
        }
        vv5 vv5VarM29027b = gm3Var.m29027b();
        if (vv5VarM29027b != null) {
            l9gVarMo41871h.mo26539b(h7fVar2, vv5VarM29027b);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
