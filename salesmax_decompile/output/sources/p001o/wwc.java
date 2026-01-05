package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.twc;

/* loaded from: classes3.dex */
public abstract class wwc {
    /* renamed from: a */
    public static final twc m55301a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        twc.C17244a c17244a = new twc.C17244a();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("Name"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c17244a.m50730d(interfaceC12997cMo23579h.mo31726i());
            } else {
                if (numMo23583m == null) {
                    c17244a.m50728b();
                    return c17244a.m50727a();
                }
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
