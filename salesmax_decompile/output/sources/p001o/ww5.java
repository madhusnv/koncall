package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.vw5;

/* loaded from: classes3.dex */
public abstract class ww5 {
    /* renamed from: a */
    public static final vw5 m55291a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        vw5.C17682a c17682a = new vw5.C17682a();
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar = new h7f(c12159f, new na9("Blue"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("CSSColor"));
        h7f h7fVar3 = new h7f(c12159f, new na9("Green"));
        h7f h7fVar4 = new h7f(c12163j, new na9("HexCode"));
        h7f h7fVar5 = new h7f(aff.C12158e.f14617a, new na9("PixelPercent"));
        h7f h7fVar6 = new h7f(c12159f, new na9("Red"));
        h7f h7fVar7 = new h7f(c12163j, new na9("SimplifiedColor"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c17682a.m53497j(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17682a.m53498k(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c17682a.m53499l(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c17682a.m53500m(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c17682a.m53501n(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c17682a.m53502o(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c17682a.m53503p(interfaceC12997cMo23579h.mo31726i());
                                    } else {
                                        if (numMo23583m == null) {
                                            c17682a.m53489b();
                                            return c17682a.m53488a();
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
}
