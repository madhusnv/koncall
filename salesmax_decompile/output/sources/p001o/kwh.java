package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.jwh;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class kwh {
    /* renamed from: a */
    public static final jwh m36269a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        jwh.C14678a c14678a = new jwh.C14678a();
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar = new h7f(c12157d, new na9("Brevity"));
        h7f h7fVar2 = new h7f(c12157d, new na9("Formality"));
        h7f h7fVar3 = new h7f(c12157d, new na9("Profanity"));
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
                c14678a.m34645f(nl1.f36988a.m40742a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c14678a.m34646g(gf7.f25063a.m28553a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14678a.m34647h(ild.f28820a.m32266a(interfaceC12997cMo23579h.mo31726i()));
                    } else {
                        if (numMo23583m == null) {
                            c14678a.m34641b();
                            return c14678a.m34640a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
