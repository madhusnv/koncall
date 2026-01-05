package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class lwh {
    /* renamed from: a */
    public static final void m38079a(tff tffVar, jwh jwhVar) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(jwhVar, "input");
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar = new h7f(c12157d, new na9("Brevity"));
        h7f h7fVar2 = new h7f(c12157d, new na9("Formality"));
        h7f h7fVar3 = new h7f(c12157d, new na9("Profanity"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        gf7 gf7VarM34638b = jwhVar.m34638b();
        if (gf7VarM34638b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, gf7VarM34638b.mo28552a());
        }
        ild ildVarM34639c = jwhVar.m34639c();
        if (ildVarM34639c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, ildVarM34639c.mo32265a());
        }
        nl1 nl1VarM34637a = jwhVar.m34637a();
        if (nl1VarM34637a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, nl1VarM34637a.mo40741a());
        }
        l9gVarMo41871h.mo26543j();
    }
}
