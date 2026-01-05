package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class twf {
    /* renamed from: a */
    public static final void m50734a(tff tffVar, swf swfVar) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(swfVar, "input");
        aff.C12155b c12155b = aff.C12155b.f14614a;
        h7f h7fVar = new h7f(c12155b, new na9("Enabled"));
        h7f h7fVar2 = new h7f(c12155b, new na9("PreferredMfa"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        if (swfVar.m49020a()) {
            l9gVarMo41871h.mo26542i(h7fVar, swfVar.m49020a());
        }
        if (swfVar.m49021b()) {
            l9gVarMo41871h.mo26542i(h7fVar2, swfVar.m49021b());
        }
        l9gVarMo41871h.mo26543j();
    }
}
