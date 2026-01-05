package p001o;

import p001o.aca;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class bca {
    /* renamed from: a */
    public static final aca m18598a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        aca.C12138a c12138a = new aca.C12138a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Alphabet"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("LanguageCode"));
        h7f h7fVar3 = new h7f(aff.C12165l.f14624a, new na9("LastModified"));
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar4 = new h7f(c12159f, new na9("LexemesCount"));
        h7f h7fVar5 = new h7f(c12163j, new na9("LexiconArn"));
        h7f h7fVar6 = new h7f(c12159f, new na9("Size"));
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
                c12138a.m16864i(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12138a.m16865j(tg9.f47013a.m49829a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c12138a.m16866k(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c12138a.m16867l(interfaceC12997cMo23579h.mo31724b());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c12138a.m16868m(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c12138a.m16869n(interfaceC12997cMo23579h.mo31724b());
                                } else {
                                    if (numMo23583m == null) {
                                        c12138a.m16857b();
                                        return c12138a.m16856a();
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
