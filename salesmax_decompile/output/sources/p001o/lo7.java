package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.go7;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class lo7 {
    /* renamed from: a */
    public static final go7 m37574a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        go7.C13804a c13804a = new go7.C13804a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("BoundingBox"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("Polygon"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13804a.m29242e(kl1.m35823a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(dcd.m22807a(dn5Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c13804a.m29243f(arrayList);
                } else {
                    if (numMo23583m == null) {
                        c13804a.m29239b();
                        return c13804a.m29238a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
