package p001o;

import p001o.aff;
import p001o.cca;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dca {
    /* renamed from: a */
    public static final cca m22806a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        cca.C12634a c12634a = new cca.C12634a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("Attributes"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("Name"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c12634a.m20846e(bca.m18598a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12634a.m20847f(interfaceC12997cMo23579h.mo31726i());
                } else {
                    if (numMo23583m == null) {
                        c12634a.m20843b();
                        return c12634a.m20842a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
