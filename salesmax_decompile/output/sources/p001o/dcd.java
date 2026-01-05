package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.ybd;

/* loaded from: classes3.dex */
public abstract class dcd {
    /* renamed from: a */
    public static final ybd m22807a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ybd.C18372a c18372a = new ybd.C18372a();
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar = new h7f(c12158e, new na9("X"));
        h7f h7fVar2 = new h7f(c12158e, new na9("Y"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18372a.m57469e(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18372a.m57470f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    if (numMo23583m == null) {
                        c18372a.m57466b();
                        return c18372a.m57465a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
