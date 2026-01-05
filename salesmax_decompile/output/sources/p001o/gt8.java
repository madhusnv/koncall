package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.ft8;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class gt8 {
    /* renamed from: a */
    public static final ft8 m29472a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ft8.C13552a c13552a = new ft8.C13552a();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("Reason"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13552a.m27469d(ht8.f27523a.m31117a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                if (numMo23583m == null) {
                    c13552a.m27467b();
                    return c13552a.m27466a();
                }
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
