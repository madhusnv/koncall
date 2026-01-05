package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.zi1;

/* loaded from: classes3.dex */
public abstract class aj1 {
    /* renamed from: a */
    public static final zi1 m17200a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        zi1.C18648a c18648a = new zi1.C18648a();
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar = new h7f(c12159f, new na9("BeginOffset"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("BlockId"));
        h7f h7fVar3 = new h7f(aff.C12160g.f14619a, new na9("ChildBlocks"));
        h7f h7fVar4 = new h7f(c12159f, new na9("EndOffset"));
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
                c18648a.m59476g(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18648a.m59477h(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar3);
                        ArrayList arrayList = new ArrayList();
                        while (interfaceC12995aMo23577c.mo23581d()) {
                            if (interfaceC12995aMo23577c.mo23580a()) {
                                arrayList.add(z83.m58926a(dn5Var));
                            } else {
                                interfaceC12995aMo23577c.mo31725e();
                            }
                        }
                        c18648a.m59478i(arrayList);
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c18648a.m59479j(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                        } else {
                            if (numMo23583m == null) {
                                c18648a.m59471b();
                                return c18648a.m59470a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
