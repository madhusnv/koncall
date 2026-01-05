package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nx0 {
    /* renamed from: a */
    public static final void m41202a(tff tffVar, lx0 lx0Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(lx0Var, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Name"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Value"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        l9gVarMo41871h.mo26541g(h7fVar, lx0Var.m38085a());
        String strM38086b = lx0Var.m38086b();
        if (strM38086b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM38086b);
        }
        l9gVarMo41871h.mo26543j();
    }
}
