package p001o;

import org.apache.http.HttpHeaders;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.ze3;

/* loaded from: classes3.dex */
public abstract class af3 {
    /* renamed from: a */
    public static final ze3 m16984a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ze3.C18625a c18625a = new ze3.C18625a();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AttributeName"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("DeliveryMedium"));
        h7f h7fVar3 = new h7f(c12163j, new na9(HttpHeaders.DESTINATION));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18625a.m59331f(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18625a.m59332g(xl5.f53888a.m56447a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c18625a.m59333h(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        if (numMo23583m == null) {
                            c18625a.m59327b();
                            return c18625a.m59326a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
