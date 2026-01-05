package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.zba;

/* loaded from: classes3.dex */
public abstract class eca {
    /* renamed from: a */
    public static final zba m24775a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        zba.C18608a c18608a = new zba.C18608a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Content"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Name"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18608a.m59152e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18608a.m59153f(interfaceC12997cMo23579h.mo31726i());
                } else {
                    if (numMo23583m == null) {
                        c18608a.m59149b();
                        return c18608a.m59148a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
