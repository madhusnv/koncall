package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.ko5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class lo5 {
    /* renamed from: a */
    public static final ko5 m37573a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        ko5.C14890a c14890a = new ko5.C14890a();
        aff.C12158e c12158e = aff.C12158e.f14617a;
        h7f h7fVar = new h7f(c12158e, new na9("Brightness"));
        h7f h7fVar2 = new h7f(c12158e, new na9("Contrast"));
        h7f h7fVar3 = new h7f(c12158e, new na9("Sharpness"));
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
                c14890a.m35976f(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c14890a.m35977g(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14890a.m35978h(Float.valueOf(interfaceC12997cMo23579h.mo31728k()));
                    } else {
                        if (numMo23583m == null) {
                            c14890a.m35972b();
                            return c14890a.m35971a();
                        }
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
