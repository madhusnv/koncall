package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.pw5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class qw5 {
    /* renamed from: a */
    public static final pw5 m45880a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        pw5.C16203a c16203a = new pw5.C16203a();
        h7f h7fVar = new h7f(aff.C12159f.f14618a, new na9("Page"));
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
                c16203a.m44253e(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16203a.m44254f(ow5.f38992a.m42727a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    if (numMo23583m == null) {
                        c16203a.m44250b();
                        return c16203a.m44249a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
