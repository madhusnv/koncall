package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.rhg;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class shg {
    /* renamed from: a */
    public static final rhg m48356a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        rhg.C16614a c16614a = new rhg.C16614a();
        h7f h7fVar = new h7f(aff.C12165l.f14624a, new na9("CreationTime"));
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar2 = new h7f(c12157d, new na9("Engine"));
        h7f h7fVar3 = new h7f(c12157d, new na9("LanguageCode"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar4 = new h7f(c12160g, new na9("LexiconNames"));
        h7f h7fVar5 = new h7f(c12157d, new na9("OutputFormat"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar6 = new h7f(c12163j, new na9("OutputUri"));
        rhg.C16614a c16614a2 = c16614a;
        h7f h7fVar7 = new h7f(aff.C12159f.f14618a, new na9("RequestCharacters"));
        h7f h7fVar8 = new h7f(c12163j, new na9("SampleRate"));
        h7f h7fVar9 = new h7f(c12163j, new na9("SnsTopicArn"));
        h7f h7fVar10 = new h7f(c12160g, new na9("SpeechMarkTypes"));
        h7f h7fVar11 = new h7f(c12163j, new na9("TaskId"));
        h7f h7fVar12 = new h7f(c12157d, new na9("TaskStatus"));
        h7f h7fVar13 = new h7f(c12163j, new na9("TaskStatusReason"));
        h7f h7fVar14 = new h7f(c12157d, new na9("TextType"));
        h7f h7fVar15 = new h7f(c12157d, new na9("VoiceId"));
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
        h7f h7fVar16 = h7fVar14;
        c17016a.m49539b(h7fVar16);
        c17016a.m49539b(h7fVar15);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            h7f h7fVar17 = h7fVar16;
            int iM29946a = h7fVar.m29946a();
            h7f h7fVar18 = h7fVar;
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16614a2.m46804r(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                h7fVar16 = h7fVar17;
                h7fVar = h7fVar18;
            } else {
                rhg.C16614a c16614a3 = c16614a2;
                int iM29946a2 = h7fVar2.m29946a();
                h7f h7fVar19 = h7fVar2;
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16614a3.m46805s(xf6.f53687a.m56210a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16614a3.m46806t(tg9.f47013a.m49829a(interfaceC12997cMo23579h.mo31726i()));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar4);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC12995aMo23577c.mo23581d()) {
                                h7f h7fVar20 = h7fVar3;
                                if (interfaceC12995aMo23577c.mo23580a()) {
                                    arrayList.add(interfaceC12995aMo23577c.mo31726i());
                                    h7fVar3 = h7fVar20;
                                } else {
                                    interfaceC12995aMo23577c.mo31725e();
                                }
                            }
                            c16614a3.m46807u(arrayList);
                        } else {
                            h7f h7fVar21 = h7fVar3;
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c16614a3.m46808v(jgc.f30395a.m33801a(interfaceC12997cMo23579h.mo31726i()));
                            } else {
                                int iM29946a6 = h7fVar6.m29946a();
                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a6) {
                                    c16614a3.m46809w(interfaceC12997cMo23579h.mo31726i());
                                } else {
                                    int iM29946a7 = h7fVar7.m29946a();
                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a7) {
                                        c16614a3.m46810x(interfaceC12997cMo23579h.mo31724b());
                                    } else {
                                        int iM29946a8 = h7fVar8.m29946a();
                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a8) {
                                            c16614a3.m46811y(interfaceC12997cMo23579h.mo31726i());
                                        } else {
                                            int iM29946a9 = h7fVar9.m29946a();
                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a9) {
                                                c16614a3.m46812z(interfaceC12997cMo23579h.mo31726i());
                                            } else {
                                                int iM29946a10 = h7fVar10.m29946a();
                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a10) {
                                                    dn5.InterfaceC12995a interfaceC12995aMo23577c2 = dn5Var.mo23577c(h7fVar10);
                                                    ArrayList arrayList2 = new ArrayList();
                                                    while (interfaceC12995aMo23577c2.mo23581d()) {
                                                        if (interfaceC12995aMo23577c2.mo23580a()) {
                                                            arrayList2.add(k0g.f31337a.m34847a(interfaceC12995aMo23577c2.mo31726i()));
                                                            h7fVar10 = h7fVar10;
                                                        } else {
                                                            interfaceC12995aMo23577c2.mo31725e();
                                                        }
                                                    }
                                                    c16614a3.m46781A(arrayList2);
                                                } else {
                                                    h7f h7fVar22 = h7fVar10;
                                                    int iM29946a11 = h7fVar11.m29946a();
                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a11) {
                                                        c16614a3.m46782B(interfaceC12997cMo23579h.mo31726i());
                                                    } else {
                                                        int iM29946a12 = h7fVar12.m29946a();
                                                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a12) {
                                                            c16614a3.m46783C(lyg.f34520a.m38105a(interfaceC12997cMo23579h.mo31726i()));
                                                        } else {
                                                            int iM29946a13 = h7fVar13.m29946a();
                                                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a13) {
                                                                c16614a3.m46784D(interfaceC12997cMo23579h.mo31726i());
                                                            } else {
                                                                int iM29946a14 = h7fVar17.m29946a();
                                                                if (numMo23583m != null && numMo23583m.intValue() == iM29946a14) {
                                                                    c16614a3.m46785E(yih.f55559a.m57857a(interfaceC12997cMo23579h.mo31726i()));
                                                                } else {
                                                                    int iM29946a15 = h7fVar15.m29946a();
                                                                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a15) {
                                                                        c16614a3.m46786F(l2j.f33019a.m36462a(interfaceC12997cMo23579h.mo31726i()));
                                                                    } else {
                                                                        if (numMo23583m == null) {
                                                                            c16614a3.m46788b();
                                                                            return c16614a3.m46787a();
                                                                        }
                                                                        interfaceC12997cMo23579h.skipValue();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    h7fVar2 = h7fVar19;
                                                    h7fVar = h7fVar18;
                                                    h7fVar3 = h7fVar21;
                                                    h7fVar10 = h7fVar22;
                                                    c16614a2 = c16614a3;
                                                    h7fVar16 = h7fVar17;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            h7fVar2 = h7fVar19;
                            h7fVar = h7fVar18;
                            h7fVar3 = h7fVar21;
                            c16614a2 = c16614a3;
                            h7fVar16 = h7fVar17;
                        }
                    }
                }
                h7fVar2 = h7fVar19;
                h7fVar = h7fVar18;
                c16614a2 = c16614a3;
                h7fVar16 = h7fVar17;
            }
        }
    }
}
