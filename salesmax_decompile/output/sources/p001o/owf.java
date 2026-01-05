package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.nwf;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class owf {
    /* renamed from: a */
    public static final nwf m42729a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        nwf.C15676a c15676a = new nwf.C15676a();
        h7f h7fVar = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        h7f h7fVar2 = new h7f(aff.C12155b.f14614a, new na9("Value"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c15676a.m41194e(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c15676a.m41195f(interfaceC12997cMo23579h.mo31730n());
                } else {
                    if (numMo23583m == null) {
                        c15676a.m41191b();
                        return c15676a.m41190a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
