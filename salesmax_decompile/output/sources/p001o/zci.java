package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class zci {
    /* renamed from: a */
    public static final void m59214a(tff tffVar, yci yciVar) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(yciVar, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("EncodedData"));
        h7f h7fVar2 = new h7f(c12163j, new na9("IpAddress"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        String strM57608b = yciVar.m57608b();
        if (strM57608b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM57608b);
        }
        String strM57607a = yciVar.m57607a();
        if (strM57607a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM57607a);
        }
        l9gVarMo41871h.mo26543j();
    }
}
