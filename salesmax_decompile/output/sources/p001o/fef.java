package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.eef;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fef {
    /* renamed from: a */
    public static final eef m26521a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        eef.C13168a c13168a = new eef.C13168a();
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar = new h7f(c12158e, new na9("Mixed"));
        h7f h7fVar2 = new h7f(c12158e, new na9("Negative"));
        h7f h7fVar3 = new h7f(c12158e, new na9("Neutral"));
        h7f h7fVar4 = new h7f(c12158e, new na9("Positive"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13168a.m24879g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13168a.m24880h(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c13168a.m24881i(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c13168a.m24882j(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                        } else {
                            if (numMo23583m == null) {
                                c13168a.m24874b();
                                return c13168a.m24873a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
