package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.hgh;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class igh {
    /* renamed from: a */
    public static final hgh m32118a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        hgh.C13939a c13939a = new hgh.C13939a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("SourceText"));
        h7f h7fVar2 = new h7f(c12163j, new na9("TargetText"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13939a.m30431e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13939a.m30432f(interfaceC12997cMo23579h.mo31726i());
                } else {
                    if (numMo23583m == null) {
                        c13939a.m30428b();
                        return c13939a.m30427a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
