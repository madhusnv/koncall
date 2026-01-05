package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.v56;

/* loaded from: classes3.dex */
public abstract class x56 {
    /* renamed from: a */
    public static final v56 m55642a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        v56.C17509a c17509a = new v56.C17509a();
        h7f h7fVar = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("Type"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c17509a.m52339e(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17509a.m52340f(y56.f54913a.m57228a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    if (numMo23583m == null) {
                        c17509a.m52336b();
                        return c17509a.m52335a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
