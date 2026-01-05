package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.vi1;

/* loaded from: classes3.dex */
public abstract class wi1 {
    /* renamed from: a */
    public static final vi1 m54565a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        vi1.C17593a c17593a = new vi1.C17593a();
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar = new h7f(c12157d, new na9("BlockType"));
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar2 = new h7f(c12159f, new na9("ColumnIndex"));
        h7f h7fVar3 = new h7f(c12159f, new na9("ColumnSpan"));
        h7f h7fVar4 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar5 = new h7f(c12160g, new na9("EntityTypes"));
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar6 = new h7f(c12164k, new na9("Geometry"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        vi1.C17593a c17593a2 = c17593a;
        h7f h7fVar7 = new h7f(c12163j, new na9(JsonDocumentFields.POLICY_ID));
        h7f h7fVar8 = new h7f(c12159f, new na9("Page"));
        h7f h7fVar9 = new h7f(c12164k, new na9("Query"));
        h7f h7fVar10 = new h7f(c12160g, new na9("Relationships"));
        h7f h7fVar11 = new h7f(c12159f, new na9("RowIndex"));
        h7f h7fVar12 = new h7f(c12159f, new na9("RowSpan"));
        h7f h7fVar13 = new h7f(c12157d, new na9("SelectionStatus"));
        h7f h7fVar14 = new h7f(c12163j, new na9("Text"));
        h7f h7fVar15 = new h7f(c12157d, new na9("TextType"));
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
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            h7f h7fVar16 = h7fVar14;
            int iM29946a = h7fVar.m29946a();
            h7f h7fVar17 = h7fVar;
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c17593a2.m52829r(dj1.f20066a.m23324a(interfaceC12997cMo23579h.mo31726i()));
                h7fVar14 = h7fVar16;
                h7fVar = h7fVar17;
            } else {
                vi1.C17593a c17593a3 = c17593a2;
                int iM29946a2 = h7fVar2.m29946a();
                h7f h7fVar18 = h7fVar2;
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17593a3.m52830s(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c17593a3.m52831t(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c17593a3.m52832u(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar5);
                                ArrayList arrayList = new ArrayList();
                                while (interfaceC12995aMo23577c.mo23581d()) {
                                    h7f h7fVar19 = h7fVar3;
                                    if (interfaceC12995aMo23577c.mo23580a()) {
                                        arrayList.add(bi6.f16325a.m19125a(interfaceC12995aMo23577c.mo31726i()));
                                        h7fVar3 = h7fVar19;
                                        h7fVar4 = h7fVar4;
                                    } else {
                                        interfaceC12995aMo23577c.mo31725e();
                                    }
                                }
                                c17593a3.m52833v(arrayList);
                            } else {
                                h7f h7fVar20 = h7fVar3;
                                h7f h7fVar21 = h7fVar4;
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c17593a3.m52834w(ko7.m35983a(dn5Var));
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c17593a3.m52835x(interfaceC12997cMo23579h.mo31726i());
                                    } else {
                                        int iM29946a8 = h7fVar8.m29946a();
                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a8) {
                                            c17593a3.m52836y(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                                        } else {
                                            int iM29946a9 = h7fVar9.m29946a();
                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a9) {
                                                c17593a3.m52837z(j4e.m33241a(dn5Var));
                                            } else {
                                                int iM29946a10 = h7fVar10.m29946a();
                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a10) {
                                                    dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar10);
                                                    ArrayList arrayList2 = new ArrayList();
                                                    while (interfaceC12995aMo23577c2.mo23581d()) {
                                                        if (interfaceC12995aMo23577c2.mo23580a()) {
                                                            arrayList2.add(rhe.m46779a(dn5Var));
                                                        } else {
                                                            interfaceC12995aMo23577c2.mo31725e();
                                                        }
                                                    }
                                                    c17593a3.m52806A(arrayList2);
                                                } else {
                                                    int iM29946a11 = h7fVar11.m29946a();
                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a11) {
                                                        c17593a3.m52807B(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                                                    } else {
                                                        int iM29946a12 = h7fVar12.m29946a();
                                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a12) {
                                                            c17593a3.m52808C(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                                                        } else {
                                                            int iM29946a13 = h7fVar13.m29946a();
                                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a13) {
                                                                c17593a3.m52809D(icf.f28459a.m31909a(interfaceC12997cMo23579h.mo31726i()));
                                                            } else {
                                                                int iM29946a14 = h7fVar16.m29946a();
                                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a14) {
                                                                    c17593a3.m52810E(interfaceC12997cMo23579h.mo31726i());
                                                                } else {
                                                                    int iM29946a15 = h7fVar15.m29946a();
                                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a15) {
                                                                        c17593a3.m52811F(zih.f57262a.m59501a(interfaceC12997cMo23579h.mo31726i()));
                                                                    } else {
                                                                        if (numMo23583m == null) {
                                                                            c17593a3.m52813b();
                                                                            return c17593a3.m52812a();
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
                                h7fVar2 = h7fVar18;
                                h7fVar = h7fVar17;
                                h7fVar3 = h7fVar20;
                                h7fVar4 = h7fVar21;
                                c17593a2 = c17593a3;
                                h7fVar14 = h7fVar16;
                            }
                        }
                    }
                }
                h7fVar2 = h7fVar18;
                h7fVar = h7fVar17;
                c17593a2 = c17593a3;
                h7fVar14 = h7fVar16;
            }
        }
    }
}
