package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class yv5 {
    /* renamed from: a */
    public static final void m58354a(tff tffVar, tv5 tv5Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(tv5Var, "input");
        h7f h7fVar = new h7f(aff.C12154a.f14613a, new na9("Bytes"));
        h7f h7fVar2 = new h7f(aff.C12164k.f14623a, new na9("S3Object"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        byte[] bArrM50704a = tv5Var.m50704a();
        if (bArrM50704a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, cb1.m20635c(bArrM50704a));
        }
        tv5Var.m50705b();
        l9gVarMo41871h.mo26543j();
    }
}
