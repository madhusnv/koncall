package p001o;

import p001o.aff;
import p001o.bd9;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dd9 {
    /* renamed from: a */
    public static final bd9 m22816a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        bd9.C12357a c12357a = new bd9.C12357a();
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar = new h7f(c12159f, new na9("BeginOffset"));
        h7f h7fVar2 = new h7f(c12159f, new na9("EndOffset"));
        h7f h7fVar3 = new h7f(aff.C12158e.f14617a, new na9("Score"));
        h7f h7fVar4 = new h7f(aff.C12163j.f14622a, new na9("Text"));
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
                c12357a.m18649g(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12357a.m18650h(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c12357a.m18651i(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c12357a.m18652j(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            if (numMo23583m == null) {
                                c12357a.m18644b();
                                return c12357a.m18643a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
