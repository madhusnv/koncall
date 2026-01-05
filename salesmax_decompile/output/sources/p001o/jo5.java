package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.io5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class jo5 {
    /* renamed from: a */
    public static final io5 m34149a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        io5.C14341a c14341a = new io5.C14341a();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("Background"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("DominantColors"));
        h7f h7fVar3 = new h7f(c12164k, new na9("Foreground"));
        h7f h7fVar4 = new h7f(c12164k, new na9("Quality"));
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
                c14341a.m32516g(fo5.m27240a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(ww5.m55291a(dn5Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c14341a.m32517h(arrayList);
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14341a.m32518i(ho5.m30878a(dn5Var));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c14341a.m32519j(lo5.m37573a(dn5Var));
                        } else {
                            if (numMo23583m == null) {
                                c14341a.m32511b();
                                return c14341a.m32510a();
                            }
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
            }
        }
    }
}
