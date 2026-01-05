package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.kt8;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class rt8 {
    /* renamed from: b */
    public static final void m47151b(kt8.C14922a c14922a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("Detail"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("Message"));
        h7f h7fVar3 = new h7f(aff.C12157d.f14616a, new na9("Reason"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c14922a.m36211f(gt8.m29472a(i89Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c14922a.m36212g(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14922a.m36213h(ut8.f49469a.m52012a(interfaceC12997cMo23579h.mo31726i()));
                    } else if (numMo23583m == null) {
                        return;
                    } else {
                        interfaceC12997cMo23579h.skipValue();
                    }
                }
            }
        }
    }
}
