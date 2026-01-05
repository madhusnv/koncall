package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.uhe;

/* loaded from: classes3.dex */
public abstract class vhe {
    /* renamed from: a */
    public static final uhe m52780a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        uhe.C17378a c17378a = new uhe.C17378a();
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("Ids"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("Type"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(interfaceC12995aMo23577c.mo31726i());
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c17378a.m51593e(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17378a.m51594f(she.f45444a.m48353a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    if (numMo23583m == null) {
                        c17378a.m51590b();
                        return c17378a.m51589a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
