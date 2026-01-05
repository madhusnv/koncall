package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class kr5 {
    /* renamed from: a */
    public static final void m36119a(tff tffVar, jr5 jr5Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(jr5Var, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("PasswordVerifier"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Salt"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        String strM34373a = jr5Var.m34373a();
        if (strM34373a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM34373a);
        }
        String strM34374b = jr5Var.m34374b();
        if (strM34374b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM34374b);
        }
        l9gVarMo41871h.mo26543j();
    }
}
