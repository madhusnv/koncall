package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t4j;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class u4j {
    /* renamed from: a */
    public static final t4j m50953a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        t4j.C16990a c16990a = new t4j.C16990a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AuthenticatorAttachment"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("AuthenticatorTransports"));
        h7f h7fVar3 = new h7f(aff.C12165l.f14624a, new na9("CreatedAt"));
        h7f h7fVar4 = new h7f(c12163j, new na9("CredentialId"));
        h7f h7fVar5 = new h7f(c12163j, new na9("FriendlyCredentialName"));
        h7f h7fVar6 = new h7f(c12163j, new na9("RelyingPartyId"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16990a.m49319i(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(interfaceC12995aMo23577c.mo31726i());
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c16990a.m49320j(arrayList);
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16990a.m49321k(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c16990a.m49322l(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c16990a.m49323m(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c16990a.m49324n(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    if (numMo23583m == null) {
                                        c16990a.m49312b();
                                        return c16990a.m49311a();
                                    }
                                    interfaceC12997cMo23579h.skipValue();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
