package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class cp5 {
    /* renamed from: b */
    public static final byte[] m21564b(jl6 jl6Var, dp5 dp5Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("LanguageCode"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("Text"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        sg9 sg9VarM23655a = dp5Var.m23655a();
        if (sg9VarM23655a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, sg9VarM23655a.mo48308a());
        }
        String strM23656b = dp5Var.m23656b();
        if (strM23656b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM23656b);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
