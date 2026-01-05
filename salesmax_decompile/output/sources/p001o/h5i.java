package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.f5i;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class h5i {
    /* renamed from: b */
    public static final void m29831b(f5i.C13341a c13341a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Code"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Message"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c13341a.m26191e(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c13341a.m26192f(interfaceC12997cMo23579h.mo31726i());
                } else if (numMo23583m == null) {
                    return;
                } else {
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
