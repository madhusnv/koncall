package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.j2j;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class k2j {
    /* renamed from: a */
    public static final j2j m34936a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        j2j.C14440a c14440a = new j2j.C14440a();
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar = new h7f(c12160g, new na9("AdditionalLanguageCodes"));
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar2 = new h7f(c12157d, new na9("Gender"));
        h7f h7fVar3 = new h7f(c12157d, new na9(JsonDocumentFields.POLICY_ID));
        h7f h7fVar4 = new h7f(c12157d, new na9("LanguageCode"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar5 = new h7f(c12163j, new na9("LanguageName"));
        h7f h7fVar6 = new h7f(c12163j, new na9("Name"));
        h7f h7fVar7 = new h7f(c12160g, new na9("SupportedEngines"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(tg9.f47013a.m49829a(interfaceC12995aMo23577c.mo31726i()));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c14440a.m33160j(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c14440a.m33161k(on7.f38621a.m42461a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14440a.m33162l(l2j.f33019a.m36462a(interfaceC12997cMo23579h.mo31726i()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c14440a.m33163m(tg9.f47013a.m49829a(interfaceC12997cMo23579h.mo31726i()));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c14440a.m33164n(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c14440a.m33165o(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar7);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (interfaceC12995aMo23577c2.mo23581d()) {
                                            if (interfaceC12995aMo23577c2.mo23580a()) {
                                                arrayList2.add(xf6.f53687a.m56210a(interfaceC12995aMo23577c2.mo31726i()));
                                            } else {
                                                interfaceC12995aMo23577c2.mo31725e();
                                            }
                                        }
                                        c14440a.m33166p(arrayList2);
                                    } else {
                                        if (numMo23583m == null) {
                                            c14440a.m33152b();
                                            return c14440a.m33151a();
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
}
