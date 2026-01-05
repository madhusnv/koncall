package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.og9;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pg9 {
    /* renamed from: a */
    public static final og9 m43604a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        og9.C15797a c15797a = new og9.C15797a();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("Type"));
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar2 = new h7f(c12158e, new na9("X"));
        h7f h7fVar3 = new h7f(c12158e, new na9("Y"));
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
                c15797a.m42222f(qg9.f41903a.m45431a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c15797a.m42223g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c15797a.m42224h(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        if (numMo23583m == null) {
                            c15797a.m42218b();
                            return c15797a.m42217a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
