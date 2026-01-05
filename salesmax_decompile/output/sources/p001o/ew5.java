package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.bw5;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class ew5 {
    /* renamed from: a */
    public static final bw5 m25664a(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        bw5.C12514a c12514a = new bw5.C12514a();
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("ExtractedCharacters"));
        h7f h7fVar2 = new h7f(aff.C12159f.f14618a, new na9("Pages"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = dn5Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(sq6.m48639a(dn5Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c12514a.m19901e(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12514a.m19902f(Integer.valueOf(interfaceC12997cMo23579h.mo31724b()));
                } else {
                    if (numMo23583m == null) {
                        c12514a.m19898b();
                        return c12514a.m19897a();
                    }
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }
}
