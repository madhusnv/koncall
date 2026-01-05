package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.fr6;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class ir6 {
    /* renamed from: a */
    public static final fr6 m32609a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        fr6.C13536a c13536a = new fr6.C13536a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("BoundingBox"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar3 = new h7f(c12163j, new na9("ExternalImageId"));
        h7f h7fVar4 = new h7f(c12163j, new na9("FaceId"));
        h7f h7fVar5 = new h7f(c12163j, new na9("ImageId"));
        h7f h7fVar6 = new h7f(c12163j, new na9("IndexFacesModelVersion"));
        h7f h7fVar7 = new h7f(c12163j, new na9("UserId"));
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
                c13536a.m27390j(il1.m32257a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13536a.m27391k(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c13536a.m27392l(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c13536a.m27393m(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c13536a.m27394n(interfaceC12997cMo23579h.mo31726i());
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c13536a.m27395o(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c13536a.m27396p(interfaceC12997cMo23579h.mo31726i());
                                    } else {
                                        if (numMo23583m == null) {
                                            c13536a.m27382b();
                                            return c13536a.m27381a();
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
