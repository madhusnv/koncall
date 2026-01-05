package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.jue;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class kue {
    /* renamed from: a */
    public static final jue m36248a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        jue.C14664a c14664a = new jue.C14664a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("accessKeyId"));
        h7f h7fVar2 = new h7f(aff.C12161h.f14620a, new na9("expiration"));
        h7f h7fVar3 = new h7f(c12163j, new na9("secretAccessKey"));
        h7f h7fVar4 = new h7f(c12163j, new na9("sessionToken"));
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
                c14664a.m34536g(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c14664a.m34537h(interfaceC12997cMo23579h.mo31731o());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14664a.m34538i(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c14664a.m34539j(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            if (numMo23583m == null) {
                                c14664a.m34531b();
                                return c14664a.m34530a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
