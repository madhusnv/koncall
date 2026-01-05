package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.lr5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class mr5 {
    /* renamed from: a */
    public static final lr5 m39516a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        lr5.C15139a c15139a = new lr5.C15139a();
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("DeviceAttributes"));
        aff.C12165l c12165l = aff.C12165l.f14624a;
        h7f h7fVar2 = new h7f(c12165l, new na9("DeviceCreateDate"));
        h7f h7fVar3 = new h7f(aff.C12163j.f14622a, new na9("DeviceKey"));
        h7f h7fVar4 = new h7f(c12165l, new na9("DeviceLastAuthenticatedDate"));
        h7f h7fVar5 = new h7f(c12165l, new na9("DeviceLastModifiedDate"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(mx0.m39753a(dn5Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c15139a.m37812h(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c15139a.m37813i(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c15139a.m37814j(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c15139a.m37815k(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c15139a.m37816l(interfaceC12997cMo23579h.mo31729l(vmh.EPOCH_SECONDS));
                            } else {
                                if (numMo23583m == null) {
                                    c15139a.m37806b();
                                    return c15139a.m37805a();
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
