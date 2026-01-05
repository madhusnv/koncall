package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.y80;

/* loaded from: classes3.dex */
public abstract class z80 {
    /* renamed from: a */
    public static final y80 m58879a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        y80.C18350a c18350a = new y80.C18350a();
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar = new h7f(c12159f, new na9("High"));
        h7f h7fVar2 = new h7f(c12159f, new na9("Low"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18350a.m57357e(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18350a.m57358f(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                } else {
                    if (numMo23583m == null) {
                        c18350a.m57354b();
                        return c18350a.m57353a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
