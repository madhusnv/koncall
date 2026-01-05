package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.ck8;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dk8 {
    /* renamed from: a */
    public static final ck8 m23361a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ck8.C12697a c12697a = new ck8.C12697a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("BoundingBox"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        h7f h7fVar3 = new h7f(aff.C12160g.f14619a, new na9("DominantColors"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c12697a.m21343f(il1.m32257a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12697a.m21344g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar3);
                        ArrayList arrayList = new ArrayList();
                        while (interfaceC12995aMo23577c.mo23581d()) {
                            if (interfaceC12995aMo23577c.mo23580a()) {
                                arrayList.add(ww5.m55291a(dn5Var));
                            } else {
                                interfaceC12995aMo23577c.mo31725e();
                            }
                        }
                        c12697a.m21345h(arrayList);
                    } else {
                        if (numMo23583m == null) {
                            c12697a.m21339b();
                            return c12697a.m21338a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
