package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.lx0;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class mx0 {
    /* renamed from: a */
    public static final lx0 m39753a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        lx0.C15174a c15174a = new lx0.C15174a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Name"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Value"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c15174a.m38091e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c15174a.m38092f(interfaceC12997cMo23579h.mo31726i());
                } else {
                    if (numMo23583m == null) {
                        c15174a.m38088b();
                        return c15174a.m38087a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
