package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.y58;

/* loaded from: classes3.dex */
public abstract class b68 {
    /* renamed from: b */
    public static final void m18195b(y58.C18336a c18336a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Code"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Message"));
        h7f h7fVar3 = new h7f(c12163j, new na9("QuotaCode"));
        h7f h7fVar4 = new h7f(c12163j, new na9("ResourceType"));
        h7f h7fVar5 = new h7f(c12163j, new na9("ServiceCode"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18336a.m57236h(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18336a.m57237i(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c18336a.m57238j(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c18336a.m57239k(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c18336a.m57240l(interfaceC12997cMo23579h.mo31726i());
                            } else if (numMo23583m == null) {
                                return;
                            } else {
                                interfaceC12997cMo23579h.skipValue();
                            }
                        }
                    }
                }
            }
        }
    }
}
