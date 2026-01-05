package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.q01;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class r01 {
    /* renamed from: a */
    public static final q01 m46010a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        q01.C16263a c16263a = new q01.C16263a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(aff.C12159f.f14618a, new na9("ExpiresIn"));
        h7f h7fVar3 = new h7f(c12163j, new na9("IdToken"));
        h7f h7fVar4 = new h7f(aff.C12164k.f14623a, new na9("NewDeviceMetadata"));
        h7f h7fVar5 = new h7f(c12163j, new na9("RefreshToken"));
        h7f h7fVar6 = new h7f(c12163j, new na9("TokenType"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16263a.m44586i(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16263a.m44587j(interfaceC12997cMo23579h.mo31724b());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16263a.m44588k(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c16263a.m44589l(kub.m36247a(dn5Var));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c16263a.m44590m(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c16263a.m44591n(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    if (numMo23583m == null) {
                                        c16263a.m44579b();
                                        return c16263a.m44578a();
                                    }
                                    interfaceC12997cMo23579h.skipValue();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
