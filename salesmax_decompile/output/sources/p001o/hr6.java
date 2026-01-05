package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.gr6;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class hr6 {
    /* renamed from: a */
    public static final gr6 m31004a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        gr6.C13816a c13816a = new gr6.C13816a();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AgeRange"));
        h7f h7fVar2 = new h7f(c12164k, new na9("Beard"));
        h7f h7fVar3 = new h7f(c12164k, new na9("BoundingBox"));
        h7f h7fVar4 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar5 = new h7f(c12160g, new na9("Emotions"));
        h7f h7fVar6 = new h7f(c12164k, new na9("EyeDirection"));
        h7f h7fVar7 = new h7f(c12164k, new na9("Eyeglasses"));
        h7f h7fVar8 = new h7f(c12164k, new na9("EyesOpen"));
        gr6.C13816a c13816a2 = c13816a;
        h7f h7fVar9 = new h7f(c12164k, new na9("FaceOccluded"));
        h7f h7fVar10 = new h7f(c12164k, new na9("Gender"));
        h7f h7fVar11 = new h7f(c12160g, new na9("Landmarks"));
        h7f h7fVar12 = new h7f(c12164k, new na9("MouthOpen"));
        h7f h7fVar13 = new h7f(c12164k, new na9("Mustache"));
        h7f h7fVar14 = new h7f(c12164k, new na9("Pose"));
        h7f h7fVar15 = new h7f(c12164k, new na9("Quality"));
        h7f h7fVar16 = new h7f(c12164k, new na9("Smile"));
        h7f h7fVar17 = new h7f(c12164k, new na9("Sunglasses"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        c17016a.m49539b(h7fVar8);
        c17016a.m49539b(h7fVar9);
        c17016a.m49539b(h7fVar10);
        c17016a.m49539b(h7fVar11);
        c17016a.m49539b(h7fVar12);
        c17016a.m49539b(h7fVar13);
        c17016a.m49539b(h7fVar14);
        c17016a.m49539b(h7fVar15);
        h7f h7fVar18 = h7fVar16;
        c17016a.m49539b(h7fVar18);
        c17016a.m49539b(h7fVar17);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            h7f h7fVar19 = h7fVar18;
            int iM29946a = h7fVar.m29946a();
            h7f h7fVar20 = h7fVar;
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13816a2.m29386t(z80.m58879a(dn5Var));
                h7fVar18 = h7fVar19;
                h7fVar = h7fVar20;
            } else {
                gr6.C13816a c13816a3 = c13816a2;
                int iM29946a2 = h7fVar2.m29946a();
                h7f h7fVar21 = h7fVar2;
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13816a3.m29387u(zf1.m59367a(dn5Var));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c13816a3.m29388v(il1.m32257a(dn5Var));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c13816a3.m29389w(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar5);
                                ArrayList arrayList = new ArrayList();
                                while (interfaceC12995aMo23577c.mo23581d()) {
                                    h7f h7fVar22 = h7fVar3;
                                    if (interfaceC12995aMo23577c.mo23580a()) {
                                        arrayList.add(x56.m55642a(dn5Var));
                                        h7fVar3 = h7fVar22;
                                    } else {
                                        interfaceC12995aMo23577c.mo31725e();
                                    }
                                }
                                c13816a3.m29390x(arrayList);
                            } else {
                                h7f h7fVar23 = h7fVar3;
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c13816a3.m29391y(ar6.m17702a(dn5Var));
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c13816a3.m29392z(er6.m25513a(dn5Var));
                                    } else {
                                        int iM29946a8 = h7fVar8.m29946a();
                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a8) {
                                            c13816a3.m29357A(cr6.m21610a(dn5Var));
                                        } else {
                                            int iM29946a9 = h7fVar9.m29946a();
                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a9) {
                                                c13816a3.m29358B(mr6.m39517a(dn5Var));
                                            } else {
                                                int iM29946a10 = h7fVar10.m29946a();
                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a10) {
                                                    c13816a3.m29359C(rn7.m47001a(dn5Var));
                                                } else {
                                                    int iM29946a11 = h7fVar11.m29946a();
                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a11) {
                                                        dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar11);
                                                        ArrayList arrayList2 = new ArrayList();
                                                        while (interfaceC12995aMo23577c2.mo23581d()) {
                                                            if (interfaceC12995aMo23577c2.mo23580a()) {
                                                                arrayList2.add(pg9.m43604a(dn5Var));
                                                            } else {
                                                                interfaceC12995aMo23577c2.mo31725e();
                                                            }
                                                        }
                                                        c13816a3.m29360D(arrayList2);
                                                    } else {
                                                        int iM29946a12 = h7fVar12.m29946a();
                                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a12) {
                                                            c13816a3.m29361E(wmb.m54713a(dn5Var));
                                                        } else {
                                                            int iM29946a13 = h7fVar13.m29946a();
                                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a13) {
                                                                c13816a3.m29362F(rob.m47029a(dn5Var));
                                                            } else {
                                                                int iM29946a14 = h7fVar14.m29946a();
                                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a14) {
                                                                    c13816a3.m29363G(red.m46588a(dn5Var));
                                                                } else {
                                                                    int iM29946a15 = h7fVar15.m29946a();
                                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a15) {
                                                                        c13816a3.m29364H(xd8.m56044a(dn5Var));
                                                                    } else {
                                                                        int iM29946a16 = h7fVar19.m29946a();
                                                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a16) {
                                                                            c13816a3.m29365I(owf.m42729a(dn5Var));
                                                                        } else {
                                                                            int iM29946a17 = h7fVar17.m29946a();
                                                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a17) {
                                                                                c13816a3.m29366J(tcg.m49749a(dn5Var));
                                                                            } else {
                                                                                if (numMo23583m == null) {
                                                                                    c13816a3.m29368b();
                                                                                    return c13816a3.m29367a();
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
                                    }
                                }
                                h7fVar2 = h7fVar21;
                                h7fVar = h7fVar20;
                                h7fVar3 = h7fVar23;
                                c13816a2 = c13816a3;
                                h7fVar18 = h7fVar19;
                            }
                        }
                    }
                }
                h7fVar2 = h7fVar21;
                h7fVar = h7fVar20;
                c13816a2 = c13816a3;
                h7fVar18 = h7fVar19;
            }
        }
    }
}
