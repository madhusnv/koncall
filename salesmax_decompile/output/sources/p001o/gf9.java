package p001o;

import java.util.ArrayList;
import p001o.af9;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class gf9 {
    /* renamed from: a */
    public static final af9 m28554a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        af9.C12152a c12152a = new af9.C12152a();
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar = new h7f(c12160g, new na9("Aliases"));
        h7f h7fVar2 = new h7f(c12160g, new na9("Categories"));
        h7f h7fVar3 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        h7f h7fVar4 = new h7f(c12160g, new na9("Instances"));
        h7f h7fVar5 = new h7f(aff.C12163j.f14622a, new na9("Name"));
        h7f h7fVar6 = new h7f(c12160g, new na9("Parents"));
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
                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(df9.m22984a(dn5Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c12152a.m17003i(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC12995aMo23577c2.mo23581d()) {
                        if (interfaceC12995aMo23577c2.mo23580a()) {
                            arrayList2.add(ff9.m26550a(dn5Var));
                        } else {
                            interfaceC12995aMo23577c2.mo31725e();
                        }
                    }
                    c12152a.m17004j(arrayList2);
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c12152a.m17005k(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            dn5.InterfaceC12995a interfaceC12995aMo23577c3 = dn5Var.mo23577c(h7fVar4);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC12995aMo23577c3.mo23581d()) {
                                if (interfaceC12995aMo23577c3.mo23580a()) {
                                    arrayList3.add(dk8.m23361a(dn5Var));
                                } else {
                                    interfaceC12995aMo23577c3.mo31725e();
                                }
                            }
                            c12152a.m17006l(arrayList3);
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c12152a.m17007m(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    dn5.InterfaceC12995a interfaceC12995aMo23577c4 = dn5Var.mo23577c(h7fVar6);
                                    ArrayList arrayList4 = new ArrayList();
                                    while (interfaceC12995aMo23577c4.mo23581d()) {
                                        if (interfaceC12995aMo23577c4.mo23580a()) {
                                            arrayList4.add(wwc.m55301a(dn5Var));
                                        } else {
                                            interfaceC12995aMo23577c4.mo31725e();
                                        }
                                    }
                                    c12152a.m17008n(arrayList4);
                                } else {
                                    if (numMo23583m == null) {
                                        c12152a.m16996b();
                                        return c12152a.m16995a();
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
