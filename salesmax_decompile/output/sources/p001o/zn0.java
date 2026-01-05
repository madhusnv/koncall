package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.yn0;

/* loaded from: classes3.dex */
public abstract class zn0 {
    /* renamed from: a */
    public static final yn0 m59628a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        yn0.C18434a c18434a = new yn0.C18434a();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("Name"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("Terms"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18434a.m58007e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(igh.m32118a(dn5Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c18434a.m58008f(arrayList);
                } else {
                    if (numMo23583m == null) {
                        c18434a.m58004b();
                        return c18434a.m58003a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
