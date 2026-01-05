package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import p001o.aff;
import p001o.dn5;
import p001o.sgh;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class tgh {
    /* renamed from: a */
    public static final sgh m49848a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        sgh.C16842a c16842a = new sgh.C16842a();
        h7f h7fVar = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("DetectedText"));
        h7f h7fVar3 = new h7f(aff.C12164k.f14623a, new na9("Geometry"));
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar4 = new h7f(c12159f, new na9(JsonDocumentFields.POLICY_ID));
        h7f h7fVar5 = new h7f(c12159f, new na9("ParentId"));
        h7f h7fVar6 = new h7f(aff.C12157d.f14616a, new na9("Type"));
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
                c16842a.m48341i(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16842a.m48342j(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16842a.m48343k(jo7.m34151a(dn5Var));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c16842a.m48344l(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c16842a.m48345m(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c16842a.m48346n(ajh.f14860a.m17259a(interfaceC12997cMo23579h.mo31726i()));
                                } else {
                                    if (numMo23583m == null) {
                                        c16842a.m48334b();
                                        return c16842a.m48333a();
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
