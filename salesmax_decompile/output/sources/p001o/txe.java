package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class txe {
    /* renamed from: a */
    public static final void m50747a(tff tffVar, rxe rxeVar) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(rxeVar, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("Bucket"));
        h7f h7fVar2 = new h7f(c12163j, new na9("Name"));
        h7f h7fVar3 = new h7f(c12163j, new na9(JsonDocumentFields.VERSION));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        String strM47271a = rxeVar.m47271a();
        if (strM47271a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM47271a);
        }
        String strM47272b = rxeVar.m47272b();
        if (strM47272b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM47272b);
        }
        String strM47273c = rxeVar.m47273c();
        if (strM47273c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM47273c);
        }
        l9gVarMo41871h.mo26543j();
    }
}
