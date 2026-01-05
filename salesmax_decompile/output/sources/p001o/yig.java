package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class yig {
    /* renamed from: a */
    public static final void m57855a(tff tffVar, vig vigVar) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(vigVar, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new ue7("Key"));
        h7f h7fVar2 = new h7f(c12163j, new ue7("Value"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49542e(new ue7("Tag"));
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        l9gVarMo41871h.mo26541g(h7fVar, vigVar.m52862a());
        l9gVarMo41871h.mo26541g(h7fVar2, vigVar.m52863b());
        l9gVarMo41871h.mo26543j();
    }
}
