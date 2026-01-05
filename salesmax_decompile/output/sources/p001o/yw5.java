package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.xw5;

/* loaded from: classes3.dex */
public abstract class yw5 {
    /* renamed from: a */
    public static final xw5 m58396a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        xw5.C18257a c18257a = new xw5.C18257a();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("LanguageCode"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Score"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18257a.m56914e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18257a.m56915f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    if (numMo23583m == null) {
                        c18257a.m56911b();
                        return c18257a.m56910a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
