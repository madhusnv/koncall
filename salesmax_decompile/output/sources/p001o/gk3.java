package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.fk3;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class gk3 {
    /* renamed from: a */
    public static final fk3 m28945a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        fk3.C13469a c13469a = new fk3.C13469a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("Face"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Similarity"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13469a.m26955e(pk3.m43798a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13469a.m26956f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    if (numMo23583m == null) {
                        c13469a.m26952b();
                        return c13469a.m26951a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
