package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class u46 {
    /* renamed from: a */
    public static final void m50929a(tff tffVar, t46 t46Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(t46Var, "input");
        aff.C12155b c12155b = aff.C12155b.f14614a;
        h7f h7fVar = new h7f(c12155b, new na9("Enabled"));
        h7f h7fVar2 = new h7f(c12155b, new na9("PreferredMfa"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        if (t46Var.m49272a()) {
            l9gVarMo41871h.mo26542i(h7fVar, t46Var.m49272a());
        }
        if (t46Var.m49273b()) {
            l9gVarMo41871h.mo26542i(h7fVar2, t46Var.m49273b());
        }
        l9gVarMo41871h.mo26543j();
    }
}
