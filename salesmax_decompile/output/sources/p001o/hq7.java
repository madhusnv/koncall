package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class hq7 {

    /* renamed from: o.hq7$a */
    public static final class C14043a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ iq7 f27367a;

        public C14043a(iq7 iq7Var) {
            this.f27367a = iq7Var;
        }

        /* renamed from: a */
        public final void m30992a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f27367a.m32548c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m30992a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m30991b(jl6 jl6Var, iq7 iq7Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccountId"));
        h7f h7fVar2 = new h7f(c12163j, new na9("IdentityPoolId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("Logins"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM32546a = iq7Var.m32546a();
        if (strM32546a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM32546a);
        }
        String strM32547b = iq7Var.m32547b();
        if (strM32547b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM32547b);
        }
        if (iq7Var.m32548c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C14043a(iq7Var));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
