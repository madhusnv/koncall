package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.xkb;

/* loaded from: classes3.dex */
public abstract class ykb {
    /* renamed from: a */
    public static final xkb m57920a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        xkb.C18175a c18175a = new xkb.C18175a();
        h7f h7fVar = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("Name"));
        h7f h7fVar3 = new h7f(c12163j, new na9("ParentName"));
        h7f h7fVar4 = new h7f(aff.C12159f.f14618a, new na9("TaxonomyLevel"));
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
                c18175a.m56431g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18175a.m56432h(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c18175a.m56433i(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c18175a.m56434j(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                        } else {
                            if (numMo23583m == null) {
                                c18175a.m56426b();
                                return c18175a.m56425a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
