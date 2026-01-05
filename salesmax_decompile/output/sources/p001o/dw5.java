package p001o;

import p001o.aff;
import p001o.cw5;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dw5 {
    /* renamed from: a */
    public static final cw5 m23896a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        cw5.C12759a c12759a = new cw5.C12759a();
        h7f h7fVar = new h7f(aff.C12159f.f14618a, new na9("Pages"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c12759a.m21890d(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
            } else {
                if (numMo23583m == null) {
                    c12759a.m21888b();
                    return c12759a.m21887a();
                }
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
