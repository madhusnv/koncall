package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.qed;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class red {
    /* renamed from: a */
    public static final qed m46588a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        qed.C16366a c16366a = new qed.C16366a();
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar = new h7f(c12158e, new na9("Pitch"));
        h7f h7fVar2 = new h7f(c12158e, new na9("Roll"));
        h7f h7fVar3 = new h7f(c12158e, new na9("Yaw"));
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
                c16366a.m45299f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16366a.m45300g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16366a.m45301h(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        if (numMo23583m == null) {
                            c16366a.m45295b();
                            return c16366a.m45294a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
