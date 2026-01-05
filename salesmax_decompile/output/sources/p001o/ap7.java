package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class ap7 {

    /* renamed from: o.ap7$a */
    public static final class C12233a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ bp7 f15108a;

        public C12233a(bp7 bp7Var) {
            this.f15108a = bp7Var;
        }

        /* renamed from: a */
        public final void m17636a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f15108a.m19539c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17636a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m17635b(jl6 jl6Var, bp7 bp7Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("CustomRoleArn"));
        h7f h7fVar2 = new h7f(c12163j, new na9("IdentityId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("Logins"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM19537a = bp7Var.m19537a();
        if (strM19537a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM19537a);
        }
        String strM19538b = bp7Var.m19538b();
        if (strM19538b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM19538b);
        }
        if (bp7Var.m19539c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C12233a(bp7Var));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
