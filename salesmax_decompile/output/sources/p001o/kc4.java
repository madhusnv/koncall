package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.hc4;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class kc4 {
    /* renamed from: a */
    public static final hc4 m35390a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        hc4.C13913a c13913a = new hc4.C13913a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessKeyId"));
        h7f h7fVar2 = new h7f(aff.C12165l.f14624a, new na9("Expiration"));
        h7f h7fVar3 = new h7f(c12163j, new na9("SecretKey"));
        h7f h7fVar4 = new h7f(c12163j, new na9("SessionToken"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13913a.m30212g(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13913a.m30213h(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c13913a.m30214i(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c13913a.m30215j(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            if (numMo23583m == null) {
                                c13913a.m30207b();
                                return c13913a.m30206a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
