package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.fl1;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class kl1 {
    /* renamed from: a */
    public static final fl1 m35823a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        fl1.C13477a c13477a = new fl1.C13477a();
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar = new h7f(c12158e, new na9("Height"));
        h7f h7fVar2 = new h7f(c12158e, new na9("Left"));
        h7f h7fVar3 = new h7f(c12158e, new na9("Top"));
        h7f h7fVar4 = new h7f(c12158e, new na9("Width"));
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
                c13477a.m26988g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13477a.m26989h(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c13477a.m26990i(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c13477a.m26991j(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                        } else {
                            if (numMo23583m == null) {
                                c13477a.m26983b();
                                return c13477a.m26982a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
