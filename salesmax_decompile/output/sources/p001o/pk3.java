package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.ok3;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pk3 {
    /* renamed from: a */
    public static final ok3 m43798a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ok3.C15829a c15829a = new ok3.C15829a();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("BoundingBox"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar3 = new h7f(c12160g, new na9("Emotions"));
        h7f h7fVar4 = new h7f(c12160g, new na9("Landmarks"));
        h7f h7fVar5 = new h7f(c12164k, new na9("Pose"));
        h7f h7fVar6 = new h7f(c12164k, new na9("Quality"));
        h7f h7fVar7 = new h7f(c12164k, new na9("Smile"));
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
                c15829a.m42361j(il1.m32257a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c15829a.m42362k(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar3);
                        ArrayList arrayList = new ArrayList();
                        while (interfaceC12995aMo23577c.mo23581d()) {
                            if (interfaceC12995aMo23577c.mo23580a()) {
                                arrayList.add(x56.m55642a(dn5Var));
                            } else {
                                interfaceC12995aMo23577c.mo31725e();
                            }
                        }
                        c15829a.m42363l(arrayList);
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar4);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC12995aMo23577c2.mo23581d()) {
                                if (interfaceC12995aMo23577c2.mo23580a()) {
                                    arrayList2.add(pg9.m43604a(dn5Var));
                                } else {
                                    interfaceC12995aMo23577c2.mo31725e();
                                }
                            }
                            c15829a.m42364m(arrayList2);
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c15829a.m42365n(red.m46588a(dn5Var));
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c15829a.m42366o(xd8.m56044a(dn5Var));
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c15829a.m42367p(owf.m42729a(dn5Var));
                                    } else {
                                        if (numMo23583m == null) {
                                            c15829a.m42353b();
                                            return c15829a.m42352a();
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
