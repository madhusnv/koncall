package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.tj6;

/* loaded from: classes3.dex */
public abstract class uj6 {
    /* renamed from: a */
    public static final tj6 m51647a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        tj6.C17129a c17129a = new tj6.C17129a();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("ErrorCode"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("ErrorMessage"));
        h7f h7fVar3 = new h7f(aff.C12159f.f14618a, new na9("Page"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c17129a.m49971f(oic.f38404a.m42267a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17129a.m49972g(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c17129a.m49973h(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                    } else {
                        if (numMo23583m == null) {
                            c17129a.m49967b();
                            return c17129a.m49966a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
