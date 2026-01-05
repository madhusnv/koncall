package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.me9;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class ne9 {
    /* renamed from: a */
    public static final me9 m40418a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        me9.C15293a c15293a = new me9.C15293a();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("Type"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c15293a.m38821d(oe9.f38216a.m42120a(interfaceC12997cMo23579h.mo31726i()));
            } else {
                if (numMo23583m == null) {
                    c15293a.m38819b();
                    return c15293a.m38818a();
                }
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
