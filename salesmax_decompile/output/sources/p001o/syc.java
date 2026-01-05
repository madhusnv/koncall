package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.ryc;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class syc {
    /* renamed from: a */
    public static final ryc m49082a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ryc.C16679a c16679a = new ryc.C16679a();
        h7f h7fVar = new h7f(aff.C12158e.f14617a, new na9("Score"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("Tag"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16679a.m47296e(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16679a.m47297f(tyc.f48050a.m50787a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    if (numMo23583m == null) {
                        c16679a.m47293b();
                        return c16679a.m47292a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
