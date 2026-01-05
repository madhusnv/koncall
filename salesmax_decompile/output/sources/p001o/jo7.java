package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.ho7;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class jo7 {
    /* renamed from: a */
    public static final ho7 m34151a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ho7.C14017a c14017a = new ho7.C14017a();
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
                c14017a.m30885e(il1.m32257a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(bcd.m18599a(dn5Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c14017a.m30886f(arrayList);
                } else {
                    if (numMo23583m == null) {
                        c14017a.m30882b();
                        return c14017a.m30881a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
