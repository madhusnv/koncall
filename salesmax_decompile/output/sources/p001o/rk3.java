package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.qk3;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class rk3 {
    /* renamed from: a */
    public static final qk3 m46871a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        qk3.C16415a c16415a = new qk3.C16415a();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("BoundingBox"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("Confidence"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16415a.m45576e(il1.m32257a(dn5Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c16415a.m45577f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    if (numMo23583m == null) {
                        c16415a.m45573b();
                        return c16415a.m45572a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
