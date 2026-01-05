package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.seb;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class teb {
    /* renamed from: a */
    public static final seb m49789a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        seb.C16817a c16817a = new seb.C16817a();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("AttributeName"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("DeliveryMedium"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16817a.m48278e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16817a.m48279f(xl5.f53888a.m56447a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    if (numMo23583m == null) {
                        c16817a.m48275b();
                        return c16817a.m48274a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
