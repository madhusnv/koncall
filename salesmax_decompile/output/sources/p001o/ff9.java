package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.ef9;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class ff9 {
    /* renamed from: a */
    public static final ef9 m26550a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ef9.C13178a c13178a = new ef9.C13178a();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("Name"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13178a.m24925d(interfaceC12997cMo23579h.mo31726i());
            } else {
                if (numMo23583m == null) {
                    c13178a.m24923b();
                    return c13178a.m24922a();
                }
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
