package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.ui1;

/* loaded from: classes3.dex */
public abstract class xi1 {
    /* renamed from: a */
    public static final ui1 m56327a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ui1.C17382a c17382a = new ui1.C17382a();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("BlockType"));
        h7f h7fVar2 = new h7f(aff.C12164k.f14623a, new na9("Geometry"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar3 = new h7f(c12163j, new na9(JsonDocumentFields.POLICY_ID));
        h7f h7fVar4 = new h7f(aff.C12159f.f14618a, new na9("Page"));
        h7f h7fVar5 = new h7f(aff.C12160g.f14619a, new na9("Relationships"));
        h7f h7fVar6 = new h7f(c12163j, new na9("Text"));
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
                c17382a.m51610i(cj1.f18233a.m21315a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17382a.m51611j(lo7.m37574a(dn5Var));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c17382a.m51612k(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c17382a.m51613l(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar5);
                                ArrayList arrayList = new ArrayList();
                                while (interfaceC12995aMo23577c.mo23581d()) {
                                    if (interfaceC12995aMo23577c.mo23580a()) {
                                        arrayList.add(vhe.m52780a(dn5Var));
                                    } else {
                                        interfaceC12995aMo23577c.mo31725e();
                                    }
                                }
                                c17382a.m51614m(arrayList);
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c17382a.m51615n(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    if (numMo23583m == null) {
                                        c17382a.m51603b();
                                        return c17382a.m51602a();
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
